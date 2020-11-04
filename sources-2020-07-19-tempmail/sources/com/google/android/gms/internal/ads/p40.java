package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class p40 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4605b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4606c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ View f4607d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4608e;

    p40(zzdy zzdy, Context context, String str, View view, Activity activity) {
        this.f4605b = context;
        this.f4606c = str;
        this.f4607d = view;
        this.f4608e = activity;
    }

    public final void run() {
        try {
            zzdy.z.zza(this.f4605b, this.f4606c, this.f4607d, this.f4608e);
        } catch (Exception e2) {
            zzdy.B.b(2021, -1, e2);
        }
    }
}
