package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class j<TResult> implements p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10783a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f10784b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public OnFailureListener f10785c;

    public j(Executor executor, OnFailureListener onFailureListener) {
        this.f10783a = executor;
        this.f10785c = onFailureListener;
    }

    public final void a(Task<TResult> task) {
        if (!task.r() && !task.p()) {
            synchronized (this.f10784b) {
                if (this.f10785c != null) {
                    this.f10783a.execute(new k(this, task));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f10784b) {
            this.f10785c = null;
        }
    }
}
