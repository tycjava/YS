package com.ruoyi.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 file_uploading
 *
 * @author ruoyi
 * @date 2020-04-29
 */
public class FileUploading extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文件id */
    private Long fId;

    /** 文件类别 */
    @Excel(name = "文件类别")
    private Long fType;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String fName;

    /** 附件上传 */
    @Excel(name = "附件上传")
    private String fAccessory;

    /** 上传人 */
    @Excel(name = "上传人")
    private String fPrincipal;

    /** 上传时间 */
    @Excel(name = "上传时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fTime;

    /** 限期公告 */
    @Excel(name = "限期公告", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fDeadline;

    /** 审批状态 */
    @Excel(name = "审批状态")
    private String fRatify;

    /** 项目展示外键（链接项目id） */
    @Excel(name = "项目展示外键", readConverterExp = "链=接项目id")
    private Long fB;

    public void setfId(Long fId)
    {
        this.fId = fId;
    }

    public Long getfId()
    {
        return fId;
    }
    public void setfType(Long fType)
    {
        this.fType = fType;
    }

    public Long getfType()
    {
        return fType;
    }
    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public String getfName()
    {
        return fName;
    }
    public void setfAccessory(String fAccessory)
    {
        this.fAccessory = fAccessory;
    }

    public String getfAccessory()
    {
        return fAccessory;
    }
    public void setfPrincipal(String fPrincipal)
    {
        this.fPrincipal = fPrincipal;
    }

    public String getfPrincipal()
    {
        return fPrincipal;
    }
    public void setfTime(Date fTime)
    {
        this.fTime = fTime;
    }

    public Date getfTime()
    {
        return fTime;
    }
    public void setfDeadline(Date fDeadline)
    {
        this.fDeadline = fDeadline;
    }

    public Date getfDeadline()
    {
        return fDeadline;
    }
    public void setfRatify(String fRatify)
    {
        this.fRatify = fRatify;
    }

    public String getfRatify()
    {
        return fRatify;
    }
    public void setFB(Long fB)
    {
        this.fB = fB;
    }

    public Long getFB()
    {
        return fB;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fType", getfType())
            .append("fName", getfName())
            .append("fAccessory", getfAccessory())
            .append("fPrincipal", getfPrincipal())
            .append("fTime", getfTime())
            .append("fDeadline", getfDeadline())
            .append("fRatify", getfRatify())
            .append("fB", getFB())
            .toString();
    }
}
