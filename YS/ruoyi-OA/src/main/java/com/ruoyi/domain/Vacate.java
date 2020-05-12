package com.ruoyi.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 vacate
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public class Vacate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 请假条id */
    private Long vId;

    /** 请假人姓名 */
    @Excel(name = "请假人姓名")
    private String vName;

    /** 请假时间 */
    @Excel(name = "请假时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date vTime;

    /** 请假天数 */
    @Excel(name = "请假天数")
    private String vDay;

    /** 请假事由 */
    @Excel(name = "请假事由")
    private String vRemarks;

    /** 假条状态 */
    @Excel(name = "假条状态")
    private String vStatus;

    public void setvId(Long vId)
    {
        this.vId = vId;
    }

    public Long getvId()
    {
        return vId;
    }
    public void setvName(String vName)
    {
        this.vName = vName;
    }

    public String getvName()
    {
        return vName;
    }
    public void setvTime(Date vTime)
    {
        this.vTime = vTime;
    }

    public Date getvTime()
    {
        return vTime;
    }
    public void setvDay(String vDay)
    {
        this.vDay = vDay;
    }

    public String getvDay()
    {
        return vDay;
    }
    public void setvRemarks(String vRemarks)
    {
        this.vRemarks = vRemarks;
    }

    public String getvRemarks()
    {
        return vRemarks;
    }
    public void setvStatus(String vStatus)
    {
        this.vStatus = vStatus;
    }

    public String getvStatus()
    {
        return vStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("vId", getvId())
            .append("vName", getvName())
            .append("vTime", getvTime())
            .append("vDay", getvDay())
            .append("vRemarks", getvRemarks())
            .append("vStatus", getvStatus())
            .toString();
    }
}
