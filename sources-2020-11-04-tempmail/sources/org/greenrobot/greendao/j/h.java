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
    private final i<T> f15131a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f15132b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f15133c;

    /* renamed from: d  reason: collision with root package name */
    private final List<f<T, ?>> f15134d;

    /* renamed from: e  reason: collision with root package name */
    private final a<T, ?> f15135e;

    /* renamed from: f  reason: collision with root package name */
    private final String f15136f;
    private Integer g;
    private Integer h;
    private boolean i;
    private String j;

    protected h(a<T, ?> aVar) {
        this(aVar, "T");
    }

    private void b(StringBuilder sb, String str) {
        this.f15133c.clear();
        for (f next : this.f15134d) {
            sb.append(" JOIN ");
            sb.append(next.f15124b.getTablename());
            sb.append(' ');
            sb.append(next.f15127e);
            sb.append(" ON ");
            d.h(sb, next.f15123a, next.f15125c);
            sb.append('=');
            d.h(sb, next.f15127e, next.f15126d);
        }
        boolean z = !this.f15131a.e();
        if (z) {
            sb.append(" WHERE ");
            this.f15131a.b(sb, str, this.f15133c);
        }
        for (f next2 : this.f15134d) {
            if (!next2.f15128f.e()) {
                if (!z) {
                    sb.append(" WHERE ");
                    z = true;
                } else {
                    sb.append(" AND ");
                }
                next2.f15128f.b(sb, next2.f15127e, this.f15133c);
            }
        }
    }

    private int f(StringBuilder sb) {
        if (this.g == null) {
            return -1;
        }
        sb.append(" LIMIT ?");
        this.f15133c.add(this.g);
        return this.f15133c.size() - 1;
    }

    private int g(StringBuilder sb) {
        if (this.h == null) {
            return -1;
        }
        if (this.g != null) {
            sb.append(" OFFSET ?");
            this.f15133c.add(this.h);
            return this.f15133c.size() - 1;
        }
        throw new IllegalStateException("Offset cannot be set without limit");
    }

    private void h(String str) {
        if (k) {
            org.greenrobot.greendao.d.a("Built SQL for query: " + str);
        }
        if (l) {
            org.greenrobot.greendao.d.a("Values for query: " + this.f15133c);
        }
    }

    private void i() {
        StringBuilder sb = this.f15132b;
        if (sb == null) {
            this.f15132b = new StringBuilder();
        } else if (sb.length() > 0) {
            this.f15132b.append(",");
        }
    }

    private StringBuilder k() {
        StringBuilder sb = new StringBuilder(d.l(this.f15135e.getTablename(), this.f15136f, this.f15135e.getAllColumns(), this.i));
        b(sb, this.f15136f);
        StringBuilder sb2 = this.f15132b;
        if (sb2 != null && sb2.length() > 0) {
            sb.append(" ORDER BY ");
            sb.append(this.f15132b);
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
            a(this.f15132b, fVar);
            if (String.class.equals(fVar.f15076b) && (str2 = this.j) != null) {
                this.f15132b.append(str2);
            }
            this.f15132b.append(str);
        }
    }

    /* access modifiers changed from: protected */
    public StringBuilder a(StringBuilder sb, f fVar) {
        this.f15131a.d(fVar);
        sb.append(this.f15136f);
        sb.append('.');
        sb.append('\'');
        sb.append(fVar.f15079e);
        sb.append('\'');
        return sb;
    }

    public g<T> c() {
        StringBuilder k2 = k();
        int f2 = f(k2);
        int g2 = g(k2);
        String sb = k2.toString();
        h(sb);
        return g.e(this.f15135e, sb, this.f15133c.toArray(), f2, g2);
    }

    public d<T> d() {
        StringBuilder sb = new StringBuilder(d.m(this.f15135e.getTablename(), this.f15136f));
        b(sb, this.f15136f);
        String sb2 = sb.toString();
        h(sb2);
        return d.e(this.f15135e, sb2, this.f15133c.toArray());
    }

    public e<T> e() {
        if (this.f15134d.isEmpty()) {
            String tablename = this.f15135e.getTablename();
            StringBuilder sb = new StringBuilder(d.j(tablename, (String[]) null));
            b(sb, this.f15136f);
            String replace = sb.toString().replace(this.f15136f + ".\"", '\"' + tablename + "\".\"");
            h(replace);
            return e.d(this.f15135e, replace, this.f15133c.toArray());
        }
        throw new DaoException("JOINs are not supported for DELETE queries");
    }

    public long j() {
        return d().d();
    }

    public List<T> m() {
        return c().h();
    }

    public h<T> o(f... fVarArr) {
        n(" DESC", fVarArr);
        return this;
    }

    public h<T> p(j jVar, j... jVarArr) {
        this.f15131a.a(jVar, jVarArr);
        return this;
    }

    protected h(a<T, ?> aVar, String str) {
        this.f15135e = aVar;
        this.f15136f = str;
        this.f15133c = new ArrayList();
        this.f15134d = new ArrayList();
        this.f15131a = new i<>(aVar, str);
        this.j = " COLLATE NOCASE";
    }
}
