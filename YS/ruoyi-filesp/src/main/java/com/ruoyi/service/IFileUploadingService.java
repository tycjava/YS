package com.ruoyi.service;

import com.ruoyi.domain.FileUploading;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public interface IFileUploadingService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param fId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public FileUploading selectFileUploadingById(Long fId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param fileUploading 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FileUploading> selectFileUploadingList(FileUploading fileUploading);

    /**
     * 新增【请填写功能名称】
     *
     * @param fileUploading 【请填写功能名称】
     * @return 结果
     */
    public int insertFileUploading(FileUploading fileUploading);

    /**
     * 修改【请填写功能名称】
     *
     * @param fileUploading 【请填写功能名称】
     * @return 结果
     */
    public int updateFileUploading(FileUploading fileUploading);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFileUploadingByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param fId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFileUploadingById(Long fId);


}
