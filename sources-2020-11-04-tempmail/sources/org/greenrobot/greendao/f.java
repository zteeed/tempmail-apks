package org.greenrobot.greendao;

import java.util.Collection;
import org.greenrobot.greendao.i.d;
import org.greenrobot.greendao.j.j;

/* compiled from: Property */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f15075a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f15076b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15077c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15078d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15079e;

    public f(int i, Class<?> cls, String str, boolean z, String str2) {
        this.f15075a = i;
        this.f15076b = cls;
        this.f15077c = str;
        this.f15078d = z;
        this.f15079e = str2;
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
