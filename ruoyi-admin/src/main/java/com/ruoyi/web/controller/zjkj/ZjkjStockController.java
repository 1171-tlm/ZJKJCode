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
import com.ruoyi.zjkj.domain.ZjkjStock;
import com.ruoyi.zjkj.service.IZjkjStockService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 库存Controller
 * 
 * @author taoliming
 * @date 2019-09-29
 */
@Controller
@RequestMapping("/zjkj/stock")
public class ZjkjStockController extends BaseController
{
    private String prefix = "zjkj/stock";

    @Autowired
    private IZjkjStockService zjkjStockService;

    @RequiresPermissions("zjkj:stock:view")
    @GetMapping()
    public String stock()
    {
        return prefix + "/stock";
    }

    /**
     * 查询库存列表
     */
    @RequiresPermissions("zjkj:stock:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZjkjStock zjkjStock)
    {
        startPage();
        List<ZjkjStock> list = zjkjStockService.selectZjkjStockList(zjkjStock);
        return getDataTable(list);
    }

    /**
     * 导出库存列表
     */
    @RequiresPermissions("zjkj:stock:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ZjkjStock zjkjStock)
    {
        List<ZjkjStock> list = zjkjStockService.selectZjkjStockList(zjkjStock);
        ExcelUtil<ZjkjStock> util = new ExcelUtil<ZjkjStock>(ZjkjStock.class);
        return util.exportExcel(list, "stock");
    }

    /**
     * 新增库存
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存库存
     */
    @RequiresPermissions("zjkj:stock:add")
    @Log(title = "库存", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ZjkjStock zjkjStock)
    {
        return toAjax(zjkjStockService.insertZjkjStock(zjkjStock));
    }

    /**
     * 修改库存
     */
    @GetMapping("/edit/{stockId}")
    public String edit(@PathVariable("stockId") Long stockId, ModelMap mmap)
    {
        ZjkjStock zjkjStock = zjkjStockService.selectZjkjStockById(stockId);
        mmap.put("zjkjStock", zjkjStock);
        return prefix + "/edit";
    }

    /**
     * 修改保存库存
     */
    @RequiresPermissions("zjkj:stock:edit")
    @Log(title = "库存", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZjkjStock zjkjStock)
    {
        return toAjax(zjkjStockService.updateZjkjStock(zjkjStock));
    }

    /**
     * 删除库存
     */
    @RequiresPermissions("zjkj:stock:remove")
    @Log(title = "库存", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(zjkjStockService.deleteZjkjStockByIds(ids));
    }
}
