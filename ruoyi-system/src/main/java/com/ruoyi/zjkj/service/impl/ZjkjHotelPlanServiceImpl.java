package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ZjkjHotelPlanMapper;
import com.ruoyi.system.domain.ZjkjHotelPlan;
import com.ruoyi.system.service.IZjkjHotelPlanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 酒店-产品方案关联Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-28
 */
@Service
public class ZjkjHotelPlanServiceImpl implements IZjkjHotelPlanService 
{
    @Autowired
    private ZjkjHotelPlanMapper zjkjHotelPlanMapper;

    /**
     * 查询酒店-产品方案关联
     * 
     * @param hotelId 酒店-产品方案关联ID
     * @return 酒店-产品方案关联
     */
    @Override
    public ZjkjHotelPlan selectZjkjHotelPlanById(Long hotelId)
    {
        return zjkjHotelPlanMapper.selectZjkjHotelPlanById(hotelId);
    }

    /**
     * 查询酒店-产品方案关联列表
     * 
     * @param zjkjHotelPlan 酒店-产品方案关联
     * @return 酒店-产品方案关联
     */
    @Override
    public List<ZjkjHotelPlan> selectZjkjHotelPlanList(ZjkjHotelPlan zjkjHotelPlan)
    {
        return zjkjHotelPlanMapper.selectZjkjHotelPlanList(zjkjHotelPlan);
    }

    /**
     * 新增酒店-产品方案关联
     * 
     * @param zjkjHotelPlan 酒店-产品方案关联
     * @return 结果
     */
    @Override
    public int insertZjkjHotelPlan(ZjkjHotelPlan zjkjHotelPlan)
    {
        return zjkjHotelPlanMapper.insertZjkjHotelPlan(zjkjHotelPlan);
    }

    /**
     * 修改酒店-产品方案关联
     * 
     * @param zjkjHotelPlan 酒店-产品方案关联
     * @return 结果
     */
    @Override
    public int updateZjkjHotelPlan(ZjkjHotelPlan zjkjHotelPlan)
    {
        return zjkjHotelPlanMapper.updateZjkjHotelPlan(zjkjHotelPlan);
    }

    /**
     * 删除酒店-产品方案关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjHotelPlanByIds(String ids)
    {
        return zjkjHotelPlanMapper.deleteZjkjHotelPlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除酒店-产品方案关联信息
     * 
     * @param hotelId 酒店-产品方案关联ID
     * @return 结果
     */
    @Override
    public int deleteZjkjHotelPlanById(Long hotelId)
    {
        return zjkjHotelPlanMapper.deleteZjkjHotelPlanById(hotelId);
    }
}
