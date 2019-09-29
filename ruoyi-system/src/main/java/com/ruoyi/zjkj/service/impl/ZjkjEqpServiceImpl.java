package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ZjkjEqpMapper;
import com.ruoyi.system.domain.ZjkjEqp;
import com.ruoyi.system.service.IZjkjEqpService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备信息Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-28
 */
@Service
public class ZjkjEqpServiceImpl implements IZjkjEqpService 
{
    @Autowired
    private ZjkjEqpMapper zjkjEqpMapper;

    /**
     * 查询设备信息
     * 
     * @param eqpId 设备信息ID
     * @return 设备信息
     */
    @Override
    public ZjkjEqp selectZjkjEqpById(Long eqpId)
    {
        return zjkjEqpMapper.selectZjkjEqpById(eqpId);
    }

    /**
     * 查询设备信息列表
     * 
     * @param zjkjEqp 设备信息
     * @return 设备信息
     */
    @Override
    public List<ZjkjEqp> selectZjkjEqpList(ZjkjEqp zjkjEqp)
    {
        return zjkjEqpMapper.selectZjkjEqpList(zjkjEqp);
    }

    /**
     * 新增设备信息
     * 
     * @param zjkjEqp 设备信息
     * @return 结果
     */
    @Override
    public int insertZjkjEqp(ZjkjEqp zjkjEqp)
    {
        zjkjEqp.setCreateTime(DateUtils.getNowDate());
        return zjkjEqpMapper.insertZjkjEqp(zjkjEqp);
    }

    /**
     * 修改设备信息
     * 
     * @param zjkjEqp 设备信息
     * @return 结果
     */
    @Override
    public int updateZjkjEqp(ZjkjEqp zjkjEqp)
    {
        zjkjEqp.setUpdateTime(DateUtils.getNowDate());
        return zjkjEqpMapper.updateZjkjEqp(zjkjEqp);
    }

    /**
     * 删除设备信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjEqpByIds(String ids)
    {
        return zjkjEqpMapper.deleteZjkjEqpByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备信息信息
     * 
     * @param eqpId 设备信息ID
     * @return 结果
     */
    @Override
    public int deleteZjkjEqpById(Long eqpId)
    {
        return zjkjEqpMapper.deleteZjkjEqpById(eqpId);
    }
}
