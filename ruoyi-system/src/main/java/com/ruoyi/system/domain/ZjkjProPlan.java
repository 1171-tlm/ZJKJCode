package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品-方案关联对象 zjkj_pro_plan
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public class ZjkjProPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产品方案id */
    private Long planId;

    /** 产品id */
    private Long proId;

    /** 产品对应方案价格 */
    @Excel(name = "产品对应方案价格")
    private Double planPrice;

    /** 格子号 */
    @Excel(name = "格子号")
    private Integer cellNum;

    public void setPlanId(Long planId) 
    {
        this.planId = planId;
    }

    public Long getPlanId() 
    {
        return planId;
    }
    public void setProId(Long proId) 
    {
        this.proId = proId;
    }

    public Long getProId() 
    {
        return proId;
    }
    public void setPlanPrice(Double planPrice) 
    {
        this.planPrice = planPrice;
    }

    public Double getPlanPrice() 
    {
        return planPrice;
    }
    public void setCellNum(Integer cellNum) 
    {
        this.cellNum = cellNum;
    }

    public Integer getCellNum() 
    {
        return cellNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("planId", getPlanId())
            .append("proId", getProId())
            .append("planPrice", getPlanPrice())
            .append("cellNum", getCellNum())
            .toString();
    }
}
