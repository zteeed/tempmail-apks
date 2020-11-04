package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b.c.a.b.i.m;
import b.c.a.b.i.w.j.c;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* compiled from: WorkInitializer */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2618a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2619b;

    /* renamed from: c  reason: collision with root package name */
    private final s f2620c;

    /* renamed from: d  reason: collision with root package name */
    private final a f2621d;

    @Inject
    q(Executor executor, c cVar, s sVar, a aVar) {
        this.f2618a = executor;
        this.f2619b = cVar;
        this.f2620c = sVar;
        this.f2621d = aVar;
    }

    static /* synthetic */ Object b(q qVar) {
        for (m a2 : qVar.f2619b.w()) {
            qVar.f2620c.a(a2, 1);
        }
        return null;
    }

    public void a() {
        this.f2618a.execute(o.a(this));
    }
}
