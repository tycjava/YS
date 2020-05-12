package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.Vacate;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public interface IVacateService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param vId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Vacate selectVacateById(Long vId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param vacate 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Vacate> selectVacateList(Vacate vacate);

    /**
     * 新增【请填写功能名称】
     *
     * @param vacate 【请填写功能名称】
     * @return 结果
     */
    public int insertVacate(Vacate vacate);

    /**
     * 修改【请填写功能名称】
     *
     * @param vacate 【请填写功能名称】
     * @return 结果
     */
    public int updateVacate(Vacate vacate);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteVacateByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param vId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteVacateById(Long vId);
}
