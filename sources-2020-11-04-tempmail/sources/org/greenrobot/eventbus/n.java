package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* compiled from: SubscriberMethod */
public class n {

    /* renamed from: a  reason: collision with root package name */
    final Method f15037a;

    /* renamed from: b  reason: collision with root package name */
    final ThreadMode f15038b;

    /* renamed from: c  reason: collision with root package name */
    final Class<?> f15039c;

    /* renamed from: d  reason: collision with root package name */
    final int f15040d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f15041e;

    /* renamed from: f  reason: collision with root package name */
    String f15042f;

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f15037a = method;
        this.f15038b = threadMode;
        this.f15039c = cls;
        this.f15040d = i;
        this.f15041e = z;
    }

    private synchronized void a() {
        if (this.f15042f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f15037a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f15037a.getName());
            sb.append('(');
            sb.append(this.f15039c.getName());
            this.f15042f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        a();
        n nVar = (n) obj;
        nVar.a();
        return this.f15042f.equals(nVar.f15042f);
    }

    public int hashCode() {
        return this.f15037a.hashCode();
    }
}
