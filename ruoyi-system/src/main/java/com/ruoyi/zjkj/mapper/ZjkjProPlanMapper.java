package com.ruoyi.zjkj.mapper;

import java.util.List;

import com.ruoyi.zjkj.domain.ZjkjProPlan;

/**
 * 产品-方案关联Mapper接口
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public interface ZjkjProPlanMapper 
{
    /**
     * 查询产品-方案关联
     * 
     * @param planId 产品-方案关联ID
     * @return 产品-方案关联
     */
    public ZjkjProPlan selectZjkjProPlanById(Long planId);

    /**
     * 查询产品-方案关联列表
     * 
     * @param zjkjProPlan 产品-方案关联
     * @return 产品-方案关联集合
     */
    public List<ZjkjProPlan> selectZjkjProPlanList(ZjkjProPlan zjkjProPlan);

    /**
     * 新增产品-方案关联
     * 
     * @param zjkjProPlan 产品-方案关联
     * @return 结果
     */
    public int insertZjkjProPlan(ZjkjProPlan zjkjProPlan);

    /**
     * 修改产品-方案关联
     * 
     * @param zjkjProPlan 产品-方案关联
     * @return 结果
     */
    public int updateZjkjProPlan(ZjkjProPlan zjkjProPlan);

    /**
     * 删除产品-方案关联
     * 
     * @param planId 产品-方案关联ID
     * @return 结果
     */
    public int deleteZjkjProPlanById(Long planId);

    /**
     * 批量删除产品-方案关联
     * 
     * @param planIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjProPlanByIds(String[] planIds);
}
