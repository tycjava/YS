package com.ruoyi.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 salary
 *
 * @author ruoyi
 * @date 2020-04-28
 */
public class Salary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工资id */
    private Long sId;

    /** 人员姓名 */
    @Excel(name = "人员姓名")
    private String sName;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private Double sBasic;

    /** 应出勤天数 */
    @Excel(name = "应出勤天数")
    private String sShould;

    /** 工资 */
    @Excel(name = "工资")
    private Double sSalary;

    /** 奖金 */
    @Excel(name = "奖金")
    private String sAward;

    /** 交通补贴 */
    @Excel(name = "交通补贴")
    private String sSubsidy;

    /** 应发工资小计 */
    @Excel(name = "应发工资小计")
    private String sSubtotal1;

    /** 请假天数 */
    @Excel(name = "请假天数")
    private String sLeave;

    /** 应扣金额 */
    @Excel(name = "应扣金额")
    private String sDeduct;

    /** 处罚金额 */
    @Excel(name = "处罚金额")
    private String sPunish;

    /** 应扣工资小计 */
    @Excel(name = "应扣工资小计")
    private String sSubtotal2;

    /** 报销金额 */
    @Excel(name = "报销金额")
    private String sBaoxiao;

    /** 实发工资 */
    @Excel(name = "实发工资")
    private String sPractical;

    /** 备注 */
    @Excel(name = "备注")
    private String sRemarks;

    /** 工资时间 */
    @Excel(name = "工资时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sTime;

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
    public void setsBasic(Double sBasic)
    {
        this.sBasic = sBasic;
    }

    public Double getsBasic()
    {
        return sBasic;
    }
    public void setsShould(String sShould)
    {
        this.sShould = sShould;
    }

    public String getsShould()
    {
        return sShould;
    }
    public void setsSalary(Double sSalary)
    {
        this.sSalary = sSalary;
    }

    public Double getsSalary()
    {
        return sSalary;
    }
    public void setsAward(String sAward)
    {
        this.sAward = sAward;
    }

    public String getsAward()
    {
        return sAward;
    }
    public void setsSubsidy(String sSubsidy)
    {
        this.sSubsidy = sSubsidy;
    }

    public String getsSubsidy()
    {
        return sSubsidy;
    }
    public void setsSubtotal1(String sSubtotal1)
    {
        this.sSubtotal1 = sSubtotal1;
    }

    public String getsSubtotal1()
    {
        return sSubtotal1;
    }
    public void setsLeave(String sLeave)
    {
        this.sLeave = sLeave;
    }

    public String getsLeave()
    {
        return sLeave;
    }
    public void setsDeduct(String sDeduct)
    {
        this.sDeduct = sDeduct;
    }

    public String getsDeduct()
    {
        return sDeduct;
    }
    public void setsPunish(String sPunish)
    {
        this.sPunish = sPunish;
    }

    public String getsPunish()
    {
        return sPunish;
    }
    public void setsSubtotal2(String sSubtotal2)
    {
        this.sSubtotal2 = sSubtotal2;
    }

    public String getsSubtotal2()
    {
        return sSubtotal2;
    }
    public void setsBaoxiao(String sBaoxiao)
    {
        this.sBaoxiao = sBaoxiao;
    }

    public String getsBaoxiao()
    {
        return sBaoxiao;
    }
    public void setsPractical(String sPractical)
    {
        this.sPractical = sPractical;
    }

    public String getsPractical()
    {
        return sPractical;
    }
    public void setsRemarks(String sRemarks)
    {
        this.sRemarks = sRemarks;
    }

    public String getsRemarks()
    {
        return sRemarks;
    }
    public void setsTime(Date sTime)
    {
        this.sTime = sTime;
    }

    public Date getsTime()
    {
        return sTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("sName", getsName())
            .append("sBasic", getsBasic())
            .append("sShould", getsShould())
            .append("sSalary", getsSalary())
            .append("sAward", getsAward())
            .append("sSubsidy", getsSubsidy())
            .append("sSubtotal1", getsSubtotal1())
            .append("sLeave", getsLeave())
            .append("sDeduct", getsDeduct())
            .append("sPunish", getsPunish())
            .append("sSubtotal2", getsSubtotal2())
            .append("sBaoxiao", getsBaoxiao())
            .append("sPractical", getsPractical())
            .append("sRemarks", getsRemarks())
            .append("sTime", getsTime())
            .toString();
    }
}
