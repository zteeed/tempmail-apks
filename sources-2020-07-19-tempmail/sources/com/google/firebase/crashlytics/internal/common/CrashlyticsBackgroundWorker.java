package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

class CrashlyticsBackgroundWorker {
    private final ExecutorService executorService;
    /* access modifiers changed from: private */
    public ThreadLocal<Boolean> isExecutorThread = new ThreadLocal<>();
    private Task<Void> tail = Tasks.e(null);
    private final Object tailLock = new Object();

    public CrashlyticsBackgroundWorker(ExecutorService executorService2) {
        this.executorService = executorService2;
        executorService2.submit(new Runnable() {
            public void run() {
                CrashlyticsBackgroundWorker.this.isExecutorThread.set(Boolean.TRUE);
            }
        });
    }

    private <T> Task<Void> ignoreResult(Task<T> task) {
        return task.j(this.executorService, new Continuation<T, Void>() {
            public Void then(Task<T> task) throws Exception {
                return null;
            }
        });
    }

    private boolean isRunningOnThread() {
        return Boolean.TRUE.equals(this.isExecutorThread.get());
    }

    private <T> Continuation<Void, T> newContinuation(final Callable<T> callable) {
        return new Continuation<Void, T>() {
            public T then(Task<Void> task) throws Exception {
                return callable.call();
            }
        };
    }

    public void checkRunningOnThread() {
        if (!isRunningOnThread()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor getExecutor() {
        return this.executorService;
    }

    /* access modifiers changed from: package-private */
    public Task<Void> submit(final Runnable runnable) {
        return submit(new Callable<Void>() {
            public Void call() throws Exception {
                runnable.run();
                return null;
            }
        });
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        Task<TContinuationResult> l;
        synchronized (this.tailLock) {
            l = this.tail.l(this.executorService, newContinuation(callable));
            this.tail = ignoreResult(l);
        }
        return l;
    }

    public <T> Task<T> submit(Callable<T> callable) {
        Task<TContinuationResult> j;
        synchronized (this.tailLock) {
            j = this.tail.j(this.executorService, newContinuation(callable));
            this.tail = ignoreResult(j);
        }
        return j;
    }
}
