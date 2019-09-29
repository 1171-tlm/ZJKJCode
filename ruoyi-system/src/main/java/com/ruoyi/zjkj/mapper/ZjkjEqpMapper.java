package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.ZjkjEqp;
import java.util.List;

/**
 * 设备信息Mapper接口
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public interface ZjkjEqpMapper 
{
    /**
     * 查询设备信息
     * 
     * @param eqpId 设备信息ID
     * @return 设备信息
     */
    public ZjkjEqp selectZjkjEqpById(Long eqpId);

    /**
     * 查询设备信息列表
     * 
     * @param zjkjEqp 设备信息
     * @return 设备信息集合
     */
    public List<ZjkjEqp> selectZjkjEqpList(ZjkjEqp zjkjEqp);

    /**
     * 新增设备信息
     * 
     * @param zjkjEqp 设备信息
     * @return 结果
     */
    public int insertZjkjEqp(ZjkjEqp zjkjEqp);

    /**
     * 修改设备信息
     * 
     * @param zjkjEqp 设备信息
     * @return 结果
     */
    public int updateZjkjEqp(ZjkjEqp zjkjEqp);

    /**
     * 删除设备信息
     * 
     * @param eqpId 设备信息ID
     * @return 结果
     */
    public int deleteZjkjEqpById(Long eqpId);

    /**
     * 批量删除设备信息
     * 
     * @param eqpIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjEqpByIds(String[] eqpIds);
}
