package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class f<TResult> implements p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10774a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f10775b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public OnCanceledListener f10776c;

    public f(Executor executor, OnCanceledListener onCanceledListener) {
        this.f10774a = executor;
        this.f10776c = onCanceledListener;
    }

    public final void a(Task task) {
        if (task.p()) {
            synchronized (this.f10775b) {
                if (this.f10776c != null) {
                    this.f10774a.execute(new g(this));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f10775b) {
            this.f10776c = null;
        }
    }
}
