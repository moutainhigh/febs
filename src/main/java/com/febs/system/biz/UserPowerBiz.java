package com.febs.system.biz;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.febs.basic.entity.BasicPtda;
import com.febs.basic.mapper.BasicPtdaMapper;
import com.febs.basic.service.IBasicPtdaService;
import com.febs.common.exception.FebsException;
import com.febs.system.entity.*;
import com.febs.system.mapper.CangkuMapper;
import com.febs.system.mapper.GysMapper;
import com.febs.system.service.*;
import com.febs.system.vo.req.UserPowerReq;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserPowerBiz
 * @Description:
 * @Author:
 * @Date 2020/9/25
 * @Version 1.0
 */
@Service
public class UserPowerBiz {

    @Autowired
    private IUserGysService userGysService;
    @Autowired
    private IUserOrgService userOrgService;
    @Autowired
    private IUserCangkuService userCangkuService;
    @Resource
    private GysMapper gysMapper;
    @Resource
    private CangkuMapper cangkuMapper;
    @Resource
    private BasicPtdaMapper ptdaMapper;

    public List<Map<String,Object>> getUserPower(UserPowerReq req){

//        Map<String,Object> map = new HashMap<>();
//        List<Map<String,Object>> checkMap = new ArrayList<>();
//        List<Map<String,Object>> unCheckMap = new ArrayList<>();
//        Map<String,Object> temp = new HashMap<>();

        List<Map<String,Object>> userPowerMap = new ArrayList<>();


        if ("userOrg".equals(req.getPowerType())){



            List<Long> userOrgId = userOrgService.getUserOrg(req.getUserId());
            LambdaQueryWrapper<BasicPtda> queryWrapper = new LambdaQueryWrapper<>();
            List<BasicPtda> ptdaList =  ptdaMapper.selectList(queryWrapper);
            for (BasicPtda ptda : ptdaList ){
                Map<String,Object> map = new HashMap<>();
                map.put("powerId",ptda.getId());
                map.put("powerName",ptda.getPtdamc());
                map.put("check",0);
                if (userOrgId.contains(ptda.getId())){
                    map.put("check",1);
                }
                userPowerMap.add(map);
            }

        } else if ("userGys".equals(req.getPowerType())) {
            List<Long> userGysId = userGysService.getUserGys(req.getUserId());

            GysExample example = new GysExample();
            List<Gys> gysList = gysMapper.selectByExample(example);

            for (Gys gys : gysList){
                Map<String,Object> map = new HashMap<>();
                map.put("powerId",gys.getId());
                map.put("powerName",gys.getGysmc());
                map.put("check",0);
                if (userGysId.contains(gys.getId())){
                    map.put("check",1);
                }

                userPowerMap.add(map);
            }

        } else if ("userCangku".equals(req.getPowerType())) {
            List<Long> userCangkuId = userCangkuService.getUserCangku(req.getUserId());

            CangkuExample example = new CangkuExample();
            List<Cangku> cangkuList = cangkuMapper.selectByExample(example);


            for (Cangku cangku : cangkuList){
                Map<String,Object> map = new HashMap<>();
                map.put("powerId",cangku.getId());
                map.put("powerName",cangku.getCkmc());
                map.put("check",0);
                if (userCangkuId.contains(cangku.getId())){
                    map.put("check",1);
                }

                userPowerMap.add(map);
            }
        }
        return userPowerMap;
    }

    public void authorization(UserPowerReq req) {

        if (CollectionUtils.isEmpty(req.getPowerIds())){
            throw new FebsException("未选择权限");
        }

        List<Long> powerIds = req.getPowerIds();

        if ("userOrg".equals(req.getPowerType())){

            UserOrgExample example = new UserOrgExample();
            example.createCriteria().andUserIdEqualTo(req.getUserId());
            userOrgService.delete(example);

            for (Long powerId : powerIds){
                UserOrg userOrg = new UserOrg();
                userOrg.setUserId(req.getUserId());
                userOrg.setOrgId(powerId);
                userOrgService.create(userOrg);
            }


        } else if ("userGys".equals(req.getPowerType())) {

            UserGysExample example = new UserGysExample();
            example.createCriteria().andUserIdEqualTo(req.getUserId());
            userGysService.deleted(example);

            for (Long powerId : powerIds){
                UserGys userGys = new UserGys();
                userGys.setUserId(req.getUserId());
                userGys.setGysId(powerId);
                userGysService.create(userGys);
            }


        } else if ("userCangku".equals(req.getPowerType())) {

            UserCangkuExample example = new UserCangkuExample();
            example.createCriteria().andUserIdEqualTo(req.getUserId());
            userCangkuService.delete(example);

            for (Long powerId : powerIds){
                UserCangku userCangku = new UserCangku();
                userCangku.setUserId(req.getUserId());
                userCangku.setCangkuId(powerId);
                userCangkuService.create(userCangku);
            }
        }

    }
}
