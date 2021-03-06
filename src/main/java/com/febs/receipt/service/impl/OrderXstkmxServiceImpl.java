package com.febs.receipt.service.impl;

import com.febs.common.entity.QueryRequest;
import com.febs.common.exception.FebsException;
import com.febs.receipt.entity.OrderXstkmx;
import com.febs.receipt.mapper.OrderXstkmxMapper;
import com.febs.receipt.service.IOrderXstkmxService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.febs.receipt.vo.resp.OrderXstkmxResp;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * 销售退款明细 Service实现
 *
 * @author liubaixing
 * @date 2020-06-11 14:01:13
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class OrderXstkmxServiceImpl extends ServiceImpl<OrderXstkmxMapper, OrderXstkmx> implements IOrderXstkmxService {

    @Autowired
    private OrderXstkmxMapper orderXstkmxMapper;

    @Override
    public IPage<OrderXstkmxResp> findOrderXstkmxs(QueryRequest request, OrderXstkmx orderXstkmx) {
        Page<OrderXstkmx> page = new Page<>(request.getPageNum(), request.getPageSize());
        return this.orderXstkmxMapper.selectPageByQuery(page, orderXstkmx);
    }

    @Override
    public List<OrderXstkmxResp> findOrderXstkmxs(OrderXstkmx orderXstkmx) {
		return this.orderXstkmxMapper.selectByQuery(orderXstkmx);
    }

    @Override
    @Transactional
    public void createOrderXstkmx(OrderXstkmx orderXstkmx) {
        this.orderXstkmxMapper.insertSelective(orderXstkmx);
    }

    @Override
    @Transactional
    public void updateOrderXstkmx(OrderXstkmx orderXstkmx) {
        this.orderXstkmxMapper.updateByPrimaryKeySelective(orderXstkmx);
    }

    @Override
    @Transactional
    public void deleteOrderXstkmx(String[] ids) {
        List<String> list = Arrays.asList(ids);
        this.removeByIds(list);
	}
}
