package com.tempmail.utils;

import com.tempmail.api.models.answers.Mail;
import com.tempmail.db.AttachmentInfoTableDao;
import com.tempmail.db.DomainTable;
import com.tempmail.db.DomainTableDao;
import com.tempmail.db.EmailAddressTableDao;
import com.tempmail.db.EmailTableDao;
import com.tempmail.db.MailHtmlTableDao;
import com.tempmail.db.MailTextOnlyTableDao;
import com.tempmail.db.MailTextTableDao;
import com.tempmail.db.PurchaseTableDao;
import com.tempmail.db.a;
import com.tempmail.db.c;
import com.tempmail.db.e;
import com.tempmail.db.f;
import com.tempmail.db.i;
import com.tempmail.db.j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.greenrobot.greendao.j.h;

/* compiled from: DbUtils */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12573a = "g";

    public static List<f> A(c cVar, e eVar, long j) {
        String str = f12573a;
        m.b(str, "get mails list where email address " + eVar.p());
        h E = cVar.h().E();
        E.p(EmailTableDao.Properties.Timestamp.b(Long.valueOf(j)), EmailTableDao.Properties.EmailAddress.a(eVar.p()), EmailTableDao.Properties.IsDeleted.a(Boolean.FALSE));
        E.o(EmailTableDao.Properties.Timestamp);
        return E.m();
    }

    public static List<j> B(c cVar) {
        return cVar.l().E().m();
    }

    public static j C(c cVar, String str) {
        h E = cVar.l().E();
        E.p(PurchaseTableDao.Properties.OriginalJson.a(str), new org.greenrobot.greendao.j.j[0]);
        List m = E.m();
        if (m.size() > 0) {
            return (j) m.get(0);
        }
        return null;
    }

    public static long D(c cVar, e eVar, long j) {
        h E = cVar.h().E();
        E.p(EmailTableDao.Properties.Timestamp.b(Long.valueOf(j)), EmailTableDao.Properties.EmailAddress.a(eVar.p()), EmailTableDao.Properties.IsChecked.a(Boolean.FALSE), EmailTableDao.Properties.IsDeleted.a(Boolean.FALSE));
        return E.j();
    }

    public static void E(c cVar, e eVar) {
        h E = cVar.g().E();
        E.p(EmailAddressTableDao.Properties.IsDefault.a(Boolean.TRUE), EmailAddressTableDao.Properties.FullEmailAddress.d(eVar.p()));
        for (e eVar2 : E.m()) {
            eVar2.G(Boolean.FALSE);
            L(cVar, eVar2);
        }
    }

    public static void F(c cVar) {
        cVar.g().g();
    }

    public static void G(c cVar, e eVar) {
        cVar.h().j(eVar.m());
    }

    public static void H(c cVar, e eVar) {
        cVar.g().f(eVar);
    }

    public static void I(c cVar, String str) {
        String str2 = f12573a;
        m.b(str2, "removeEmailAddressesWithDomain " + str);
        h E = cVar.g().E();
        E.p(EmailAddressTableDao.Properties.Domain.a(str), new org.greenrobot.greendao.j.j[0]);
        E.e().e();
    }

    public static void J(c cVar, String str) {
        h E = cVar.l().E();
        E.p(PurchaseTableDao.Properties.OriginalJson.a(str), new org.greenrobot.greendao.j.j[0]);
        E.e().e();
    }

    public static void K(c cVar, f fVar) {
        EmailTableDao h = cVar.h();
        fVar.q(Boolean.TRUE);
        h.H(fVar);
    }

    public static void L(c cVar, e eVar) {
        cVar.g().H(eVar);
    }

    private static void a(c cVar, Mail mail) {
        AttachmentInfoTableDao e2 = cVar.e();
        if (mail.getAttachmentInfo() != null) {
            for (Mail.AttachmentInfo next : mail.getAttachmentInfo()) {
                e2.t(new a(mail.getMailId(), next.getFilename(), Integer.valueOf(next.getId()), Long.valueOf(next.getSize()), next.getMimeType(), next.getCid()));
            }
        }
    }

    public static void b(c cVar, List<DomainTable> list) {
        DomainTableDao f2 = cVar.f();
        f2.g();
        f2.u(list);
    }

    public static void c(c cVar, e eVar) {
        EmailAddressTableDao g = cVar.g();
        if (eVar.u() == null && eVar.o() == null) {
            eVar.H(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
            eVar.B(Long.valueOf(e.p()));
        }
        g.t(eVar);
    }

    public static void d(c cVar, e eVar) {
        E(cVar, eVar);
        c(cVar, eVar);
    }

    public static boolean e(c cVar, e eVar) {
        h E = cVar.g().E();
        E.p(EmailAddressTableDao.Properties.FullEmailAddress.a(eVar.p()), new org.greenrobot.greendao.j.j[0]);
        if (E.j() != 0) {
            return false;
        }
        c(cVar, eVar);
        return true;
    }

    public static boolean f(c cVar, String str, Mail mail) {
        EmailTableDao h = cVar.h();
        if (i(h, mail.getMailId())) {
            return false;
        }
        String str2 = f12573a;
        m.b(str2, "table not exist " + mail.getMailId());
        h.t(new f(str, mail.getMailId(), Boolean.FALSE, mail.getMailFrom(), mail.getMailSubject(), Double.valueOf(mail.getMailTimestamp()), Boolean.FALSE));
        p(cVar, mail.getMailTextOnly(), mail.getMailId());
        o(cVar, mail.getMailText(), mail.getMailId());
        n(cVar, mail.getMailHtml(), mail.getMailId());
        a(cVar, mail);
        return true;
    }

    public static void g(c cVar, j jVar) {
        cVar.l().t(jVar);
    }

    public static void h(c cVar, e eVar) {
        String str = f12573a;
        m.b(str, "change to default " + eVar.p());
        E(cVar, eVar);
        eVar.G(Boolean.TRUE);
        L(cVar, eVar);
    }

    public static boolean i(EmailTableDao emailTableDao, String str) {
        h E = emailTableDao.E();
        E.p(EmailTableDao.Properties.Eid.a(str), new org.greenrobot.greendao.j.j[0]);
        if (E.j() != 0) {
            return true;
        }
        return false;
    }

    public static void j(c cVar) {
        cVar.g().g();
        cVar.h().g();
        cVar.f().g();
        cVar.e().g();
        cVar.k().g();
        cVar.j().g();
        cVar.i().g();
    }

    public static void k(c cVar, List<String> list) {
        h<e> b2 = cVar.b(e.class);
        b2.p(EmailAddressTableDao.Properties.FullEmailAddress.e(list), new org.greenrobot.greendao.j.j[0]);
        b2.e().e();
    }

    private static void l(c cVar, List<a> list) {
        cVar.e().j(list);
    }

    public static void m(c cVar, f fVar) {
        l(cVar, fVar.c());
        EmailTableDao h = cVar.h();
        fVar.r(Boolean.TRUE);
        h.H(fVar);
    }

    public static void n(c cVar, String str, String str2) {
        List<String> J = e.J(str);
        MailHtmlTableDao i = cVar.i();
        for (String gVar : J) {
            i.t(new com.tempmail.db.g(gVar, str2));
        }
    }

    public static void o(c cVar, String str, String str2) {
        List<String> J = e.J(str);
        MailTextTableDao k = cVar.k();
        for (String iVar : J) {
            k.t(new i(iVar, str2));
        }
    }

    public static void p(c cVar, String str, String str2) {
        List<String> J = e.J(str);
        MailTextOnlyTableDao j = cVar.j();
        for (String hVar : J) {
            j.t(new com.tempmail.db.h(hVar, str2));
        }
    }

    public static com.tempmail.t.a q(c cVar) {
        List<e> z = z(cVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (e next : z) {
            if (!next.v() || !e.P()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return new com.tempmail.t.a(arrayList, arrayList2);
    }

    public static List<DomainTable> r(c cVar) {
        h E = cVar.f().E();
        E.p(DomainTableDao.Properties.ExpirationTimestamp.c(), new org.greenrobot.greendao.j.j[0]);
        return E.m();
    }

    public static List<DomainTable> s(c cVar) {
        List<DomainTable> r = r(cVar);
        return r.size() == 0 ? w(cVar) : r;
    }

    public static e t(c cVar) {
        EmailAddressTableDao g = cVar.g();
        h E = g.E();
        E.p(EmailAddressTableDao.Properties.IsDefault.a(Boolean.TRUE), new org.greenrobot.greendao.j.j[0]);
        List m = E.m();
        if (!m.isEmpty()) {
            return (e) m.get(0);
        }
        List y = g.y();
        if (y.size() <= 0) {
            return null;
        }
        e eVar = (e) y.get(0);
        eVar.G(Boolean.TRUE);
        L(cVar, eVar);
        return eVar;
    }

    public static List<f> u(c cVar, long j) {
        return A(cVar, t(cVar), j);
    }

    public static List<DomainTable> v(c cVar, String str) {
        h E = cVar.f().E();
        E.p(DomainTableDao.Properties.Domain.a(str), new org.greenrobot.greendao.j.j[0]);
        return E.m();
    }

    public static List<DomainTable> w(c cVar) {
        return cVar.f().y();
    }

    public static List<String> x(c cVar) {
        List<DomainTable> s = s(cVar);
        ArrayList arrayList = new ArrayList();
        for (DomainTable a2 : s) {
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    public static List<f> y(c cVar, String str) {
        String str2 = f12573a;
        m.b(str2, "get mails where email id  " + str);
        h E = cVar.h().E();
        E.p(EmailTableDao.Properties.Eid.a(str), new org.greenrobot.greendao.j.j[0]);
        return E.m();
    }

    public static List<e> z(c cVar) {
        return cVar.g().y();
    }
}
