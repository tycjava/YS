package com.ruoyi.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.domain.FileUploading;
import com.ruoyi.mapper.FileUploadingMapper;
import com.ruoyi.service.IFileUploadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2020-04-29
 */
@Service
public class FileUploadingServiceImpl implements IFileUploadingService
{
    @Autowired
    private FileUploadingMapper fileUploadingMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param fId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public FileUploading selectFileUploadingById(Long fId)
    {
        return fileUploadingMapper.selectFileUploadingById(fId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param fileUploading 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FileUploading> selectFileUploadingList(FileUploading fileUploading)
    {
        return fileUploadingMapper.selectFileUploadingList(fileUploading);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param fileUploading 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFileUploading(FileUploading fileUploading)
    {
        return fileUploadingMapper.insertFileUploading(fileUploading);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param fileUploading 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFileUploading(FileUploading fileUploading)
    {
        return fileUploadingMapper.updateFileUploading(fileUploading);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFileUploadingByIds(String ids)
    {
        return fileUploadingMapper.deleteFileUploadingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param fId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFileUploadingById(Long fId)
    {
        return fileUploadingMapper.deleteFileUploadingById(fId);
    }

}
