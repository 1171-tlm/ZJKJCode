package com.ruoyi.zjkj.service;

import java.util.List;

import com.ruoyi.zjkj.domain.ZjkjPlan;

/**
 * 商品方案Service接口
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public interface IZjkjPlanService 
{
    /**
     * 查询商品方案
     * 
     * @param planId 商品方案ID
     * @return 商品方案
     */
    public ZjkjPlan selectZjkjPlanById(Long planId);

    /**
     * 查询商品方案列表
     * 
     * @param zjkjPlan 商品方案
     * @return 商品方案集合
     */
    public List<ZjkjPlan> selectZjkjPlanList(ZjkjPlan zjkjPlan);

    /**
     * 新增商品方案
     * 
     * @param zjkjPlan 商品方案
     * @return 结果
     */
    public int insertZjkjPlan(ZjkjPlan zjkjPlan);

    /**
     * 修改商品方案
     * 
     * @param zjkjPlan 商品方案
     * @return 结果
     */
    public int updateZjkjPlan(ZjkjPlan zjkjPlan);

    /**
     * 批量删除商品方案
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjPlanByIds(String ids);

    /**
     * 删除商品方案信息
     * 
     * @param planId 商品方案ID
     * @return 结果
     */
    public int deleteZjkjPlanById(Long planId);
}
