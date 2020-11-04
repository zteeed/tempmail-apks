package org.greenrobot.eventbus;

/* compiled from: PendingPostQueue */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private i f14474a;

    /* renamed from: b  reason: collision with root package name */
    private i f14475b;

    j() {
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(i iVar) {
        if (iVar != null) {
            try {
                if (this.f14475b != null) {
                    this.f14475b.f14473c = iVar;
                    this.f14475b = iVar;
                } else if (this.f14474a == null) {
                    this.f14475b = iVar;
                    this.f14474a = iVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized i b() {
        i iVar;
        iVar = this.f14474a;
        if (this.f14474a != null) {
            i iVar2 = this.f14474a.f14473c;
            this.f14474a = iVar2;
            if (iVar2 == null) {
                this.f14475b = null;
            }
        }
        return iVar;
    }

    /* access modifiers changed from: package-private */
    public synchronized i c(int i) throws InterruptedException {
        if (this.f14474a == null) {
            wait((long) i);
        }
        return b();
    }
}
