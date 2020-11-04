package com.tempmail.db;

import java.util.Calendar;
import java.util.List;
import org.greenrobot.greendao.DaoException;

/* compiled from: EmailAddressTable */
public class e implements Comparable<e> {

    /* renamed from: b  reason: collision with root package name */
    private Long f12290b;

    /* renamed from: c  reason: collision with root package name */
    private String f12291c;

    /* renamed from: d  reason: collision with root package name */
    private String f12292d;

    /* renamed from: e  reason: collision with root package name */
    private String f12293e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f12294f;
    private Boolean g;
    private transient c h;
    private transient EmailAddressTableDao i;
    private List<f> j;
    private Long k = 0L;
    private Long l = 0L;

    public e(String str, String str2, String str3, Boolean bool) {
        this.f12291c = str;
        this.f12292d = str2;
        this.f12293e = str3;
        this.f12294f = bool;
    }

    private void g() {
        if (this.i == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    public void A(String str) {
        this.f12292d = str;
    }

    public void B(Long l2) {
        this.l = l2;
    }

    public void D(String str) {
        this.f12291c = str;
    }

    public void E(Long l2) {
        this.f12290b = l2;
    }

    public void G(Boolean bool) {
        this.f12294f = bool;
    }

    public void H(Long l2) {
        this.k = l2;
    }

    public void f(c cVar) {
        this.h = cVar;
        this.i = cVar != null ? cVar.g() : null;
    }

    /* renamed from: h */
    public int compareTo(e eVar) {
        if (o() == null || eVar.o() == null) {
            return 0;
        }
        return o().compareTo(eVar.o());
    }

    public String k() {
        return this.f12293e;
    }

    public List<f> m() {
        if (this.j == null) {
            g();
            List<f> M = this.h.h().M(this.f12291c);
            synchronized (this) {
                if (this.j == null) {
                    this.j = M;
                }
            }
        }
        return this.j;
    }

    public String n() {
        return this.f12292d;
    }

    public Long o() {
        Long l2 = this.l;
        if (l2 == null) {
            return 0L;
        }
        return l2;
    }

    public String p() {
        return this.f12291c;
    }

    public Long q() {
        return this.f12290b;
    }

    public Boolean r() {
        return this.f12294f;
    }

    public Boolean t() {
        Boolean bool = this.g;
        return bool == null ? Boolean.FALSE : bool;
    }

    public Long u() {
        Long l2 = this.k;
        if (l2 == null) {
            return 0L;
        }
        return l2;
    }

    public boolean v() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        return !t().booleanValue() && (timeInMillis < u().longValue() || timeInMillis > o().longValue());
    }

    public void x(String str) {
        this.f12293e = str;
    }

    public e() {
    }

    public e(Long l2, String str, String str2, String str3, Boolean bool, Long l3, Long l4, Boolean bool2) {
        this.f12290b = l2;
        this.f12291c = str;
        this.f12292d = str2;
        this.f12293e = str3;
        this.f12294f = bool;
        this.k = l3;
        this.l = l4;
        this.g = bool2;
    }
}
