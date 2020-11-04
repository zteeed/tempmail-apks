package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class j0 {

    /* renamed from: a  reason: collision with root package name */
    final Intent f11757a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<Void> f11758b = new TaskCompletionSource<>();

    j0(Intent intent) {
        this.f11757a = intent;
    }

    /* access modifiers changed from: package-private */
    public final Task<Void> a() {
        return this.f11758b.a();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f11758b.e(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        String action = this.f11757a.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("FirebaseInstanceId", sb.toString());
        b();
    }
}
