package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final /* synthetic */ class c1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final d1 f11168b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11169c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11170d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11171e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f11172f;
    private final TaskCompletionSource g;

    c1(d1 d1Var, String str, String str2, String str3, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        this.f11168b = d1Var;
        this.f11169c = str;
        this.f11170d = str2;
        this.f11171e = str3;
        this.f11172f = bundle;
        this.g = taskCompletionSource;
    }

    public final void run() {
        this.f11168b.e(this.f11169c, this.f11170d, this.f11171e, this.f11172f, this.g);
    }
}
