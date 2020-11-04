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
    private final Object f10615a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final q<TResult> f10616b = new q<>();
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    private boolean f10617c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f10618d;
    @GuardedBy("mLock")

    /* renamed from: e  reason: collision with root package name */
    private TResult f10619e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    private Exception f10620f;

    private static class a extends LifecycleCallback {

        /* renamed from: c  reason: collision with root package name */
        private final List<WeakReference<p<?>>> f10621c = new ArrayList();

        private a(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.f2754b.d("TaskOnStopCallback", this);
        }

        public static a l(Activity activity) {
            LifecycleFragment c2 = LifecycleCallback.c(activity);
            a aVar = (a) c2.k("TaskOnStopCallback", a.class);
            return aVar == null ? new a(c2) : aVar;
        }

        public void k() {
            synchronized (this.f10621c) {
                for (WeakReference<p<?>> weakReference : this.f10621c) {
                    p pVar = (p) weakReference.get();
                    if (pVar != null) {
                        pVar.cancel();
                    }
                }
                this.f10621c.clear();
            }
        }

        public final <T> void m(p<T> pVar) {
            synchronized (this.f10621c) {
                this.f10621c.add(new WeakReference(pVar));
            }
        }
    }

    t() {
    }

    @GuardedBy("mLock")
    private final void A() {
        Preconditions.o(!this.f10617c, "Task is already complete");
    }

    @GuardedBy("mLock")
    private final void B() {
        if (this.f10618d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void C() {
        synchronized (this.f10615a) {
            if (this.f10617c) {
                this.f10616b.a(this);
            }
        }
    }

    @GuardedBy("mLock")
    private final void z() {
        Preconditions.o(this.f10617c, "Task is not yet complete");
    }

    public final Task<TResult> a(Executor executor, OnCanceledListener onCanceledListener) {
        this.f10616b.b(new f(executor, onCanceledListener));
        C();
        return this;
    }

    public final Task<TResult> b(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        h hVar = new h(TaskExecutors.f10568a, onCompleteListener);
        this.f10616b.b(hVar);
        a.l(activity).m(hVar);
        C();
        return this;
    }

    public final Task<TResult> c(OnCompleteListener<TResult> onCompleteListener) {
        d(TaskExecutors.f10568a, onCompleteListener);
        return this;
    }

    public final Task<TResult> d(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f10616b.b(new h(executor, onCompleteListener));
        C();
        return this;
    }

    public final Task<TResult> e(Activity activity, OnFailureListener onFailureListener) {
        j jVar = new j(TaskExecutors.f10568a, onFailureListener);
        this.f10616b.b(jVar);
        a.l(activity).m(jVar);
        C();
        return this;
    }

    public final Task<TResult> f(Executor executor, OnFailureListener onFailureListener) {
        this.f10616b.b(new j(executor, onFailureListener));
        C();
        return this;
    }

    public final Task<TResult> g(Activity activity, OnSuccessListener<? super TResult> onSuccessListener) {
        l lVar = new l(TaskExecutors.f10568a, onSuccessListener);
        this.f10616b.b(lVar);
        a.l(activity).m(lVar);
        C();
        return this;
    }

    public final Task<TResult> h(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.f10616b.b(new l(executor, onSuccessListener));
        C();
        return this;
    }

    public final <TContinuationResult> Task<TContinuationResult> i(Continuation<TResult, TContinuationResult> continuation) {
        return j(TaskExecutors.f10568a, continuation);
    }

    public final <TContinuationResult> Task<TContinuationResult> j(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        t tVar = new t();
        this.f10616b.b(new b(executor, continuation, tVar));
        C();
        return tVar;
    }

    public final <TContinuationResult> Task<TContinuationResult> k(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return l(TaskExecutors.f10568a, continuation);
    }

    public final <TContinuationResult> Task<TContinuationResult> l(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        t tVar = new t();
        this.f10616b.b(new d(executor, continuation, tVar));
        C();
        return tVar;
    }

    public final Exception m() {
        Exception exc;
        synchronized (this.f10615a) {
            exc = this.f10620f;
        }
        return exc;
    }

    public final TResult n() {
        TResult tresult;
        synchronized (this.f10615a) {
            z();
            B();
            if (this.f10620f == null) {
                tresult = this.f10619e;
            } else {
                throw new RuntimeExecutionException(this.f10620f);
            }
        }
        return tresult;
    }

    public final <X extends Throwable> TResult o(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f10615a) {
            z();
            B();
            if (cls.isInstance(this.f10620f)) {
                throw ((Throwable) cls.cast(this.f10620f));
            } else if (this.f10620f == null) {
                tresult = this.f10619e;
            } else {
                throw new RuntimeExecutionException(this.f10620f);
            }
        }
        return tresult;
    }

    public final boolean p() {
        return this.f10618d;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.f10615a) {
            z = this.f10617c;
        }
        return z;
    }

    public final boolean r() {
        boolean z;
        synchronized (this.f10615a) {
            z = this.f10617c && !this.f10618d && this.f10620f == null;
        }
        return z;
    }

    public final <TContinuationResult> Task<TContinuationResult> s(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        return t(TaskExecutors.f10568a, successContinuation);
    }

    public final <TContinuationResult> Task<TContinuationResult> t(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        t tVar = new t();
        this.f10616b.b(new n(executor, successContinuation, tVar));
        C();
        return tVar;
    }

    public final void u(Exception exc) {
        Preconditions.l(exc, "Exception must not be null");
        synchronized (this.f10615a) {
            A();
            this.f10617c = true;
            this.f10620f = exc;
        }
        this.f10616b.a(this);
    }

    public final void v(TResult tresult) {
        synchronized (this.f10615a) {
            A();
            this.f10617c = true;
            this.f10619e = tresult;
        }
        this.f10616b.a(this);
    }

    public final boolean w(Exception exc) {
        Preconditions.l(exc, "Exception must not be null");
        synchronized (this.f10615a) {
            if (this.f10617c) {
                return false;
            }
            this.f10617c = true;
            this.f10620f = exc;
            this.f10616b.a(this);
            return true;
        }
    }

    public final boolean x(TResult tresult) {
        synchronized (this.f10615a) {
            if (this.f10617c) {
                return false;
            }
            this.f10617c = true;
            this.f10619e = tresult;
            this.f10616b.a(this);
            return true;
        }
    }

    public final boolean y() {
        synchronized (this.f10615a) {
            if (this.f10617c) {
                return false;
            }
            this.f10617c = true;
            this.f10618d = true;
            this.f10616b.a(this);
            return true;
        }
    }
}
