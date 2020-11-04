package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.j;
import com.google.firebase.installations.n.d;

/* compiled from: GetAuthTokenListener */
class i implements l {

    /* renamed from: a  reason: collision with root package name */
    private final m f11852a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<j> f11853b;

    public i(m mVar, TaskCompletionSource<j> taskCompletionSource) {
        this.f11852a = mVar;
        this.f11853b = taskCompletionSource;
    }

    public boolean a(d dVar, Exception exc) {
        if (!dVar.i() && !dVar.j() && !dVar.l()) {
            return false;
        }
        this.f11853b.d(exc);
        return true;
    }

    public boolean b(d dVar) {
        if (!dVar.k() || this.f11852a.b(dVar)) {
            return false;
        }
        TaskCompletionSource<j> taskCompletionSource = this.f11853b;
        j.a a2 = j.a();
        a2.b(dVar.b());
        a2.d(dVar.c());
        a2.c(dVar.h());
        taskCompletionSource.c(a2.a());
        return true;
    }
}
