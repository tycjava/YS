package com.ruoyi.web.controller.charge;

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
import com.ruoyi.domain.Charge;
import com.ruoyi.service.IChargeService;
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
@RequestMapping("/charge/charge")
public class ChargeController extends BaseController
{
    private String prefix = "charge/charge";

    @Autowired
    private IChargeService chargeService;

    @RequiresPermissions("charge:charge:view")
    @GetMapping()
    public String charge()
    {
        return prefix + "/charge";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("charge:charge:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Charge charge)
    {
        startPage();
        List<Charge> list = chargeService.selectChargeList(charge);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("charge:charge:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Charge charge)
    {
        List<Charge> list = chargeService.selectChargeList(charge);
        ExcelUtil<Charge> util = new ExcelUtil<Charge>(Charge.class);
        return util.exportExcel(list, "charge");
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
    @RequiresPermissions("charge:charge:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Charge charge)
    {
        return toAjax(chargeService.insertCharge(charge));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{chId}")
    public String edit(@PathVariable("chId") Long chId, ModelMap mmap)
    {
        Charge charge = chargeService.selectChargeById(chId);
        mmap.put("charge", charge);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("charge:charge:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Charge charge)
    {
        return toAjax(chargeService.updateCharge(charge));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("charge:charge:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(chargeService.deleteChargeByIds(ids));
    }
}
