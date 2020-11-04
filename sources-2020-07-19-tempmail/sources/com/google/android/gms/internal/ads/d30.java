package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d30 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3596b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ View f3597c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Activity f3598d;

    d30(zzdy zzdy, Context context, View view, Activity activity) {
        this.f3596b = context;
        this.f3597c = view;
        this.f3598d = activity;
    }

    public final void run() {
        try {
            zzdy.z.zza(this.f3596b, this.f3597c, this.f3598d);
        } catch (Exception e2) {
            zzdy.B.b(2020, -1, e2);
        }
    }
}
