package com.ruoyi.zjkj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zjkj.mapper.ZjkjHotelEqpMapper;
import com.ruoyi.zjkj.domain.ZjkjHotelEqp;
import com.ruoyi.zjkj.service.IZjkjHotelEqpService;
import com.ruoyi.common.core.text.Convert;

/**
 * 酒店-设备关联Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-29
 */
@Service
public class ZjkjHotelEqpServiceImpl implements IZjkjHotelEqpService 
{
    @Autowired
    private ZjkjHotelEqpMapper zjkjHotelEqpMapper;

    /**
     * 查询酒店-设备关联
     * 
     * @param hotelId 酒店-设备关联ID
     * @return 酒店-设备关联
     */
    @Override
    public ZjkjHotelEqp selectZjkjHotelEqpById(Long hotelId)
    {
        return zjkjHotelEqpMapper.selectZjkjHotelEqpById(hotelId);
    }

    /**
     * 查询酒店-设备关联列表
     * 
     * @param zjkjHotelEqp 酒店-设备关联
     * @return 酒店-设备关联
     */
    @Override
    public List<ZjkjHotelEqp> selectZjkjHotelEqpList(ZjkjHotelEqp zjkjHotelEqp)
    {
        return zjkjHotelEqpMapper.selectZjkjHotelEqpList(zjkjHotelEqp);
    }

    /**
     * 新增酒店-设备关联
     * 
     * @param zjkjHotelEqp 酒店-设备关联
     * @return 结果
     */
    @Override
    public int insertZjkjHotelEqp(ZjkjHotelEqp zjkjHotelEqp)
    {
        return zjkjHotelEqpMapper.insertZjkjHotelEqp(zjkjHotelEqp);
    }

    /**
     * 修改酒店-设备关联
     * 
     * @param zjkjHotelEqp 酒店-设备关联
     * @return 结果
     */
    @Override
    public int updateZjkjHotelEqp(ZjkjHotelEqp zjkjHotelEqp)
    {
        return zjkjHotelEqpMapper.updateZjkjHotelEqp(zjkjHotelEqp);
    }

    /**
     * 删除酒店-设备关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjHotelEqpByIds(String ids)
    {
        return zjkjHotelEqpMapper.deleteZjkjHotelEqpByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除酒店-设备关联信息
     * 
     * @param hotelId 酒店-设备关联ID
     * @return 结果
     */
    @Override
    public int deleteZjkjHotelEqpById(Long hotelId)
    {
        return zjkjHotelEqpMapper.deleteZjkjHotelEqpById(hotelId);
    }
}
