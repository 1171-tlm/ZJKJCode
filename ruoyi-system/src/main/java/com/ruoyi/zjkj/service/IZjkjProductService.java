package com.ruoyi.zjkj.service;

import com.ruoyi.zjkj.domain.ZjkjProduct;
import java.util.List;

/**
 * 商品Service接口
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public interface IZjkjProductService 
{
    /**
     * 查询商品
     * 
     * @param proId 商品ID
     * @return 商品
     */
    public ZjkjProduct selectZjkjProductById(Long proId);

    /**
     * 查询商品列表
     * 
     * @param zjkjProduct 商品
     * @return 商品集合
     */
    public List<ZjkjProduct> selectZjkjProductList(ZjkjProduct zjkjProduct);

    /**
     * 新增商品
     * 
     * @param zjkjProduct 商品
     * @return 结果
     */
    public int insertZjkjProduct(ZjkjProduct zjkjProduct);

    /**
     * 修改商品
     * 
     * @param zjkjProduct 商品
     * @return 结果
     */
    public int updateZjkjProduct(ZjkjProduct zjkjProduct);

    /**
     * 批量删除商品
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjProductByIds(String ids);

    /**
     * 删除商品信息
     * 
     * @param proId 商品ID
     * @return 结果
     */
    public int deleteZjkjProductById(Long proId);
}
