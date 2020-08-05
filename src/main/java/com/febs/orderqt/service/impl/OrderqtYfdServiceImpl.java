package com.febs.orderqt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.febs.common.entity.QueryRequest;
import com.febs.common.exception.FebsException;
import com.febs.orderqt.entity.OrderqtYfd;
import com.febs.orderqt.mapper.OrderqtYfdMapper;
import com.febs.orderqt.service.IOrderqtYfdService;
import com.febs.orderqt.vo.req.YfdReq;
import com.febs.orderqt.vo.resp.YfdResp;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * 运费单 Service实现
 *
 * @author liubaixing
 * @date 2020-07-29 14:14:12
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class OrderqtYfdServiceImpl extends ServiceImpl<OrderqtYfdMapper, OrderqtYfd> implements IOrderqtYfdService {

    @Autowired
    private OrderqtYfdMapper orderqtYfdMapper;

    @Override
    public IPage<YfdResp> findOrderqtYfds(QueryRequest request, YfdReq req) {
        Page<OrderqtYfd> page = new Page<>(request.getPageNum(), request.getPageSize());
        return this.orderqtYfdMapper.selectPageByQuery(page, req);
    }

    @Override
    public List<YfdResp> findOrderqtYfds(YfdReq req) {
		return this.orderqtYfdMapper.selectByQuery(req);
    }

    @Override
    public YfdResp findById(Long id){
        YfdReq req = new YfdReq();
        req.setId(id);
        List<YfdResp> yfdRespList = findOrderqtYfds(req);
        return CollectionUtils.isEmpty(yfdRespList) ? null : yfdRespList.get(0);
    }

    @Override
    @Transactional
    public void createOrderqtYfd(OrderqtYfd orderqtYfd) {
        this.orderqtYfdMapper.insertSelective(orderqtYfd);
    }

    @Override
    @Transactional
    public void updateOrderqtYfd(OrderqtYfd orderqtYfd) {
        this.orderqtYfdMapper.updateByPrimaryKeySelective(orderqtYfd);
    }

    @Override
    @Transactional
    public void deleteOrderqtYfd(String[] ids) {
        List<String> list = Arrays.asList(ids);
        this.removeByIds(list);
	}
}