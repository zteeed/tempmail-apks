package org.greenrobot.greendao.j;

import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.i.d;

/* compiled from: QueryBuilder */
public class h<T> {
    public static boolean k;
    public static boolean l;

    /* renamed from: a  reason: collision with root package name */
    private final i<T> f14562a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f14563b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f14564c;

    /* renamed from: d  reason: collision with root package name */
    private final List<f<T, ?>> f14565d;

    /* renamed from: e  reason: collision with root package name */
    private final a<T, ?> f14566e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14567f;
    private Integer g;
    private Integer h;
    private boolean i;
    private String j;

    protected h(a<T, ?> aVar) {
        this(aVar, "T");
    }

    private void b(StringBuilder sb, String str) {
        this.f14564c.clear();
        for (f next : this.f14565d) {
            sb.append(" JOIN ");
            sb.append(next.f14555b.s());
            sb.append(' ');
            sb.append(next.f14558e);
            sb.append(" ON ");
            d.h(sb, next.f14554a, next.f14556c);
            sb.append('=');
            d.h(sb, next.f14558e, next.f14557d);
        }
        boolean z = !this.f14562a.e();
        if (z) {
            sb.append(" WHERE ");
            this.f14562a.b(sb, str, this.f14564c);
        }
        for (f next2 : this.f14565d) {
            if (!next2.f14559f.e()) {
                if (!z) {
                    sb.append(" WHERE ");
                    z = true;
                } else {
                    sb.append(" AND ");
                }
                next2.f14559f.b(sb, next2.f14558e, this.f14564c);
            }
        }
    }

    private int f(StringBuilder sb) {
        if (this.g == null) {
            return -1;
        }
        sb.append(" LIMIT ?");
        this.f14564c.add(this.g);
        return this.f14564c.size() - 1;
    }

    private int g(StringBuilder sb) {
        if (this.h == null) {
            return -1;
        }
        if (this.g != null) {
            sb.append(" OFFSET ?");
            this.f14564c.add(this.h);
            return this.f14564c.size() - 1;
        }
        throw new IllegalStateException("Offset cannot be set without limit");
    }

    private void h(String str) {
        if (k) {
            org.greenrobot.greendao.d.a("Built SQL for query: " + str);
        }
        if (l) {
            org.greenrobot.greendao.d.a("Values for query: " + this.f14564c);
        }
    }

    private void i() {
        StringBuilder sb = this.f14563b;
        if (sb == null) {
            this.f14563b = new StringBuilder();
        } else if (sb.length() > 0) {
            this.f14563b.append(",");
        }
    }

    private StringBuilder k() {
        StringBuilder sb = new StringBuilder(d.k(this.f14566e.s(), this.f14567f, this.f14566e.n(), this.i));
        b(sb, this.f14567f);
        StringBuilder sb2 = this.f14563b;
        if (sb2 != null && sb2.length() > 0) {
            sb.append(" ORDER BY ");
            sb.append(this.f14563b);
        }
        return sb;
    }

    public static <T2> h<T2> l(a<T2, ?> aVar) {
        return new h<>(aVar);
    }

    private void n(String str, f... fVarArr) {
        String str2;
        for (f fVar : fVarArr) {
            i();
            a(this.f14563b, fVar);
            if (String.class.equals(fVar.f14510b) && (str2 = this.j) != null) {
                this.f14563b.append(str2);
            }
            this.f14563b.append(str);
        }
    }

    /* access modifiers changed from: protected */
    public StringBuilder a(StringBuilder sb, f fVar) {
        this.f14562a.d(fVar);
        sb.append(this.f14567f);
        sb.append('.');
        sb.append('\'');
        sb.append(fVar.f14513e);
        sb.append('\'');
        return sb;
    }

    public g<T> c() {
        StringBuilder k2 = k();
        int f2 = f(k2);
        int g2 = g(k2);
        String sb = k2.toString();
        h(sb);
        return g.e(this.f14566e, sb, this.f14564c.toArray(), f2, g2);
    }

    public d<T> d() {
        StringBuilder sb = new StringBuilder(d.l(this.f14566e.s(), this.f14567f));
        b(sb, this.f14567f);
        String sb2 = sb.toString();
        h(sb2);
        return d.e(this.f14566e, sb2, this.f14564c.toArray());
    }

    public e<T> e() {
        if (this.f14565d.isEmpty()) {
            String s = this.f14566e.s();
            StringBuilder sb = new StringBuilder(d.i(s, (String[]) null));
            b(sb, this.f14567f);
            String replace = sb.toString().replace(this.f14567f + ".\"", '\"' + s + "\".\"");
            h(replace);
            return e.d(this.f14566e, replace, this.f14564c.toArray());
        }
        throw new DaoException("JOINs are not supported for DELETE queries");
    }

    public long j() {
        return d().d();
    }

    public List<T> m() {
        return c().g();
    }

    public h<T> o(f... fVarArr) {
        n(" DESC", fVarArr);
        return this;
    }

    public h<T> p(j jVar, j... jVarArr) {
        this.f14562a.a(jVar, jVarArr);
        return this;
    }

    protected h(a<T, ?> aVar, String str) {
        this.f14566e = aVar;
        this.f14567f = str;
        this.f14564c = new ArrayList();
        this.f14565d = new ArrayList();
        this.f14562a = new i<>(aVar, str);
        this.j = " COLLATE NOCASE";
    }
}
