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
import com.ruoyi.zjkj.domain.ZjkjRotation;
import com.ruoyi.zjkj.service.IZjkjRotationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 轮播图设置Controller
 * 
 * @author taoliming
 * @date 2019-09-29
 */
@Controller
@RequestMapping("/zjkj/rotation")
public class ZjkjRotationController extends BaseController
{
    private String prefix = "zjkj/rotation";

    @Autowired
    private IZjkjRotationService zjkjRotationService;

    @RequiresPermissions("zjkj:rotation:view")
    @GetMapping()
    public String rotation()
    {
        return prefix + "/rotation";
    }

    /**
     * 查询轮播图设置列表
     */
    @RequiresPermissions("zjkj:rotation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZjkjRotation zjkjRotation)
    {
        startPage();
        List<ZjkjRotation> list = zjkjRotationService.selectZjkjRotationList(zjkjRotation);
        return getDataTable(list);
    }

    /**
     * 导出轮播图设置列表
     */
    @RequiresPermissions("zjkj:rotation:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ZjkjRotation zjkjRotation)
    {
        List<ZjkjRotation> list = zjkjRotationService.selectZjkjRotationList(zjkjRotation);
        ExcelUtil<ZjkjRotation> util = new ExcelUtil<ZjkjRotation>(ZjkjRotation.class);
        return util.exportExcel(list, "rotation");
    }

    /**
     * 新增轮播图设置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存轮播图设置
     */
    @RequiresPermissions("zjkj:rotation:add")
    @Log(title = "轮播图设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ZjkjRotation zjkjRotation)
    {
        return toAjax(zjkjRotationService.insertZjkjRotation(zjkjRotation));
    }

    /**
     * 修改轮播图设置
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ZjkjRotation zjkjRotation = zjkjRotationService.selectZjkjRotationById(id);
        mmap.put("zjkjRotation", zjkjRotation);
        return prefix + "/edit";
    }

    /**
     * 修改保存轮播图设置
     */
    @RequiresPermissions("zjkj:rotation:edit")
    @Log(title = "轮播图设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZjkjRotation zjkjRotation)
    {
        return toAjax(zjkjRotationService.updateZjkjRotation(zjkjRotation));
    }

    /**
     * 删除轮播图设置
     */
    @RequiresPermissions("zjkj:rotation:remove")
    @Log(title = "轮播图设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(zjkjRotationService.deleteZjkjRotationByIds(ids));
    }
}
