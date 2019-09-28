package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ZjkjPlanMapper;
import com.ruoyi.system.domain.ZjkjPlan;
import com.ruoyi.system.service.IZjkjPlanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品方案Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-28
 */
@Service
public class ZjkjPlanServiceImpl implements IZjkjPlanService 
{
    @Autowired
    private ZjkjPlanMapper zjkjPlanMapper;

    /**
     * 查询商品方案
     * 
     * @param planId 商品方案ID
     * @return 商品方案
     */
    @Override
    public ZjkjPlan selectZjkjPlanById(Long planId)
    {
        return zjkjPlanMapper.selectZjkjPlanById(planId);
    }

    /**
     * 查询商品方案列表
     * 
     * @param zjkjPlan 商品方案
     * @return 商品方案
     */
    @Override
    public List<ZjkjPlan> selectZjkjPlanList(ZjkjPlan zjkjPlan)
    {
        return zjkjPlanMapper.selectZjkjPlanList(zjkjPlan);
    }

    /**
     * 新增商品方案
     * 
     * @param zjkjPlan 商品方案
     * @return 结果
     */
    @Override
    public int insertZjkjPlan(ZjkjPlan zjkjPlan)
    {
        zjkjPlan.setCreateTime(DateUtils.getNowDate());
        return zjkjPlanMapper.insertZjkjPlan(zjkjPlan);
    }

    /**
     * 修改商品方案
     * 
     * @param zjkjPlan 商品方案
     * @return 结果
     */
    @Override
    public int updateZjkjPlan(ZjkjPlan zjkjPlan)
    {
        zjkjPlan.setUpdateTime(DateUtils.getNowDate());
        return zjkjPlanMapper.updateZjkjPlan(zjkjPlan);
    }

    /**
     * 删除商品方案对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjPlanByIds(String ids)
    {
        return zjkjPlanMapper.deleteZjkjPlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品方案信息
     * 
     * @param planId 商品方案ID
     * @return 结果
     */
    @Override
    public int deleteZjkjPlanById(Long planId)
    {
        return zjkjPlanMapper.deleteZjkjPlanById(planId);
    }
}
