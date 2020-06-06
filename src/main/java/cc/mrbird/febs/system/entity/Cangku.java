package cc.mrbird.febs.system.entity;


import cc.mrbird.febs.common.converter.CangkuTypeConverter;
import cc.mrbird.febs.common.converter.StatusConverter;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 仓库管理 Entity
 *
 * @author lbx
 * @date 2020-05-16 19:57:45
 */
@Data
@TableName("system_cangku")
public class Cangku {

    /**
     * 
     */
    @ExcelIgnore
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仓库代码
     */
    @ExcelProperty(value = "仓库代码",index = 0)
    @TableField("ckdm")
    private String ckdm;

    /**
     * 仓库名称
     */
    @ExcelProperty(value = "仓库代码",index = 1)
    @NotBlank(message = "{required}")
    @TableField("ckmc")
    private String ckmc;

    /**
     * 仓库类别 Basic_cklb表id
     */
    @ExcelIgnore
    @NotNull(message = "仓库类型不能为空")
    @TableField("cklx_id")
    private Integer cklxId;


    @ExcelProperty(value = "仓库代码",index = 2)
    private String cklxmc;

    /**
     * 仓库性质 0:自发 1:直发
     */
    @ExcelProperty(value = "仓库代码",index = 3,converter = CangkuTypeConverter.class)
    @NotNull(message = "仓库性质不能为空")
    @TableField("ckxz")
    private Integer ckxz;

    /**
     * 联系人电话
     */
    @ExcelProperty(value = "仓库代码",index = 4)
    @TableField("tel")
    private String tel;

    /**
     * 联系人
     */
    @ExcelProperty(value = "仓库代码",index = 5)
    @TableField("contact")
    private String contact;

    /**
     * 发货地址
     */
    @ExcelProperty(value = "仓库代码",index = 6)
    @TableField("address")
    private String address;

    /**
     * 备注
     */
    @ExcelIgnore
    @TableField("memo")
    private String memo;

    /**
     * 备用1
     */
    @ExcelIgnore
    @TableField("ex1")
    private String ex1;

    /**
     * 备用2
     */
    @ExcelIgnore
    @TableField("ex2")
    private String ex2;

    /**
     * 备用3
     */
    @ExcelIgnore
    @TableField("ex3")
    private String ex3;

    /**
     * 是否启用 0:启用 1:停用
     */
    @ExcelProperty(value = "是否启用",index = 7,converter = StatusConverter.class)
    @TableField("status")
    private Integer status;

    @ExcelIgnore
    @TableField("create_time")
    private Date createTime;

    @ExcelIgnore
    @TableField("update_time")
    private Date updateTime;

    @ExcelIgnore
    @TableField("deleted")
    private Integer deleted;

}
