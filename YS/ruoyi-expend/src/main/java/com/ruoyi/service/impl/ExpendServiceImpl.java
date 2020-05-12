package com.ruoyi.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.domain.Expend;
import com.ruoyi.mapper.ExpendMapper;
import com.ruoyi.service.IExpendService;
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
public class ExpendServiceImpl implements IExpendService
{
    @Autowired
    private ExpendMapper expendMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param chId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Expend selectChargeById(Long chId)
    {
        return expendMapper.selectChargeById(chId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param charge 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Expend> selectChargeList(Expend charge)
    {
        return expendMapper.selectChargeList(charge);
    }

    /**
     * 查询【请填写功能名称】服务费不为0
     *
     * @param charge 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Expend> selectChargeServe(Expend charge)
    {
        return expendMapper.selectChargeServe(charge);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param charge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCharge(Expend charge)
    {
        return expendMapper.insertCharge(charge);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param charge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCharge(Expend charge)
    {
        return expendMapper.updateCharge(charge);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteChargeByIds(String ids)
    {
        return expendMapper.deleteChargeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param chId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteChargeById(Long chId)
    {
        return expendMapper.deleteChargeById(chId);
    }



}
