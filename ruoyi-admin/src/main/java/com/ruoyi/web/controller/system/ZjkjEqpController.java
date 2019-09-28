package com.ruoyi.web.controller.system;

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
import com.ruoyi.system.domain.ZjkjEqp;
import com.ruoyi.system.service.IZjkjEqpService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备信息Controller
 * 
 * @author taoliming
 * @date 2019-09-28
 */
@Controller
@RequestMapping("/system/eqp")
public class ZjkjEqpController extends BaseController
{
    private String prefix = "system/eqp";

    @Autowired
    private IZjkjEqpService zjkjEqpService;

    @RequiresPermissions("system:eqp:view")
    @GetMapping()
    public String eqp()
    {
        return prefix + "/eqp";
    }

    /**
     * 查询设备信息列表
     */
    @RequiresPermissions("system:eqp:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZjkjEqp zjkjEqp)
    {
        startPage();
        List<ZjkjEqp> list = zjkjEqpService.selectZjkjEqpList(zjkjEqp);
        return getDataTable(list);
    }

    /**
     * 导出设备信息列表
     */
    @RequiresPermissions("system:eqp:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ZjkjEqp zjkjEqp)
    {
        List<ZjkjEqp> list = zjkjEqpService.selectZjkjEqpList(zjkjEqp);
        ExcelUtil<ZjkjEqp> util = new ExcelUtil<ZjkjEqp>(ZjkjEqp.class);
        return util.exportExcel(list, "eqp");
    }

    /**
     * 新增设备信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备信息
     */
    @RequiresPermissions("system:eqp:add")
    @Log(title = "设备信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ZjkjEqp zjkjEqp)
    {
        return toAjax(zjkjEqpService.insertZjkjEqp(zjkjEqp));
    }

    /**
     * 修改设备信息
     */
    @GetMapping("/edit/{eqpId}")
    public String edit(@PathVariable("eqpId") Long eqpId, ModelMap mmap)
    {
        ZjkjEqp zjkjEqp = zjkjEqpService.selectZjkjEqpById(eqpId);
        mmap.put("zjkjEqp", zjkjEqp);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备信息
     */
    @RequiresPermissions("system:eqp:edit")
    @Log(title = "设备信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZjkjEqp zjkjEqp)
    {
        return toAjax(zjkjEqpService.updateZjkjEqp(zjkjEqp));
    }

    /**
     * 删除设备信息
     */
    @RequiresPermissions("system:eqp:remove")
    @Log(title = "设备信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(zjkjEqpService.deleteZjkjEqpByIds(ids));
    }
}
