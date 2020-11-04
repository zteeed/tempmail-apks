package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class e9 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f3877b;

    e9(JsPromptResult jsPromptResult) {
        this.f3877b = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3877b.cancel();
    }
}
