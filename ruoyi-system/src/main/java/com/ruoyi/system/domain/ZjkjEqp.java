package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 设备信息对象 zjkj_eqp
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public class ZjkjEqp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备ID */
    private Long eqpId;

    /** 设备号 */
    @Excel(name = "设备号")
    private String eqpNo;

    /** 设备IMEI */
    @Excel(name = "设备IMEI")
    private String imei;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String eqpType;

    /** 格子个数 */
    @Excel(name = "格子个数")
    private Integer cellNum;

    /** 二维码链接 */
    @Excel(name = "二维码链接")
    private String qrCode;

    /** 二维码图片 */
    @Excel(name = "二维码图片")
    private String qrCodeImage;

    /** 设备拥有人 */
    @Excel(name = "设备拥有人")
    private String owner;

    /** 蓝牙名称 */
    @Excel(name = "蓝牙名称")
    private String bluetoothName;

    /** 设备状态 */
    @Excel(name = "设备状态")
    private Integer eqpStatus;

    /** 是否缺货 */
    @Excel(name = "是否缺货")
    private Integer ifLack;

    /** 设备电量 */
    @Excel(name = "设备电量")
    private String eqpElect;

    /** 扫码次数 */
    @Excel(name = "扫码次数")
    private Integer scanTimes;

    /** 最新扫码时间 */
    @Excel(name = "最新扫码时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date scanLastTime;

    /** 设备错误码 */
    @Excel(name = "设备错误码")
    private String errorCode;

    /** 绑定时间 */
    @Excel(name = "绑定时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bindTime;

    /** 解绑时间 */
    @Excel(name = "解绑时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date unbingTime;

    /** 上线时间 */
    @Excel(name = "上线时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date onlineTime;

    /** 下线时间 */
    @Excel(name = "下线时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date offTime;

    public void setEqpId(Long eqpId) 
    {
        this.eqpId = eqpId;
    }

    public Long getEqpId() 
    {
        return eqpId;
    }
    public void setEqpNo(String eqpNo) 
    {
        this.eqpNo = eqpNo;
    }

    public String getEqpNo() 
    {
        return eqpNo;
    }
    public void setImei(String imei) 
    {
        this.imei = imei;
    }

    public String getImei() 
    {
        return imei;
    }
    public void setEqpType(String eqpType) 
    {
        this.eqpType = eqpType;
    }

    public String getEqpType() 
    {
        return eqpType;
    }
    public void setCellNum(Integer cellNum) 
    {
        this.cellNum = cellNum;
    }

    public Integer getCellNum() 
    {
        return cellNum;
    }
    public void setQrCode(String qrCode) 
    {
        this.qrCode = qrCode;
    }

    public String getQrCode() 
    {
        return qrCode;
    }
    public void setQrCodeImage(String qrCodeImage) 
    {
        this.qrCodeImage = qrCodeImage;
    }

    public String getQrCodeImage() 
    {
        return qrCodeImage;
    }
    public void setOwner(String owner) 
    {
        this.owner = owner;
    }

    public String getOwner() 
    {
        return owner;
    }
    public void setBluetoothName(String bluetoothName) 
    {
        this.bluetoothName = bluetoothName;
    }

    public String getBluetoothName() 
    {
        return bluetoothName;
    }
    public void setEqpStatus(Integer eqpStatus) 
    {
        this.eqpStatus = eqpStatus;
    }

    public Integer getEqpStatus() 
    {
        return eqpStatus;
    }
    public void setIfLack(Integer ifLack) 
    {
        this.ifLack = ifLack;
    }

    public Integer getIfLack() 
    {
        return ifLack;
    }
    public void setEqpElect(String eqpElect) 
    {
        this.eqpElect = eqpElect;
    }

    public String getEqpElect() 
    {
        return eqpElect;
    }
    public void setScanTimes(Integer scanTimes) 
    {
        this.scanTimes = scanTimes;
    }

    public Integer getScanTimes() 
    {
        return scanTimes;
    }
    public void setScanLastTime(Date scanLastTime) 
    {
        this.scanLastTime = scanLastTime;
    }

    public Date getScanLastTime() 
    {
        return scanLastTime;
    }
    public void setErrorCode(String errorCode) 
    {
        this.errorCode = errorCode;
    }

    public String getErrorCode() 
    {
        return errorCode;
    }
    public void setBindTime(Date bindTime) 
    {
        this.bindTime = bindTime;
    }

    public Date getBindTime() 
    {
        return bindTime;
    }
    public void setUnbingTime(Date unbingTime) 
    {
        this.unbingTime = unbingTime;
    }

    public Date getUnbingTime() 
    {
        return unbingTime;
    }
    public void setOnlineTime(Date onlineTime) 
    {
        this.onlineTime = onlineTime;
    }

    public Date getOnlineTime() 
    {
        return onlineTime;
    }
    public void setOffTime(Date offTime) 
    {
        this.offTime = offTime;
    }

    public Date getOffTime() 
    {
        return offTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("eqpId", getEqpId())
            .append("eqpNo", getEqpNo())
            .append("imei", getImei())
            .append("eqpType", getEqpType())
            .append("cellNum", getCellNum())
            .append("qrCode", getQrCode())
            .append("qrCodeImage", getQrCodeImage())
            .append("owner", getOwner())
            .append("bluetoothName", getBluetoothName())
            .append("eqpStatus", getEqpStatus())
            .append("ifLack", getIfLack())
            .append("eqpElect", getEqpElect())
            .append("scanTimes", getScanTimes())
            .append("scanLastTime", getScanLastTime())
            .append("errorCode", getErrorCode())
            .append("bindTime", getBindTime())
            .append("unbingTime", getUnbingTime())
            .append("onlineTime", getOnlineTime())
            .append("offTime", getOffTime())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
