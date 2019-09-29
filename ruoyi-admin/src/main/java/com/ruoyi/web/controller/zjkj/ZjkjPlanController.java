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
import com.ruoyi.zjkj.domain.ZjkjPlan;
import com.ruoyi.zjkj.service.IZjkjPlanService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品方案Controller
 * 
 * @author taoliming
 * @date 2019-09-28
 */
@Controller
@RequestMapping("/zjkj/plan") 
public class ZjkjPlanController extends BaseController
{
    private String prefix = "zjkj/plan";

    @Autowired
    private IZjkjPlanService zjkjPlanService;

    @RequiresPermissions("zjkj:plan:view")
    @GetMapping()
    public String plan()
    {
        return prefix + "/plan";
    }

    /**
     * 查询商品方案列表
     */
    @RequiresPermissions("zjkj:plan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZjkjPlan zjkjPlan)
    {
        startPage();
        List<ZjkjPlan> list = zjkjPlanService.selectZjkjPlanList(zjkjPlan);
        return getDataTable(list);
    }

    /**
     * 导出商品方案列表
     */
    @RequiresPermissions("zjkj:plan:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ZjkjPlan zjkjPlan)
    {
        List<ZjkjPlan> list = zjkjPlanService.selectZjkjPlanList(zjkjPlan);
        ExcelUtil<ZjkjPlan> util = new ExcelUtil<ZjkjPlan>(ZjkjPlan.class);
        return util.exportExcel(list, "plan");
    }

    /**
     * 新增商品方案
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品方案
     */
    @RequiresPermissions("zjkj:plan:add")
    @Log(title = "商品方案", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ZjkjPlan zjkjPlan)
    {
        return toAjax(zjkjPlanService.insertZjkjPlan(zjkjPlan));
    }

    /**
     * 修改商品方案
     */
    @GetMapping("/edit/{planId}")
    public String edit(@PathVariable("planId") Long planId, ModelMap mmap)
    {
        ZjkjPlan zjkjPlan = zjkjPlanService.selectZjkjPlanById(planId);
        mmap.put("zjkjPlan", zjkjPlan);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品方案
     */
    @RequiresPermissions("zjkj:plan:edit")
    @Log(title = "商品方案", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZjkjPlan zjkjPlan)
    {
        return toAjax(zjkjPlanService.updateZjkjPlan(zjkjPlan));
    }

    /**
     * 删除商品方案
     */
    @RequiresPermissions("zjkj:plan:remove")
    @Log(title = "商品方案", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(zjkjPlanService.deleteZjkjPlanByIds(ids));
    }
}
