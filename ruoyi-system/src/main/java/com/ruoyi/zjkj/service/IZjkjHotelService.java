package com.ruoyi.zjkj.service;

import java.util.List;

import com.ruoyi.zjkj.domain.ZjkjHotel;

/**
 * 酒店列表Service接口
 * 
 * @author taoliming
 * @date 2019-09-27
 */
public interface IZjkjHotelService 
{
    /**
     * 查询酒店列表
     * 
     * @param hotelId 酒店列表ID
     * @return 酒店列表
     */
    public ZjkjHotel selectZjkjHotelById(Long hotelId);

    /**
     * 查询酒店列表列表
     * 
     * @param zjkjHotel 酒店列表
     * @return 酒店列表集合
     */
    public List<ZjkjHotel> selectZjkjHotelList(ZjkjHotel zjkjHotel);

    /**
     * 新增酒店列表
     * 
     * @param zjkjHotel 酒店列表
     * @return 结果
     */
    public int insertZjkjHotel(ZjkjHotel zjkjHotel);

    /**
     * 修改酒店列表
     * 
     * @param zjkjHotel 酒店列表
     * @return 结果
     */
    public int updateZjkjHotel(ZjkjHotel zjkjHotel);

    /**
     * 批量删除酒店列表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjHotelByIds(String ids);

    /**
     * 删除酒店列表信息
     * 
     * @param hotelId 酒店列表ID
     * @return 结果
     */
    public int deleteZjkjHotelById(Long hotelId);
}
