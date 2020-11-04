package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d9 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f3803b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ EditText f3804c;

    d9(JsPromptResult jsPromptResult, EditText editText) {
        this.f3803b = jsPromptResult;
        this.f3804c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3803b.confirm(this.f3804c.getText().toString());
    }
}
