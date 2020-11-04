package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class t5 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final zzayv f4951b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4952c;

    t5(zzayv zzayv, String str) {
        this.f4951b = zzayv;
        this.f4952c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4951b.e(this.f4952c, dialogInterface, i);
    }
}
