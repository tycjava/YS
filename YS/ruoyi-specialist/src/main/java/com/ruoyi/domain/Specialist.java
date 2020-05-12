package com.ruoyi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 specialist
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public class Specialist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 专家id */
    private Long sId;

    /** 专家姓名 */
    @Excel(name = "专家姓名")
    private String sName;

    /** 专家姓名（0男 1女 2未知） */
    @Excel(name = "专家姓名", readConverterExp = "0=男,1=女,2=未知")
    private Long sSex;

    /** 专家专业 */
    @Excel(name = "专家专业")
    private String sExpert;

    /** 专家单位 */
    @Excel(name = "专家单位")
    private String sCompany;

    public void setsId(Long sId)
    {
        this.sId = sId;
    }

    public Long getsId()
    {
        return sId;
    }
    public void setsName(String sName)
    {
        this.sName = sName;
    }

    public String getsName()
    {
        return sName;
    }
    public void setsSex(Long sSex)
    {
        this.sSex = sSex;
    }

    public Long getsSex()
    {
        return sSex;
    }
    public void setsExpert(String sExpert)
    {
        this.sExpert = sExpert;
    }

    public String getsExpert()
    {
        return sExpert;
    }
    public void setsCompany(String sCompany)
    {
        this.sCompany = sCompany;
    }

    public String getsCompany()
    {
        return sCompany;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("sName", getsName())
            .append("sSex", getsSex())
            .append("sExpert", getsExpert())
            .append("sCompany", getsCompany())
            .toString();
    }
}
