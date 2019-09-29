package com.ruoyi.zjkj.service;

import com.ruoyi.zjkj.domain.ZjkjHotelEqp;
import java.util.List;

/**
 * 酒店-设备关联Service接口
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public interface IZjkjHotelEqpService 
{
    /**
     * 查询酒店-设备关联
     * 
     * @param hotelId 酒店-设备关联ID
     * @return 酒店-设备关联
     */
    public ZjkjHotelEqp selectZjkjHotelEqpById(Long hotelId);

    /**
     * 查询酒店-设备关联列表
     * 
     * @param zjkjHotelEqp 酒店-设备关联
     * @return 酒店-设备关联集合
     */
    public List<ZjkjHotelEqp> selectZjkjHotelEqpList(ZjkjHotelEqp zjkjHotelEqp);

    /**
     * 新增酒店-设备关联
     * 
     * @param zjkjHotelEqp 酒店-设备关联
     * @return 结果
     */
    public int insertZjkjHotelEqp(ZjkjHotelEqp zjkjHotelEqp);

    /**
     * 修改酒店-设备关联
     * 
     * @param zjkjHotelEqp 酒店-设备关联
     * @return 结果
     */
    public int updateZjkjHotelEqp(ZjkjHotelEqp zjkjHotelEqp);

    /**
     * 批量删除酒店-设备关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjHotelEqpByIds(String ids);

    /**
     * 删除酒店-设备关联信息
     * 
     * @param hotelId 酒店-设备关联ID
     * @return 结果
     */
    public int deleteZjkjHotelEqpById(Long hotelId);
}
