package org.greenrobot.greendao;

import java.util.Collection;
import org.greenrobot.greendao.i.d;
import org.greenrobot.greendao.j.j;

/* compiled from: Property */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f14509a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f14510b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14511c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14512d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14513e;

    public f(int i, Class<?> cls, String str, boolean z, String str2) {
        this.f14509a = i;
        this.f14510b = cls;
        this.f14511c = str;
        this.f14512d = z;
        this.f14513e = str2;
    }

    public j a(Object obj) {
        return new j.b(this, "=?", obj);
    }

    public j b(Object obj) {
        return new j.b(this, ">=?", obj);
    }

    public j c() {
        return new j.b(this, " IS NULL");
    }

    public j d(Object obj) {
        return new j.b(this, "<>?", obj);
    }

    public j e(Collection<?> collection) {
        return f(collection.toArray());
    }

    public j f(Object... objArr) {
        StringBuilder sb = new StringBuilder(" NOT IN (");
        d.g(sb, objArr.length);
        sb.append(')');
        return new j.b(this, sb.toString(), objArr);
    }
}
