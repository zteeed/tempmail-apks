package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* compiled from: SubscriberMethod */
public class n {

    /* renamed from: a  reason: collision with root package name */
    final Method f14479a;

    /* renamed from: b  reason: collision with root package name */
    final ThreadMode f14480b;

    /* renamed from: c  reason: collision with root package name */
    final Class<?> f14481c;

    /* renamed from: d  reason: collision with root package name */
    final int f14482d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f14483e;

    /* renamed from: f  reason: collision with root package name */
    String f14484f;

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f14479a = method;
        this.f14480b = threadMode;
        this.f14481c = cls;
        this.f14482d = i;
        this.f14483e = z;
    }

    private synchronized void a() {
        if (this.f14484f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f14479a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f14479a.getName());
            sb.append('(');
            sb.append(this.f14481c.getName());
            this.f14484f = sb.toString();
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
        return this.f14484f.equals(nVar.f14484f);
    }

    public int hashCode() {
        return this.f14479a.hashCode();
    }
}
