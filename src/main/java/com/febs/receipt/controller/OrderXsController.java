package com.febs.receipt.controller;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.febs.common.annotation.ControllerEndpoint;
import com.febs.common.controller.BaseController;
import com.febs.common.entity.FebsResponse;
import com.febs.common.entity.QueryRequest;
import com.febs.common.entity.excel.CommonExcelEntity;
import com.febs.common.entity.excel.OrderXsExcelModel;
import com.febs.common.listener.CommonExcelListener;
import com.febs.common.listener.UploadDataListener;
import com.febs.common.utils.ExcelUtil;
import com.febs.common.utils.StringUtil;
import com.febs.other.service.IDictionaryService;
import com.febs.receipt.biz.OrderXsBiz;
import com.febs.receipt.entity.OrderXs;
import com.febs.receipt.service.IOrderXsService;
import com.febs.receipt.vo.req.OrderXsReq;
import com.febs.receipt.vo.resp.OrderXsResp;
import com.febs.system.entity.User;
import com.febs.system.service.IUserOrgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotBlank;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 销售单 Controller
 *
 * @author liubaixing
 * @date 2020-06-11 11:36:56
 */
@Slf4j
@Validated
@Api(tags = "销售单管理")
@RestController
@RequestMapping("orderXs")
public class OrderXsController extends BaseController {

    @Autowired
    private IOrderXsService orderXsService;

    @Autowired
    private OrderXsBiz orderXsBiz;

    @Autowired
    private IUserOrgService userOrgService;

    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("")
//    @RequiresPermissions("orderXs:list")
    public FebsResponse getAllOrderXss(OrderXsReq orderXs) {
        User user = getCurrentUser();

        if (requestCheck(user,orderXs)){
            return new FebsResponse().success();
        }

        List<OrderXsResp> orderXsRespList = orderXsService.findByXskp(orderXs);

        List<OrderXsResp> orderXsRespResult = orderXsRespList.stream().filter(i -> i.getJhsl() - i.getKpsl() > 0).collect(Collectors.toList());

        return new FebsResponse().success().data(orderXsRespResult);
    }

    @ApiOperation("查询销售单")
    @GetMapping("/list")
//    @RequiresPermissions("orderXs:list")
    public FebsResponse orderXsList(QueryRequest request, OrderXsReq orderXs) {
        User user = getCurrentUser();

        if (requestCheck(user,orderXs)){
            return new FebsResponse().success();
        }

        Map<String, Object> dataTable = getDataTable(this.orderXsService.findOrderXss(request, orderXs));
        return new FebsResponse().success().data(dataTable);
    }

    @ApiOperation("导入查询")
    @PostMapping("/list/import")
    public FebsResponse orderXsList(@RequestParam MultipartFile file) throws IOException {

        CommonExcelListener<CommonExcelEntity> listener = new CommonExcelListener<CommonExcelEntity>();
        EasyExcel.read(file.getInputStream(),CommonExcelEntity.class,listener).sheet().doRead();

        List<CommonExcelEntity> datas = listener.getDatas();

        if (CollectionUtils.isEmpty(datas)){
            return new FebsResponse().success();
        }

        List<String> orderXsNoList = datas.stream().filter(i -> i.getRow() != null).map(CommonExcelEntity::getRow).collect(Collectors.toList());

        List<OrderXsResp> orderXsRespList = new ArrayList<>();

        if (CollectionUtils.isNotEmpty(orderXsNoList)){
            User user = getCurrentUser();
            OrderXsReq req = new OrderXsReq();

            List<Long> orgList = userOrgService.getUserOrg(user.getUserId());
            if (CollectionUtils.isNotEmpty(orgList)){
                req.setOrgList(orgList);
                req.setDjbhList(orderXsNoList);

                orderXsRespList = orderXsService.findOrderXss(req);
            }

        }

        return new FebsResponse().success().data(orderXsRespList);
    }

    private boolean requestCheck(User user,OrderXsReq req){
        List<Long> orgList = userOrgService.getUserOrg(user.getUserId());

        if (CollectionUtils.isEmpty(orgList)){
            return true;
        }
        req.setOrgList(orgList);
        return false;
    }

