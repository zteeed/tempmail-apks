package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class a extends DialogRedirect {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3222b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f3223c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3224d;

    a(Intent intent, Activity activity, int i) {
        this.f3222b = intent;
        this.f3223c = activity;
        this.f3224d = i;
    }

    public final void d() {
        Intent intent = this.f3222b;
        if (intent != null) {
            this.f3223c.startActivityForResult(intent, this.f3224d);
        }
    }
}
