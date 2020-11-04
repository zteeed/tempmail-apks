package org.greenrobot.eventbus;

/* compiled from: Subscription */
final class p {

    /* renamed from: a  reason: collision with root package name */
    final Object f14496a;

    /* renamed from: b  reason: collision with root package name */
    final n f14497b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f14498c = true;

    p(Object obj, n nVar) {
        this.f14496a = obj;
        this.f14497b = nVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f14496a != pVar.f14496a || !this.f14497b.equals(pVar.f14497b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f14496a.hashCode() + this.f14497b.f14484f.hashCode();
    }
}
