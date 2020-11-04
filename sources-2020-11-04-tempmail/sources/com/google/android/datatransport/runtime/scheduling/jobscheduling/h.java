package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;

/* compiled from: Uploader */
final /* synthetic */ class h implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final m f2777b;

    /* renamed from: c  reason: collision with root package name */
    private final m f2778c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2779d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f2780e;

    private h(m mVar, m mVar2, int i, Runnable runnable) {
        this.f2777b = mVar;
        this.f2778c = mVar2;
        this.f2779d = i;
        this.f2780e = runnable;
    }

    public static Runnable a(m mVar, m mVar2, int i, Runnable runnable) {
        return new h(mVar, mVar2, i, runnable);
    }

    public void run() {
        m.e(this.f2777b, this.f2778c, this.f2779d, this.f2780e);
    }
}
