package com.ruoyi.zjkj.service;

import java.util.List;

import com.ruoyi.zjkj.domain.ZjkjHotelPlan;

/**
 * 酒店-产品方案关联Service接口
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public interface IZjkjHotelPlanService 
{
    /**
     * 查询酒店-产品方案关联
     * 
     * @param hotelId 酒店-产品方案关联ID
     * @return 酒店-产品方案关联
     */
    public ZjkjHotelPlan selectZjkjHotelPlanById(Long hotelId);

    /**
     * 查询酒店-产品方案关联列表
     * 
     * @param zjkjHotelPlan 酒店-产品方案关联
     * @return 酒店-产品方案关联集合
     */
    public List<ZjkjHotelPlan> selectZjkjHotelPlanList(ZjkjHotelPlan zjkjHotelPlan);

    /**
     * 新增酒店-产品方案关联
     * 
     * @param zjkjHotelPlan 酒店-产品方案关联
     * @return 结果
     */
    public int insertZjkjHotelPlan(ZjkjHotelPlan zjkjHotelPlan);

    /**
     * 修改酒店-产品方案关联
     * 
     * @param zjkjHotelPlan 酒店-产品方案关联
     * @return 结果
     */
    public int updateZjkjHotelPlan(ZjkjHotelPlan zjkjHotelPlan);

    /**
     * 批量删除酒店-产品方案关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjHotelPlanByIds(String ids);

    /**
     * 删除酒店-产品方案关联信息
     * 
     * @param hotelId 酒店-产品方案关联ID
     * @return 结果
     */
    public int deleteZjkjHotelPlanById(Long hotelId);
}
