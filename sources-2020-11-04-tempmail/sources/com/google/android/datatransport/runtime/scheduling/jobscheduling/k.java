package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.w.j.c;
import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: Uploader */
final /* synthetic */ class k implements a.C0069a {

    /* renamed from: a  reason: collision with root package name */
    private final c f2788a;

    private k(c cVar) {
        this.f2788a = cVar;
    }

    public static a.C0069a a(c cVar) {
        return new k(cVar);
    }

    public Object execute() {
        return Integer.valueOf(this.f2788a.c());
    }
}
