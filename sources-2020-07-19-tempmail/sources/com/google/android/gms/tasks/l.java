package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class l<TResult> implements p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10602a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f10603b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public OnSuccessListener<? super TResult> f10604c;

    public l(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.f10602a = executor;
        this.f10604c = onSuccessListener;
    }

    public final void a(Task<TResult> task) {
        if (task.r()) {
            synchronized (this.f10603b) {
                if (this.f10604c != null) {
                    this.f10602a.execute(new m(this, task));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f10603b) {
            this.f10604c = null;
        }
    }
}
