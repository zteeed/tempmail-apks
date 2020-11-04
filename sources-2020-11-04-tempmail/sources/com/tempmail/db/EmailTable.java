package com.tempmail.db;

import java.io.Serializable;
import java.util.List;
import org.greenrobot.greendao.DaoException;

public class EmailTable implements Serializable {
    private List<AttachmentInfoTable> attachments;
    private transient DaoSession daoSession;
    private String eid;
    private String emailAddress;
    private Long emailAddressId;
    private String fromField;
    private List<MailHtmlTable> htmlList;
    private Long id;
    private Boolean isChecked;
    private Boolean isDeleted;
    private transient EmailTableDao myDao;
    private String subject;
    private List<MailTextTable> textList;
    private List<MailTextOnlyTable> textOnlyList;
    private Double timestamp;

    public EmailTable(String str, String str2, Boolean bool, String str3, String str4, Double d2, Boolean bool2) {
        this.emailAddress = str;
        this.eid = str2;
        this.isChecked = bool;
        this.fromField = str3;
        this.subject = str4;
        this.timestamp = d2;
        this.isDeleted = bool2;
    }

    private void __throwIfDetached() {
        if (this.myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    public void __setDaoSession(DaoSession daoSession2) {
        this.daoSession = daoSession2;
        this.myDao = daoSession2 != null ? daoSession2.getEmailTableDao() : null;
    }

    public void delete() {
        __throwIfDetached();
        this.myDao.delete(this);
    }

    public List<AttachmentInfoTable> getAttachments() {
        if (this.attachments == null) {
            __throwIfDetached();
            List<AttachmentInfoTable> _queryEmailTable_Attachments = this.daoSession.getAttachmentInfoTableDao()._queryEmailTable_Attachments(this.eid);
            synchronized (this) {
                if (this.attachments == null) {
                    this.attachments = _queryEmailTable_Attachments;
                }
            }
        }
        return this.attachments;
    }

    public String getEid() {
        return this.eid;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public Long getEmailAddressId() {
        return this.emailAddressId;
    }

    public String getFromField() {
        return this.fromField;
    }

    public List<MailHtmlTable> getHtmlList() {
        if (this.htmlList == null) {
            __throwIfDetached();
            List<MailHtmlTable> _queryEmailTable_HtmlList = this.daoSession.getMailHtmlTableDao()._queryEmailTable_HtmlList(this.eid);
            synchronized (this) {
                if (this.htmlList == null) {
                    this.htmlList = _queryEmailTable_HtmlList;
                }
            }
        }
        return this.htmlList;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getIsChecked() {
        return this.isChecked;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public String getSubject() {
        return this.subject;
    }

    public List<MailTextTable> getTextList() {
        if (this.textList == null) {
            __throwIfDetached();
            List<MailTextTable> _queryEmailTable_TextList = this.daoSession.getMailTextTableDao()._queryEmailTable_TextList(this.eid);
            synchronized (this) {
                if (this.textList == null) {
                    this.textList = _queryEmailTable_TextList;
                }
            }
        }
        return this.textList;
    }

    public List<MailTextOnlyTable> getTextOnlyList() {
        if (this.textOnlyList == null) {
            __throwIfDetached();
            List<MailTextOnlyTable> _queryEmailTable_TextOnlyList = this.daoSession.getMailTextOnlyTableDao()._queryEmailTable_TextOnlyList(this.eid);
            synchronized (this) {
                if (this.textOnlyList == null) {
                    this.textOnlyList = _queryEmailTable_TextOnlyList;
                }
            }
        }
        return this.textOnlyList;
    }

    public Double getTimestamp() {
        return this.timestamp;
    }

    public void refresh() {
        __throwIfDetached();
        this.myDao.refresh(this);
    }

    public synchronized void resetAttachments() {
        this.attachments = null;
    }

    public synchronized void resetHtmlList() {
        this.htmlList = null;
    }

    public synchronized void resetTextList() {
        this.textList = null;
    }

    public synchronized void resetTextOnlyList() {
        this.textOnlyList = null;
    }

    public void setEid(String str) {
        this.eid = str;
    }

    public void setEmailAddress(String str) {
        this.emailAddress = str;
    }

    public void setEmailAddressId(Long l) {
        this.emailAddressId = l;
    }

    public void setFromField(String str) {
        this.fromField = str;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setIsChecked(Boolean bool) {
        this.isChecked = bool;
    }

    public void setIsDeleted(Boolean bool) {
        this.isDeleted = bool;
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public void setTimestamp(Double d2) {
        this.timestamp = d2;
    }

    public void update() {
        __throwIfDetached();
        this.myDao.update(this);
    }

    public EmailTable() {
    }

    public EmailTable(Long l) {
        this.id = l;
    }

    public EmailTable(Long l, String str, Long l2, String str2, Boolean bool, String str3, String str4, Double d2, Boolean bool2) {
        this.id = l;
        this.emailAddress = str;
        this.emailAddressId = l2;
        this.eid = str2;
        this.isChecked = bool;
        this.fromField = str3;
        this.subject = str4;
        this.timestamp = d2;
        this.isDeleted = bool2;
    }
}
