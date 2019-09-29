package com.ruoyi.zjkj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zjkj.mapper.ZjkjOrderMapper;
import com.ruoyi.zjkj.domain.ZjkjOrder;
import com.ruoyi.zjkj.service.IZjkjOrderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 订单管理Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-29
 */
@Service
public class ZjkjOrderServiceImpl implements IZjkjOrderService 
{
    @Autowired
    private ZjkjOrderMapper zjkjOrderMapper;

    /**
     * 查询订单管理
     * 
     * @param orderId 订单管理ID
     * @return 订单管理
     */
    @Override
    public ZjkjOrder selectZjkjOrderById(Long orderId)
    {
        return zjkjOrderMapper.selectZjkjOrderById(orderId);
    }

    /**
     * 查询订单管理列表
     * 
     * @param zjkjOrder 订单管理
     * @return 订单管理
     */
    @Override
    public List<ZjkjOrder> selectZjkjOrderList(ZjkjOrder zjkjOrder)
    {
        return zjkjOrderMapper.selectZjkjOrderList(zjkjOrder);
    }

    /**
     * 新增订单管理
     * 
     * @param zjkjOrder 订单管理
     * @return 结果
     */
    @Override
    public int insertZjkjOrder(ZjkjOrder zjkjOrder)
    {
        zjkjOrder.setCreateTime(DateUtils.getNowDate());
        return zjkjOrderMapper.insertZjkjOrder(zjkjOrder);
    }

    /**
     * 修改订单管理
     * 
     * @param zjkjOrder 订单管理
     * @return 结果
     */
    @Override
    public int updateZjkjOrder(ZjkjOrder zjkjOrder)
    {
        zjkjOrder.setUpdateTime(DateUtils.getNowDate());
        return zjkjOrderMapper.updateZjkjOrder(zjkjOrder);
    }

    /**
     * 删除订单管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjOrderByIds(String ids)
    {
        return zjkjOrderMapper.deleteZjkjOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单管理信息
     * 
     * @param orderId 订单管理ID
     * @return 结果
     */
    @Override
    public int deleteZjkjOrderById(Long orderId)
    {
        return zjkjOrderMapper.deleteZjkjOrderById(orderId);
    }
}
