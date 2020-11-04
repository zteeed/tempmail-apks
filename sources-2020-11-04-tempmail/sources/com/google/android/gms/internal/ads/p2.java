package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final /* synthetic */ class p2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4782b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4783c;

    p2(zzamj zzamj, Context context, String str) {
        this.f4782b = context;
        this.f4783c = str;
    }

    public final void run() {
        zzamj.c(this.f4782b, this.f4783c);
    }
}
