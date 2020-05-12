package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.Member;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public interface IMemberService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param mId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Member selectMemberById(Long mId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param member 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Member> selectMemberList(Member member);

    /**
     * 新增【请填写功能名称】
     *
     * @param member 【请填写功能名称】
     * @return 结果
     */
    public int insertMember(Member member);

    /**
     * 修改【请填写功能名称】
     *
     * @param member 【请填写功能名称】
     * @return 结果
     */
    public int updateMember(Member member);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMemberByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param mId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteMemberById(Long mId);
}
