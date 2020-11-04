package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class t<TResult> extends Task<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10801a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final q<TResult> f10802b = new q<>();
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    private boolean f10803c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f10804d;
    @GuardedBy("mLock")

    /* renamed from: e  reason: collision with root package name */
    private TResult f10805e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    private Exception f10806f;

    private static class a extends LifecycleCallback {

        /* renamed from: c  reason: collision with root package name */
        private final List<WeakReference<p<?>>> f10807c = new ArrayList();

        private a(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.f2942b.e("TaskOnStopCallback", this);
        }

        public static a l(Activity activity) {
            LifecycleFragment c2 = LifecycleCallback.c(activity);
            a aVar = (a) c2.m("TaskOnStopCallback", a.class);
            return aVar == null ? new a(c2) : aVar;
        }

        public void k() {
            synchronized (this.f10807c) {
                for (WeakReference<p<?>> weakReference : this.f10807c) {
                    p pVar = (p) weakReference.get();
                    if (pVar != null) {
                        pVar.cancel();
                    }
                }
                this.f10807c.clear();
            }
        }

        public final <T> void m(p<T> pVar) {
            synchronized (this.f10807c) {
                this.f10807c.add(new WeakReference(pVar));
            }
        }
    }

    t() {
    }

    @GuardedBy("mLock")
    private final void A() {
        Preconditions.o(!this.f10803c, "Task is already complete");
    }

    @GuardedBy("mLock")
    private final void B() {
        if (this.f10804d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void C() {
        synchronized (this.f10801a) {
            if (this.f10803c) {
                this.f10802b.a(this);
            }
        }
    }

    @GuardedBy("mLock")
    private final void z() {
        Preconditions.o(this.f10803c, "Task is not yet complete");
    }

    public final Task<TResult> a(Executor executor, OnCanceledListener onCanceledListener) {
        this.f10802b.b(new f(executor, onCanceledListener));
        C();
        return this;
    }

    public final Task<TResult> b(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        h hVar = new h(TaskExecutors.f10754a, onCompleteListener);
        this.f10802b.b(hVar);
        a.l(activity).m(hVar);
        C();
        return this;
    }

    public final Task<TResult> c(OnCompleteListener<TResult> onCompleteListener) {
        d(TaskExecutors.f10754a, onCompleteListener);
        return this;
    }

    public final Task<TResult> d(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f10802b.b(new h(executor, onCompleteListener));
        C();
        return this;
    }

    public final Task<TResult> e(Activity activity, OnFailureListener onFailureListener) {
        j jVar = new j(TaskExecutors.f10754a, onFailureListener);
        this.f10802b.b(jVar);
        a.l(activity).m(jVar);
        C();
        return this;
    }

    public final Task<TResult> f(Executor executor, OnFailureListener onFailureListener) {
        this.f10802b.b(new j(executor, onFailureListener));
        C();
        return this;
    }

    public final Task<TResult> g(Activity activity, OnSuccessListener<? super TResult> onSuccessListener) {
        l lVar = new l(TaskExecutors.f10754a, onSuccessListener);
        this.f10802b.b(lVar);
        a.l(activity).m(lVar);
        C();
        return this;
    }

    public final Task<TResult> h(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.f10802b.b(new l(executor, onSuccessListener));
        C();
        return this;
    }

    public final <TContinuationResult> Task<TContinuationResult> i(Continuation<TResult, TContinuationResult> continuation) {
        return j(TaskExecutors.f10754a, continuation);
    }

    public final <TContinuationResult> Task<TContinuationResult> j(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        t tVar = new t();
        this.f10802b.b(new b(executor, continuation, tVar));
        C();
        return tVar;
    }

    public final <TContinuationResult> Task<TContinuationResult> k(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return l(TaskExecutors.f10754a, continuation);
    }

    public final <TContinuationResult> Task<TContinuationResult> l(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        t tVar = new t();
        this.f10802b.b(new d(executor, continuation, tVar));
        C();
        return tVar;
    }

    public final Exception m() {
        Exception exc;
        synchronized (this.f10801a) {
            exc = this.f10806f;
        }
        return exc;
    }

    public final TResult n() {
        TResult tresult;
        synchronized (this.f10801a) {
            z();
            B();
            if (this.f10806f == null) {
                tresult = this.f10805e;
            } else {
                throw new RuntimeExecutionException(this.f10806f);
            }
        }
        return tresult;
    }

    public final <X extends Throwable> TResult o(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f10801a) {
            z();
            B();
            if (cls.isInstance(this.f10806f)) {
                throw ((Throwable) cls.cast(this.f10806f));
            } else if (this.f10806f == null) {
                tresult = this.f10805e;
            } else {
                throw new RuntimeExecutionException(this.f10806f);
            }
        }
        return tresult;
    }

    public final boolean p() {
        return this.f10804d;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.f10801a) {
            z = this.f10803c;
        }
        return z;
    }

    public final boolean r() {
        boolean z;
        synchronized (this.f10801a) {
            z = this.f10803c && !this.f10804d && this.f10806f == null;
        }
        return z;
    }

    public final <TContinuationResult> Task<TContinuationResult> s(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        return t(TaskExecutors.f10754a, successContinuation);
    }

    public final <TContinuationResult> Task<TContinuationResult> t(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        t tVar = new t();
        this.f10802b.b(new n(executor, successContinuation, tVar));
        C();
        return tVar;
    }

    public final void u(Exception exc) {
        Preconditions.l(exc, "Exception must not be null");
        synchronized (this.f10801a) {
            A();
            this.f10803c = true;
            this.f10806f = exc;
        }
        this.f10802b.a(this);
    }

    public final void v(TResult tresult) {
        synchronized (this.f10801a) {
            A();
            this.f10803c = true;
            this.f10805e = tresult;
        }
        this.f10802b.a(this);
    }

    public final boolean w(Exception exc) {
        Preconditions.l(exc, "Exception must not be null");
        synchronized (this.f10801a) {
            if (this.f10803c) {
                return false;
            }
            this.f10803c = true;
            this.f10806f = exc;
            this.f10802b.a(this);
            return true;
        }
    }

    public final boolean x(TResult tresult) {
        synchronized (this.f10801a) {
            if (this.f10803c) {
                return false;
            }
            this.f10803c = true;
            this.f10805e = tresult;
            this.f10802b.a(this);
            return true;
        }
    }

    public final boolean y() {
        synchronized (this.f10801a) {
            if (this.f10803c) {
                return false;
            }
            this.f10803c = true;
            this.f10804d = true;
            this.f10802b.a(this);
            return true;
        }
    }
}
