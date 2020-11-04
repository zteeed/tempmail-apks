package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ga0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3864b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f3865c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzex f3866d;

    ga0(zzex zzex, int i, boolean z) {
        this.f3866d = zzex;
        this.f3864b = i;
        this.f3865c = z;
    }

    public final void run() {
        zzcf.zza l = this.f3866d.l(this.f3864b, this.f3865c);
        zzcf.zza unused = this.f3866d.j = l;
        if (zzex.i(this.f3864b, l)) {
            this.f3866d.f(this.f3864b + 1, this.f3865c);
        }
    }
}
