package cc.mrbird.febs.basic.service.impl;

import cc.mrbird.febs.basic.entity.BasicJldw;
import cc.mrbird.febs.basic.entity.BasicKhlb;
import cc.mrbird.febs.basic.entity.BasicKhlb;
import cc.mrbird.febs.basic.mapper.BasicKhlbMapper;
import cc.mrbird.febs.basic.service.IBasicKhlbService;
import cc.mrbird.febs.common.entity.QueryRequest;
import cc.mrbird.febs.common.exception.FebsException;
import cc.mrbird.febs.common.utils.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * 客户类别 Service实现
 *
 * @author liubaixing
 * @date 2020-05-22 01:39:16
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class BasicKhlbServiceImpl extends ServiceImpl<BasicKhlbMapper, BasicKhlb> implements IBasicKhlbService {

    @Autowired
    private BasicKhlbMapper basicKhlbMapper;

    @Override
    public IPage<BasicKhlb> findBasicKhlbs(QueryRequest request, BasicKhlb basicKhlb) {
        LambdaQueryWrapper<BasicKhlb> queryWrapper = new LambdaQueryWrapper<>();
        // TODO 设置查询条件
        if(StringUtils.isNotBlank(basicKhlb.getKhlydm())){
            queryWrapper.like(BasicKhlb::getKhlydm,basicKhlb.getKhlydm());
        }
        if(StringUtils.isNotBlank(basicKhlb.getKhlymc())){
            queryWrapper.like(BasicKhlb::getKhlymc,basicKhlb.getKhlymc());
        }
        if(basicKhlb.getStatus()!=null){
            queryWrapper.eq(BasicKhlb::getStatus,basicKhlb.getStatus());
        }
        Page<BasicKhlb> page = new Page<>(request.getPageNum(), request.getPageSize());
        return this.page(page, queryWrapper);
    }

    @Override
    public List<BasicKhlb> findBasicKhlbs(BasicKhlb basicKhlb) {
	    LambdaQueryWrapper<BasicKhlb> queryWrapper = new LambdaQueryWrapper<>();
		// TODO 设置查询条件
		return this.baseMapper.selectList(queryWrapper);
    }

    @Override
    @Transactional
    public void createBasicKhlb(BasicKhlb basicKhlb) {
        check(basicKhlb);
        this.save(basicKhlb);
        if(StringUtils.isBlank(basicKhlb.getKhlydm())){
            String dm = StringUtil.padStart(basicKhlb.getId());
            basicKhlb.setKhlydm(dm);
            this.updateById(basicKhlb);
        }
    }

    @Override
    @Transactional
    public void updateBasicKhlb(BasicKhlb basicKhlb) {
        if(basicKhlb.getId()==null){
            throw new FebsException("id不能为空，修改失败");
        }
        this.updateById(basicKhlb);
    }

    @Override
    @Transactional
    public void deleteBasicKhlb(String[] ids) {
        List<String> list = Arrays.asList(ids);
        this.removeByIds(list);
	}

	private void check(BasicKhlb basicKhlb) throws FebsException{
        LambdaQueryWrapper<BasicKhlb> queryWrapper = new LambdaQueryWrapper<>();
        if(StringUtils.isNotBlank(basicKhlb.getKhlydm())){
            queryWrapper.eq(BasicKhlb::getKhlydm,basicKhlb.getKhlydm());
            Integer count = this.baseMapper.selectCount(queryWrapper);
            if (count>0) {
                throw new FebsException("代码重复，添加失败");
            }
        }
    }
}
