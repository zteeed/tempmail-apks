package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class b7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3427b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3428c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzbbz f3429d;

    b7(zzbbz zzbbz, String str, String str2) {
        this.f3429d = zzbbz;
        this.f3427b = str;
        this.f3428c = str2;
    }

    public final void run() {
        if (this.f3429d.q != null) {
            this.f3429d.q.e(this.f3427b, this.f3428c);
        }
    }
}
