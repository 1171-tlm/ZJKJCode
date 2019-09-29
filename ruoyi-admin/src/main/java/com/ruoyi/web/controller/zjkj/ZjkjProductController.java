package com.ruoyi.web.controller.zjkj;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.zjkj.domain.ZjkjProduct;
import com.ruoyi.zjkj.service.IZjkjProductService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品Controller
 * 
 * @author taoliming
 * @date 2019-09-29
 */
@Controller
@RequestMapping("/zjkj/product")
public class ZjkjProductController extends BaseController
{
    private String prefix = "zjkj/product";

    @Autowired
    private IZjkjProductService zjkjProductService;

    @RequiresPermissions("zjkj:product:view")
    @GetMapping()
    public String product()
    {
        return prefix + "/product";
    }

    /**
     * 查询商品列表
     */
    @RequiresPermissions("zjkj:product:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZjkjProduct zjkjProduct)
    {
        startPage();
        List<ZjkjProduct> list = zjkjProductService.selectZjkjProductList(zjkjProduct);
        return getDataTable(list);
    }

    /**
     * 导出商品列表
     */
    @RequiresPermissions("zjkj:product:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ZjkjProduct zjkjProduct)
    {
        List<ZjkjProduct> list = zjkjProductService.selectZjkjProductList(zjkjProduct);
        ExcelUtil<ZjkjProduct> util = new ExcelUtil<ZjkjProduct>(ZjkjProduct.class);
        return util.exportExcel(list, "product");
    }

    /**
     * 新增商品
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品
     */
    @RequiresPermissions("zjkj:product:add")
    @Log(title = "商品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ZjkjProduct zjkjProduct)
    {
        return toAjax(zjkjProductService.insertZjkjProduct(zjkjProduct));
    }

    /**
     * 修改商品
     */
    @GetMapping("/edit/{proId}")
    public String edit(@PathVariable("proId") Long proId, ModelMap mmap)
    {
        ZjkjProduct zjkjProduct = zjkjProductService.selectZjkjProductById(proId);
        mmap.put("zjkjProduct", zjkjProduct);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品
     */
    @RequiresPermissions("zjkj:product:edit")
    @Log(title = "商品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZjkjProduct zjkjProduct)
    {
        return toAjax(zjkjProductService.updateZjkjProduct(zjkjProduct));
    }

    /**
     * 删除商品
     */
    @RequiresPermissions("zjkj:product:remove")
    @Log(title = "商品", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(zjkjProductService.deleteZjkjProductByIds(ids));
    }
}
