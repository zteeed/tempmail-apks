package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class l<TResult> implements p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10788a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f10789b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public OnSuccessListener<? super TResult> f10790c;

    public l(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.f10788a = executor;
        this.f10790c = onSuccessListener;
    }

    public final void a(Task<TResult> task) {
        if (task.r()) {
            synchronized (this.f10789b) {
                if (this.f10790c != null) {
                    this.f10788a.execute(new m(this, task));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f10789b) {
            this.f10790c = null;
        }
    }
}
