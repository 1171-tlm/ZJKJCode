package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备-产品-方案明细对象 zjkj_eqp_pro
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public class ZjkjEqpPro extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备id */
    private Long eqpId;

    /** 产品id */
    private Long proId;

    /** 格子号 */
    @Excel(name = "格子号")
    private Integer cellNum;

    /** 产品实际价格 */
    @Excel(name = "产品实际价格")
    private Double proPrice;

    /** 是否缺货 */
    @Excel(name = "是否缺货")
    private String ifLack;

    public void setEqpId(Long eqpId) 
    {
        this.eqpId = eqpId;
    }

    public Long getEqpId() 
    {
        return eqpId;
    }
    public void setProId(Long proId) 
    {
        this.proId = proId;
    }

    public Long getProId() 
    {
        return proId;
    }
    public void setCellNum(Integer cellNum) 
    {
        this.cellNum = cellNum;
    }

    public Integer getCellNum() 
    {
        return cellNum;
    }
    public void setProPrice(Double proPrice) 
    {
        this.proPrice = proPrice;
    }

    public Double getProPrice() 
    {
        return proPrice;
    }
    public void setIfLack(String ifLack) 
    {
        this.ifLack = ifLack;
    }

    public String getIfLack() 
    {
        return ifLack;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("eqpId", getEqpId())
            .append("proId", getProId())
            .append("cellNum", getCellNum())
            .append("proPrice", getProPrice())
            .append("ifLack", getIfLack())
            .toString();
    }
}
