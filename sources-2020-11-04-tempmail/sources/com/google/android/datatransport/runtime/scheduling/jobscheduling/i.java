package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;
import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: Uploader */
final /* synthetic */ class i implements a.C0069a {

    /* renamed from: a  reason: collision with root package name */
    private final m f2781a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2782b;

    private i(m mVar, m mVar2) {
        this.f2781a = mVar;
        this.f2782b = mVar2;
    }

    public static a.C0069a a(m mVar, m mVar2) {
        return new i(mVar, mVar2);
    }

    public Object execute() {
        return this.f2781a.f2794c.j(this.f2782b);
    }
}
