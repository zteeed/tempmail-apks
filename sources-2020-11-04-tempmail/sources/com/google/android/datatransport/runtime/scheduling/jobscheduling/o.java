package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: WorkInitializer */
final /* synthetic */ class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final q f2804b;

    private o(q qVar) {
        this.f2804b = qVar;
    }

    public static Runnable a(q qVar) {
        return new o(qVar);
    }

    public void run() {
        this.f2804b.f2809d.a(p.a(this.f2804b));
    }
}
