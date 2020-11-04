package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class d<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10769a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Continuation<TResult, Task<TContinuationResult>> f10770b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final t<TContinuationResult> f10771c;

    public d(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation, t<TContinuationResult> tVar) {
        this.f10769a = executor;
        this.f10770b = continuation;
        this.f10771c = tVar;
    }

    public final void a(Task<TResult> task) {
        this.f10769a.execute(new e(this, task));
    }

    public final void b(Exception exc) {
        this.f10771c.u(exc);
    }

    public final void c() {
        this.f10771c.y();
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f10771c.v(tcontinuationresult);
    }
}
