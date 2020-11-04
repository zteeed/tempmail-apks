package org.jsoup.d;

import java.util.Collections;
import java.util.List;
import org.jsoup.b.c;

/* compiled from: LeafNode */
abstract class k extends l {

    /* renamed from: e  reason: collision with root package name */
    private static final List<l> f15189e = Collections.emptyList();

    /* renamed from: d  reason: collision with root package name */
    Object f15190d;

    k() {
    }

    private void c0() {
        if (!w()) {
            Object obj = this.f15190d;
            b bVar = new b();
            this.f15190d = bVar;
            if (obj != null) {
                bVar.Y(C(), (String) obj);
            }
        }
    }

    public String b(String str) {
        c0();
        return super.b(str);
    }

    /* access modifiers changed from: package-private */
    public String b0() {
        return d(C());
    }

    public String d(String str) {
        c.i(str);
        if (!w()) {
            return str.equals(C()) ? (String) this.f15190d : "";
        }
        return super.d(str);
    }

    public l e(String str, String str2) {
        if (w() || !str.equals(C())) {
            c0();
            super.e(str, str2);
        } else {
            this.f15190d = str2;
        }
        return this;
    }

    public final b f() {
        c0();
        return (b) this.f15190d;
    }

    public String g() {
        return x() ? M().g() : "";
    }

    public int k() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void p(String str) {
    }

    /* access modifiers changed from: protected */
    public List<l> r() {
        return f15189e;
    }

    public boolean t(String str) {
        c0();
        return super.t(str);
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return this.f15190d instanceof b;
    }
}
