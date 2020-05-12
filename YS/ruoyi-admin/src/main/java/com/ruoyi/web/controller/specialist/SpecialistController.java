package com.ruoyi.web.controller.specialist;

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
import com.ruoyi.domain.Specialist;
import com.ruoyi.service.ISpecialistService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2020-04-29
 */
@Controller
@RequestMapping("/specialist/specialist")
public class SpecialistController extends BaseController
{
    private String prefix = "specialist/specialist";

    @Autowired
    private ISpecialistService specialistService;

    @RequiresPermissions("specialist:specialist:view")
    @GetMapping()
    public String specialist()
    {
        return prefix + "/specialist";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("specialist:specialist:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Specialist specialist)
    {
        startPage();
        List<Specialist> list = specialistService.selectSpecialistList(specialist);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("specialist:specialist:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Specialist specialist)
    {
        List<Specialist> list = specialistService.selectSpecialistList(specialist);
        ExcelUtil<Specialist> util = new ExcelUtil<Specialist>(Specialist.class);
        return util.exportExcel(list, "specialist");
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
    @RequiresPermissions("specialist:specialist:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Specialist specialist)
    {
        return toAjax(specialistService.insertSpecialist(specialist));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{sId}")
    public String edit(@PathVariable("sId") Long sId, ModelMap mmap)
    {
        Specialist specialist = specialistService.selectSpecialistById(sId);
        mmap.put("specialist", specialist);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("specialist:specialist:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Specialist specialist)
    {
        return toAjax(specialistService.updateSpecialist(specialist));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("specialist:specialist:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(specialistService.deleteSpecialistByIds(ids));
    }
}
