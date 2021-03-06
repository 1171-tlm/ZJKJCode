package com.ruoyi.zjkj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.zjkj.domain.ZjkjEqpPro;
import com.ruoyi.zjkj.mapper.ZjkjEqpProMapper;
import com.ruoyi.zjkj.service.IZjkjEqpProService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备-产品-方案明细Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-28
 */
@Service
public class ZjkjEqpProServiceImpl implements IZjkjEqpProService 
{
    @Autowired
    private ZjkjEqpProMapper zjkjEqpProMapper;

    /**
     * 查询设备-产品-方案明细
     * 
     * @param eqpId 设备-产品-方案明细ID
     * @return 设备-产品-方案明细
     */
    @Override
    public ZjkjEqpPro selectZjkjEqpProById(Long eqpId)
    {
        return zjkjEqpProMapper.selectZjkjEqpProById(eqpId);
    }

    /**
     * 查询设备-产品-方案明细列表
     * 
     * @param zjkjEqpPro 设备-产品-方案明细
     * @return 设备-产品-方案明细
     */
    @Override
    public List<ZjkjEqpPro> selectZjkjEqpProList(ZjkjEqpPro zjkjEqpPro)
    {
        return zjkjEqpProMapper.selectZjkjEqpProList(zjkjEqpPro);
    }

    /**
     * 新增设备-产品-方案明细
     * 
     * @param zjkjEqpPro 设备-产品-方案明细
     * @return 结果
     */
    @Override
    public int insertZjkjEqpPro(ZjkjEqpPro zjkjEqpPro)
    {
        return zjkjEqpProMapper.insertZjkjEqpPro(zjkjEqpPro);
    }

    /**
     * 修改设备-产品-方案明细
     * 
     * @param zjkjEqpPro 设备-产品-方案明细
     * @return 结果
     */
    @Override
    public int updateZjkjEqpPro(ZjkjEqpPro zjkjEqpPro)
    {
        return zjkjEqpProMapper.updateZjkjEqpPro(zjkjEqpPro);
    }

    /**
     * 删除设备-产品-方案明细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjEqpProByIds(String ids)
    {
        return zjkjEqpProMapper.deleteZjkjEqpProByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备-产品-方案明细信息
     * 
     * @param eqpId 设备-产品-方案明细ID
     * @return 结果
     */
    @Override
    public int deleteZjkjEqpProById(Long eqpId)
    {
        return zjkjEqpProMapper.deleteZjkjEqpProById(eqpId);
    }
}
