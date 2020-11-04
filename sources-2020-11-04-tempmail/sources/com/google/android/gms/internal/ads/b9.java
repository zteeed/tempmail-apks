package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class b9 implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f3620b;

    b9(JsPromptResult jsPromptResult) {
        this.f3620b = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f3620b.cancel();
    }
}
