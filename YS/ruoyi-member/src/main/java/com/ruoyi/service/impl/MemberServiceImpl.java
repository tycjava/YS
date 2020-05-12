package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mapper.MemberMapper;
import com.ruoyi.domain.Member;
import com.ruoyi.service.IMemberService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2020-04-29
 */
@Service
public class MemberServiceImpl implements IMemberService
{
    @Autowired
    private MemberMapper memberMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param mId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Member selectMemberById(Long mId)
    {
        return memberMapper.selectMemberById(mId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param member 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Member> selectMemberList(Member member)
    {
        return memberMapper.selectMemberList(member);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param member 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMember(Member member)
    {
        return memberMapper.insertMember(member);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param member 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMember(Member member)
    {
        return memberMapper.updateMember(member);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMemberByIds(String ids)
    {
        return memberMapper.deleteMemberByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param mId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteMemberById(Long mId)
    {
        return memberMapper.deleteMemberById(mId);
    }
}
