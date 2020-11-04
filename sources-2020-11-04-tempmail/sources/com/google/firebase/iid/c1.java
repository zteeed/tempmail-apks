package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class c1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final d1 f11718b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11719c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11720d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11721e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f11722f;
    private final TaskCompletionSource g;

    c1(d1 d1Var, String str, String str2, String str3, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        this.f11718b = d1Var;
        this.f11719c = str;
        this.f11720d = str2;
        this.f11721e = str3;
        this.f11722f = bundle;
        this.g = taskCompletionSource;
    }

    public final void run() {
        this.f11718b.e(this.f11719c, this.f11720d, this.f11721e, this.f11722f, this.g);
    }
}
