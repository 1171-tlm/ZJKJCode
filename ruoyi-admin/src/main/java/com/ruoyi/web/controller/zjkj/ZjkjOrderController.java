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
import com.ruoyi.zjkj.domain.ZjkjOrder;
import com.ruoyi.zjkj.service.IZjkjOrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单管理Controller
 * 
 * @author taoliming
 * @date 2019-09-29
 */
@Controller
@RequestMapping("/zjkj/order")
public class ZjkjOrderController extends BaseController
{
    private String prefix = "zjkj/order";

    @Autowired
    private IZjkjOrderService zjkjOrderService;

    @RequiresPermissions("zjkj:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    /**
     * 查询订单管理列表
     */
    @RequiresPermissions("zjkj:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZjkjOrder zjkjOrder)
    {
        startPage();
        List<ZjkjOrder> list = zjkjOrderService.selectZjkjOrderList(zjkjOrder);
        return getDataTable(list);
    }

    /**
     * 导出订单管理列表
     */
    @RequiresPermissions("zjkj:order:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ZjkjOrder zjkjOrder)
    {
        List<ZjkjOrder> list = zjkjOrderService.selectZjkjOrderList(zjkjOrder);
        ExcelUtil<ZjkjOrder> util = new ExcelUtil<ZjkjOrder>(ZjkjOrder.class);
        return util.exportExcel(list, "order");
    }

    /**
     * 新增订单管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存订单管理
     */
    @RequiresPermissions("zjkj:order:add")
    @Log(title = "订单管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ZjkjOrder zjkjOrder)
    {
        return toAjax(zjkjOrderService.insertZjkjOrder(zjkjOrder));
    }

    /**
     * 修改订单管理
     */
    @GetMapping("/edit/{orderId}")
    public String edit(@PathVariable("orderId") Long orderId, ModelMap mmap)
    {
        ZjkjOrder zjkjOrder = zjkjOrderService.selectZjkjOrderById(orderId);
        mmap.put("zjkjOrder", zjkjOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单管理
     */
    @RequiresPermissions("zjkj:order:edit")
    @Log(title = "订单管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZjkjOrder zjkjOrder)
    {
        return toAjax(zjkjOrderService.updateZjkjOrder(zjkjOrder));
    }

    /**
     * 删除订单管理
     */
    @RequiresPermissions("zjkj:order:remove")
    @Log(title = "订单管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(zjkjOrderService.deleteZjkjOrderByIds(ids));
    }
}
