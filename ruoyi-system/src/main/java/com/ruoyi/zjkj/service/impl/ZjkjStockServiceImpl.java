package com.ruoyi.zjkj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zjkj.mapper.ZjkjStockMapper;
import com.ruoyi.zjkj.domain.ZjkjStock;
import com.ruoyi.zjkj.service.IZjkjStockService;
import com.ruoyi.common.core.text.Convert;

/**
 * 库存Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-29
 */
@Service
public class ZjkjStockServiceImpl implements IZjkjStockService 
{
    @Autowired
    private ZjkjStockMapper zjkjStockMapper;

    /**
     * 查询库存
     * 
     * @param stockId 库存ID
     * @return 库存
     */
    @Override
    public ZjkjStock selectZjkjStockById(Long stockId)
    {
        return zjkjStockMapper.selectZjkjStockById(stockId);
    }

    /**
     * 查询库存列表
     * 
     * @param zjkjStock 库存
     * @return 库存
     */
    @Override
    public List<ZjkjStock> selectZjkjStockList(ZjkjStock zjkjStock)
    {
        return zjkjStockMapper.selectZjkjStockList(zjkjStock);
    }

    /**
     * 新增库存
     * 
     * @param zjkjStock 库存
     * @return 结果
     */
    @Override
    public int insertZjkjStock(ZjkjStock zjkjStock)
    {
        zjkjStock.setCreateTime(DateUtils.getNowDate());
        return zjkjStockMapper.insertZjkjStock(zjkjStock);
    }

    /**
     * 修改库存
     * 
     * @param zjkjStock 库存
     * @return 结果
     */
    @Override
    public int updateZjkjStock(ZjkjStock zjkjStock)
    {
        zjkjStock.setUpdateTime(DateUtils.getNowDate());
        return zjkjStockMapper.updateZjkjStock(zjkjStock);
    }

    /**
     * 删除库存对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjStockByIds(String ids)
    {
        return zjkjStockMapper.deleteZjkjStockByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除库存信息
     * 
     * @param stockId 库存ID
     * @return 结果
     */
    @Override
    public int deleteZjkjStockById(Long stockId)
    {
        return zjkjStockMapper.deleteZjkjStockById(stockId);
    }
}
