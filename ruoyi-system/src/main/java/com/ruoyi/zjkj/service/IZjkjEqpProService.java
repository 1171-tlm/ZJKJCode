package com.ruoyi.zjkj.service;

import java.util.List;

import com.ruoyi.zjkj.domain.ZjkjEqpPro;

/**
 * 设备-产品-方案明细Service接口
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public interface IZjkjEqpProService 
{
    /**
     * 查询设备-产品-方案明细
     * 
     * @param eqpId 设备-产品-方案明细ID
     * @return 设备-产品-方案明细
     */
    public ZjkjEqpPro selectZjkjEqpProById(Long eqpId);

    /**
     * 查询设备-产品-方案明细列表
     * 
     * @param zjkjEqpPro 设备-产品-方案明细
     * @return 设备-产品-方案明细集合
     */
    public List<ZjkjEqpPro> selectZjkjEqpProList(ZjkjEqpPro zjkjEqpPro);

    /**
     * 新增设备-产品-方案明细
     * 
     * @param zjkjEqpPro 设备-产品-方案明细
     * @return 结果
     */
    public int insertZjkjEqpPro(ZjkjEqpPro zjkjEqpPro);

    /**
     * 修改设备-产品-方案明细
     * 
     * @param zjkjEqpPro 设备-产品-方案明细
     * @return 结果
     */
    public int updateZjkjEqpPro(ZjkjEqpPro zjkjEqpPro);

    /**
     * 批量删除设备-产品-方案明细
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjEqpProByIds(String ids);

    /**
     * 删除设备-产品-方案明细信息
     * 
     * @param eqpId 设备-产品-方案明细ID
     * @return 结果
     */
    public int deleteZjkjEqpProById(Long eqpId);
}
