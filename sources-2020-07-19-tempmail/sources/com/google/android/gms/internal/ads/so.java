package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class so implements zzduu<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f4920a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f4921b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzdkk f4922c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzdkm f4923d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzcts f4924e;

    so(zzcts zzcts, String str, long j, zzdkk zzdkk, zzdkm zzdkm) {
        this.f4924e = zzcts;
        this.f4920a = str;
        this.f4921b = j;
        this.f4922c = zzdkk;
        this.f4923d = zzdkm;
    }

    public final void a(Throwable th) {
        long b2 = this.f4924e.f7523a.b();
        int i = 6;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzcti) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzdlg) {
            i = 5;
        } else if ((th instanceof zzcmi) && ((zzcmi) th).a().f9172b == 3) {
            i = 1;
        }
        this.f4924e.d(this.f4920a, i, b2 - this.f4921b, this.f4922c.Y);
        if (this.f4924e.f7526d) {
            this.f4924e.f7524b.a(this.f4923d, this.f4922c, i, th instanceof zzcqx ? (zzcqx) th : null, b2 - this.f4921b);
        }
    }

    public final void onSuccess(T t) {
        long b2 = this.f4924e.f7523a.b();
        this.f4924e.d(this.f4920a, 0, b2 - this.f4921b, this.f4922c.Y);
        if (this.f4924e.f7526d) {
            this.f4924e.f7524b.a(this.f4923d, this.f4922c, 0, (zzcqx) null, b2 - this.f4921b);
        }
    }
}
