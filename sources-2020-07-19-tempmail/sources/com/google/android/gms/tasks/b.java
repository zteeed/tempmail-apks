package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class b<TResult, TContinuationResult> implements p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10578a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Continuation<TResult, TContinuationResult> f10579b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final t<TContinuationResult> f10580c;

    public b(Executor executor, Continuation<TResult, TContinuationResult> continuation, t<TContinuationResult> tVar) {
        this.f10578a = executor;
        this.f10579b = continuation;
        this.f10580c = tVar;
    }

    public final void a(Task<TResult> task) {
        this.f10578a.execute(new c(this, task));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
