package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

public final class Tasks {

    interface b extends OnCanceledListener, OnFailureListener, OnSuccessListener<Object> {
    }

    private static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f10758a = new Object();

        /* renamed from: b  reason: collision with root package name */
        private final int f10759b;

        /* renamed from: c  reason: collision with root package name */
        private final t<Void> f10760c;
        @GuardedBy("mLock")

        /* renamed from: d  reason: collision with root package name */
        private int f10761d;
        @GuardedBy("mLock")

        /* renamed from: e  reason: collision with root package name */
        private int f10762e;
        @GuardedBy("mLock")

        /* renamed from: f  reason: collision with root package name */
        private int f10763f;
        @GuardedBy("mLock")
        private Exception g;
        @GuardedBy("mLock")
        private boolean h;

        public c(int i, t<Void> tVar) {
            this.f10759b = i;
            this.f10760c = tVar;
        }

        @GuardedBy("mLock")
        private final void a() {
            if (this.f10761d + this.f10762e + this.f10763f != this.f10759b) {
                return;
            }
            if (this.g != null) {
                t<Void> tVar = this.f10760c;
                int i = this.f10762e;
                int i2 = this.f10759b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i);
                sb.append(" out of ");
                sb.append(i2);
                sb.append(" underlying tasks failed");
                tVar.u(new ExecutionException(sb.toString(), this.g));
            } else if (this.h) {
                this.f10760c.y();
            } else {
                this.f10760c.v(null);
            }
        }

        public final void b(Exception exc) {
            synchronized (this.f10758a) {
                this.f10762e++;
                this.g = exc;
                a();
            }
        }

        public final void c() {
            synchronized (this.f10758a) {
                this.f10763f++;
                this.h = true;
                a();
            }
        }

        public final void onSuccess(Object obj) {
            synchronized (this.f10758a) {
                this.f10761d++;
                a();
            }
        }
    }

    private Tasks() {
    }

    public static <TResult> TResult a(Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.i();
        Preconditions.l(task, "Task must not be null");
        if (task.q()) {
            return k(task);
        }
        a aVar = new a((u) null);
        j(task, aVar);
        aVar.a();
        return k(task);
    }

    public static <TResult> TResult b(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.i();
        Preconditions.l(task, "Task must not be null");
        Preconditions.l(timeUnit, "TimeUnit must not be null");
        if (task.q()) {
            return k(task);
        }
        a aVar = new a((u) null);
        j(task, aVar);
        if (aVar.d(j, timeUnit)) {
            return k(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> Task<TResult> c(Executor executor, Callable<TResult> callable) {
        Preconditions.l(executor, "Executor must not be null");
        Preconditions.l(callable, "Callback must not be null");
        t tVar = new t();
        executor.execute(new u(tVar, callable));
        return tVar;
    }

    public static <TResult> Task<TResult> d(Exception exc) {
        t tVar = new t();
        tVar.u(exc);
        return tVar;
    }

    public static <TResult> Task<TResult> e(TResult tresult) {
        t tVar = new t();
        tVar.v(tresult);
        return tVar;
    }

    public static Task<Void> f(Collection<? extends Task<?>> collection) {
        if (collection.isEmpty()) {
            return e((Object) null);
        }
        for (Task task : collection) {
            if (task == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        t tVar = new t();
        c cVar = new c(collection.size(), tVar);
        for (Task j : collection) {
            j(j, cVar);
        }
        return tVar;
    }

    public static Task<Void> g(Task<?>... taskArr) {
        if (taskArr.length == 0) {
            return e((Object) null);
        }
        return f(Arrays.asList(taskArr));
    }

    public static Task<List<Task<?>>> h(Collection<? extends Task<?>> collection) {
        return f(collection).k(new v(collection));
    }

    public static Task<List<Task<?>>> i(Task<?>... taskArr) {
        return h(Arrays.asList(taskArr));
    }

    private static void j(Task<?> task, b bVar) {
        task.h(TaskExecutors.f10755b, bVar);
        task.f(TaskExecutors.f10755b, bVar);
        task.a(TaskExecutors.f10755b, bVar);
    }

    private static <TResult> TResult k(Task<TResult> task) throws ExecutionException {
        if (task.r()) {
            return task.n();
        }
        if (task.p()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.m());
    }

    private static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f10757a;

        private a() {
            this.f10757a = new CountDownLatch(1);
        }

        public final void a() throws InterruptedException {
            this.f10757a.await();
        }

        public final void b(Exception exc) {
            this.f10757a.countDown();
        }

        public final void c() {
            this.f10757a.countDown();
        }

        public final boolean d(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f10757a.await(j, timeUnit);
        }

        public final void onSuccess(Object obj) {
            this.f10757a.countDown();
        }

        /* synthetic */ a(u uVar) {
            this();
        }
    }
}
