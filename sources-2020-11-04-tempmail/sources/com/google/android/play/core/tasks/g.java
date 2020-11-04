package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

final class g<ResultT> implements k<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11512a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f11513b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f11514c;

    public g(Executor executor, a aVar) {
        this.f11512a = executor;
        this.f11514c = aVar;
    }

    public final void a(c<ResultT> cVar) {
        if (!cVar.h()) {
            synchronized (this.f11513b) {
                if (this.f11514c != null) {
                    this.f11512a.execute(new f(this, cVar));
                }
            }
        }
    }
}