    @ApiOperation("查看")
    @GetMapping("view/{id}")
//    @RequiresPermissions("orderXs:view")
    public FebsResponse view(@PathVariable Long id) {
        return new FebsResponse().success().data(orderXsBiz.view(id));
    }

    @GetMapping("getSerialNumber")
    public FebsResponse getSerialNumber(){
        String serialNumber = StringUtil.serialStr(dictionaryService.incr());
       return new FebsResponse().success().data(serialNumber);
    }

    @ApiOperation("新增销售单")
    @ControllerEndpoint(operation = "新增销售单", exceptionMessage = "新增销售单失败")
    @PostMapping("")
//    @RequiresPermissions("orderXs:add")
    public FebsResponse addOrderXs(OrderXsReq orderXs) {
        this.orderXsBiz.create(orderXs);
        return new FebsResponse().success();
    }

    @ApiOperation("删除销售单")
    @ControllerEndpoint(operation = "删除销售单", exceptionMessage = "删除销售单失败")
    @GetMapping("delete/{ids}")
//    @RequiresPermissions("orderXs:delete")
    public FebsResponse deleteOrderXs(@NotBlank(message = "{required}") @PathVariable String ids) {
        String[] id = ids.split(StringPool.COMMA);
        this.orderXsBiz.delete(id);
        return new FebsResponse().success();
    }

    @ApiOperation("修改销售单")
    @ControllerEndpoint(operation = "修改销售单", exceptionMessage = "修改销售单失败")
    @PostMapping("/update")
//    @RequiresPermissions("orderXs:update")
    public FebsResponse updateOrderXs(OrderXsReq orderXsReq) {
        this.orderXsBiz.update(orderXsReq);
        return new FebsResponse().success();
    }

    @ApiOperation("确认")
    @ControllerEndpoint(operation = "确认销售单", exceptionMessage = "确认销售单失败")
    @GetMapping("/confirm/{id}")
//    @RequiresPermissions("orderXs:confirm")
    public FebsResponse orderXsConfirm(@PathVariable Long id){
        User user = getCurrentUser();
        OrderXs req = new OrderXs();
        req.setId(id);
        req.setQr((byte)1);
        req.setQrr(user.getUsername());
        this.orderXsBiz.confirmOrderXs(req,true);
        return new FebsResponse().success();
    }

    @ApiOperation("反确认")
    @ControllerEndpoint(operation = "反确认销售单", exceptionMessage = "反确认销售单失败")
    @GetMapping("/unConfirm/{id}")
//    @RequiresPermissions("orderXs:unConfirm")
    public FebsResponse orderXsUnConfirm(@PathVariable Long id){
        User user = getCurrentUser();
        OrderXs req = new OrderXs();
        req.setId(id);
        req.setQr((byte)0);
        req.setQrr(user.getUsername());
        this.orderXsBiz.confirmOrderXs(req,false);
        return new FebsResponse().success();
    }

    @ApiOperation("审核")
    @ControllerEndpoint(operation = "审核销售单", exceptionMessage = "审核销售单失败")
    @GetMapping("/check/{id}")
//    @RequiresPermissions("orderXs:check")
    public FebsResponse orderXsCheck(@PathVariable Long id ){
        User user = getCurrentUser();
        OrderXs req = new OrderXs();
        req.setId(id);
        req.setSh((byte)1);
        req.setAuditor(user.getUsername());
        this.orderXsBiz.checkOrderXs(req,true);
        return new FebsResponse().success();
    }

    @ApiOperation("反审核")
    @ControllerEndpoint(operation = "反审核销售单", exceptionMessage = "反审核销售单失败")
    @GetMapping("/unCheck/{id}")
//    @RequiresPermissions("orderXs:unCheck")
    public FebsResponse orderXsUnCheck(@PathVariable Long id ){
        User user = getCurrentUser();
        OrderXs req = new OrderXs();
        req.setId(id);
        req.setSh((byte)0);
        req.setAuditor(user.getUsername());
        this.orderXsBiz.checkOrderXs(req,false);
        return new FebsResponse().success();
    }

