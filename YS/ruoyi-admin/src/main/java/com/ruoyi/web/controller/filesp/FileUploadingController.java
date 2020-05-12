package com.ruoyi.web.controller.filesp;

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
import com.ruoyi.domain.FileUploading;
import com.ruoyi.service.IFileUploadingService;
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
@RequestMapping("/filesp/uploading")
public class FileUploadingController extends BaseController
{
    private String prefix = "filesp/uploading";

    @Autowired
    private IFileUploadingService fileUploadingService;

    @RequiresPermissions("filesp:uploading:view")
    @GetMapping()
    public String uploading()
    {
        return prefix + "/uploading";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("filesp:uploading:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FileUploading fileUploading)
    {
        startPage();
        List<FileUploading> list = fileUploadingService.selectFileUploadingList(fileUploading);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("filesp:uploading:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FileUploading fileUploading)
    {
        List<FileUploading> list = fileUploadingService.selectFileUploadingList(fileUploading);
        ExcelUtil<FileUploading> util = new ExcelUtil<FileUploading>(FileUploading.class);
        return util.exportExcel(list, "uploading");
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
    @RequiresPermissions("filesp:uploading:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FileUploading fileUploading)
    {
        return toAjax(fileUploadingService.insertFileUploading(fileUploading));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        FileUploading fileUploading = fileUploadingService.selectFileUploadingById(fId);
        mmap.put("fileUploading", fileUploading);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("filesp:uploading:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FileUploading fileUploading)
    {
        return toAjax(fileUploadingService.updateFileUploading(fileUploading));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("filesp:uploading:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fileUploadingService.deleteFileUploadingByIds(ids));
    }
}
