package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.ZjkjEqpPro;
import java.util.List;

/**
 * 设备-产品-方案明细Mapper接口
 * 
 * @author taoliming
 * @date 2019-09-28
 */
public interface ZjkjEqpProMapper 
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
     * 删除设备-产品-方案明细
     * 
     * @param eqpId 设备-产品-方案明细ID
     * @return 结果
     */
    public int deleteZjkjEqpProById(Long eqpId);

    /**
     * 批量删除设备-产品-方案明细
     * 
     * @param eqpIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjEqpProByIds(String[] eqpIds);
}
