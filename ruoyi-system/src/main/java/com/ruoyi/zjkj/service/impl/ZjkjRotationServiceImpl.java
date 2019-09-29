package com.ruoyi.zjkj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zjkj.mapper.ZjkjRotationMapper;
import com.ruoyi.zjkj.domain.ZjkjRotation;
import com.ruoyi.zjkj.service.IZjkjRotationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 轮播图设置Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-29
 */
@Service
public class ZjkjRotationServiceImpl implements IZjkjRotationService 
{
    @Autowired
    private ZjkjRotationMapper zjkjRotationMapper;

    /**
     * 查询轮播图设置
     * 
     * @param id 轮播图设置ID
     * @return 轮播图设置
     */
    @Override
    public ZjkjRotation selectZjkjRotationById(Long id)
    {
        return zjkjRotationMapper.selectZjkjRotationById(id);
    }

    /**
     * 查询轮播图设置列表
     * 
     * @param zjkjRotation 轮播图设置
     * @return 轮播图设置
     */
    @Override
    public List<ZjkjRotation> selectZjkjRotationList(ZjkjRotation zjkjRotation)
    {
        return zjkjRotationMapper.selectZjkjRotationList(zjkjRotation);
    }

    /**
     * 新增轮播图设置
     * 
     * @param zjkjRotation 轮播图设置
     * @return 结果
     */
    @Override
    public int insertZjkjRotation(ZjkjRotation zjkjRotation)
    {
        zjkjRotation.setCreateTime(DateUtils.getNowDate());
        return zjkjRotationMapper.insertZjkjRotation(zjkjRotation);
    }

    /**
     * 修改轮播图设置
     * 
     * @param zjkjRotation 轮播图设置
     * @return 结果
     */
    @Override
    public int updateZjkjRotation(ZjkjRotation zjkjRotation)
    {
        zjkjRotation.setUpdateTime(DateUtils.getNowDate());
        return zjkjRotationMapper.updateZjkjRotation(zjkjRotation);
    }

    /**
     * 删除轮播图设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjRotationByIds(String ids)
    {
        return zjkjRotationMapper.deleteZjkjRotationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除轮播图设置信息
     * 
     * @param id 轮播图设置ID
     * @return 结果
     */
    @Override
    public int deleteZjkjRotationById(Long id)
    {
        return zjkjRotationMapper.deleteZjkjRotationById(id);
    }
}
