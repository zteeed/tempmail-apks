package org.greenrobot.eventbus;

/* compiled from: Subscription */
final class p {

    /* renamed from: a  reason: collision with root package name */
    final Object f15054a;

    /* renamed from: b  reason: collision with root package name */
    final n f15055b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f15056c = true;

    p(Object obj, n nVar) {
        this.f15054a = obj;
        this.f15055b = nVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f15054a != pVar.f15054a || !this.f15055b.equals(pVar.f15055b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f15054a.hashCode() + this.f15055b.f15042f.hashCode();
    }
}
