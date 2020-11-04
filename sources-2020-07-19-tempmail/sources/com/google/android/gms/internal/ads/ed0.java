package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ed0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ jd0 f3717b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ dd0 f3718c;

    ed0(dd0 dd0, jd0 jd0) {
        this.f3718c = dd0;
        this.f3717b = jd0;
    }

    public final void run() {
        this.f3717b.a();
        int size = this.f3718c.q.size();
        for (int i = 0; i < size; i++) {
            ((zznj) this.f3718c.q.valueAt(i)).e();
        }
    }
}
