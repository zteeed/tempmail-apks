package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.c;
import com.google.firebase.installations.n.d;
import com.google.firebase.installations.o.e;
import com.google.firebase.j.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FirebaseInstallations */
public class f implements g {
    private static final Object l = new Object();
    private static final ThreadFactory m = new a();

    /* renamed from: a  reason: collision with root package name */
    private final c f11842a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.installations.o.c f11843b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.installations.n.c f11844c;

    /* renamed from: d  reason: collision with root package name */
    private final m f11845d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.installations.n.b f11846e;

    /* renamed from: f  reason: collision with root package name */
    private final k f11847f;
    private final Object g;
    private final ExecutorService h;
    private final ExecutorService i;
    private String j;
    private final List<l> k;

    /* compiled from: FirebaseInstallations */
    class a implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f11848b = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f11848b.getAndIncrement())}));
        }
    }

    /* compiled from: FirebaseInstallations */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11849a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f11850b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.o.e$b[] r0 = com.google.firebase.installations.o.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11850b = r0
                r1 = 1
                com.google.firebase.installations.o.e$b r2 = com.google.firebase.installations.o.e.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f11850b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.o.e$b r3 = com.google.firebase.installations.o.e.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f11850b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.o.e$b r3 = com.google.firebase.installations.o.e.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.o.d$b[] r2 = com.google.firebase.installations.o.d.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f11849a = r2
                com.google.firebase.installations.o.d$b r3 = com.google.firebase.installations.o.d.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f11849a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.o.d$b r2 = com.google.firebase.installations.o.d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.f.b.<clinit>():void");
        }
    }

    f(c cVar, h hVar, com.google.firebase.g.c cVar2) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), m), cVar, new com.google.firebase.installations.o.c(cVar.g(), hVar, cVar2), new com.google.firebase.installations.n.c(cVar), new m(), new com.google.firebase.installations.n.b(cVar), new k());
    }

    private Task<j> b() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i iVar = new i(this.f11845d, taskCompletionSource);
        synchronized (this.g) {
            this.k.add(iVar);
        }
        return taskCompletionSource.a();
    }

    /* access modifiers changed from: private */
    public void c(boolean z) {
        d k2 = k();
        if (z) {
            k2 = k2.p();
        }
        u(k2);
        this.i.execute(e.a(this, z));
    }

    private String d() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        d k2 = k();
        this.i.execute(d.a(this));
        return k2.d();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.n.d r0 = r2.j()
            boolean r1 = r0.i()     // Catch:{ IOException -> 0x005b }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.l()     // Catch:{ IOException -> 0x005b }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.m r3 = r2.f11845d     // Catch:{ IOException -> 0x005b }
            boolean r3 = r3.b(r0)     // Catch:{ IOException -> 0x005b }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.n.d r3 = r2.f(r0)     // Catch:{ IOException -> 0x005b }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.n.d r3 = r2.s(r0)     // Catch:{ IOException -> 0x005b }
        L_0x0026:
            r2.m(r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r3.d()
            r2.j = r0
        L_0x0035:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x0046
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r1 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r0.<init>(r1)
            r2.t(r3, r0)
            goto L_0x005a
        L_0x0046:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x0057
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cleared fid due to auth error"
            r0.<init>(r1)
            r2.t(r3, r0)
            goto L_0x005a
        L_0x0057:
            r2.u(r3)
        L_0x005a:
            return
        L_0x005b:
            r3 = move-exception
            r2.t(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.f.e(boolean):void");
    }

    private d f(d dVar) throws IOException {
        e e2 = this.f11843b.e(g(), dVar.d(), l(), dVar.f());
        int i2 = b.f11850b[e2.b().ordinal()];
        if (i2 == 1) {
            return dVar.o(e2.c(), e2.d(), this.f11845d.a());
        } else if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            if (i2 == 3) {
                this.j = null;
                return dVar.r();
            }
            throw new IOException();
        }
    }

    private d j() {
        d c2;
        synchronized (l) {
            b a2 = b.a(this.f11842a.g(), "generatefid.lock");
            try {
                c2 = this.f11844c.c();
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
        return c2;
    }

    private d k() {
        d c2;
        synchronized (l) {
            b a2 = b.a(this.f11842a.g(), "generatefid.lock");
            try {
                c2 = this.f11844c.c();
                if (c2.j()) {
                    String r = r(c2);
                    com.google.firebase.installations.n.c cVar = this.f11844c;
                    c2 = c2.t(r);
                    cVar.a(c2);
                }
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
        return c2;
    }

    private void m(d dVar) {
        synchronized (l) {
            b a2 = b.a(this.f11842a.g(), "generatefid.lock");
            try {
                this.f11844c.a(dVar);
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
    }

    private void q() {
        Preconditions.g(i());
        Preconditions.g(l());
        Preconditions.g(g());
        Preconditions.b(m.d(i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.b(m.c(g()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String r(d dVar) {
        if ((!this.f11842a.i().equals("CHIME_ANDROID_SDK") && !this.f11842a.q()) || !dVar.m()) {
            return this.f11847f.a();
        }
        String f2 = this.f11846e.f();
        return TextUtils.isEmpty(f2) ? this.f11847f.a() : f2;
    }

    private d s(d dVar) throws IOException {
        com.google.firebase.installations.o.d d2 = this.f11843b.d(g(), dVar.d(), l(), i(), dVar.d().length() == 11 ? this.f11846e.i() : null);
        int i2 = b.f11849a[d2.e().ordinal()];
        if (i2 == 1) {
            return dVar.s(d2.c(), d2.d(), this.f11845d.a(), d2.b().c(), d2.b().d());
        } else if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            throw new IOException();
        }
    }

    private void t(d dVar, Exception exc) {
        synchronized (this.g) {
            Iterator<l> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    private void u(d dVar) {
        synchronized (this.g) {
            Iterator<l> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    public Task<j> a(boolean z) {
        q();
        Task<j> b2 = b();
        this.h.execute(c.a(this, z));
        return b2;
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return this.f11842a.j().b();
    }

    public Task<String> h() {
        q();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.e(d());
        return taskCompletionSource.a();
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return this.f11842a.j().c();
    }

    /* access modifiers changed from: package-private */
    public String l() {
        return this.f11842a.j().e();
    }

    f(ExecutorService executorService, c cVar, com.google.firebase.installations.o.c cVar2, com.google.firebase.installations.n.c cVar3, m mVar, com.google.firebase.installations.n.b bVar, k kVar) {
        this.g = new Object();
        this.j = null;
        this.k = new ArrayList();
        this.f11842a = cVar;
        this.f11843b = cVar2;
        this.f11844c = cVar3;
        this.f11845d = mVar;
        this.f11846e = bVar;
        this.f11847f = kVar;
        this.h = executorService;
        this.i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), m);
    }
}
