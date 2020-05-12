package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.ChargeMapper;
import com.ruoyi.domain.Charge;
import com.ruoyi.service.IChargeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2020-04-29
 */
@Service
public class ChargeServiceImpl implements IChargeService
{
    @Autowired
    private ChargeMapper chargeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param chId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Charge selectChargeById(Long chId)
    {
        return chargeMapper.selectChargeById(chId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param charge 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Charge> selectChargeList(Charge charge)
    {
        return chargeMapper.selectChargeList(charge);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param charge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCharge(Charge charge)
    {
        return chargeMapper.insertCharge(charge);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param charge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCharge(Charge charge)
    {
        return chargeMapper.updateCharge(charge);
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
        return chargeMapper.deleteChargeByIds(Convert.toStrArray(ids));
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
        return chargeMapper.deleteChargeById(chId);
    }
}
