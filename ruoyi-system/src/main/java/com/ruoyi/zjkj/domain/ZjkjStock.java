package com.ruoyi.zjkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 库存对象 zjkj_stock
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public class ZjkjStock extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 库存id */
    private Long stockId;

    /** 酒店ID */
    private Long hotelId;

    /** 产品ID */
    private Long proId;

    /** 产品库存量 */
    @Excel(name = "产品库存量")
    private Integer stockNum;

    public void setStockId(Long stockId) 
    {
        this.stockId = stockId;
    }

    public Long getStockId() 
    {
        return stockId;
    }
    public void setHotelId(Long hotelId) 
    {
        this.hotelId = hotelId;
    }

    public Long getHotelId() 
    {
        return hotelId;
    }
    public void setProId(Long proId) 
    {
        this.proId = proId;
    }

    public Long getProId() 
    {
        return proId;
    }
    public void setStockNum(Integer stockNum) 
    {
        this.stockNum = stockNum;
    }

    public Integer getStockNum() 
    {
        return stockNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stockId", getStockId())
            .append("hotelId", getHotelId())
            .append("proId", getProId())
            .append("stockNum", getStockNum())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
