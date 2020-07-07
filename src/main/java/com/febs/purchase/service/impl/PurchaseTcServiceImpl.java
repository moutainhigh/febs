package com.febs.purchase.service.impl;

import com.febs.common.constant.PurchaseConstant;
import com.febs.common.entity.QueryRequest;
import com.febs.common.exception.FebsException;
import com.febs.common.utils.DateUtil;
import com.febs.common.utils.StringUtil;
import com.febs.purchase.entity.PurchaseTc;
import com.febs.purchase.mapper.PurchaseTcMapper;
import com.febs.purchase.service.IPurchaseTcService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * 退仓单 Service实现
 *
 * @author liubaixing
 * @date 2020-06-27 19:55:32
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class PurchaseTcServiceImpl extends ServiceImpl<PurchaseTcMapper, PurchaseTc> implements IPurchaseTcService {

    @Autowired
    private PurchaseTcMapper purchaseTcMapper;

    @Override
    public IPage<PurchaseTc> findPurchaseTcs(QueryRequest request, PurchaseTc purchaseTc) {
        LambdaQueryWrapper<PurchaseTc> queryWrapper = new LambdaQueryWrapper<>();
        // TODO 设置查询条件
        Page<PurchaseTc> page = new Page<>(request.getPageNum(), request.getPageSize());
        return this.page(page, queryWrapper);
    }

    @Override
    public List<PurchaseTc> findPurchaseTcs(PurchaseTc purchaseTc) {
	    LambdaQueryWrapper<PurchaseTc> queryWrapper = new LambdaQueryWrapper<>();
		// TODO 设置查询条件
		return this.baseMapper.selectList(queryWrapper);
    }

    @Override
    @Transactional
    public Long createPurchaseTc(PurchaseTc purchaseTc) {
        this.purchaseTcMapper.insertSelective(purchaseTc);
        String bh = PurchaseConstant.PURCHASE_TC_PREFIX + DateUtil.getYear() + StringUtil.padStart(purchaseTc.getId());
        purchaseTc.setDjbh(bh);
        this.purchaseTcMapper.updateByPrimaryKeySelective(purchaseTc);
        return purchaseTc.getId();
    }

    @Override
    @Transactional
    public void updatePurchaseTc(PurchaseTc purchaseTc) {
        this.purchaseTcMapper.updateByPrimaryKeySelective(purchaseTc);
    }

    @Override
    @Transactional
    public void deletePurchaseTc(String[] ids) {
        List<String> list = Arrays.asList(ids);
        this.removeByIds(list);
	}
}