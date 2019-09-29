package com.ruoyi.zjkj.mapper;

import com.ruoyi.zjkj.domain.ZjkjProduct;
import java.util.List;

/**
 * 商品Mapper接口
 * 
 * @author taoliming
 * @date 2019-09-29
 */
public interface ZjkjProductMapper 
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
     * 删除商品
     * 
     * @param proId 商品ID
     * @return 结果
     */
    public int deleteZjkjProductById(Long proId);

    /**
     * 批量删除商品
     * 
     * @param proIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteZjkjProductByIds(String[] proIds);
}
