package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.Specialist;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public interface ISpecialistService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param sId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Specialist selectSpecialistById(Long sId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param specialist 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Specialist> selectSpecialistList(Specialist specialist);

    /**
     * 新增【请填写功能名称】
     *
     * @param specialist 【请填写功能名称】
     * @return 结果
     */
    public int insertSpecialist(Specialist specialist);

    /**
     * 修改【请填写功能名称】
     *
     * @param specialist 【请填写功能名称】
     * @return 结果
     */
    public int updateSpecialist(Specialist specialist);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpecialistByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param sId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSpecialistById(Long sId);
}
