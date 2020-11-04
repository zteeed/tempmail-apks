package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class o0 implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f11777b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f11778c;

    o0(Context context, Intent intent) {
        this.f11777b = context;
        this.f11778c = intent;
    }

    public final Object call() {
        return Integer.valueOf(y.b().a(this.f11777b, this.f11778c));
    }
}
