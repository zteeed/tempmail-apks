package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class e {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, e> f12025d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f12026e = d.a();

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f12027a;

    /* renamed from: b  reason: collision with root package name */
    private final n f12028b;

    /* renamed from: c  reason: collision with root package name */
    private Task<f> f12029c = null;

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    private static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f12030a;

        private b() {
            this.f12030a = new CountDownLatch(1);
        }

        public boolean a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f12030a.await(j, timeUnit);
        }

        public void b(Exception exc) {
            this.f12030a.countDown();
        }

        public void c() {
            this.f12030a.countDown();
        }

        public void onSuccess(TResult tresult) {
            this.f12030a.countDown();
        }
    }

    private e(ExecutorService executorService, n nVar) {
        this.f12027a = executorService;
        this.f12028b = nVar;
    }

    private static <TResult> TResult a(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        task.h(f12026e, bVar);
        task.f(f12026e, bVar);
        task.a(f12026e, bVar);
        if (!bVar.a(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.r()) {
            return task.n();
        } else {
            throw new ExecutionException(task.m());
        }
    }

    public static synchronized e f(ExecutorService executorService, n nVar) {
        e eVar;
        synchronized (e.class) {
            String b2 = nVar.b();
            if (!f12025d.containsKey(b2)) {
                f12025d.put(b2, new e(executorService, nVar));
            }
            eVar = f12025d.get(b2);
        }
        return eVar;
    }

    static /* synthetic */ Task h(e eVar, boolean z, f fVar, Void voidR) throws Exception {
        if (z) {
            eVar.k(fVar);
        }
        return Tasks.e(fVar);
    }

    private synchronized void k(f fVar) {
        this.f12029c = Tasks.e(fVar);
    }

    public void b() {
        synchronized (this) {
            this.f12029c = Tasks.e(null);
        }
        this.f12028b.a();
    }

    public synchronized Task<f> c() {
        if (this.f12029c == null || (this.f12029c.q() && !this.f12029c.r())) {
            ExecutorService executorService = this.f12027a;
            n nVar = this.f12028b;
            nVar.getClass();
            this.f12029c = Tasks.c(executorService, c.a(nVar));
        }
        return this.f12029c;
    }

    public f d() {
        return e(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return (com.google.firebase.remoteconfig.internal.f) a(c(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.f e(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.f> r0 = r2.f12029c     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.f> r0 = r2.f12029c     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.r()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.f> r3 = r2.f12029c     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r3.n()     // Catch:{ all -> 0x0033 }
            com.google.firebase.remoteconfig.internal.f r3 = (com.google.firebase.remoteconfig.internal.f) r3     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            return r3
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            com.google.android.gms.tasks.Task r0 = r2.c()     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.lang.Object r3 = a(r0, r3, r1)     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            com.google.firebase.remoteconfig.internal.f r3 = (com.google.firebase.remoteconfig.internal.f) r3     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            return r3
        L_0x0025:
            r3 = move-exception
            goto L_0x002a
        L_0x0027:
            r3 = move-exception
            goto L_0x002a
        L_0x0029:
            r3 = move-exception
        L_0x002a:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.e.e(long):com.google.firebase.remoteconfig.internal.f");
    }

    public Task<f> i(f fVar) {
        return j(fVar, true);
    }

    public Task<f> j(f fVar, boolean z) {
        return Tasks.c(this.f12027a, a.a(this, fVar)).t(this.f12027a, b.a(this, z, fVar));
    }
}
