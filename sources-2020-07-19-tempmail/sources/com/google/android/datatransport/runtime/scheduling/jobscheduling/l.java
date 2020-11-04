package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;
import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: Uploader */
final /* synthetic */ class l implements a.C0070a {

    /* renamed from: a  reason: collision with root package name */
    private final m f2601a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2602b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2603c;

    private l(m mVar, m mVar2, int i) {
        this.f2601a = mVar;
        this.f2602b = mVar2;
        this.f2603c = i;
    }

    public static a.C0070a a(m mVar, m mVar2, int i) {
        return new l(mVar, mVar2, i);
    }

    public Object execute() {
        return this.f2601a.f2607d.a(this.f2602b, this.f2603c + 1);
    }
}
