package com.tempmail.db;

import java.util.Map;
import org.greenrobot.greendao.c;
import org.greenrobot.greendao.h.d;
import org.greenrobot.greendao.i.a;

public class DaoSession extends c {
    private final AttachmentInfoTableDao attachmentInfoTableDao = new AttachmentInfoTableDao(this.attachmentInfoTableDaoConfig, this);
    private final a attachmentInfoTableDaoConfig;
    private final DomainTableDao domainTableDao = new DomainTableDao(this.domainTableDaoConfig, this);
    private final a domainTableDaoConfig;
    private final EmailAddressTableDao emailAddressTableDao = new EmailAddressTableDao(this.emailAddressTableDaoConfig, this);
    private final a emailAddressTableDaoConfig;
    private final EmailTableDao emailTableDao = new EmailTableDao(this.emailTableDaoConfig, this);
    private final a emailTableDaoConfig;
    private final MailHtmlTableDao mailHtmlTableDao = new MailHtmlTableDao(this.mailHtmlTableDaoConfig, this);
    private final a mailHtmlTableDaoConfig;
    private final MailTextOnlyTableDao mailTextOnlyTableDao = new MailTextOnlyTableDao(this.mailTextOnlyTableDaoConfig, this);
    private final a mailTextOnlyTableDaoConfig;
    private final MailTextTableDao mailTextTableDao = new MailTextTableDao(this.mailTextTableDaoConfig, this);
    private final a mailTextTableDaoConfig;
    private final PurchaseTableDao purchaseTableDao = new PurchaseTableDao(this.purchaseTableDaoConfig, this);
    private final a purchaseTableDaoConfig;

    public DaoSession(org.greenrobot.greendao.g.a aVar, d dVar, Map<Class<? extends org.greenrobot.greendao.a<?, ?>>, a> map) {
        super(aVar);
        a c2 = map.get(EmailAddressTableDao.class).clone();
        this.emailAddressTableDaoConfig = c2;
        c2.e(dVar);
        a c3 = map.get(EmailTableDao.class).clone();
        this.emailTableDaoConfig = c3;
        c3.e(dVar);
        a c4 = map.get(MailTextOnlyTableDao.class).clone();
        this.mailTextOnlyTableDaoConfig = c4;
        c4.e(dVar);
        a c5 = map.get(MailTextTableDao.class).clone();
        this.mailTextTableDaoConfig = c5;
        c5.e(dVar);
        a c6 = map.get(MailHtmlTableDao.class).clone();
        this.mailHtmlTableDaoConfig = c6;
        c6.e(dVar);
        a c7 = map.get(AttachmentInfoTableDao.class).clone();
        this.attachmentInfoTableDaoConfig = c7;
        c7.e(dVar);
        a c8 = map.get(DomainTableDao.class).clone();
        this.domainTableDaoConfig = c8;
        c8.e(dVar);
        a c9 = map.get(PurchaseTableDao.class).clone();
        this.purchaseTableDaoConfig = c9;
        c9.e(dVar);
        registerDao(EmailAddressTable.class, this.emailAddressTableDao);
        registerDao(EmailTable.class, this.emailTableDao);
        registerDao(MailTextOnlyTable.class, this.mailTextOnlyTableDao);
        registerDao(MailTextTable.class, this.mailTextTableDao);
        registerDao(MailHtmlTable.class, this.mailHtmlTableDao);
        registerDao(AttachmentInfoTable.class, this.attachmentInfoTableDao);
        registerDao(DomainTable.class, this.domainTableDao);
        registerDao(PurchaseTable.class, this.purchaseTableDao);
    }

    public void clear() {
        this.emailAddressTableDaoConfig.b();
        this.emailTableDaoConfig.b();
        this.mailTextOnlyTableDaoConfig.b();
        this.mailTextTableDaoConfig.b();
        this.mailHtmlTableDaoConfig.b();
        this.attachmentInfoTableDaoConfig.b();
        this.domainTableDaoConfig.b();
        this.purchaseTableDaoConfig.b();
    }

    public AttachmentInfoTableDao getAttachmentInfoTableDao() {
        return this.attachmentInfoTableDao;
    }

    public DomainTableDao getDomainTableDao() {
        return this.domainTableDao;
    }

    public EmailAddressTableDao getEmailAddressTableDao() {
        return this.emailAddressTableDao;
    }

    public EmailTableDao getEmailTableDao() {
        return this.emailTableDao;
    }

    public MailHtmlTableDao getMailHtmlTableDao() {
        return this.mailHtmlTableDao;
    }

    public MailTextOnlyTableDao getMailTextOnlyTableDao() {
        return this.mailTextOnlyTableDao;
    }

    public MailTextTableDao getMailTextTableDao() {
        return this.mailTextTableDao;
    }

    public PurchaseTableDao getPurchaseTableDao() {
        return this.purchaseTableDao;
    }
}
