package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ZjkjProPlanMapper;
import com.ruoyi.system.domain.ZjkjProPlan;
import com.ruoyi.system.service.IZjkjProPlanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 产品-方案关联Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-28
 */
@Service
public class ZjkjProPlanServiceImpl implements IZjkjProPlanService 
{
    @Autowired
    private ZjkjProPlanMapper zjkjProPlanMapper;

    /**
     * 查询产品-方案关联
     * 
     * @param planId 产品-方案关联ID
     * @return 产品-方案关联
     */
    @Override
    public ZjkjProPlan selectZjkjProPlanById(Long planId)
    {
        return zjkjProPlanMapper.selectZjkjProPlanById(planId);
    }

    /**
     * 查询产品-方案关联列表
     * 
     * @param zjkjProPlan 产品-方案关联
     * @return 产品-方案关联
     */
    @Override
    public List<ZjkjProPlan> selectZjkjProPlanList(ZjkjProPlan zjkjProPlan)
    {
        return zjkjProPlanMapper.selectZjkjProPlanList(zjkjProPlan);
    }

    /**
     * 新增产品-方案关联
     * 
     * @param zjkjProPlan 产品-方案关联
     * @return 结果
     */
    @Override
    public int insertZjkjProPlan(ZjkjProPlan zjkjProPlan)
    {
        return zjkjProPlanMapper.insertZjkjProPlan(zjkjProPlan);
    }

    /**
     * 修改产品-方案关联
     * 
     * @param zjkjProPlan 产品-方案关联
     * @return 结果
     */
    @Override
    public int updateZjkjProPlan(ZjkjProPlan zjkjProPlan)
    {
        return zjkjProPlanMapper.updateZjkjProPlan(zjkjProPlan);
    }

    /**
     * 删除产品-方案关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjProPlanByIds(String ids)
    {
        return zjkjProPlanMapper.deleteZjkjProPlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产品-方案关联信息
     * 
     * @param planId 产品-方案关联ID
     * @return 结果
     */
    @Override
    public int deleteZjkjProPlanById(Long planId)
    {
        return zjkjProPlanMapper.deleteZjkjProPlanById(planId);
    }
}
