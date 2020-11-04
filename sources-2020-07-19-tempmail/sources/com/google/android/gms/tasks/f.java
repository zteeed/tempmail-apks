package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class f<TResult> implements p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10588a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f10589b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public OnCanceledListener f10590c;

    public f(Executor executor, OnCanceledListener onCanceledListener) {
        this.f10588a = executor;
        this.f10590c = onCanceledListener;
    }

    public final void a(Task task) {
        if (task.p()) {
            synchronized (this.f10589b) {
                if (this.f10590c != null) {
                    this.f10588a.execute(new g(this));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f10589b) {
            this.f10590c = null;
        }
    }
}
