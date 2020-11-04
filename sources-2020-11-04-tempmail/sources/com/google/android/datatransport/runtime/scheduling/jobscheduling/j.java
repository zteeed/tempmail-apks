package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: Uploader */
final /* synthetic */ class j implements a.C0069a {

    /* renamed from: a  reason: collision with root package name */
    private final m f2783a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2784b;

    /* renamed from: c  reason: collision with root package name */
    private final Iterable f2785c;

    /* renamed from: d  reason: collision with root package name */
    private final m f2786d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2787e;

    private j(m mVar, g gVar, Iterable iterable, m mVar2, int i) {
        this.f2783a = mVar;
        this.f2784b = gVar;
        this.f2785c = iterable;
        this.f2786d = mVar2;
        this.f2787e = i;
    }

    public static a.C0069a a(m mVar, g gVar, Iterable iterable, m mVar2, int i) {
        return new j(mVar, gVar, iterable, mVar2, i);
    }

    public Object execute() {
        return m.c(this.f2783a, this.f2784b, this.f2785c, this.f2786d, this.f2787e);
    }
}
