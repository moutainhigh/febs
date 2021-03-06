package com.febs.purchase.service.impl;

import com.febs.common.entity.QueryRequest;
import com.febs.common.exception.FebsException;
import com.febs.purchase.entity.PurchaseRkmx;
import com.febs.purchase.mapper.PurchaseRkmxMapper;
import com.febs.purchase.service.IPurchaseRkmxService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.febs.purchase.vo.resp.PurchaseRkmxResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * 入库单明细 Service实现
 *
 * @author liubaixing
 * @date 2020-06-27 19:56:10
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class PurchaseRkmxServiceImpl extends ServiceImpl<PurchaseRkmxMapper, PurchaseRkmx> implements IPurchaseRkmxService {

    @Autowired
    private PurchaseRkmxMapper purchaseRkmxMapper;

    @Override
    public IPage<PurchaseRkmxResp> findPurchaseRkmxs(QueryRequest request, PurchaseRkmx purchaseRkmx) {
        Page<PurchaseRkmx> page = new Page<>(request.getPageNum(), request.getPageSize());
        return this.purchaseRkmxMapper.selectPageByQuery(page, purchaseRkmx);
    }

    @Override
    public List<PurchaseRkmxResp> findPurchaseRkmxs(PurchaseRkmx purchaseRkmx) {
		return this.purchaseRkmxMapper.selectByQuery(purchaseRkmx);
    }

    @Override
    @Transactional
    public Long createPurchaseRkmx(PurchaseRkmx purchaseRkmx) {
        this.purchaseRkmxMapper.insertSelective(purchaseRkmx);
        return purchaseRkmx.getId();
    }

    @Override
    @Transactional
    public void updatePurchaseRkmx(PurchaseRkmx purchaseRkmx) {
        this.purchaseRkmxMapper.updateByPrimaryKeySelective(purchaseRkmx);
    }

    @Override
    @Transactional
    public void deletePurchaseRkmx(String[] ids) {
        List<String> list = Arrays.asList(ids);
        this.removeByIds(list);
	}
}
