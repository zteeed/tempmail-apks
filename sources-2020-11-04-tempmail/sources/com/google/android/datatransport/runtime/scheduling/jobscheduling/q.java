package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;
import b.c.a.b.i.w.j.c;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* compiled from: WorkInitializer */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2806a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2807b;

    /* renamed from: c  reason: collision with root package name */
    private final s f2808c;

    /* renamed from: d  reason: collision with root package name */
    private final a f2809d;

    @Inject
    q(Executor executor, c cVar, s sVar, a aVar) {
        this.f2806a = executor;
        this.f2807b = cVar;
        this.f2808c = sVar;
        this.f2809d = aVar;
    }

    static /* synthetic */ Object b(q qVar) {
        for (m a2 : qVar.f2807b.w()) {
            qVar.f2808c.a(a2, 1);
        }
        return null;
    }

    public void a() {
        this.f2806a.execute(o.a(this));
    }
}
