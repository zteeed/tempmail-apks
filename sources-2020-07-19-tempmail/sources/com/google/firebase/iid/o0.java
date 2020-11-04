package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final /* synthetic */ class o0 implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f11227b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f11228c;

    o0(Context context, Intent intent) {
        this.f11227b = context;
        this.f11228c = intent;
    }

    public final Object call() {
        return Integer.valueOf(y.b().a(this.f11227b, this.f11228c));
    }
}
