package a.h.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SelfDestructiveThread */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f294a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f295b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f296c;

    /* renamed from: d  reason: collision with root package name */
    private int f297d;

    /* renamed from: e  reason: collision with root package name */
    private Handler.Callback f298e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final int f299f;
    private final int g;
    private final String h;

    /* compiled from: SelfDestructiveThread */
    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                c.this.b((Runnable) message.obj);
                return true;
            }
        }
    }

    /* compiled from: SelfDestructiveThread */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f301b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Handler f302c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f303d;

        /* compiled from: SelfDestructiveThread */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f304b;

            a(Object obj) {
                this.f304b = obj;
            }

            public void run() {
                b.this.f303d.a(this.f304b);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f301b = callable;
            this.f302c = handler;
            this.f303d = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f301b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f302c.post(new a(obj));
        }
    }

    /* renamed from: a.h.h.c$c  reason: collision with other inner class name */
    /* compiled from: SelfDestructiveThread */
    class C0008c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicReference f306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callable f307c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReentrantLock f308d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f309e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Condition f310f;

        C0008c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f306b = atomicReference;
            this.f307c = callable;
            this.f308d = reentrantLock;
            this.f309e = atomicBoolean;
            this.f310f = condition;
        }

        public void run() {
            try {
                this.f306b.set(this.f307c.call());
            } catch (Exception unused) {
            }
            this.f308d.lock();
            try {
                this.f309e.set(false);
                this.f310f.signal();
            } finally {
                this.f308d.unlock();
            }
        }
    }

    /* compiled from: SelfDestructiveThread */
    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f299f = i2;
        this.f297d = 0;
    }

    private void c(Runnable runnable) {
        synchronized (this.f294a) {
            if (this.f295b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f295b = handlerThread;
                handlerThread.start();
                this.f296c = new Handler(this.f295b.getLooper(), this.f298e);
                this.f297d++;
            }
            this.f296c.removeMessages(0);
            this.f296c.sendMessage(this.f296c.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.f294a) {
            if (!this.f296c.hasMessages(1)) {
                this.f295b.quit();
                this.f295b = null;
                this.f296c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Runnable runnable) {
        runnable.run();
        synchronized (this.f294a) {
            this.f296c.removeMessages(0);
            this.f296c.sendMessageDelayed(this.f296c.obtainMessage(0), (long) this.f299f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(this, callable, new Handler(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T e(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            a.h.h.c$c r11 = new a.h.h.c$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.c(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.h.c.e(java.util.concurrent.Callable, int):java.lang.Object");
    }
}
