package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品方案对象 zjkj_plan
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public class ZjkjPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产品方案id */
    private Long planId;

    /** 方案名称 */
    @Excel(name = "方案名称")
    private String planName;

    /** 格子总数 */
    @Excel(name = "格子总数")
    private String cellType;

    public void setPlanId(Long planId) 
    {
        this.planId = planId;
    }

    public Long getPlanId() 
    {
        return planId;
    }
    public void setPlanName(String planName) 
    {
        this.planName = planName;
    }

    public String getPlanName() 
    {
        return planName;
    }
    public void setCellType(String cellType) 
    {
        this.cellType = cellType;
    }

    public String getCellType() 
    {
        return cellType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("planId", getPlanId())
            .append("planName", getPlanName())
            .append("cellType", getCellType())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
