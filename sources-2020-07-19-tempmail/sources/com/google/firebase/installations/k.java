package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.p.d;

/* compiled from: GetIdListener */
class k implements n {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource<String> f11304a;

    public k(TaskCompletionSource<String> taskCompletionSource) {
        this.f11304a = taskCompletionSource;
    }

    public boolean a(d dVar, Exception exc) {
        return false;
    }

    public boolean b(d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f11304a.e(dVar.d());
        return true;
    }
}
