package org.greenrobot.greendao.i;

import org.greenrobot.greendao.g.a;
import org.greenrobot.greendao.g.c;

/* compiled from: TableStatements */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final a f15107a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15108b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f15109c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f15110d;

    /* renamed from: e  reason: collision with root package name */
    private c f15111e;

    /* renamed from: f  reason: collision with root package name */
    private c f15112f;
    private c g;
    private c h;
    private c i;
    private volatile String j;
    private volatile String k;
    private volatile String l;

    public e(a aVar, String str, String[] strArr, String[] strArr2) {
        this.f15107a = aVar;
        this.f15108b = str;
        this.f15109c = strArr;
        this.f15110d = strArr2;
    }

    public c a() {
        if (this.i == null) {
            this.i = this.f15107a.c(d.i(this.f15108b));
        }
        return this.i;
    }

    public c b() {
        if (this.h == null) {
            c c2 = this.f15107a.c(d.j(this.f15108b, this.f15110d));
            synchronized (this) {
                if (this.h == null) {
                    this.h = c2;
                }
            }
            if (this.h != c2) {
                c2.close();
            }
        }
        return this.h;
    }

    public c c() {
        if (this.f15112f == null) {
            c c2 = this.f15107a.c(d.k("INSERT OR REPLACE INTO ", this.f15108b, this.f15109c));
            synchronized (this) {
                if (this.f15112f == null) {
                    this.f15112f = c2;
                }
            }
            if (this.f15112f != c2) {
                c2.close();
            }
        }
        return this.f15112f;
    }

    public c d() {
        if (this.f15111e == null) {
            c c2 = this.f15107a.c(d.k("INSERT INTO ", this.f15108b, this.f15109c));
            synchronized (this) {
                if (this.f15111e == null) {
                    this.f15111e = c2;
                }
            }
            if (this.f15111e != c2) {
                c2.close();
            }
        }
        return this.f15111e;
    }

    public String e() {
        if (this.j == null) {
            this.j = d.l(this.f15108b, "T", this.f15109c, false);
        }
        return this.j;
    }

    public String f() {
        if (this.k == null) {
            StringBuilder sb = new StringBuilder(e());
            sb.append("WHERE ");
            d.e(sb, "T", this.f15110d);
            this.k = sb.toString();
        }
        return this.k;
    }

    public String g() {
        if (this.l == null) {
            this.l = e() + "WHERE ROWID=?";
        }
        return this.l;
    }

    public c h() {
        if (this.g == null) {
            c c2 = this.f15107a.c(d.n(this.f15108b, this.f15109c, this.f15110d));
            synchronized (this) {
                if (this.g == null) {
                    this.g = c2;
                }
            }
            if (this.g != c2) {
                c2.close();
            }
        }
        return this.g;
    }
}
