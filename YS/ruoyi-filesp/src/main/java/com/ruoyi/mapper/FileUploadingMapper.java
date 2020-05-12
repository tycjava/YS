package com.ruoyi.mapper;

import java.util.List;
import com.ruoyi.domain.FileUploading;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public interface FileUploadingMapper
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
     * 删除【请填写功能名称】
     *
     * @param fId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFileUploadingById(Long fId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param fIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteFileUploadingByIds(String[] fIds);
}
