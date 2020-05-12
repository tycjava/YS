package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.Charge;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public interface IChargeService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param chId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Charge selectChargeById(Long chId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param charge 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Charge> selectChargeList(Charge charge);

    /**
     * 新增【请填写功能名称】
     *
     * @param charge 【请填写功能名称】
     * @return 结果
     */
    public int insertCharge(Charge charge);

    /**
     * 修改【请填写功能名称】
     *
     * @param charge 【请填写功能名称】
     * @return 结果
     */
    public int updateCharge(Charge charge);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteChargeByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param chId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteChargeById(Long chId);
}
