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
import com.ruoyi.zjkj.domain.ZjkjHotel;
import com.ruoyi.zjkj.service.IZjkjHotelService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 酒店列表Controller
 * 
 * @author taoliming
 * @date 2019-09-27
 */
@Controller
@RequestMapping("/zjkj/hotel")
public class ZjkjHotelController extends BaseController
{
    private String prefix = "zjkj/hotel";

    @Autowired
    private IZjkjHotelService zjkjHotelService;

    @RequiresPermissions("zjkj:hotel:view")
    @GetMapping()
    public String hotel()
    {
        return prefix + "/hotel";
    }

    /**
     * 查询酒店列表列表
     */
    @RequiresPermissions("zjkj:hotel:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZjkjHotel zjkjHotel)
    {
        startPage();
        List<ZjkjHotel> list = zjkjHotelService.selectZjkjHotelList(zjkjHotel);
        return getDataTable(list);
    }

    /**
     * 导出酒店列表列表
     */
    @RequiresPermissions("zjkj:hotel:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ZjkjHotel zjkjHotel)
    {
        List<ZjkjHotel> list = zjkjHotelService.selectZjkjHotelList(zjkjHotel);
        ExcelUtil<ZjkjHotel> util = new ExcelUtil<ZjkjHotel>(ZjkjHotel.class);
        return util.exportExcel(list, "hotel");
    }

    /**
     * 新增酒店列表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存酒店列表
     */
    @RequiresPermissions("zjkj:hotel:add")
    @Log(title = "酒店列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ZjkjHotel zjkjHotel)
    {
        return toAjax(zjkjHotelService.insertZjkjHotel(zjkjHotel));
    }

    /**
     * 修改酒店列表
     */
    @GetMapping("/edit/{hotelId}")
    public String edit(@PathVariable("hotelId") Long hotelId, ModelMap mmap)
    {
        ZjkjHotel zjkjHotel = zjkjHotelService.selectZjkjHotelById(hotelId);
        mmap.put("zjkjHotel", zjkjHotel);
        return prefix + "/edit";
    }

    /**
     * 修改保存酒店列表
     */
    @RequiresPermissions("zjkj:hotel:edit")
    @Log(title = "酒店列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZjkjHotel zjkjHotel)
    {
        return toAjax(zjkjHotelService.updateZjkjHotel(zjkjHotel));
    }

    /**
     * 删除酒店列表
     */
    @RequiresPermissions("zjkj:hotel:remove")
    @Log(title = "酒店列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(zjkjHotelService.deleteZjkjHotelByIds(ids));
    }
    
    
}
