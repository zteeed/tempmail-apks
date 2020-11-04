package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class a9 implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsResult f3353b;

    a9(JsResult jsResult) {
        this.f3353b = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f3353b.cancel();
    }
}
