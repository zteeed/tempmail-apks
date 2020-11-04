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
    private final Object f295a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f296b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f297c;

    /* renamed from: d  reason: collision with root package name */
    private int f298d;

    /* renamed from: e  reason: collision with root package name */
    private Handler.Callback f299e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final int f300f;
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
        final /* synthetic */ Callable f302b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Handler f303c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f304d;

        /* compiled from: SelfDestructiveThread */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f305b;

            a(Object obj) {
                this.f305b = obj;
            }

            public void run() {
                b.this.f304d.a(this.f305b);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f302b = callable;
            this.f303c = handler;
            this.f304d = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f302b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f303c.post(new a(obj));
        }
    }

    /* renamed from: a.h.h.c$c  reason: collision with other inner class name */
    /* compiled from: SelfDestructiveThread */
    class C0008c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicReference f307b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callable f308c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReentrantLock f309d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f310e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Condition f311f;

        C0008c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f307b = atomicReference;
            this.f308c = callable;
            this.f309d = reentrantLock;
            this.f310e = atomicBoolean;
            this.f311f = condition;
        }

        public void run() {
            try {
                this.f307b.set(this.f308c.call());
            } catch (Exception unused) {
            }
            this.f309d.lock();
            try {
                this.f310e.set(false);
                this.f311f.signal();
            } finally {
                this.f309d.unlock();
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
        this.f300f = i2;
        this.f298d = 0;
    }

    private void c(Runnable runnable) {
        synchronized (this.f295a) {
            if (this.f296b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f296b = handlerThread;
                handlerThread.start();
                this.f297c = new Handler(this.f296b.getLooper(), this.f299e);
                this.f298d++;
            }
            this.f297c.removeMessages(0);
            this.f297c.sendMessage(this.f297c.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.f295a) {
            if (!this.f297c.hasMessages(1)) {
                this.f296b.quit();
                this.f296b = null;
                this.f297c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Runnable runnable) {
        runnable.run();
        synchronized (this.f295a) {
            this.f297c.removeMessages(0);
            this.f297c.sendMessageDelayed(this.f297c.obtainMessage(0), (long) this.f300f);
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
