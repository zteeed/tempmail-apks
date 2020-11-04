package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

final class c extends DialogRedirect {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3228b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ LifecycleFragment f3229c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3230d;

    c(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.f3228b = intent;
        this.f3229c = lifecycleFragment;
        this.f3230d = i;
    }

    public final void d() {
        Intent intent = this.f3228b;
        if (intent != null) {
            this.f3229c.startActivityForResult(intent, this.f3230d);
        }
    }
}
