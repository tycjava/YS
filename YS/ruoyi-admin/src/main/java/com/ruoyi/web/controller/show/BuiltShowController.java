package com.ruoyi.web.controller.show;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.domain.BuiltShow;
import com.ruoyi.service.IBuiltShowService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2020-04-28
 */
@Controller
@RequestMapping("/show/show")
public class BuiltShowController extends BaseController
{
    private String prefix = "show/show";

    @Autowired
    private IBuiltShowService builtShowService;

    @RequiresPermissions("show:show:view")
    @GetMapping()
    public String show()
    {
        return prefix + "/show";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("show:show:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BuiltShow builtShow)
    {
        startPage();
        List<BuiltShow> list = builtShowService.selectBuiltShowList(builtShow);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("show:show:export")
    @Log(title = "导出", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BuiltShow builtShow)
    {
        List<BuiltShow> list = builtShowService.selectBuiltShowList(builtShow);
        ExcelUtil<BuiltShow> util = new ExcelUtil<BuiltShow>(BuiltShow.class);
        return util.exportExcel(list, "show");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("show:show:add")
    @Log(title = "新增", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BuiltShow builtShow)
    {
        return toAjax(builtShowService.insertBuiltShow(builtShow));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{bId}")
    public String edit(@PathVariable("bId") Long bId, ModelMap mmap)
    {
        BuiltShow builtShow = builtShowService.selectBuiltShowById(bId);
        mmap.put("builtShow", builtShow);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("show:show:edit")
    @Log(title = "修改", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BuiltShow builtShow)
    {
        return toAjax(builtShowService.updateBuiltShow(builtShow));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("show:show:remove")
    @Log(title = "删除", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(builtShowService.deleteBuiltShowByIds(ids));
    }

    /**
     * 表格细节视图
     */
    @GetMapping( "/detail/{bId}")
    public String detail(@PathVariable("bId") Long bId, ModelMap mmap)
    {
        BuiltShow builtShow = builtShowService.selectBuiltShowById(bId);
        mmap.put("builtShow", builtShow);
        return prefix + "/detail";
    }
}
