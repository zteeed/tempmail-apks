package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;
import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: Uploader */
final /* synthetic */ class i implements a.C0070a {

    /* renamed from: a  reason: collision with root package name */
    private final m f2593a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2594b;

    private i(m mVar, m mVar2) {
        this.f2593a = mVar;
        this.f2594b = mVar2;
    }

    public static a.C0070a a(m mVar, m mVar2) {
        return new i(mVar, mVar2);
    }

    public Object execute() {
        return this.f2593a.f2606c.j(this.f2594b);
    }
}
