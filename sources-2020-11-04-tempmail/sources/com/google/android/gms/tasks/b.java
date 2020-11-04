package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class b<TResult, TContinuationResult> implements p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10764a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Continuation<TResult, TContinuationResult> f10765b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final t<TContinuationResult> f10766c;

    public b(Executor executor, Continuation<TResult, TContinuationResult> continuation, t<TContinuationResult> tVar) {
        this.f10764a = executor;
        this.f10765b = continuation;
        this.f10766c = tVar;
    }

    public final void a(Task<TResult> task) {
        this.f10764a.execute(new c(this, task));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
