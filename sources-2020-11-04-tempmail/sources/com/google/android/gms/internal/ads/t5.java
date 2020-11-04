package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class t5 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final zzayv f5134b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5135c;

    t5(zzayv zzayv, String str) {
        this.f5134b = zzayv;
        this.f5135c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5134b.e(this.f5135c, dialogInterface, i);
    }
}
