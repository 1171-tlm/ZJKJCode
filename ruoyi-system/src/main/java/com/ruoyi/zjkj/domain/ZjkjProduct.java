package com.ruoyi.zjkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品对象 zjkj_product
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public class ZjkjProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品id */
    private Long proId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String proName;

    /** 商品编号 */
    private Long proNo;

    /** 进货价格 */
    @Excel(name = "进货价格")
    private Double stockPrice;

    /** 销售价格 */
    @Excel(name = "销售价格")
    private Double salePrice;

    /** 商品销量 */
    @Excel(name = "商品销量")
    private Long saleNum;

    /** 商品分类 */
    @Excel(name = "商品分类")
    private String proType;

    /** 商品图片 */
    @Excel(name = "商品图片")
    private String proImg;

    /** 商品描述 （小程序） */
    @Excel(name = "商品描述 ", readConverterExp = "小=程序")
    private String proDesc;

    /** 商品详情 （服务器图片链接 多个逗号隔开） */
    @Excel(name = "商品详情 ", readConverterExp = "服=务器图片链接,多=个逗号隔开")
    private String proDetail;

    public void setProId(Long proId) 
    {
        this.proId = proId;
    }

    public Long getProId() 
    {
        return proId;
    }
    public void setProName(String proName) 
    {
        this.proName = proName;
    }

    public String getProName() 
    {
        return proName;
    }
    public void setProNo(Long proNo) 
    {
        this.proNo = proNo;
    }

    public Long getProNo() 
    {
        return proNo;
    }
    public void setStockPrice(Double stockPrice) 
    {
        this.stockPrice = stockPrice;
    }

    public Double getStockPrice() 
    {
        return stockPrice;
    }
    public void setSalePrice(Double salePrice) 
    {
        this.salePrice = salePrice;
    }

    public Double getSalePrice() 
    {
        return salePrice;
    }
    public void setSaleNum(Long saleNum) 
    {
        this.saleNum = saleNum;
    }

    public Long getSaleNum() 
    {
        return saleNum;
    }
    public void setProType(String proType) 
    {
        this.proType = proType;
    }

    public String getProType() 
    {
        return proType;
    }
    public void setProImg(String proImg) 
    {
        this.proImg = proImg;
    }

    public String getProImg() 
    {
        return proImg;
    }
    public void setProDesc(String proDesc) 
    {
        this.proDesc = proDesc;
    }

    public String getProDesc() 
    {
        return proDesc;
    }
    public void setProDetail(String proDetail) 
    {
        this.proDetail = proDetail;
    }

    public String getProDetail() 
    {
        return proDetail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("proId", getProId())
            .append("proName", getProName())
            .append("proNo", getProNo())
            .append("stockPrice", getStockPrice())
            .append("salePrice", getSalePrice())
            .append("saleNum", getSaleNum())
            .append("proType", getProType())
            .append("proImg", getProImg())
            .append("proDesc", getProDesc())
            .append("proDetail", getProDetail())
            .append("createTime", getCreateTime())
            .toString();
    }
}
