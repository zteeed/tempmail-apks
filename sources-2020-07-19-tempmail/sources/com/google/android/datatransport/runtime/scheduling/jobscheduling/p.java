package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: WorkInitializer */
final /* synthetic */ class p implements a.C0070a {

    /* renamed from: a  reason: collision with root package name */
    private final q f2617a;

    private p(q qVar) {
        this.f2617a = qVar;
    }

    public static a.C0070a a(q qVar) {
        return new p(qVar);
    }

    public Object execute() {
        return q.b(this.f2617a);
    }
}
