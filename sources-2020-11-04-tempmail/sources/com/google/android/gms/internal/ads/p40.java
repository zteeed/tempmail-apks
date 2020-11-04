package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class p40 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4788b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4789c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ View f4790d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4791e;

    p40(zzdy zzdy, Context context, String str, View view, Activity activity) {
        this.f4788b = context;
        this.f4789c = str;
        this.f4790d = view;
        this.f4791e = activity;
    }

    public final void run() {
        try {
            zzdy.z.zza(this.f4788b, this.f4789c, this.f4790d, this.f4791e);
        } catch (Exception e2) {
            zzdy.B.b(2021, -1, e2);
        }
    }
}
