package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class q5 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final zzayv f4685b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4686c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4687d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4688e;

    q5(zzayv zzayv, int i, int i2, int i3) {
        this.f4685b = zzayv;
        this.f4686c = i;
        this.f4687d = i2;
        this.f4688e = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4685b.d(this.f4686c, this.f4687d, this.f4688e, dialogInterface, i);
    }
}
