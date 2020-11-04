package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class h<TResult> implements p<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10778a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f10779b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public OnCompleteListener<TResult> f10780c;

    public h(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f10778a = executor;
        this.f10780c = onCompleteListener;
    }

    public final void a(Task<TResult> task) {
        synchronized (this.f10779b) {
            if (this.f10780c != null) {
                this.f10778a.execute(new i(this, task));
            }
        }
    }

    public final void cancel() {
        synchronized (this.f10779b) {
            this.f10780c = null;
        }
    }
}
