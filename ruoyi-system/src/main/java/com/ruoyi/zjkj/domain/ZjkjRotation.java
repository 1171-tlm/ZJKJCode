package com.ruoyi.zjkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 轮播图设置对象 zjkj_rotation
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public class ZjkjRotation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 轮播图id */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String rotaryPname;

    /** 公告 */
    @Excel(name = "公告")
    private String title;

    /** 轮播图 */
    private String carouselImg;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRotaryPname(String rotaryPname) 
    {
        this.rotaryPname = rotaryPname;
    }

    public String getRotaryPname() 
    {
        return rotaryPname;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setCarouselImg(String carouselImg) 
    {
        this.carouselImg = carouselImg;
    }

    public String getCarouselImg() 
    {
        return carouselImg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rotaryPname", getRotaryPname())
            .append("title", getTitle())
            .append("carouselImg", getCarouselImg())
            .append("createTime", getCreateTime())
            .append("remark", getRemark())
            .toString();
    }
}
