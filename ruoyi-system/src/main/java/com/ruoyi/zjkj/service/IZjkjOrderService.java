package com.ruoyi.zjkj.service;

import com.ruoyi.zjkj.domain.ZjkjOrder;
import java.util.List;

/**
 * 订单管理Service接口
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public interface IZjkjOrderService 
{
    /**
     * 查询订单管理
     * 
     * @param orderId 订单管理ID
     * @return 订单管理
     */
    public ZjkjOrder selectZjkjOrderById(Long orderId);

    /**
     * 查询订单管理列表
     * 
     * @param zjkjOrder 订单管理
     * @return 订单管理集合
     */
    public List<ZjkjOrder> selectZjkjOrderList(ZjkjOrder zjkjOrder);

    /**
     * 新增订单管理
     * 
     * @param zjkjOrder 订单管理
     * @return 结果
     */
    public int insertZjkjOrder(ZjkjOrder zjkjOrder);

    /**
     * 修改订单管理
     * 
     * @param zjkjOrder 订单管理
     * @return 结果
     */
    public int updateZjkjOrder(ZjkjOrder zjkjOrder);

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjOrderByIds(String ids);

    /**
     * 删除订单管理信息
     * 
     * @param orderId 订单管理ID
     * @return 结果
     */
    public int deleteZjkjOrderById(Long orderId);
}
