package com.ruoyi.zjkj.service;

import com.ruoyi.zjkj.domain.ZjkjStock;
import java.util.List;

/**
 * 库存Service接口
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public interface IZjkjStockService 
{
    /**
     * 查询库存
     * 
     * @param stockId 库存ID
     * @return 库存
     */
    public ZjkjStock selectZjkjStockById(Long stockId);

    /**
     * 查询库存列表
     * 
     * @param zjkjStock 库存
     * @return 库存集合
     */
    public List<ZjkjStock> selectZjkjStockList(ZjkjStock zjkjStock);

    /**
     * 新增库存
     * 
     * @param zjkjStock 库存
     * @return 结果
     */
    public int insertZjkjStock(ZjkjStock zjkjStock);

    /**
     * 修改库存
     * 
     * @param zjkjStock 库存
     * @return 结果
     */
    public int updateZjkjStock(ZjkjStock zjkjStock);

    /**
     * 批量删除库存
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjStockByIds(String ids);

    /**
     * 删除库存信息
     * 
     * @param stockId 库存ID
     * @return 结果
     */
    public int deleteZjkjStockById(Long stockId);
}
