package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class z8 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsResult f5622b;

    z8(JsResult jsResult) {
        this.f5622b = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5622b.cancel();
    }
}
