package com.ruoyi.web.controller.salary;

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
import com.ruoyi.domain.Salary;
import com.ruoyi.service.ISalaryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2020-04-28
 */
@Controller
@RequestMapping("/salary/salary")
public class SalaryController extends BaseController
{
    private String prefix = "salary/salary";

    @Autowired
    private ISalaryService salaryService;

    @RequiresPermissions("salary:salary:view")
    @GetMapping()
    public String salary()
    {
        return prefix + "/salary";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("salary:salary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Salary salary)
    {
        startPage();
        List<Salary> list = salaryService.selectSalaryList(salary);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("salary:salary:export")
    @Log(title = "【导出】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Salary salary)
    {
        List<Salary> list = salaryService.selectSalaryList(salary);
        ExcelUtil<Salary> util = new ExcelUtil<Salary>(Salary.class);
        return util.exportExcel(list, "salary");
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
    @RequiresPermissions("salary:salary:add")
    @Log(title = "【新增】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Salary salary)
    {
        return toAjax(salaryService.insertSalary(salary));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{sId}")
    public String edit(@PathVariable("sId") Long sId, ModelMap mmap)
    {
        Salary salary = salaryService.selectSalaryById(sId);
        mmap.put("salary", salary);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("salary:salary:edit")
    @Log(title = "【修改】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Salary salary)
    {
        return toAjax(salaryService.updateSalary(salary));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("salary:salary:remove")
    @Log(title = "【删除】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(salaryService.deleteSalaryByIds(ids));
    }
}
