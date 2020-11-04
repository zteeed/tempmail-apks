package com.tempmail.db;

import java.util.Map;
import org.greenrobot.greendao.h.d;
import org.greenrobot.greendao.i.a;

/* compiled from: DaoSession */
public class c extends org.greenrobot.greendao.c {

    /* renamed from: b  reason: collision with root package name */
    private final a f12284b;

    /* renamed from: c  reason: collision with root package name */
    private final a f12285c;

    /* renamed from: d  reason: collision with root package name */
    private final a f12286d;

    /* renamed from: e  reason: collision with root package name */
    private final a f12287e;

    /* renamed from: f  reason: collision with root package name */
    private final a f12288f;
    private final a g;
    private final a h;
    private final a i;
    private final EmailAddressTableDao j = new EmailAddressTableDao(this.f12284b, this);
    private final EmailTableDao k = new EmailTableDao(this.f12285c, this);
    private final MailTextOnlyTableDao l = new MailTextOnlyTableDao(this.f12286d, this);
    private final MailTextTableDao m = new MailTextTableDao(this.f12287e, this);
    private final MailHtmlTableDao n = new MailHtmlTableDao(this.f12288f, this);
    private final AttachmentInfoTableDao o = new AttachmentInfoTableDao(this.g, this);
    private final DomainTableDao p = new DomainTableDao(this.h, this);
    private final PurchaseTableDao q = new PurchaseTableDao(this.i, this);

    public c(org.greenrobot.greendao.g.a aVar, d dVar, Map<Class<? extends org.greenrobot.greendao.a<?, ?>>, a> map) {
        super(aVar);
        a c2 = map.get(EmailAddressTableDao.class).clone();
        this.f12284b = c2;
        c2.e(dVar);
        a c3 = map.get(EmailTableDao.class).clone();
        this.f12285c = c3;
        c3.e(dVar);
        a c4 = map.get(MailTextOnlyTableDao.class).clone();
        this.f12286d = c4;
        c4.e(dVar);
        a c5 = map.get(MailTextTableDao.class).clone();
        this.f12287e = c5;
        c5.e(dVar);
        a c6 = map.get(MailHtmlTableDao.class).clone();
        this.f12288f = c6;
        c6.e(dVar);
        a c7 = map.get(AttachmentInfoTableDao.class).clone();
        this.g = c7;
        c7.e(dVar);
        a c8 = map.get(DomainTableDao.class).clone();
        this.h = c8;
        c8.e(dVar);
        a c9 = map.get(PurchaseTableDao.class).clone();
        this.i = c9;
        c9.e(dVar);
        c(e.class, this.j);
        c(f.class, this.k);
        c(h.class, this.l);
        c(i.class, this.m);
        c(g.class, this.n);
        c(a.class, this.o);
        c(DomainTable.class, this.p);
        c(j.class, this.q);
    }

    public void d() {
        this.f12284b.b();
        this.f12285c.b();
        this.f12286d.b();
        this.f12287e.b();
        this.f12288f.b();
        this.g.b();
        this.h.b();
        this.i.b();
    }

    public AttachmentInfoTableDao e() {
        return this.o;
    }

    public DomainTableDao f() {
        return this.p;
    }

    public EmailAddressTableDao g() {
        return this.j;
    }

    public EmailTableDao h() {
        return this.k;
    }

    public MailHtmlTableDao i() {
        return this.n;
    }

    public MailTextOnlyTableDao j() {
        return this.l;
    }

    public MailTextTableDao k() {
        return this.m;
    }

    public PurchaseTableDao l() {
        return this.q;
    }
}
