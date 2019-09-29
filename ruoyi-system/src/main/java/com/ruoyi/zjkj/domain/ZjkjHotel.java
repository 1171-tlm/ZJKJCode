package com.ruoyi.zjkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 酒店列表对象 zjkj_hotel
 * 
 * @author taoliming
 * @date 2019-09-27
 */
public class ZjkjHotel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 酒店id */
    private Long hotelId;

    /** 酒店负责人名称 */
    @Excel(name = "酒店负责人名称")
    private String hotelManager;

    /** 酒店名称 */
    @Excel(name = "酒店名称")
    private String hotelName;

    /** 酒店类型（0经济型酒店、1品牌连锁酒店、2星级酒店、3主题酒店、4公寓式酒店、5商务酒店） */
    @Excel(name = "酒店类型", readConverterExp = "0=经济型酒店、1品牌连锁酒店、2星级酒店、3主题酒店、4公寓式酒店、5商务酒店")
    private Integer hotelType;

    /** 酒店负责人电话 */
    @Excel(name = "酒店负责人电话")
    private Long phone;

    /** 酒店座机电话 */
    @Excel(name = "酒店座机电话")
    private String telPhone;

    /** 酒店定位 */
    @Excel(name = "酒店定位")
    private String address;

    /** 房间数量 */
    @Excel(name = "房间数量")
    private Integer roomNum;

    /** 房间类型 */
    @Excel(name = "房间类型")
    private String roomType;

    /** 房间描述 */
    @Excel(name = "房间描述")
    private String roomDesc;

    public void setHotelId(Long hotelId) 
    {
        this.hotelId = hotelId;
    }

    public Long getHotelId() 
    {
        return hotelId;
    }
    public void setHotelManager(String hotelManager) 
    {
        this.hotelManager = hotelManager;
    }

    public String getHotelManager() 
    {
        return hotelManager;
    }
    public void setHotelName(String hotelName) 
    {
        this.hotelName = hotelName;
    }

    public String getHotelName() 
    {
        return hotelName;
    }
    public void setHotelType(Integer hotelType) 
    {
        this.hotelType = hotelType;
    }

    public Integer getHotelType() 
    {
        return hotelType;
    }
    public void setPhone(Long phone) 
    {
        this.phone = phone;
    }

    public Long getPhone() 
    {
        return phone;
    }
    public void setTelPhone(String telPhone) 
    {
        this.telPhone = telPhone;
    }

    public String getTelPhone() 
    {
        return telPhone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setRoomNum(Integer roomNum) 
    {
        this.roomNum = roomNum;
    }

    public Integer getRoomNum() 
    {
        return roomNum;
    }
    public void setRoomType(String roomType) 
    {
        this.roomType = roomType;
    }

    public String getRoomType() 
    {
        return roomType;
    }
    public void setRoomDesc(String roomDesc) 
    {
        this.roomDesc = roomDesc;
    }

    public String getRoomDesc() 
    {
        return roomDesc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("hotelId", getHotelId())
            .append("hotelManager", getHotelManager())
            .append("hotelName", getHotelName())
            .append("hotelType", getHotelType())
            .append("phone", getPhone())
            .append("telPhone", getTelPhone())
            .append("address", getAddress())
            .append("roomNum", getRoomNum())
            .append("roomType", getRoomType())
            .append("roomDesc", getRoomDesc())
            .append("createTime", getCreateTime())
            .toString();
    }
}
