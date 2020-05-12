package com.ruoyi.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 charge
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public class Charge extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 金额id */
    private Long chId;

    /** 金额类型(服务费/标书费/保证金) */
    @Excel(name = "金额类型(服务费/标书费/保证金)")
    private String chType;

    /** 保证金缴纳日期 */
    @Excel(name = "保证金缴纳日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chDatePledge;

    /** 服务费缴纳日期 */
    @Excel(name = "服务费缴纳日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chDateServe;

    /** 标书费缴纳日期 */
    @Excel(name = "标书费缴纳日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chDateBid;

    /** 保证金金额 */
    @Excel(name = "保证金金额")
    private Long chMoneyPledge;

    /** 服务费金额 */
    @Excel(name = "服务费金额")
    private Long chMoneyServe;

    /** 标书费金额 */
    @Excel(name = "标书费金额")
    private Long chMoneyBid;

    /** 保证金标段 */
    @Excel(name = "保证金标段")
    private String chSectionPledae;

    /** 服务费标段 */
    @Excel(name = "服务费标段")
    private String chSectionServe;

    /** 标书费标段 */
    @Excel(name = "标书费标段")
    private String chSectionBid;

    /** 保证金备注 */
    @Excel(name = "保证金备注")
    private String chRemarksPldae;

    /** 服务费备注 */
    @Excel(name = "服务费备注")
    private String chRemarksServe;

    /** 标书费发票号 */
    @Excel(name = "标书费发票号")
    private String chBillBid;

    /** 服务费发票号 */
    @Excel(name = "服务费发票号")
    private String chBillServe;

    /** 标书费发票日期 */
    @Excel(name = "标书费发票日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chBillBidDate;

    /** 服务费发票日期 */
    @Excel(name = "服务费发票日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chBillServeDate;

    /** 保证金退还金额 */
    @Excel(name = "保证金退还金额")
    private String chReturnPldaeMoney;

    /** 保证金退还日期 */
    @Excel(name = "保证金退还日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chReturnPldaeDate;

    /** 专家费 */
    @Excel(name = "专家费")
    private String chSpecialistMoney;

    /** 合计金额 */
    @Excel(name = "合计金额")
    private String chTotal;

    public void setChId(Long chId)
    {
        this.chId = chId;
    }

    public Long getChId()
    {
        return chId;
    }
    public void setChType(String chType)
    {
        this.chType = chType;
    }

    public String getChType()
    {
        return chType;
    }
    public void setChDatePledge(Date chDatePledge)
    {
        this.chDatePledge = chDatePledge;
    }

    public Date getChDatePledge()
    {
        return chDatePledge;
    }
    public void setChDateServe(Date chDateServe)
    {
        this.chDateServe = chDateServe;
    }

    public Date getChDateServe()
    {
        return chDateServe;
    }
    public void setChDateBid(Date chDateBid)
    {
        this.chDateBid = chDateBid;
    }

    public Date getChDateBid()
    {
        return chDateBid;
    }
    public void setChMoneyPledge(Long chMoneyPledge)
    {
        this.chMoneyPledge = chMoneyPledge;
    }

    public Long getChMoneyPledge()
    {
        return chMoneyPledge;
    }
    public void setChMoneyServe(Long chMoneyServe)
    {
        this.chMoneyServe = chMoneyServe;
    }

    public Long getChMoneyServe()
    {
        return chMoneyServe;
    }
    public void setChMoneyBid(Long chMoneyBid)
    {
        this.chMoneyBid = chMoneyBid;
    }

    public Long getChMoneyBid()
    {
        return chMoneyBid;
    }
    public void setChSectionPledae(String chSectionPledae)
    {
        this.chSectionPledae = chSectionPledae;
    }

    public String getChSectionPledae()
    {
        return chSectionPledae;
    }
    public void setChSectionServe(String chSectionServe)
    {
        this.chSectionServe = chSectionServe;
    }

    public String getChSectionServe()
    {
        return chSectionServe;
    }
    public void setChSectionBid(String chSectionBid)
    {
        this.chSectionBid = chSectionBid;
    }

    public String getChSectionBid()
    {
        return chSectionBid;
    }
    public void setChRemarksPldae(String chRemarksPldae)
    {
        this.chRemarksPldae = chRemarksPldae;
    }

    public String getChRemarksPldae()
    {
        return chRemarksPldae;
    }
    public void setChRemarksServe(String chRemarksServe)
    {
        this.chRemarksServe = chRemarksServe;
    }

    public String getChRemarksServe()
    {
        return chRemarksServe;
    }
    public void setChBillBid(String chBillBid)
    {
        this.chBillBid = chBillBid;
    }

    public String getChBillBid()
    {
        return chBillBid;
    }
    public void setChBillServe(String chBillServe)
    {
        this.chBillServe = chBillServe;
    }

    public String getChBillServe()
    {
        return chBillServe;
    }
    public void setChBillBidDate(Date chBillBidDate)
    {
        this.chBillBidDate = chBillBidDate;
    }

    public Date getChBillBidDate()
    {
        return chBillBidDate;
    }
    public void setChBillServeDate(Date chBillServeDate)
    {
        this.chBillServeDate = chBillServeDate;
    }

    public Date getChBillServeDate()
    {
        return chBillServeDate;
    }
    public void setChReturnPldaeMoney(String chReturnPldaeMoney)
    {
        this.chReturnPldaeMoney = chReturnPldaeMoney;
    }

    public String getChReturnPldaeMoney()
    {
        return chReturnPldaeMoney;
    }
    public void setChReturnPldaeDate(Date chReturnPldaeDate)
    {
        this.chReturnPldaeDate = chReturnPldaeDate;
    }

    public Date getChReturnPldaeDate()
    {
        return chReturnPldaeDate;
    }
    public void setChSpecialistMoney(String chSpecialistMoney)
    {
        this.chSpecialistMoney = chSpecialistMoney;
    }

    public String getChSpecialistMoney()
    {
        return chSpecialistMoney;
    }
    public void setChTotal(String chTotal)
    {
        this.chTotal = chTotal;
    }

    public String getChTotal()
    {
        return chTotal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("chId", getChId())
            .append("chType", getChType())
            .append("chDatePledge", getChDatePledge())
            .append("chDateServe", getChDateServe())
            .append("chDateBid", getChDateBid())
            .append("chMoneyPledge", getChMoneyPledge())
            .append("chMoneyServe", getChMoneyServe())
            .append("chMoneyBid", getChMoneyBid())
            .append("chSectionPledae", getChSectionPledae())
            .append("chSectionServe", getChSectionServe())
            .append("chSectionBid", getChSectionBid())
            .append("chRemarksPldae", getChRemarksPldae())
            .append("chRemarksServe", getChRemarksServe())
            .append("chBillBid", getChBillBid())
            .append("chBillServe", getChBillServe())
            .append("chBillBidDate", getChBillBidDate())
            .append("chBillServeDate", getChBillServeDate())
            .append("chReturnPldaeMoney", getChReturnPldaeMoney())
            .append("chReturnPldaeDate", getChReturnPldaeDate())
            .append("chSpecialistMoney", getChSpecialistMoney())
            .append("chTotal", getChTotal())
            .toString();
    }
}
