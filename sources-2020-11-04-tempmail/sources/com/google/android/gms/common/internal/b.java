package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

final class b extends DialogRedirect {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3225b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Fragment f3226c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3227d;

    b(Intent intent, Fragment fragment, int i) {
        this.f3225b = intent;
        this.f3226c = fragment;
        this.f3227d = i;
    }

    public final void d() {
        Intent intent = this.f3225b;
        if (intent != null) {
            this.f3226c.startActivityForResult(intent, this.f3227d);
        }
    }
}
