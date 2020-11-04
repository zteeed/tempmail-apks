package com.tempmail.utils;

import com.tempmail.api.models.answers.Mail;
import com.tempmail.db.AttachmentInfoTable;
import com.tempmail.db.AttachmentInfoTableDao;
import com.tempmail.db.DaoSession;
import com.tempmail.db.DomainTable;
import com.tempmail.db.DomainTableDao;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.db.EmailAddressTableDao;
import com.tempmail.db.EmailTable;
import com.tempmail.db.EmailTableDao;
import com.tempmail.db.MailHtmlTable;
import com.tempmail.db.MailHtmlTableDao;
import com.tempmail.db.MailTextOnlyTable;
import com.tempmail.db.MailTextOnlyTableDao;
import com.tempmail.db.MailTextTable;
import com.tempmail.db.MailTextTableDao;
import com.tempmail.db.PurchaseTable;
import com.tempmail.db.PurchaseTableDao;
import com.tempmail.u.a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.greenrobot.greendao.j.h;
import org.greenrobot.greendao.j.j;

/* compiled from: DbUtils */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13117a = "g";

    public static List<PurchaseTable> A(DaoSession daoSession) {
        return daoSession.getPurchaseTableDao().queryBuilder().m();
    }

    public static long B(DaoSession daoSession, EmailAddressTable emailAddressTable, long j) {
        h queryBuilder = daoSession.getEmailTableDao().queryBuilder();
        queryBuilder.p(EmailTableDao.Properties.Timestamp.b(Long.valueOf(j)), EmailTableDao.Properties.EmailAddress.a(emailAddressTable.getFullEmailAddress()), EmailTableDao.Properties.IsChecked.a(Boolean.FALSE), EmailTableDao.Properties.IsDeleted.a(Boolean.FALSE));
        return queryBuilder.j();
    }

    public static void C(DaoSession daoSession, EmailAddressTable emailAddressTable) {
        h queryBuilder = daoSession.getEmailAddressTableDao().queryBuilder();
        queryBuilder.p(EmailAddressTableDao.Properties.IsDefault.a(Boolean.TRUE), EmailAddressTableDao.Properties.FullEmailAddress.d(emailAddressTable.getFullEmailAddress()));
        for (EmailAddressTable emailAddressTable2 : queryBuilder.m()) {
            emailAddressTable2.setIsDefault(Boolean.FALSE);
            J(daoSession, emailAddressTable2);
        }
    }

    public static void D(DaoSession daoSession) {
        daoSession.getEmailAddressTableDao().deleteAll();
    }

    public static void E(DaoSession daoSession, EmailAddressTable emailAddressTable) {
        daoSession.getEmailTableDao().deleteInTx(emailAddressTable.getEmailList());
    }

    public static void F(DaoSession daoSession, EmailAddressTable emailAddressTable) {
        daoSession.getEmailAddressTableDao().delete(emailAddressTable);
    }

    public static void G(DaoSession daoSession, String str) {
        String str2 = f13117a;
        m.b(str2, "removeEmailAddressesWithDomain " + str);
        h queryBuilder = daoSession.getEmailAddressTableDao().queryBuilder();
        queryBuilder.p(EmailAddressTableDao.Properties.Domain.a(str), new j[0]);
        queryBuilder.e().e();
    }

    public static void H(DaoSession daoSession, String str) {
        h queryBuilder = daoSession.getPurchaseTableDao().queryBuilder();
        queryBuilder.p(PurchaseTableDao.Properties.OriginalJson.a(str), new j[0]);
        queryBuilder.e().e();
    }

    public static void I(DaoSession daoSession, EmailTable emailTable) {
        EmailTableDao emailTableDao = daoSession.getEmailTableDao();
        emailTable.setIsChecked(Boolean.TRUE);
        emailTableDao.update(emailTable);
    }

    public static void J(DaoSession daoSession, EmailAddressTable emailAddressTable) {
        daoSession.getEmailAddressTableDao().update(emailAddressTable);
    }

    private static void a(DaoSession daoSession, Mail mail) {
        AttachmentInfoTableDao attachmentInfoTableDao = daoSession.getAttachmentInfoTableDao();
        if (mail.getAttachmentInfo() != null) {
            for (Mail.AttachmentInfo next : mail.getAttachmentInfo()) {
                attachmentInfoTableDao.insert(new AttachmentInfoTable(mail.getMailId(), next.getFilename(), Integer.valueOf(next.getId()), Long.valueOf(next.getSize()), next.getMimeType(), next.getCid()));
            }
        }
    }

    public static void b(DaoSession daoSession, List<DomainTable> list) {
        DomainTableDao domainTableDao = daoSession.getDomainTableDao();
        domainTableDao.deleteAll();
        domainTableDao.insertInTx(list);
    }

    public static void c(DaoSession daoSession, EmailAddressTable emailAddressTable) {
        EmailAddressTableDao emailAddressTableDao = daoSession.getEmailAddressTableDao();
        if (emailAddressTable.getStartTime() == null && emailAddressTable.getEndTime() == null) {
            emailAddressTable.setStartTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
            emailAddressTable.setEndTime(Long.valueOf(e.p()));
        }
        emailAddressTableDao.insert(emailAddressTable);
    }

    public static void d(DaoSession daoSession, EmailAddressTable emailAddressTable) {
        C(daoSession, emailAddressTable);
        c(daoSession, emailAddressTable);
    }

    public static boolean e(DaoSession daoSession, EmailAddressTable emailAddressTable) {
        h queryBuilder = daoSession.getEmailAddressTableDao().queryBuilder();
        queryBuilder.p(EmailAddressTableDao.Properties.FullEmailAddress.a(emailAddressTable.getFullEmailAddress()), new j[0]);
        if (queryBuilder.j() != 0) {
            return false;
        }
        c(daoSession, emailAddressTable);
        return true;
    }

    public static boolean f(DaoSession daoSession, String str, Mail mail) {
        EmailTableDao emailTableDao = daoSession.getEmailTableDao();
        if (h(emailTableDao, mail.getMailId())) {
            return false;
        }
        String str2 = f13117a;
        m.b(str2, "table not exist " + mail.getMailId());
        emailTableDao.insert(new EmailTable(str, mail.getMailId(), Boolean.FALSE, mail.getMailFrom(), mail.getMailSubject(), Double.valueOf(mail.getMailTimestamp()), Boolean.FALSE));
        o(daoSession, mail.getMailTextOnly(), mail.getMailId());
        n(daoSession, mail.getMailText(), mail.getMailId());
        m(daoSession, mail.getMailHtml(), mail.getMailId());
        a(daoSession, mail);
        return true;
    }

    public static void g(DaoSession daoSession, EmailAddressTable emailAddressTable) {
        String str = f13117a;
        m.b(str, "change to default " + emailAddressTable.getFullEmailAddress());
        C(daoSession, emailAddressTable);
        emailAddressTable.setIsDefault(Boolean.TRUE);
        J(daoSession, emailAddressTable);
    }

    public static boolean h(EmailTableDao emailTableDao, String str) {
        h queryBuilder = emailTableDao.queryBuilder();
        queryBuilder.p(EmailTableDao.Properties.Eid.a(str), new j[0]);
        if (queryBuilder.j() != 0) {
            return true;
        }
        return false;
    }

    public static void i(DaoSession daoSession) {
        daoSession.getEmailAddressTableDao().deleteAll();
        daoSession.getEmailTableDao().deleteAll();
        daoSession.getDomainTableDao().deleteAll();
        daoSession.getAttachmentInfoTableDao().deleteAll();
        daoSession.getMailTextTableDao().deleteAll();
        daoSession.getMailTextOnlyTableDao().deleteAll();
        daoSession.getMailHtmlTableDao().deleteAll();
    }

    public static void j(DaoSession daoSession, List<String> list) {
        h<EmailAddressTable> queryBuilder = daoSession.queryBuilder(EmailAddressTable.class);
        queryBuilder.p(EmailAddressTableDao.Properties.FullEmailAddress.e(list), new j[0]);
        queryBuilder.e().e();
    }

    private static void k(DaoSession daoSession, List<AttachmentInfoTable> list) {
        daoSession.getAttachmentInfoTableDao().deleteInTx(list);
    }

    public static void l(DaoSession daoSession, EmailTable emailTable) {
        k(daoSession, emailTable.getAttachments());
        EmailTableDao emailTableDao = daoSession.getEmailTableDao();
        emailTable.setIsDeleted(Boolean.TRUE);
        emailTableDao.update(emailTable);
    }

    public static void m(DaoSession daoSession, String str, String str2) {
        List<String> K = e.K(str);
        MailHtmlTableDao mailHtmlTableDao = daoSession.getMailHtmlTableDao();
        for (String mailHtmlTable : K) {
            mailHtmlTableDao.insert(new MailHtmlTable(mailHtmlTable, str2));
        }
    }

    public static void n(DaoSession daoSession, String str, String str2) {
        List<String> K = e.K(str);
        MailTextTableDao mailTextTableDao = daoSession.getMailTextTableDao();
        for (String mailTextTable : K) {
            mailTextTableDao.insert(new MailTextTable(mailTextTable, str2));
        }
    }

    public static void o(DaoSession daoSession, String str, String str2) {
        List<String> K = e.K(str);
        MailTextOnlyTableDao mailTextOnlyTableDao = daoSession.getMailTextOnlyTableDao();
        for (String mailTextOnlyTable : K) {
            mailTextOnlyTableDao.insert(new MailTextOnlyTable(mailTextOnlyTable, str2));
        }
    }

    public static a p(DaoSession daoSession) {
        List<EmailAddressTable> y = y(daoSession);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (EmailAddressTable next : y) {
            if (!next.isExpired() || !e.Q()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return new a(arrayList, arrayList2);
    }

    public static List<DomainTable> q(DaoSession daoSession) {
        h queryBuilder = daoSession.getDomainTableDao().queryBuilder();
        queryBuilder.p(DomainTableDao.Properties.ExpirationTimestamp.c(), new j[0]);
        return queryBuilder.m();
    }

    public static List<DomainTable> r(DaoSession daoSession) {
        List<DomainTable> q = q(daoSession);
        return q.size() == 0 ? v(daoSession) : q;
    }

    public static EmailAddressTable s(DaoSession daoSession) {
        EmailAddressTableDao emailAddressTableDao = daoSession.getEmailAddressTableDao();
        h queryBuilder = emailAddressTableDao.queryBuilder();
        queryBuilder.p(EmailAddressTableDao.Properties.IsDefault.a(Boolean.TRUE), new j[0]);
        List m = queryBuilder.m();
        if (!m.isEmpty()) {
            return (EmailAddressTable) m.get(0);
        }
        List loadAll = emailAddressTableDao.loadAll();
        if (loadAll.size() <= 0) {
            return null;
        }
        EmailAddressTable emailAddressTable = (EmailAddressTable) loadAll.get(0);
        emailAddressTable.setIsDefault(Boolean.TRUE);
        J(daoSession, emailAddressTable);
        return emailAddressTable;
    }

    public static List<EmailTable> t(DaoSession daoSession, long j) {
        return z(daoSession, s(daoSession), j);
    }

    public static List<DomainTable> u(DaoSession daoSession, String str) {
        h queryBuilder = daoSession.getDomainTableDao().queryBuilder();
        queryBuilder.p(DomainTableDao.Properties.Domain.a(str), new j[0]);
        return queryBuilder.m();
    }

    public static List<DomainTable> v(DaoSession daoSession) {
        return daoSession.getDomainTableDao().loadAll();
    }

    public static List<String> w(DaoSession daoSession) {
        List<DomainTable> r = r(daoSession);
        ArrayList arrayList = new ArrayList();
        for (DomainTable domain : r) {
            arrayList.add(domain.getDomain());
        }
        return arrayList;
    }

    public static List<EmailTable> x(DaoSession daoSession, String str) {
        String str2 = f13117a;
        m.b(str2, "get mails where email id  " + str);
        h queryBuilder = daoSession.getEmailTableDao().queryBuilder();
        queryBuilder.p(EmailTableDao.Properties.Eid.a(str), new j[0]);
        return queryBuilder.m();
    }

    public static List<EmailAddressTable> y(DaoSession daoSession) {
        return daoSession.getEmailAddressTableDao().loadAll();
    }

    public static List<EmailTable> z(DaoSession daoSession, EmailAddressTable emailAddressTable, long j) {
        String str = f13117a;
        m.b(str, "get mails list where email address " + emailAddressTable.getFullEmailAddress());
        h queryBuilder = daoSession.getEmailTableDao().queryBuilder();
        queryBuilder.p(EmailTableDao.Properties.Timestamp.b(Long.valueOf(j)), EmailTableDao.Properties.EmailAddress.a(emailAddressTable.getFullEmailAddress()), EmailTableDao.Properties.IsDeleted.a(Boolean.FALSE));
        queryBuilder.o(EmailTableDao.Properties.Timestamp);
        return queryBuilder.m();
    }
}
