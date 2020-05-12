package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.SalaryMapper;
import com.ruoyi.domain.Salary;
import com.ruoyi.service.ISalaryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2020-04-28
 */
@Service
public class SalaryServiceImpl implements ISalaryService
{
    @Autowired
    private SalaryMapper salaryMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param sId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Salary selectSalaryById(Long sId)
    {
        return salaryMapper.selectSalaryById(sId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param salary 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Salary> selectSalaryList(Salary salary)
    {
        return salaryMapper.selectSalaryList(salary);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param salary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSalary(Salary salary)
    {
        return salaryMapper.insertSalary(salary);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param salary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSalary(Salary salary)
    {
        return salaryMapper.updateSalary(salary);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSalaryByIds(String ids)
    {
        return salaryMapper.deleteSalaryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param sId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSalaryById(Long sId)
    {
        return salaryMapper.deleteSalaryById(sId);
    }
}
