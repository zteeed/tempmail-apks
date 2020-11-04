package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

final class i<ResultT> implements k<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11517a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f11518b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b<? super ResultT> f11519c;

    public i(Executor executor, b<? super ResultT> bVar) {
        this.f11517a = executor;
        this.f11519c = bVar;
    }

    public final void a(c<ResultT> cVar) {
        if (cVar.h()) {
            synchronized (this.f11518b) {
                if (this.f11519c != null) {
                    this.f11517a.execute(new h(this, cVar));
                }
            }
        }
    }
}