    @ApiOperation("执行（执行必需的三个参数： mxId、zxfs(执行方式)、cangkuId）")
    @ControllerEndpoint(operation = "执行销售单", exceptionMessage = "执行销售单失败")
    @PostMapping("/execute")
//    @RequiresPermissions("orderXs:execute")
    public FebsResponse orderXsExecute(OrderXsReq req){
        User user = getCurrentUser();
        req.setZx((byte)1);
        req.setZxr(user.getUsername());
        req.setZxrq(new Date());
        req.setUserId(user.getUserId());
        this.orderXsBiz.executeOrderXs(req,true);
        return new FebsResponse().success();
    }

    @ApiOperation("反执行")
    @ControllerEndpoint(operation = "反执行销售单", exceptionMessage = "反执行销售单失败")
    @PostMapping("/unExecute")
//    @RequiresPermissions("orderXs:unExecute")
    public FebsResponse orderXsUnExecute(OrderXsReq req){
        User user = getCurrentUser();
        req.setZx((byte)0);
        req.setZxr(user.getUsername());
        req.setZxrq(new Date());
        this.orderXsBiz.executeOrderXs(req,false);
        return new FebsResponse().success();
    }

    @ApiOperation("作废")
    @ControllerEndpoint(operation = "作废销售单", exceptionMessage = "作废销售单失败")
    @GetMapping("/invalid/{id}/{status}")
//    @RequiresPermissions("orderXs:invalid")
    public FebsResponse orderXsInvalid(@PathVariable Long id){
        User user = getCurrentUser();
        OrderXs orderXs = new OrderXs();
        orderXs.setId(id);
        orderXs.setZf((byte)1);
        orderXs.setZfr(user.getUsername());
        orderXs.setZfrq(new Date());
        orderXsService.updateOrderXs(orderXs);
        return new FebsResponse().success();
    }

    @ApiOperation("关闭")
    @ControllerEndpoint(operation = "关闭销售单", exceptionMessage = "关闭销售单失败")
    @PostMapping("/close/{id}")
//    @RequiresPermissions("orderXs:close")
    public FebsResponse orderXsClose(@PathVariable Long id){
        User user = getCurrentUser();
        OrderXs req = new OrderXs();
        req.setId(id);
        req.setGb((byte)1);
        req.setGbr(user.getUsername());
        this.orderXsBiz.closeOrderXs(req,true);
        return new FebsResponse().success();
    }

    @ApiOperation("反关闭")
    @ControllerEndpoint(operation = "反关闭销售单", exceptionMessage = "反关闭销售单失败")
    @PostMapping("/unClose/{id}")
//    @RequiresPermissions("orderXs:unClose")
    public FebsResponse orderXsUnClose(@PathVariable Long id){
        User user = getCurrentUser();
        OrderXs req = new OrderXs();
        req.setId(id);
        req.setGb((byte)0);
        req.setGbr(user.getUsername());
        this.orderXsBiz.closeOrderXs(req,false);
        return new FebsResponse().success();
    }

    @ApiOperation("生成销退单")
    @ControllerEndpoint(operation = "生成销退单", exceptionMessage = "生成销退单失败")
    @PostMapping("/return")
//    @RequiresPermissions("orderXs:return")
    public FebsResponse orderXsReturn(OrderXsReq req){
        User user = getCurrentUser();
        req.setUserName(user.getUsername());
        orderXsBiz.returnOrderXs(req);
        return new FebsResponse().success();
    }

    @ControllerEndpoint(exceptionMessage = "导出Excel失败")
    @GetMapping("excel")
//    @RequiresPermissions("orderXs:export")
    public void export(QueryRequest queryRequest, OrderXsReq orderXs, HttpServletResponse response) throws IOException {
        List<OrderXsResp> orderXss = this.orderXsBiz.findByPage(queryRequest, orderXs).getRecords();
        ExcelUtil.export(orderXss, OrderXsResp.class,"销售单",response);
    }

    @ApiOperation("导入")
    @ControllerEndpoint(exceptionMessage = "导出Excel失败")
    @PostMapping("upload")
    public FebsResponse upload(@RequestParam MultipartFile file,@RequestParam("type")String type) throws IOException{
        UploadDataListener<OrderXsExcelModel> listener = new UploadDataListener<OrderXsExcelModel>(orderXsService);
        EasyExcel.read(file.getInputStream(),OrderXsExcelModel.class,listener).sheet().doRead();
        List<OrderXsExcelModel> data = listener.getData();
        orderXsBiz.excelUpload(data,type);
        return new FebsResponse().success();
    }

}
