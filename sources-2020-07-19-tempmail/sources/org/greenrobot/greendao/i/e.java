package org.greenrobot.greendao.i;

import org.greenrobot.greendao.g.a;
import org.greenrobot.greendao.g.c;

/* compiled from: TableStatements */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final a f14538a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14539b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f14540c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f14541d;

    /* renamed from: e  reason: collision with root package name */
    private c f14542e;

    /* renamed from: f  reason: collision with root package name */
    private c f14543f;
    private c g;
    private volatile String h;

    public e(a aVar, String str, String[] strArr, String[] strArr2) {
        this.f14538a = aVar;
        this.f14539b = str;
        this.f14540c = strArr;
        this.f14541d = strArr2;
    }

    public c a() {
        if (this.g == null) {
            c c2 = this.f14538a.c(d.i(this.f14539b, this.f14541d));
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

    public c b() {
        if (this.f14542e == null) {
            c c2 = this.f14538a.c(d.j("INSERT INTO ", this.f14539b, this.f14540c));
            synchronized (this) {
                if (this.f14542e == null) {
                    this.f14542e = c2;
                }
            }
            if (this.f14542e != c2) {
                c2.close();
            }
        }
        return this.f14542e;
    }

    public String c() {
        if (this.h == null) {
            this.h = d.k(this.f14539b, "T", this.f14540c, false);
        }
        return this.h;
    }

    public c d() {
        if (this.f14543f == null) {
            c c2 = this.f14538a.c(d.m(this.f14539b, this.f14540c, this.f14541d));
            synchronized (this) {
                if (this.f14543f == null) {
                    this.f14543f = c2;
                }
            }
            if (this.f14543f != c2) {
                c2.close();
            }
        }
        return this.f14543f;
    }
}
