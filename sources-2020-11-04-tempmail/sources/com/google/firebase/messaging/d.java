package com.google.firebase.messaging;

import a.e.a;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.c;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.d1;
import com.google.firebase.iid.q;
import com.google.firebase.installations.g;
import com.google.firebase.j.h;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final class d {
    private static final long i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f11949a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11950b;

    /* renamed from: c  reason: collision with root package name */
    private final q f11951c;

    /* renamed from: d  reason: collision with root package name */
    private final d1 f11952d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f11953e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f11954f;
    private boolean g = false;
    private final b0 h;

    private d(FirebaseInstanceId firebaseInstanceId, q qVar, b0 b0Var, d1 d1Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11949a = firebaseInstanceId;
        this.f11951c = qVar;
        this.h = b0Var;
        this.f11952d = d1Var;
        this.f11950b = context;
        this.f11954f = scheduledExecutorService;
    }

    static Task<d> a(c cVar, FirebaseInstanceId firebaseInstanceId, q qVar, h hVar, com.google.firebase.g.c cVar2, g gVar, Context context, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        return Tasks.c(scheduledExecutorService, new c(context, scheduledExecutorService, firebaseInstanceId, qVar, new d1(cVar, qVar, executor, hVar, cVar2, gVar)));
    }

    static final /* synthetic */ d b(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, q qVar, d1 d1Var) throws Exception {
        return new d(firebaseInstanceId, qVar, b0.a(context, scheduledExecutorService), d1Var, context, scheduledExecutorService);
    }

    private static <T> T c(Task<T> task) throws IOException {
        try {
            return Tasks.b(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        }
    }

    private final boolean i(c0 c0Var) throws IOException {
        try {
            String b2 = c0Var.b();
            char c2 = 65535;
            int hashCode = b2.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b2.equals("U")) {
                        c2 = 1;
                    }
                }
            } else if (b2.equals("S")) {
                c2 = 0;
            }
            if (c2 == 0) {
                String a2 = c0Var.a();
                com.google.firebase.iid.a aVar = (com.google.firebase.iid.a) c(this.f11949a.c());
                c(this.f11952d.h(aVar.h(), aVar.a(), a2));
                if (k()) {
                    String a3 = c0Var.a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 31);
                    sb.append("Subscribe to topic: ");
                    sb.append(a3);
                    sb.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb.toString());
                }
            } else if (c2 == 1) {
                String a4 = c0Var.a();
                com.google.firebase.iid.a aVar2 = (com.google.firebase.iid.a) c(this.f11949a.c());
                c(this.f11952d.i(aVar2.h(), aVar2.a(), a4));
                if (k()) {
                    String a5 = c0Var.a();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a5).length() + 35);
                    sb2.append("Unsubscribe from topic: ");
                    sb2.append(a5);
                    sb2.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb2.toString());
                }
            } else if (k()) {
                String valueOf = String.valueOf(c0Var);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb3.append("Unknown topic operation");
                sb3.append(valueOf);
                sb3.append(".");
                Log.d("FirebaseMessaging", sb3.toString());
            }
            return true;
        } catch (IOException e2) {
            if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                String message = e2.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 53);
                sb4.append("Topic operation failed: ");
                sb4.append(message);
                sb4.append(". Will retry Topic operation.");
                Log.e("FirebaseMessaging", sb4.toString());
                return false;
            } else if (e2.getMessage() == null) {
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            } else {
                throw e2;
            }
        }
    }

    private final synchronized boolean j() {
        return this.g;
    }

    private static boolean k() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if ((this.h.b() != null) && !j()) {
            e(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(long j) {
        f(new f(this, this.f11950b, this.f11951c, Math.min(Math.max(30, j << 1), i)), j);
        g(true);
    }

    /* access modifiers changed from: package-private */
    public final void f(Runnable runnable, long j) {
        this.f11954f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void g(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (i(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r5.h.d(r0);
        r1 = r5.f11953e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = r0.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r5.f11953e.containsKey(r0) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r2 = r5.f11953e.get(r0);
        r3 = (com.google.android.gms.tasks.TaskCompletionSource) r2.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r3 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r3.c(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r2.isEmpty() == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r5.f11953e.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        monitor-exit(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() throws java.io.IOException {
        /*
            r5 = this;
        L_0x0000:
            monitor-enter(r5)
            com.google.firebase.messaging.b0 r0 = r5.h     // Catch:{ all -> 0x005c }
            com.google.firebase.messaging.c0 r0 = r0.b()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0019
            boolean r0 = k()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x005c }
        L_0x0016:
            r0 = 1
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            return r0
        L_0x0019:
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            boolean r1 = r5.i(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.b0 r1 = r5.h
            r1.d(r0)
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r5.f11953e
            monitor-enter(r1)
            java.lang.String r0 = r0.d()     // Catch:{ all -> 0x0059 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r2 = r5.f11953e     // Catch:{ all -> 0x0059 }
            boolean r2 = r2.containsKey(r0)     // Catch:{ all -> 0x0059 }
            if (r2 != 0) goto L_0x0038
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            goto L_0x0000
        L_0x0038:
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r2 = r5.f11953e     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0059 }
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r3 = r2.poll()     // Catch:{ all -> 0x0059 }
            com.google.android.gms.tasks.TaskCompletionSource r3 = (com.google.android.gms.tasks.TaskCompletionSource) r3     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x004c
            r4 = 0
            r3.c(r4)     // Catch:{ all -> 0x0059 }
        L_0x004c:
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r2 = r5.f11953e     // Catch:{ all -> 0x0059 }
            r2.remove(r0)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            goto L_0x0000
        L_0x0059:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x005c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d.h():boolean");
    }
}
