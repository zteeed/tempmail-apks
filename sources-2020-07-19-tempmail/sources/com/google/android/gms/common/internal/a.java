package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class a extends DialogRedirect {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3039b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f3040c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3041d;

    a(Intent intent, Activity activity, int i) {
        this.f3039b = intent;
        this.f3040c = activity;
        this.f3041d = i;
    }

    public final void d() {
        Intent intent = this.f3039b;
        if (intent != null) {
            this.f3040c.startActivityForResult(intent, this.f3041d);
        }
    }
}
