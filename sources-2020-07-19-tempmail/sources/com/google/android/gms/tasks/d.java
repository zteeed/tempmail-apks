package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class d<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10583a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Continuation<TResult, Task<TContinuationResult>> f10584b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final t<TContinuationResult> f10585c;

    public d(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation, t<TContinuationResult> tVar) {
        this.f10583a = executor;
        this.f10584b = continuation;
        this.f10585c = tVar;
    }

    public final void a(Task<TResult> task) {
        this.f10583a.execute(new e(this, task));
    }

    public final void b() {
        this.f10585c.y();
    }

    public final void c(Exception exc) {
        this.f10585c.u(exc);
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f10585c.v(tcontinuationresult);
    }
}
