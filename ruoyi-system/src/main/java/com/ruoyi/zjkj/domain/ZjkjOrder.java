package com.ruoyi.zjkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 订单管理对象 zjkj_order
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public class ZjkjOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    private Long orderId;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNo;
    
    /** 交易单号(支付交易单号) */
    @Excel(name = "交易单号")
    private String orderNum;

    /** 商品ID */
    private Long proId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String prodName;

    /** 订购酒店ID */
    private Long hotelId;

    /** 酒店名称 */
    @Excel(name = "酒店名称")
    private String hotelName;

    /** 房间号 */
    @Excel(name = "房间号")
    private String hotelRoom;

    /** 设备号 */
    @Excel(name = "设备号")
    private String eqpNo;

    /** 金额 */
    private Double total;

    /** 实付金额 */
    @Excel(name = "实付金额")
    private Double actualTotal;

    /** 支付类型 */
    @Excel(name = "支付类型")
    private Integer payType;

    /** 订单备注 */
    private String remarks;

    /** 支付状态 （0未支付、1已支付、2退款中、3已退款）*/
    @Excel(name = "支付状态", readConverterExp = "0=未支付、1已支付、2退款中、3已退款")
    private Integer status;

    /** 订单商品总数 */
    private Integer productNums;

    /** 付款时间 */
    @Excel(name = "付款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /** 完成时间 支付回调成功时间 */
    private Date finallyTime;

    /** 是否已经支付，1：已经支付过，0：没有支付过 */
    private Integer isPayed;

    /** 优惠总额 */
    private Double reduceAmount;

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }
    public void setOrderNum(String orderNum) 
    {
        this.orderNum = orderNum;
    }

    public String getOrderNum() 
    {
        return orderNum;
    }
    public void setProId(Long proId) 
    {
        this.proId = proId;
    }

    public Long getProId() 
    {
        return proId;
    }
    public void setProdName(String prodName) 
    {
        this.prodName = prodName;
    }

    public String getProdName() 
    {
        return prodName;
    }
    public void setHotelId(Long hotelId) 
    {
        this.hotelId = hotelId;
    }

    public Long getHotelId() 
    {
        return hotelId;
    }
    public void setHotelName(String hotelName) 
    {
        this.hotelName = hotelName;
    }

    public String getHotelName() 
    {
        return hotelName;
    }
    public void setHotelRoom(String hotelRoom) 
    {
        this.hotelRoom = hotelRoom;
    }

    public String getHotelRoom() 
    {
        return hotelRoom;
    }
    public void setEqpNo(String eqpNo) 
    {
        this.eqpNo = eqpNo;
    }

    public String getEqpNo() 
    {
        return eqpNo;
    }
    public void setTotal(Double total) 
    {
        this.total = total;
    }

    public Double getTotal() 
    {
        return total;
    }
    public void setActualTotal(Double actualTotal) 
    {
        this.actualTotal = actualTotal;
    }

    public Double getActualTotal() 
    {
        return actualTotal;
    }
    public void setPayType(Integer payType) 
    {
        this.payType = payType;
    }

    public Integer getPayType() 
    {
        return payType;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setProductNums(Integer productNums) 
    {
        this.productNums = productNums;
    }

    public Integer getProductNums() 
    {
        return productNums;
    }
    public void setPayTime(Date payTime) 
    {
        this.payTime = payTime;
    }

    public Date getPayTime() 
    {
        return payTime;
    }
    public void setFinallyTime(Date finallyTime) 
    {
        this.finallyTime = finallyTime;
    }

    public Date getFinallyTime() 
    {
        return finallyTime;
    }
    public void setIsPayed(Integer isPayed) 
    {
        this.isPayed = isPayed;
    }

    public Integer getIsPayed() 
    {
        return isPayed;
    }
    public void setReduceAmount(Double reduceAmount) 
    {
        this.reduceAmount = reduceAmount;
    }

    public Double getReduceAmount() 
    {
        return reduceAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("orderNo", getOrderNo())
            .append("orderNum", getOrderNum())
            .append("proId", getProId())
            .append("prodName", getProdName())
            .append("hotelId", getHotelId())
            .append("hotelName", getHotelName())
            .append("hotelRoom", getHotelRoom())
            .append("eqpNo", getEqpNo())
            .append("total", getTotal())
            .append("actualTotal", getActualTotal())
            .append("payType", getPayType())
            .append("remarks", getRemarks())
            .append("status", getStatus())
            .append("productNums", getProductNums())
            .append("createTime", getCreateTime())
            .append("payTime", getPayTime())
            .append("finallyTime", getFinallyTime())
            .append("isPayed", getIsPayed())
            .append("reduceAmount", getReduceAmount())
            .toString();
    }
}
