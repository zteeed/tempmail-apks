package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class e5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzaya f3681b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f3682c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3683d;

    e5(zzaya zzaya, Context context, String str) {
        this.f3681b = zzaya;
        this.f3682c = context;
        this.f3683d = str;
    }

    public final void run() {
        this.f3681b.c(this.f3682c, this.f3683d);
    }
}
