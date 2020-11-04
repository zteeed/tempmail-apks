package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.l;
import com.google.firebase.installations.p.d;

/* compiled from: GetAuthTokenListener */
class j implements n {

    /* renamed from: a  reason: collision with root package name */
    private final o f11302a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<l> f11303b;

    public j(o oVar, TaskCompletionSource<l> taskCompletionSource) {
        this.f11302a = oVar;
        this.f11303b = taskCompletionSource;
    }

    public boolean a(d dVar, Exception exc) {
        if (!dVar.i() && !dVar.j() && !dVar.l()) {
            return false;
        }
        this.f11303b.d(exc);
        return true;
    }

    public boolean b(d dVar) {
        if (!dVar.k() || this.f11302a.b(dVar)) {
            return false;
        }
        TaskCompletionSource<l> taskCompletionSource = this.f11303b;
        l.a a2 = l.a();
        a2.b(dVar.b());
        a2.d(dVar.c());
        a2.c(dVar.h());
        taskCompletionSource.c(a2.a());
        return true;
    }
}
