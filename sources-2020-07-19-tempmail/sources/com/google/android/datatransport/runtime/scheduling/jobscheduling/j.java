package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: Uploader */
final /* synthetic */ class j implements a.C0070a {

    /* renamed from: a  reason: collision with root package name */
    private final m f2595a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2596b;

    /* renamed from: c  reason: collision with root package name */
    private final Iterable f2597c;

    /* renamed from: d  reason: collision with root package name */
    private final m f2598d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2599e;

    private j(m mVar, g gVar, Iterable iterable, m mVar2, int i) {
        this.f2595a = mVar;
        this.f2596b = gVar;
        this.f2597c = iterable;
        this.f2598d = mVar2;
        this.f2599e = i;
    }

    public static a.C0070a a(m mVar, g gVar, Iterable iterable, m mVar2, int i) {
        return new j(mVar, gVar, iterable, mVar2, i);
    }

    public Object execute() {
        return m.c(this.f2595a, this.f2596b, this.f2597c, this.f2598d, this.f2599e);
    }
}
