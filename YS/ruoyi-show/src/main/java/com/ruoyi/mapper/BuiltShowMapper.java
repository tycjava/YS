package com.ruoyi.mapper;

import java.util.List;

import com.ruoyi.domain.BuiltShow;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2020-04-28
 */
public interface BuiltShowMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param bId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BuiltShow selectBuiltShowById(Long bId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param builtShow 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BuiltShow> selectBuiltShowList(BuiltShow builtShow);

    /**
     * 新增【请填写功能名称】
     *
     * @param builtShow 【请填写功能名称】
     * @return 结果
     */
    public int insertBuiltShow(BuiltShow builtShow);

    /**
     * 修改【请填写功能名称】
     *
     * @param builtShow 【请填写功能名称】
     * @return 结果
     */
    public int updateBuiltShow(BuiltShow builtShow);

    /**
     * 删除【请填写功能名称】
     *
     * @param bId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBuiltShowById(Long bId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param bIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBuiltShowByIds(String[] bIds);
}
