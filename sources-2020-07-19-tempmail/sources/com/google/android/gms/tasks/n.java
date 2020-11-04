package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class n<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10607a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final SuccessContinuation<TResult, TContinuationResult> f10608b;

    /* renamed from: c  reason: collision with root package name */
    private final t<TContinuationResult> f10609c;

    public n(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation, t<TContinuationResult> tVar) {
        this.f10607a = executor;
        this.f10608b = successContinuation;
        this.f10609c = tVar;
    }

    public final void a(Task<TResult> task) {
        this.f10607a.execute(new o(this, task));
    }

    public final void b() {
        this.f10609c.y();
    }

    public final void c(Exception exc) {
        this.f10609c.u(exc);
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f10609c.v(tcontinuationresult);
    }
}
