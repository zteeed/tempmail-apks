package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
public final class f0 extends Binder {

    /* renamed from: b  reason: collision with root package name */
    private final h0 f11746b;

    public f0(h0 h0Var) {
        this.f11746b = h0Var;
    }

    /* access modifiers changed from: package-private */
    public final void a(j0 j0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
            }
            this.f11746b.a(j0Var.f11757a).d(s0.a(), new i0(j0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
