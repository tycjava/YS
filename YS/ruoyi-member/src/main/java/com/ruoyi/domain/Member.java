package com.ruoyi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 member
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public class Member extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 成员id */
    private Long mId;

    /** 项目主持人 */
    @Excel(name = "项目主持人")
    private String mMember;

    /** 项目记录人 */
    @Excel(name = "项目记录人")
    private String mRecorder;

    /** 项目监标人 */
    @Excel(name = "项目监标人")
    private String mSupervision;

    /** 项目服务人 */
    @Excel(name = "项目服务人")
    private String mWaiter;

    /** 项目展示外键 */
    @Excel(name = "项目展示外键")
    private Long mB;

    public void setmId(Long mId)
    {
        this.mId = mId;
    }

    public Long getmId()
    {
        return mId;
    }
    public void setmMember(String mMember)
    {
        this.mMember = mMember;
    }

    public String getmMember()
    {
        return mMember;
    }
    public void setmRecorder(String mRecorder)
    {
        this.mRecorder = mRecorder;
    }

    public String getmRecorder()
    {
        return mRecorder;
    }
    public void setmSupervision(String mSupervision)
    {
        this.mSupervision = mSupervision;
    }

    public String getmSupervision()
    {
        return mSupervision;
    }
    public void setmWaiter(String mWaiter)
    {
        this.mWaiter = mWaiter;
    }

    public String getmWaiter()
    {
        return mWaiter;
    }
    public void setMB(Long mB)
    {
        this.mB = mB;
    }

    public Long getMB()
    {
        return mB;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mId", getmId())
            .append("mMember", getmMember())
            .append("mRecorder", getmRecorder())
            .append("mSupervision", getmSupervision())
            .append("mWaiter", getmWaiter())
            .append("mB", getMB())
            .toString();
    }
}
