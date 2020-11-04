package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class e5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzaya f3864b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f3865c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3866d;

    e5(zzaya zzaya, Context context, String str) {
        this.f3864b = zzaya;
        this.f3865c = context;
        this.f3866d = str;
    }

    public final void run() {
        this.f3864b.c(this.f3865c, this.f3866d);
    }
}
