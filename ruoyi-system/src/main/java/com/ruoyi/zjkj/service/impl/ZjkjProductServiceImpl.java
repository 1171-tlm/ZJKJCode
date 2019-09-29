package com.ruoyi.zjkj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.zjkj.mapper.ZjkjProductMapper;
import com.ruoyi.zjkj.domain.ZjkjProduct;
import com.ruoyi.zjkj.service.IZjkjProductService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品Service业务层处理
 * 
 * @author taoliming
 * @date 2019-09-29
 */
@Service
public class ZjkjProductServiceImpl implements IZjkjProductService 
{
    @Autowired
    private ZjkjProductMapper zjkjProductMapper;

    /**
     * 查询商品
     * 
     * @param proId 商品ID
     * @return 商品
     */
    @Override
    public ZjkjProduct selectZjkjProductById(Long proId)
    {
        return zjkjProductMapper.selectZjkjProductById(proId);
    }

    /**
     * 查询商品列表
     * 
     * @param zjkjProduct 商品
     * @return 商品
     */
    @Override
    public List<ZjkjProduct> selectZjkjProductList(ZjkjProduct zjkjProduct)
    {
        return zjkjProductMapper.selectZjkjProductList(zjkjProduct);
    }

    /**
     * 新增商品
     * 
     * @param zjkjProduct 商品
     * @return 结果
     */
    @Override
    public int insertZjkjProduct(ZjkjProduct zjkjProduct)
    {
        zjkjProduct.setCreateTime(DateUtils.getNowDate());
        return zjkjProductMapper.insertZjkjProduct(zjkjProduct);
    }

    /**
     * 修改商品
     * 
     * @param zjkjProduct 商品
     * @return 结果
     */
    @Override
    public int updateZjkjProduct(ZjkjProduct zjkjProduct)
    {
        zjkjProduct.setUpdateTime(DateUtils.getNowDate());
        return zjkjProductMapper.updateZjkjProduct(zjkjProduct);
    }

    /**
     * 删除商品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZjkjProductByIds(String ids)
    {
        return zjkjProductMapper.deleteZjkjProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品信息
     * 
     * @param proId 商品ID
     * @return 结果
     */
    @Override
    public int deleteZjkjProductById(Long proId)
    {
        return zjkjProductMapper.deleteZjkjProductById(proId);
    }
}
