package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class h<TResult> implements p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10592a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f10593b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public OnCompleteListener<TResult> f10594c;

    public h(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f10592a = executor;
        this.f10594c = onCompleteListener;
    }

    public final void a(Task<TResult> task) {
        synchronized (this.f10593b) {
            if (this.f10594c != null) {
                this.f10592a.execute(new i(this, task));
            }
        }
    }

    public final void cancel() {
        synchronized (this.f10593b) {
            this.f10594c = null;
        }
    }
}
