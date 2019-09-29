package com.ruoyi.zjkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 酒店-设备关联对象 zjkj_hotel_eqp
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public class ZjkjHotelEqp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 酒店id */
    private Long hotelId;

    /** 设备id */
    private Long eqpId;

    public void setHotelId(Long hotelId) 
    {
        this.hotelId = hotelId;
    }

    public Long getHotelId() 
    {
        return hotelId;
    }
    public void setEqpId(Long eqpId) 
    {
        this.eqpId = eqpId;
    }

    public Long getEqpId() 
    {
        return eqpId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("hotelId", getHotelId())
            .append("eqpId", getEqpId())
            .toString();
    }
}
