package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.VacateMapper;
import com.ruoyi.domain.Vacate;
import com.ruoyi.service.IVacateService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2020-04-29
 */
@Service
public class VacateServiceImpl implements IVacateService
{
    @Autowired
    private VacateMapper vacateMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param vId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Vacate selectVacateById(Long vId)
    {
        return vacateMapper.selectVacateById(vId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param vacate 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Vacate> selectVacateList(Vacate vacate)
    {
        return vacateMapper.selectVacateList(vacate);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param vacate 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVacate(Vacate vacate)
    {
        return vacateMapper.insertVacate(vacate);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param vacate 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVacate(Vacate vacate)
    {
        return vacateMapper.updateVacate(vacate);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteVacateByIds(String ids)
    {
        return vacateMapper.deleteVacateByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param vId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteVacateById(Long vId)
    {
        return vacateMapper.deleteVacateById(vId);
    }
}
