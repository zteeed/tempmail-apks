package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class n<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10793a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final SuccessContinuation<TResult, TContinuationResult> f10794b;

    /* renamed from: c  reason: collision with root package name */
    private final t<TContinuationResult> f10795c;

    public n(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation, t<TContinuationResult> tVar) {
        this.f10793a = executor;
        this.f10794b = successContinuation;
        this.f10795c = tVar;
    }

    public final void a(Task<TResult> task) {
        this.f10793a.execute(new o(this, task));
    }

    public final void b(Exception exc) {
        this.f10795c.u(exc);
    }

    public final void c() {
        this.f10795c.y();
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f10795c.v(tcontinuationresult);
    }
}
