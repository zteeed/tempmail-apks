package com.tempmail.db;

import com.tempmail.utils.g;
import java.util.Calendar;
import java.util.List;
import org.greenrobot.greendao.DaoException;

public class EmailAddressTable implements Comparable<EmailAddressTable> {
    private transient DaoSession daoSession;
    private String domain;
    private List<EmailTable> emailList;
    private String emailPrefix;
    private Long endTime = 0L;
    private String fullEmailAddress;
    private Long id;
    private Boolean isDefault;
    private Boolean isInfinity;
    private transient EmailAddressTableDao myDao;
    private Long startTime = 0L;

    public EmailAddressTable(String str, String str2, String str3, Boolean bool) {
        this.fullEmailAddress = str;
        this.emailPrefix = str2;
        this.domain = str3;
        this.isDefault = bool;
    }

    private void __throwIfDetached() {
        if (this.myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    public void __setDaoSession(DaoSession daoSession2) {
        this.daoSession = daoSession2;
        this.myDao = daoSession2 != null ? daoSession2.getEmailAddressTableDao() : null;
    }

    public void delete() {
        __throwIfDetached();
        this.myDao.delete(this);
    }

    public String getDomain() {
        return this.domain;
    }

    public List<EmailTable> getEmailList() {
        if (this.emailList == null) {
            __throwIfDetached();
            List<EmailTable> _queryEmailAddressTable_EmailList = this.daoSession.getEmailTableDao()._queryEmailAddressTable_EmailList(this.fullEmailAddress);
            synchronized (this) {
                if (this.emailList == null) {
                    this.emailList = _queryEmailAddressTable_EmailList;
                }
            }
        }
        return this.emailList;
    }

    public String getEmailPrefix() {
        return this.emailPrefix;
    }

    public Long getEndTime() {
        Long l = this.endTime;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    public String getFullEmailAddress() {
        return this.fullEmailAddress;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Boolean getIsInfinity() {
        Boolean bool = this.isInfinity;
        return bool == null ? Boolean.FALSE : bool;
    }

    public Long getStartTime() {
        Long l = this.startTime;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    public boolean isDomainExpired() {
        return g.u(this.daoSession, this.domain) == null;
    }

    public boolean isExpired() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        return !getIsInfinity().booleanValue() && (timeInMillis < getStartTime().longValue() || timeInMillis > getEndTime().longValue());
    }

    public void refresh() {
        __throwIfDetached();
        this.myDao.refresh(this);
    }

    public synchronized void resetEmailList() {
        this.emailList = null;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setEmailPrefix(String str) {
        this.emailPrefix = str;
    }

    public void setEndTime(Long l) {
        this.endTime = l;
    }

    public void setFullEmailAddress(String str) {
        this.fullEmailAddress = str;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setIsDefault(Boolean bool) {
        this.isDefault = bool;
    }

    public void setIsInfinity(Boolean bool) {
        this.isInfinity = bool;
    }

    public void setStartTime(Long l) {
        this.startTime = l;
    }

    public void update() {
        __throwIfDetached();
        this.myDao.update(this);
    }

    public int compareTo(EmailAddressTable emailAddressTable) {
        if (getEndTime() == null || emailAddressTable.getEndTime() == null) {
            return 0;
        }
        return getEndTime().compareTo(emailAddressTable.getEndTime());
    }

    public EmailAddressTable() {
    }

    public EmailAddressTable(Long l) {
        this.id = l;
    }

    public EmailAddressTable(Long l, String str, String str2, String str3, Boolean bool, Long l2, Long l3, Boolean bool2) {
        this.id = l;
        this.fullEmailAddress = str;
        this.emailPrefix = str2;
        this.domain = str3;
        this.isDefault = bool;
        this.startTime = l2;
        this.endTime = l3;
        this.isInfinity = bool2;
    }
}
