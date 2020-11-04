package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ga0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f4047b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f4048c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzex f4049d;

    ga0(zzex zzex, int i, boolean z) {
        this.f4049d = zzex;
        this.f4047b = i;
        this.f4048c = z;
    }

    public final void run() {
        zzcf.zza l = this.f4049d.l(this.f4047b, this.f4048c);
        zzcf.zza unused = this.f4049d.j = l;
        if (zzex.i(this.f4047b, l)) {
            this.f4049d.f(this.f4047b + 1, this.f4048c);
        }
    }
}
