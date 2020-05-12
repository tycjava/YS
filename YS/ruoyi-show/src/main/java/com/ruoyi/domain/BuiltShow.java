package com.ruoyi.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 built_show
 *
 * @author ruoyi
 * @date 2020-04-28
 */
public class BuiltShow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 系统编号 */
    private Long bId;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String bName;

    /** 项目编号 */
    @Excel(name = "项目编号")
    private Long bNumber;

    /** 采购人 */
    @Excel(name = "采购人")
    private String bTenderee;

    /** 委托金额 */
    @Excel(name = "委托金额")
    private String bMoney;

    /** 采购方式 */
    @Excel(name = "采购方式")
    private Long bPattern;

    /** 项目资质（政府/非政府） */
    @Excel(name = "项目资质", readConverterExp = "政=府/非政府")
    private String bPosition;

    /** 项目类型（服务，工程，货物） */
    @Excel(name = "项目类型", readConverterExp = "服=务，工程，货物")
    private String bForm;

    /** 项目地域 */
    @Excel(name = "项目地域")
    private String bTerritory;

    /** 项目经理 */
    @Excel(name = "项目经理")
    private String bManager;

    /** 项目承揽人 */
    @Excel(name = "项目承揽人")
    private String bPrincipal;

    /** 备案日期 */
    @Excel(name = "备案日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bDate;

    /** 项目状态 */
    @Excel(name = "项目状态")
    private String bStatus;

    public void setbId(Long bId)
    {
        this.bId = bId;
    }

    public Long getbId()
    {
        return bId;
    }
    public void setbName(String bName)
    {
        this.bName = bName;
    }

    public String getbName()
    {
        return bName;
    }
    public void setbNumber(Long bNumber)
    {
        this.bNumber = bNumber;
    }

    public Long getbNumber()
    {
        return bNumber;
    }
    public void setbTenderee(String bTenderee)
    {
        this.bTenderee = bTenderee;
    }

    public String getbTenderee()
    {
        return bTenderee;
    }
    public void setbMoney(String bMoney)
    {
        this.bMoney = bMoney;
    }

    public String getbMoney()
    {
        return bMoney;
    }
    public void setbPattern(Long bPattern)
    {
        this.bPattern = bPattern;
    }

    public Long getbPattern()
    {
        return bPattern;
    }
    public void setbPosition(String bPosition)
    {
        this.bPosition = bPosition;
    }

    public String getbPosition()
    {
        return bPosition;
    }
    public void setbForm(String bForm)
    {
        this.bForm = bForm;
    }

    public String getbForm()
    {
        return bForm;
    }
    public void setbTerritory(String bTerritory)
    {
        this.bTerritory = bTerritory;
    }

    public String getbTerritory()
    {
        return bTerritory;
    }
    public void setbManager(String bManager)
    {
        this.bManager = bManager;
    }

    public String getbManager()
    {
        return bManager;
    }
    public void setbPrincipal(String bPrincipal)
    {
        this.bPrincipal = bPrincipal;
    }

    public String getbPrincipal()
    {
        return bPrincipal;
    }
    public void setbDate(Date bDate)
    {
        this.bDate = bDate;
    }

    public Date getbDate()
    {
        return bDate;
    }
    public void setbStatus(String bStatus)
    {
        this.bStatus = bStatus;
    }

    public String getbStatus()
    {
        return bStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("bId", getbId())
            .append("bName", getbName())
            .append("bNumber", getbNumber())
            .append("bTenderee", getbTenderee())
            .append("bMoney", getbMoney())
            .append("bPattern", getbPattern())
            .append("bPosition", getbPosition())
            .append("bForm", getbForm())
            .append("bTerritory", getbTerritory())
            .append("bManager", getbManager())
            .append("bPrincipal", getbPrincipal())
            .append("bDate", getbDate())
            .append("bStatus", getbStatus())
            .toString();
    }
}
