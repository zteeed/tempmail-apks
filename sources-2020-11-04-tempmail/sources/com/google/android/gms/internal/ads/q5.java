package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class q5 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final zzayv f4868b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4869c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4870d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4871e;

    q5(zzayv zzayv, int i, int i2, int i3) {
        this.f4868b = zzayv;
        this.f4869c = i;
        this.f4870d = i2;
        this.f4871e = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4868b.d(this.f4869c, this.f4870d, this.f4871e, dialogInterface, i);
    }
}
