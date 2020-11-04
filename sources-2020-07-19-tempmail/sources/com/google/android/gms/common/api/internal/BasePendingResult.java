package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
@KeepForSdk
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> p = new m0();

    /* renamed from: a  reason: collision with root package name */
    private final Object f2721a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final CallbackHandler<R> f2722b = new CallbackHandler<>(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<GoogleApiClient> f2723c = new WeakReference<>((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final CountDownLatch f2724d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<PendingResult.StatusListener> f2725e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ResultCallback<? super R> f2726f;
    private final AtomicReference<h0> g = new AtomicReference<>();
    /* access modifiers changed from: private */
    public R h;
    private Status i;
    private volatile boolean j;
    private boolean k;
    private boolean l;
    private ICancelToken m;
    @KeepName
    private a mResultGuardian;
    private volatile zacm<R> n;
    private boolean o = false;

    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends zap {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public final void a(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.a(result);
                } catch (RuntimeException e2) {
                    BasePendingResult.m(result);
                    throw e2;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).n(Status.h);
            }
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }

    private final class a {
        private a() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m(BasePendingResult.this.h);
            super.finalize();
        }

        /* synthetic */ a(BasePendingResult basePendingResult, m0 m0Var) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    private final R e() {
        R r;
        synchronized (this.f2721a) {
            Preconditions.o(!this.j, "Result has already been consumed.");
            Preconditions.o(g(), "Result is not ready.");
            r = this.h;
            this.h = null;
            this.f2726f = null;
            this.j = true;
        }
        h0 andSet = this.g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    private final void k(R r) {
        this.h = r;
        this.m = null;
        this.f2724d.countDown();
        this.i = this.h.q();
        if (this.k) {
            this.f2726f = null;
        } else if (this.f2726f != null) {
            this.f2722b.removeMessages(2);
            this.f2722b.a(this.f2726f, e());
        } else if (this.h instanceof Releasable) {
            this.mResultGuardian = new a(this, (m0) null);
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.f2725e;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            PendingResult.StatusListener statusListener = arrayList.get(i2);
            i2++;
            statusListener.a(this.i);
        }
        this.f2725e.clear();
    }

    public static void m(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2721a
            monitor-enter(r0)
            boolean r1 = r2.k     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.j     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.ICancelToken r1 = r2.m     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.ICancelToken r1 = r2.m     // Catch:{ RemoteException -> 0x0015 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.h     // Catch:{ all -> 0x002a }
            m(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.k = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.i     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Result r1 = r2.d(r1)     // Catch:{ all -> 0x002a }
            r2.k(r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.b():void");
    }

    public final void c(PendingResult.StatusListener statusListener) {
        Preconditions.b(statusListener != null, "Callback cannot be null.");
        synchronized (this.f2721a) {
            if (g()) {
                statusListener.a(this.i);
            } else {
                this.f2725e.add(statusListener);
            }
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract R d(Status status);

    public boolean f() {
        boolean z;
        synchronized (this.f2721a) {
            z = this.k;
        }
        return z;
    }

    @KeepForSdk
    public final boolean g() {
        return this.f2724d.getCount() == 0;
    }

    @KeepForSdk
    public final void h(R r) {
        synchronized (this.f2721a) {
            if (this.l || this.k) {
                m(r);
                return;
            }
            g();
            boolean z = true;
            Preconditions.o(!g(), "Results have already been set");
            if (this.j) {
                z = false;
            }
            Preconditions.o(z, "Result has already been consumed");
            k(r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(com.google.android.gms.common.api.ResultCallback<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2721a
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.f2726f = r6     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x000a:
            boolean r1 = r5.j     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.o(r1, r4)     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.internal.zacm<R> r1 = r5.n     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.o(r2, r1)     // Catch:{ all -> 0x003f }
            boolean r1 = r5.f()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r1 = r5.g()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r1 = r5.f2722b     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.Result r2 = r5.e()     // Catch:{ all -> 0x003f }
            r1.a(r6, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003b:
            r5.f2726f = r6     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.i(com.google.android.gms.common.api.ResultCallback):void");
    }

    public final void l(h0 h0Var) {
        this.g.set(h0Var);
    }

    public final void n(Status status) {
        synchronized (this.f2721a) {
            if (!g()) {
                h(d(status));
                this.l = true;
            }
        }
    }

    public final Integer o() {
        return null;
    }

    public final boolean p() {
        boolean f2;
        synchronized (this.f2721a) {
            if (((GoogleApiClient) this.f2723c.get()) == null || !this.o) {
                b();
            }
            f2 = f();
        }
        return f2;
    }

    public final void q() {
        this.o = this.o || p.get().booleanValue();
    }
}
