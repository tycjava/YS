package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.Salary;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-04-28
 */
public interface ISalaryService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param sId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Salary selectSalaryById(Long sId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param salary 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Salary> selectSalaryList(Salary salary);

    /**
     * 新增【请填写功能名称】
     *
     * @param salary 【请填写功能名称】
     * @return 结果
     */
    public int insertSalary(Salary salary);

    /**
     * 修改【请填写功能名称】
     *
     * @param salary 【请填写功能名称】
     * @return 结果
     */
    public int updateSalary(Salary salary);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSalaryByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param sId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSalaryById(Long sId);
}
