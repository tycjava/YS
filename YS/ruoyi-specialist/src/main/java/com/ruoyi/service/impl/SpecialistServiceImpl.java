package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.SpecialistMapper;
import com.ruoyi.domain.Specialist;
import com.ruoyi.service.ISpecialistService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2020-04-29
 */
@Service
public class SpecialistServiceImpl implements ISpecialistService
{
    @Autowired
    private SpecialistMapper specialistMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param sId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Specialist selectSpecialistById(Long sId)
    {
        return specialistMapper.selectSpecialistById(sId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param specialist 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Specialist> selectSpecialistList(Specialist specialist)
    {
        return specialistMapper.selectSpecialistList(specialist);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param specialist 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSpecialist(Specialist specialist)
    {
        return specialistMapper.insertSpecialist(specialist);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param specialist 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSpecialist(Specialist specialist)
    {
        return specialistMapper.updateSpecialist(specialist);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSpecialistByIds(String ids)
    {
        return specialistMapper.deleteSpecialistByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param sId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSpecialistById(Long sId)
    {
        return specialistMapper.deleteSpecialistById(sId);
    }
}
