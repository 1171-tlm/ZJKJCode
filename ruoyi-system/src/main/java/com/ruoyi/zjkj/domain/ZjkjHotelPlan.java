package com.ruoyi.zjkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 酒店-产品方案关联对象 zjkj_hotel_plan
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public class ZjkjHotelPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 酒店id */
    private Long hotelId;

    /** 产品方案id */
    @Excel(name = "产品方案id")
    private Long planId;

    public void setHotelId(Long hotelId) 
    {
        this.hotelId = hotelId;
    }

    public Long getHotelId() 
    {
        return hotelId;
    }
    public void setPlanId(Long planId) 
    {
        this.planId = planId;
    }

    public Long getPlanId() 
    {
        return planId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("hotelId", getHotelId())
            .append("planId", getPlanId())
            .toString();
    }
}
