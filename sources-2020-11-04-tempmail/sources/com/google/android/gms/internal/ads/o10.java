package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class o10 extends a10<zzdvf<V>> {

    /* renamed from: e  reason: collision with root package name */
    private final zzduf<V> f4700e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ l10 f4701f;

    o10(l10 l10, zzduf<V> zzduf) {
        this.f4701f = l10;
        zzdsh.b(zzduf);
        this.f4700e = zzduf;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f4701f.isDone();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c() throws Exception {
        zzdvf<V> a2 = this.f4700e.a();
        zzdsh.d(a2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f4700e);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f4700e.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(Object obj, Throwable th) {
        zzdvf zzdvf = (zzdvf) obj;
        if (th == null) {
            this.f4701f.k(zzdvf);
        } else {
            this.f4701f.j(th);
        }
    }
}