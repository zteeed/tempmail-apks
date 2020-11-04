package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.c;
import com.google.firebase.f.b;
import com.google.firebase.f.d;
import com.google.firebase.installations.h;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
public class FirebaseInstanceId {
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static b0 j;
    private static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");
    @GuardedBy("FirebaseInstanceId.class")
    @VisibleForTesting
    private static ScheduledExecutorService l;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11140a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f11141b;

    /* renamed from: c  reason: collision with root package name */
    private final q f11142c;

    /* renamed from: d  reason: collision with root package name */
    private final d1 f11143d;

    /* renamed from: e  reason: collision with root package name */
    private final v f11144e;

    /* renamed from: f  reason: collision with root package name */
    private final h f11145f;
    @GuardedBy("this")
    private boolean g;
    private final a h;

    /* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
    private class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11146a;

        /* renamed from: b  reason: collision with root package name */
        private final d f11147b;
        @GuardedBy("this")

        /* renamed from: c  reason: collision with root package name */
        private boolean f11148c;
        @GuardedBy("this")

        /* renamed from: d  reason: collision with root package name */
        private b<com.google.firebase.a> f11149d;
        @GuardedBy("this")

        /* renamed from: e  reason: collision with root package name */
        private Boolean f11150e;

        a(d dVar) {
            this.f11147b = dVar;
        }

        private final synchronized void b() {
            if (!this.f11148c) {
                this.f11146a = d();
                Boolean c2 = c();
                this.f11150e = c2;
                if (c2 == null && this.f11146a) {
                    a1 a1Var = new a1(this);
                    this.f11149d = a1Var;
                    this.f11147b.a(com.google.firebase.a.class, a1Var);
                }
                this.f11148c = true;
            }
        }

        private final Boolean c() {
            ApplicationInfo applicationInfo;
            Context g = FirebaseInstanceId.this.f11141b.g();
            SharedPreferences sharedPreferences = g.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = g.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(g.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean d() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context g = FirebaseInstanceId.this.f11141b.g();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(g.getPackageName());
                ResolveInfo resolveService = g.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean a() {
            b();
            if (this.f11150e == null) {
                return this.f11146a && FirebaseInstanceId.this.f11141b.p();
            }
            return this.f11150e.booleanValue();
        }
    }

    FirebaseInstanceId(c cVar, d dVar, com.google.firebase.j.h hVar, com.google.firebase.g.c cVar2, h hVar2) {
        this(cVar, new q(cVar.g()), s0.b(), s0.b(), dVar, hVar, cVar2, hVar2);
    }

    /* access modifiers changed from: private */
    public final void C() {
        if (r(s())) {
            D();
        }
    }

    private final synchronized void D() {
        if (!this.g) {
            m(0);
        }
    }

    private final String E() {
        try {
            j.e(this.f11141b.k());
            Task<String> g2 = this.f11145f.g();
            Preconditions.l(g2, "Task must not be null");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            g2.d(x0.f11259b, new w0(countDownLatch));
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
            if (g2.r()) {
                return g2.n();
            }
            if (g2.p()) {
                throw new CancellationException("Task is already canceled");
            } else if (g2.q()) {
                throw new IllegalStateException(g2.m());
            } else {
                throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
            }
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private final String F() {
        if ("[DEFAULT]".equals(this.f11141b.i())) {
            return "";
        }
        return this.f11141b.k();
    }

    public static FirebaseInstanceId b() {
        return getInstance(c.h());
    }

    private final Task<a> e(String str, String str2) {
        return Tasks.e(null).l(this.f11140a, new u0(this, str, l(str2)));
    }

    @Keep
    public static FirebaseInstanceId getInstance(c cVar) {
        n(cVar);
        return (FirebaseInstanceId) cVar.f(FirebaseInstanceId.class);
    }

    private final <T> T k(Task<T> task) throws IOException {
        try {
            return Tasks.b(task, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    x();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private static String l(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    private static void n(c cVar) {
        Preconditions.h(cVar.j().e(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.h(cVar.j().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.h(cVar.j().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.b(cVar.j().c().contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.b(k.matcher(cVar.j().b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    static void o(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (l == null) {
                l = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            l.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    @VisibleForTesting
    private final a0 t(String str, String str2) {
        return j.a(F(), str, str2);
    }

    static boolean w() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    @VisibleForTesting
    public final boolean A() {
        return this.h.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void B() {
        if (this.h.a()) {
            C();
        }
    }

    public String a() {
        n(this.f11141b);
        C();
        return E();
    }

    public Task<a> c() {
        n(this.f11141b);
        return e(q.b(this.f11141b), "*");
    }

    public String d(String str, String str2) throws IOException {
        n(this.f11141b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((a) k(e(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task f(String str, String str2, Task task) throws Exception {
        String E = E();
        a0 t = t(str, str2);
        if (!r(t)) {
            return Tasks.e(new d(E, t.f11155a));
        }
        return this.f11144e.b(str, str2, new z0(this, E, str, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task g(String str, String str2, String str3) {
        return this.f11143d.b(str, str2, str3).t(this.f11140a, new y0(this, str2, str3, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task h(String str, String str2, String str3, String str4) throws Exception {
        j.d(F(), str, str2, str4, this.f11142c.e());
        return Tasks.e(new d(str3, str4));
    }

    /* access modifiers changed from: package-private */
    public final c i() {
        return this.f11141b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void m(long j2) {
        o(new e0(this, Math.min(Math.max(30, j2 << 1), i)), j2);
        this.g = true;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void q(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: package-private */
    public final boolean r(a0 a0Var) {
        return a0Var == null || a0Var.c(this.f11142c.e());
    }

    /* access modifiers changed from: package-private */
    public final a0 s() {
        return t(q.b(this.f11141b), "*");
    }

    /* access modifiers changed from: package-private */
    public final String v() throws IOException {
        return d(q.b(this.f11141b), "*");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void x() {
        j.c();
        if (this.h.a()) {
            D();
        }
    }

    @VisibleForTesting
    public final boolean y() {
        return this.f11142c.c();
    }

    /* access modifiers changed from: package-private */
    public final void z() {
        j.h(F());
        D();
    }

    private FirebaseInstanceId(c cVar, q qVar, Executor executor, Executor executor2, d dVar, com.google.firebase.j.h hVar, com.google.firebase.g.c cVar2, h hVar2) {
        Executor executor3 = executor2;
        this.g = false;
        if (q.b(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (j == null) {
                    j = new b0(cVar.g());
                }
            }
            this.f11141b = cVar;
            this.f11142c = qVar;
            this.f11143d = new d1(cVar, qVar, executor, hVar, cVar2, hVar2);
            this.f11140a = executor3;
            this.h = new a(dVar);
            Executor executor4 = executor;
            this.f11144e = new v(executor);
            this.f11145f = hVar2;
            executor3.execute(new v0(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }
}
