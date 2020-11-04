package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

final class c extends DialogRedirect {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3045b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ LifecycleFragment f3046c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3047d;

    c(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.f3045b = intent;
        this.f3046c = lifecycleFragment;
        this.f3047d = i;
    }

    public final void d() {
        Intent intent = this.f3045b;
        if (intent != null) {
            this.f3046c.startActivityForResult(intent, this.f3047d);
        }
    }
}
