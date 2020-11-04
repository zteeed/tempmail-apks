package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class b7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3610b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3611c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzbbz f3612d;

    b7(zzbbz zzbbz, String str, String str2) {
        this.f3612d = zzbbz;
        this.f3610b = str;
        this.f3611c = str2;
    }

    public final void run() {
        if (this.f3612d.q != null) {
            this.f3612d.q.e(this.f3610b, this.f3611c);
        }
    }
}
