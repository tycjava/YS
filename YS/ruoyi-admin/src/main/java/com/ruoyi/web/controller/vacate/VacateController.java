package com.ruoyi.web.controller.vacate;

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
import com.ruoyi.domain.Vacate;
import com.ruoyi.service.IVacateService;
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
@RequestMapping("/vacate/vacate")
public class VacateController extends BaseController
{
    private String prefix = "vacate/vacate";

    @Autowired
    private IVacateService vacateService;

    @RequiresPermissions("vacate:vacate:view")
    @GetMapping()
    public String vacate()
    {
        return prefix + "/vacate";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("vacate:vacate:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Vacate vacate)
    {
        startPage();
        List<Vacate> list = vacateService.selectVacateList(vacate);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("vacate:vacate:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Vacate vacate)
    {
        List<Vacate> list = vacateService.selectVacateList(vacate);
        ExcelUtil<Vacate> util = new ExcelUtil<Vacate>(Vacate.class);
        return util.exportExcel(list, "vacate");
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
    @RequiresPermissions("vacate:vacate:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Vacate vacate)
    {
        return toAjax(vacateService.insertVacate(vacate));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{vId}")
    public String edit(@PathVariable("vId") Long vId, ModelMap mmap)
    {
        Vacate vacate = vacateService.selectVacateById(vId);
        mmap.put("vacate", vacate);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("vacate:vacate:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Vacate vacate)
    {
        return toAjax(vacateService.updateVacate(vacate));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("vacate:vacate:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vacateService.deleteVacateByIds(ids));
    }
}
