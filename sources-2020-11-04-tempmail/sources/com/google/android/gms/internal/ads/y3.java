package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class y3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzavi f5529b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f5530c;

    y3(zzavi zzavi, Bitmap bitmap) {
        this.f5529b = zzavi;
        this.f5530c = bitmap;
    }

    public final void run() {
        this.f5529b.i(this.f5530c);
    }
}
