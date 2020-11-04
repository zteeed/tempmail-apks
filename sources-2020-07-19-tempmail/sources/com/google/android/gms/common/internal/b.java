package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

final class b extends DialogRedirect {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3042b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Fragment f3043c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3044d;

    b(Intent intent, Fragment fragment, int i) {
        this.f3042b = intent;
        this.f3043c = fragment;
        this.f3044d = i;
    }

    public final void d() {
        Intent intent = this.f3042b;
        if (intent != null) {
            this.f3043c.startActivityForResult(intent, this.f3044d);
        }
    }
}
