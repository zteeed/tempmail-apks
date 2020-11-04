package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class so implements zzduu<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f5103a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f5104b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzdkk f5105c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzdkm f5106d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzcts f5107e;

    so(zzcts zzcts, String str, long j, zzdkk zzdkk, zzdkm zzdkm) {
        this.f5107e = zzcts;
        this.f5103a = str;
        this.f5104b = j;
        this.f5105c = zzdkk;
        this.f5106d = zzdkm;
    }

    public final void a(Throwable th) {
        long b2 = this.f5107e.f7706a.b();
        int i = 6;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzcti) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzdlg) {
            i = 5;
        } else if ((th instanceof zzcmi) && ((zzcmi) th).a().f9355b == 3) {
            i = 1;
        }
        this.f5107e.d(this.f5103a, i, b2 - this.f5104b, this.f5105c.Y);
        if (this.f5107e.f7709d) {
            this.f5107e.f7707b.a(this.f5106d, this.f5105c, i, th instanceof zzcqx ? (zzcqx) th : null, b2 - this.f5104b);
        }
    }

    public final void onSuccess(T t) {
        long b2 = this.f5107e.f7706a.b();
        this.f5107e.d(this.f5103a, 0, b2 - this.f5104b, this.f5105c.Y);
        if (this.f5107e.f7709d) {
            this.f5107e.f7707b.a(this.f5106d, this.f5105c, 0, (zzcqx) null, b2 - this.f5104b);
        }
    }
}
