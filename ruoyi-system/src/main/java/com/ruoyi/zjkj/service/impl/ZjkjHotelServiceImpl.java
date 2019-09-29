package com.ruoyi.zjkj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.zjkj.domain.ZjkjHotel;
import com.ruoyi.zjkj.mapper.ZjkjHotelMapper;
import com.ruoyi.zjkj.service.IZjkjHotelService;
import com.ruoyi.common.core.text.Convert;

/**
 * 酒店列表Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-27
 */
@Service
public class ZjkjHotelServiceImpl implements IZjkjHotelService 
{
    @Autowired
    private ZjkjHotelMapper zjkjHotelMapper;

    /**
     * 查询酒店列表
     * 
     * @param hotelId 酒店列表ID
     * @return 酒店列表
     */
    @Override
    public ZjkjHotel selectZjkjHotelById(Long hotelId)
    {
        return zjkjHotelMapper.selectZjkjHotelById(hotelId);
    }

    /**
     * 查询酒店列表列表
     * 
     * @param zjkjHotel 酒店列表
     * @return 酒店列表
     */
    @Override
    public List<ZjkjHotel> selectZjkjHotelList(ZjkjHotel zjkjHotel)
    {
        return zjkjHotelMapper.selectZjkjHotelList(zjkjHotel);
    }

    /**
     * 新增酒店列表
     * 
     * @param zjkjHotel 酒店列表
     * @return 结果
     */
    @Override
    public int insertZjkjHotel(ZjkjHotel zjkjHotel)
    {
        zjkjHotel.setCreateTime(DateUtils.getNowDate());
        return zjkjHotelMapper.insertZjkjHotel(zjkjHotel);
    }

    /**
     * 修改酒店列表
     * 
     * @param zjkjHotel 酒店列表
     * @return 结果
     */
    @Override
    public int updateZjkjHotel(ZjkjHotel zjkjHotel)
    {
        zjkjHotel.setUpdateTime(DateUtils.getNowDate());
        return zjkjHotelMapper.updateZjkjHotel(zjkjHotel);
    }

    /**
     * 删除酒店列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjHotelByIds(String ids)
    {
        return zjkjHotelMapper.deleteZjkjHotelByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除酒店列表信息
     * 
     * @param hotelId 酒店列表ID
     * @return 结果
     */
    @Override
    public int deleteZjkjHotelById(Long hotelId)
    {
        return zjkjHotelMapper.deleteZjkjHotelById(hotelId);
    }
}
