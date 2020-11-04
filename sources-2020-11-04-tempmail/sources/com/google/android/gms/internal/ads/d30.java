package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d30 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3779b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ View f3780c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Activity f3781d;

    d30(zzdy zzdy, Context context, View view, Activity activity) {
        this.f3779b = context;
        this.f3780c = view;
        this.f3781d = activity;
    }

    public final void run() {
        try {
            zzdy.z.zza(this.f3779b, this.f3780c, this.f3781d);
        } catch (Exception e2) {
            zzdy.B.b(2020, -1, e2);
        }
    }
}
