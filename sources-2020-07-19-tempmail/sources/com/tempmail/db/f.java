package com.tempmail.db;

import java.io.Serializable;
import java.util.List;
import org.greenrobot.greendao.DaoException;

/* compiled from: EmailTable */
public class f implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private Long f12295b;

    /* renamed from: c  reason: collision with root package name */
    private String f12296c;

    /* renamed from: d  reason: collision with root package name */
    private Long f12297d;

    /* renamed from: e  reason: collision with root package name */
    private String f12298e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f12299f;
    private String g;
    private String h;
    private Double i;
    private Boolean j;
    private transient c k;
    private transient EmailTableDao l;
    private List<h> m;
    private List<i> n;
    private List<g> o;
    private List<a> p;

    public f(String str, String str2, Boolean bool, String str3, String str4, Double d2, Boolean bool2) {
        this.f12296c = str;
        this.f12298e = str2;
        this.f12299f = bool;
        this.g = str3;
        this.h = str4;
        this.i = d2;
        this.j = bool2;
    }

    private void b() {
        if (this.l == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    public void a(c cVar) {
        this.k = cVar;
        this.l = cVar != null ? cVar.h() : null;
    }

    public List<a> c() {
        if (this.p == null) {
            b();
            List<a> M = this.k.e().M(this.f12298e);
            synchronized (this) {
                if (this.p == null) {
                    this.p = M;
                }
            }
        }
        return this.p;
    }

    public String d() {
        return this.f12298e;
    }

    public String e() {
        return this.f12296c;
    }

    public Long f() {
        return this.f12297d;
    }

    public String g() {
        return this.g;
    }

    public List<g> h() {
        if (this.o == null) {
            b();
            List<g> M = this.k.i().M(this.f12298e);
            synchronized (this) {
                if (this.o == null) {
                    this.o = M;
                }
            }
        }
        return this.o;
    }

    public Long i() {
        return this.f12295b;
    }

    public Boolean j() {
        return this.f12299f;
    }

    public Boolean k() {
        return this.j;
    }

    public String l() {
        return this.h;
    }

    public List<i> m() {
        if (this.n == null) {
            b();
            List<i> M = this.k.k().M(this.f12298e);
            synchronized (this) {
                if (this.n == null) {
                    this.n = M;
                }
            }
        }
        return this.n;
    }

    public List<h> n() {
        if (this.m == null) {
            b();
            List<h> M = this.k.j().M(this.f12298e);
            synchronized (this) {
                if (this.m == null) {
                    this.m = M;
                }
            }
        }
        return this.m;
    }

    public Double o() {
        return this.i;
    }

    public void p(Long l2) {
        this.f12295b = l2;
    }

    public void q(Boolean bool) {
        this.f12299f = bool;
    }

    public void r(Boolean bool) {
        this.j = bool;
    }

    public f() {
    }

    public f(Long l2, String str, Long l3, String str2, Boolean bool, String str3, String str4, Double d2, Boolean bool2) {
        this.f12295b = l2;
        this.f12296c = str;
        this.f12297d = l3;
        this.f12298e = str2;
        this.f12299f = bool;
        this.g = str3;
        this.h = str4;
        this.i = d2;
        this.j = bool2;
    }
}
