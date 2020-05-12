package com.ruoyi.mapper;

import com.ruoyi.domain.Expend;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public interface ExpendMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param chId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Expend selectChargeById(Long chId);

    /**
     * 查询【请填写功能名称】服务费不为0
     *
     * @param  【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public List<Expend> selectChargeServe(Expend charge);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param charge 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Expend> selectChargeList(Expend charge);

    /**
     * 新增【请填写功能名称】
     *
     * @param charge 【请填写功能名称】
     * @return 结果
     */
    public int insertCharge(Expend charge);

    /**
     * 修改【请填写功能名称】
     *
     * @param charge 【请填写功能名称】
     * @return 结果
     */
    public int updateCharge(Expend charge);

    /**
     * 删除【请填写功能名称】
     *
     * @param chId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteChargeById(Long chId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param chIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteChargeByIds(String[] chIds);
    /*
    无参查询所有
     */

}
