package com.febs.receipt.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.febs.common.entity.QueryRequest;
import com.febs.receipt.entity.OrderXsfpmx;
import com.febs.receipt.mapper.OrderXsfpmxMapper;
import com.febs.receipt.service.IOrderXsfpmxService;
import com.febs.receipt.vo.resp.OrderXsfpmxResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * 销售发票明细 Service实现
 *
 * @author liubaixing
 * @date 2020-06-11 14:01:07
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class OrderXsfpmxServiceImpl extends ServiceImpl<OrderXsfpmxMapper, OrderXsfpmx> implements IOrderXsfpmxService {

    @Autowired
    private OrderXsfpmxMapper orderXsfpmxMapper;

    @Override
    public IPage<OrderXsfpmxResp> findOrderXsfpmxs(QueryRequest request, OrderXsfpmx orderXsfpmx) {
        Page<OrderXsfpmx> page = new Page<>(request.getPageNum(), request.getPageSize());
        return this.orderXsfpmxMapper.selectPageByQuery(page,orderXsfpmx);
    }

    @Override
    public List<OrderXsfpmxResp> findOrderXsfpmxs(OrderXsfpmx orderXsfpmx) {
		return this.orderXsfpmxMapper.selectByQuery(orderXsfpmx);
    }

    @Override
    @Transactional
    public void createOrderXsfpmx(OrderXsfpmx orderXsfpmx) {
        orderXsfpmxMapper.insertSelective(orderXsfpmx);
    }

    @Override
    @Transactional
    public void updateOrderXsfpmx(OrderXsfpmx orderXsfpmx) {
        orderXsfpmxMapper.updateByPrimaryKeySelective(orderXsfpmx);
    }

    @Override
    @Transactional
    public void deleteOrderXsfpmx(String[] ids) {
        List<String> list = Arrays.asList(ids);
        this.removeByIds(list);
	}
}
