package com.febs.system.service.impl;

import com.febs.system.entity.DingTalkUser;
import com.febs.system.entity.DingTalkUserExample;
import com.febs.system.mapper.DingTalkUserMapper;
import com.febs.system.service.IDingTalkUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: DingTalkServiceImpl
 * @Description:
 * @Author:
 * @Date 2020/10/13
 * @Version 1.0
 */
@Service
public class DingTalkUserServiceImpl implements IDingTalkUserService {

    @Resource
    private DingTalkUserMapper dingTalkUserMapper;

    @Override
    public DingTalkUser getById(Long userId) {
        return dingTalkUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<DingTalkUser> getByList(DingTalkUser user) {
        DingTalkUserExample example = new DingTalkUserExample();
        return dingTalkUserMapper.selectByExample(example);
    }

    @Override
    public void createUser(DingTalkUser dingTalkUser) {
        dingTalkUserMapper.insertSelective(dingTalkUser);
    }

    @Override
    public void updateUser(DingTalkUser dingTalkUser) {
        dingTalkUserMapper.updateByPrimaryKeySelective(dingTalkUser);
    }

    @Override
    public void deleteUser(Long id) {
        dingTalkUserMapper.deleteByPrimaryKey(id);
    }
}
