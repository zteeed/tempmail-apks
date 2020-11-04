package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class c9 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsResult f3711b;

    c9(JsResult jsResult) {
        this.f3711b = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3711b.confirm();
    }
}
