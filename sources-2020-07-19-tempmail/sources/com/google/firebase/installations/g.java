package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.c;
import com.google.firebase.installations.p.d;
import com.google.firebase.installations.q.e;
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
public class g implements h {
    private static final Object k = new Object();
    private static final ThreadFactory l = new a();

    /* renamed from: a  reason: collision with root package name */
    private final c f11292a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.installations.q.c f11293b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.installations.p.c f11294c;

    /* renamed from: d  reason: collision with root package name */
    private final o f11295d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.installations.p.b f11296e;

    /* renamed from: f  reason: collision with root package name */
    private final m f11297f;
    private final Object g;
    private final ExecutorService h;
    private final ExecutorService i;
    private final List<n> j;

    /* compiled from: FirebaseInstallations */
    class a implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f11298b = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f11298b.getAndIncrement())}));
        }
    }

    /* compiled from: FirebaseInstallations */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11299a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f11300b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.q.e$b[] r0 = com.google.firebase.installations.q.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11300b = r0
                r1 = 1
                com.google.firebase.installations.q.e$b r2 = com.google.firebase.installations.q.e.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f11300b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.q.e$b r3 = com.google.firebase.installations.q.e.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f11300b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.q.e$b r3 = com.google.firebase.installations.q.e.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.q.d$b[] r2 = com.google.firebase.installations.q.d.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f11299a = r2
                com.google.firebase.installations.q.d$b r3 = com.google.firebase.installations.q.d.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f11299a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.q.d$b r2 = com.google.firebase.installations.q.d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.g.b.<clinit>():void");
        }
    }

    g(c cVar, h hVar, com.google.firebase.g.c cVar2) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), l), cVar, new com.google.firebase.installations.q.c(cVar.g(), hVar, cVar2), new com.google.firebase.installations.p.c(cVar), new o(), new com.google.firebase.installations.p.b(cVar), new m());
    }

    private Task<l> e() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j jVar = new j(this.f11295d, taskCompletionSource);
        synchronized (this.g) {
            this.j.add(jVar);
        }
        return taskCompletionSource.a();
    }

    private Task<String> f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k kVar = new k(taskCompletionSource);
        synchronized (this.g) {
            this.j.add(kVar);
        }
        return taskCompletionSource.a();
    }

    /* access modifiers changed from: private */
    public final void h() {
        l(true);
    }

    /* access modifiers changed from: private */
    public final void i() {
        l(false);
    }

    /* access modifiers changed from: private */
    public final void j() {
        l(false);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.p.d r0 = r2.p()
            boolean r1 = r0.i()     // Catch:{ IOException -> 0x004f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.l()     // Catch:{ IOException -> 0x004f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.o r3 = r2.f11295d     // Catch:{ IOException -> 0x004f }
            boolean r3 = r3.b(r0)     // Catch:{ IOException -> 0x004f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.p.d r3 = r2.m(r0)     // Catch:{ IOException -> 0x004f }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.p.d r3 = r2.v(r0)     // Catch:{ IOException -> 0x004f }
        L_0x0026:
            r2.r(r3)
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x003a
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r1 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r0.<init>(r1)
            r2.w(r3, r0)
            goto L_0x004e
        L_0x003a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x004b
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cleared fid due to auth error"
            r0.<init>(r1)
            r2.w(r3, r0)
            goto L_0x004e
        L_0x004b:
            r2.x(r3)
        L_0x004e:
            return
        L_0x004f:
            r3 = move-exception
            r2.w(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.g.k(boolean):void");
    }

    private final void l(boolean z) {
        d p = p();
        if (z) {
            p = p.p();
        }
        x(p);
        this.i.execute(f.a(this, z));
    }

    private d m(d dVar) throws IOException {
        e e2 = this.f11293b.e(n(), dVar.d(), q(), dVar.f());
        int i2 = b.f11300b[e2.b().ordinal()];
        if (i2 == 1) {
            return dVar.o(e2.c(), e2.d(), this.f11295d.a());
        } else if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            if (i2 == 3) {
                return dVar.r();
            }
            throw new IOException();
        }
    }

    private d p() {
        d c2;
        synchronized (k) {
            b a2 = b.a(this.f11292a.g(), "generatefid.lock");
            try {
                c2 = this.f11294c.c();
                if (c2.j()) {
                    String u = u(c2);
                    com.google.firebase.installations.p.c cVar = this.f11294c;
                    c2 = c2.t(u);
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

    private void r(d dVar) {
        synchronized (k) {
            b a2 = b.a(this.f11292a.g(), "generatefid.lock");
            try {
                this.f11294c.a(dVar);
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

    private void t() {
        Preconditions.g(o());
        Preconditions.g(q());
        Preconditions.g(n());
        Preconditions.b(o.d(o()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.b(o.c(n()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String u(d dVar) {
        if ((!this.f11292a.i().equals("CHIME_ANDROID_SDK") && !this.f11292a.q()) || !dVar.m()) {
            return this.f11297f.a();
        }
        String f2 = this.f11296e.f();
        return TextUtils.isEmpty(f2) ? this.f11297f.a() : f2;
    }

    private d v(d dVar) throws IOException {
        com.google.firebase.installations.q.d d2 = this.f11293b.d(n(), dVar.d(), q(), o(), dVar.d().length() == 11 ? this.f11296e.i() : null);
        int i2 = b.f11299a[d2.e().ordinal()];
        if (i2 == 1) {
            return dVar.s(d2.c(), d2.d(), this.f11295d.a(), d2.b().c(), d2.b().d());
        } else if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            throw new IOException();
        }
    }

    private void w(d dVar, Exception exc) {
        synchronized (this.g) {
            Iterator<n> it = this.j.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    private void x(d dVar) {
        synchronized (this.g) {
            Iterator<n> it = this.j.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    public Task<l> a(boolean z) {
        t();
        Task<l> e2 = e();
        if (z) {
            this.h.execute(d.a(this));
        } else {
            this.h.execute(e.a(this));
        }
        return e2;
    }

    public Task<String> g() {
        t();
        Task<String> f2 = f();
        this.h.execute(c.a(this));
        return f2;
    }

    /* access modifiers changed from: package-private */
    public String n() {
        return this.f11292a.j().b();
    }

    /* access modifiers changed from: package-private */
    public String o() {
        return this.f11292a.j().c();
    }

    /* access modifiers changed from: package-private */
    public String q() {
        return this.f11292a.j().e();
    }

    g(ExecutorService executorService, c cVar, com.google.firebase.installations.q.c cVar2, com.google.firebase.installations.p.c cVar3, o oVar, com.google.firebase.installations.p.b bVar, m mVar) {
        this.g = new Object();
        this.j = new ArrayList();
        this.f11292a = cVar;
        this.f11293b = cVar2;
        this.f11294c = cVar3;
        this.f11295d = oVar;
        this.f11296e = bVar;
        this.f11297f = mVar;
        this.h = executorService;
        this.i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), l);
    }
}
