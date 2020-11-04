package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;

/* compiled from: Uploader */
final /* synthetic */ class h implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final m f2589b;

    /* renamed from: c  reason: collision with root package name */
    private final m f2590c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2591d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f2592e;

    private h(m mVar, m mVar2, int i, Runnable runnable) {
        this.f2589b = mVar;
        this.f2590c = mVar2;
        this.f2591d = i;
        this.f2592e = runnable;
    }

    public static Runnable a(m mVar, m mVar2, int i, Runnable runnable) {
        return new h(mVar, mVar2, i, runnable);
    }

    public void run() {
        m.e(this.f2589b, this.f2590c, this.f2591d, this.f2592e);
    }
}
