package com.febs.receipt.service;

import com.febs.common.entity.QueryRequest;
import com.febs.common.entity.excel.OrderXsExcelModel;
import com.febs.common.service.IExportService;
import com.febs.receipt.entity.OrderXs;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.febs.receipt.entity.OrderXsExample;
import com.febs.receipt.vo.req.OrderXsReq;
import com.febs.receipt.vo.resp.OrderXsResp;

import java.util.List;

/**
 * 销售单 Service接口
 *
 * @author liubaixing
 * @date 2020-06-11 11:36:56
 */
public interface IOrderXsService extends IService<OrderXs>, IExportService<OrderXsExcelModel> {
    /**
     * 查询（分页）
     *
     * @param request QueryRequest
     * @param orderXs orderXs
     * @return IPage<OrderXs>
     */
    IPage<OrderXsResp> findOrderXss(QueryRequest request, OrderXsReq orderXs);

    /**
     * 查询（所有）
     *
     * @param orderXs orderXs
     * @return List<OrderXs>
     */
    List<OrderXsResp> findOrderXss(OrderXsReq orderXs);

    List<OrderXsResp> findByXskp(OrderXsReq orderXs);

    OrderXs findOrderXs(OrderXsExample example);

    OrderXsResp findOrderXsDetail(OrderXsReq orderXs);

    List<OrderXs> selectByExample(OrderXsExample example);

    OrderXsResp selectOneByQuery(OrderXsReq orderXs);

    OrderXs findById(Long id);

    /**
     * 新增
     *
     * @param orderXs orderXs
     */
    Long createOrderXs(OrderXs orderXs);

    /**
     * 修改
     *
     * @param orderXs orderXs
     */
    OrderXsResp updateOrderXs(OrderXs orderXs);

    void updateByExample(OrderXs orderXs,OrderXsExample example);

    /**
     * 删除
     */
    void deleteOrderXs(String[] ids);

    void deleteByPrimaryKey(Long id);

}
