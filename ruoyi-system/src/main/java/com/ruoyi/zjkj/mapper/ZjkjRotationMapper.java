package com.ruoyi.zjkj.mapper;

import com.ruoyi.zjkj.domain.ZjkjRotation;
import java.util.List;

/**
 * 轮播图设置Mapper接口
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public interface ZjkjRotationMapper 
{
    /**
     * 查询轮播图设置
     * 
     * @param id 轮播图设置ID
     * @return 轮播图设置
     */
    public ZjkjRotation selectZjkjRotationById(Long id);

    /**
     * 查询轮播图设置列表
     * 
     * @param zjkjRotation 轮播图设置
     * @return 轮播图设置集合
     */
    public List<ZjkjRotation> selectZjkjRotationList(ZjkjRotation zjkjRotation);

    /**
     * 新增轮播图设置
     * 
     * @param zjkjRotation 轮播图设置
     * @return 结果
     */
    public int insertZjkjRotation(ZjkjRotation zjkjRotation);

    /**
     * 修改轮播图设置
     * 
     * @param zjkjRotation 轮播图设置
     * @return 结果
     */
    public int updateZjkjRotation(ZjkjRotation zjkjRotation);

    /**
     * 删除轮播图设置
     * 
     * @param id 轮播图设置ID
     * @return 结果
     */
    public int deleteZjkjRotationById(Long id);

    /**
     * 批量删除轮播图设置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjRotationByIds(String[] ids);
}
