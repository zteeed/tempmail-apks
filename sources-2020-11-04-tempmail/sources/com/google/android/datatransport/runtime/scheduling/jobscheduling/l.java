package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;
import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: Uploader */
final /* synthetic */ class l implements a.C0069a {

    /* renamed from: a  reason: collision with root package name */
    private final m f2789a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2790b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2791c;

    private l(m mVar, m mVar2, int i) {
        this.f2789a = mVar;
        this.f2790b = mVar2;
        this.f2791c = i;
    }

    public static a.C0069a a(m mVar, m mVar2, int i) {
        return new l(mVar, mVar2, i);
    }

    public Object execute() {
        return this.f2789a.f2795d.a(this.f2790b, this.f2791c + 1);
    }
}
