package org.greenrobot.eventbus;

/* compiled from: PendingPostQueue */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private i f15032a;

    /* renamed from: b  reason: collision with root package name */
    private i f15033b;

    j() {
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(i iVar) {
        if (iVar != null) {
            try {
                if (this.f15033b != null) {
                    this.f15033b.f15031c = iVar;
                    this.f15033b = iVar;
                } else if (this.f15032a == null) {
                    this.f15033b = iVar;
                    this.f15032a = iVar;
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
        iVar = this.f15032a;
        if (this.f15032a != null) {
            i iVar2 = this.f15032a.f15031c;
            this.f15032a = iVar2;
            if (iVar2 == null) {
                this.f15033b = null;
            }
        }
        return iVar;
    }

    /* access modifiers changed from: package-private */
    public synchronized i c(int i) throws InterruptedException {
        if (this.f15032a == null) {
            wait((long) i);
        }
        return b();
    }
}
