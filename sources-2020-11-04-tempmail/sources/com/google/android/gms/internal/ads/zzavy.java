package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzavy {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<ThreadPoolExecutor> f6183a = new AtomicReference<>((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final Object f6184b = new Object();
    @GuardedBy("gmpAppIdLock")

    /* renamed from: c  reason: collision with root package name */
    private String f6185c = null;
    @GuardedBy("gmpAppIdLock")

    /* renamed from: d  reason: collision with root package name */
    private String f6186d = null;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f6187e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f6188f = new AtomicInteger(-1);
    private final AtomicReference<Object> g = new AtomicReference<>((Object) null);
    private final AtomicReference<Object> h = new AtomicReference<>((Object) null);
    private final ConcurrentMap<String, Method> i = new ConcurrentHashMap(9);
    private final AtomicReference<zzbhy> j = new AtomicReference<>((Object) null);
    @GuardedBy("proxyReference")
    private final BlockingQueue<FutureTask<?>> k = new ArrayBlockingQueue(20);
    private final Object l = new Object();

    private static Bundle A(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e2) {
            String valueOf = String.valueOf(str);
            zzbba.c(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e2);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Method C(Context context, String str) {
        Method method = (Method) this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            i(e2, str, false);
            return null;
        }
    }

    private final Method D(Context context, String str) {
        Method method = (Method) this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            i(e2, str, false);
            return null;
        }
    }

    private final Method E(Context context, String str) {
        Class<String> cls = String.class;
        Method method = (Method) this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, cls, cls});
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            i(e2, str, false);
            return null;
        }
    }

    private final ThreadPoolExecutor F() {
        if (this.f6183a.get() == null) {
            this.f6183a.compareAndSet((Object) null, new ThreadPoolExecutor(((Integer) zzwg.e().c(zzaav.X)).intValue(), ((Integer) zzwg.e().c(zzaav.X)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new t4(this)));
        }
        return this.f6183a.get();
    }

    private final Object a(String str, Context context) {
        if (!k(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            return null;
        }
        try {
            return D(context, str).invoke(this.g.get(), new Object[0]);
        } catch (Exception e2) {
            i(e2, str, true);
            return null;
        }
    }

    private final <T> T b(String str, T t, s4<T> s4Var) {
        synchronized (this.j) {
            if (this.j.get() != null) {
                try {
                    T a2 = s4Var.a(this.j.get());
                    return a2;
                } catch (Exception e2) {
                    i(e2, str, false);
                    return t;
                }
            }
        }
    }

    private final void e(Context context, String str, String str2) {
        if (k(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            Method C = C(context, str2);
            try {
                C.invoke(this.g.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzaxv.m(sb.toString());
            } catch (Exception e2) {
                i(e2, str2, false);
            }
        }
    }

    private final void f(Context context, String str, String str2, Bundle bundle) {
        if (l(context)) {
            Bundle A = A(str2, str);
            if (bundle != null) {
                A.putAll(bundle);
            }
            if (m(context)) {
                j("logEventInternal", new f4(str, A));
            } else if (k(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
                Method s = s(context);
                try {
                    s.invoke(this.g.get(), new Object[]{"am", str, A});
                } catch (Exception e2) {
                    i(e2, "logEventInternal", true);
                }
            }
        }
    }

    private final void i(Exception exc, String str, boolean z) {
        if (!this.f6187e.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            zzbba.i(sb.toString());
            if (z) {
                zzbba.i("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f6187e.set(true);
            }
        }
    }

    private final void j(String str, u4 u4Var) {
        synchronized (this.j) {
            FutureTask futureTask = new FutureTask(new j4(this, u4Var, str), (Object) null);
            if (this.j.get() != null) {
                futureTask.run();
            } else {
                this.k.offer(futureTask);
            }
        }
    }

    private final boolean k(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception e2) {
                i(e2, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    private static boolean m(Context context) {
        if (!((Boolean) zzwg.e().c(zzaav.Y)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzwg.e().c(zzaav.Z)).intValue()) {
            return false;
        }
        if (((Boolean) zzwg.e().c(zzaav.a0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Method s(Context context) {
        Class<String> cls = String.class;
        Method method = (Method) this.i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{cls, cls, Bundle.class});
            this.i.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            i(e2, "logEventInternal", true);
            return null;
        }
    }

    public final void B(Context context, String str) {
        f(context, "_aa", str, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String G() throws Exception {
        return (String) b("getAppInstanceId", (Object) null, i4.f4198a);
    }

    public final void c(Context context, zzve zzve) {
        if (((Boolean) zzwg.e().c(zzaav.e0)).booleanValue() && l(context) && m(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void d(Context context, zzzu zzzu) {
        if (((Boolean) zzwg.e().c(zzaav.e0)).booleanValue() && l(context) && m(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void g(Context context, String str, String str2, String str3, int i2) {
        if (l(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i2);
            f(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i2);
            zzaxv.m(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(u4 u4Var, String str) {
        if (this.j.get() != null) {
            try {
                u4Var.a(this.j.get());
            } catch (Exception e2) {
                i(e2, str, false);
            }
        }
    }

    public final boolean l(Context context) {
        if (((Boolean) zzwg.e().c(zzaav.R)).booleanValue() && !this.f6187e.get()) {
            if (((Boolean) zzwg.e().c(zzaav.b0)).booleanValue()) {
                return true;
            }
            if (this.f6188f.get() == -1) {
                zzwg.a();
                if (!zzbaq.t(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    zzwg.a();
                    if (zzbaq.n(context)) {
                        zzbba.i("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f6188f.set(0);
                    }
                }
                this.f6188f.set(1);
            }
            if (this.f6188f.get() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String n(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.l(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = m(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.s4 r7 = com.google.android.gms.internal.ads.k4.f4360a
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.b(r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.g
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.k(r7, r4, r1, r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.D(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.D(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r6.g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r7 = move-exception
            r6.i(r7, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavy.n(android.content.Context):java.lang.String");
    }

    public final String o(Context context) {
        if (!l(context)) {
            return null;
        }
        synchronized (this.f6184b) {
            if (this.f6185c != null) {
                String str = this.f6185c;
                return str;
            }
            if (m(context)) {
                this.f6185c = (String) b("getGmpAppId", this.f6185c, m4.f4527a);
            } else {
                this.f6185c = (String) a("getGmpAppId", context);
            }
            String str2 = this.f6185c;
            return str2;
        }
    }

    public final String p(Context context) {
        if (!l(context)) {
            return null;
        }
        long longValue = ((Long) zzwg.e().c(zzaav.W)).longValue();
        if (m(context)) {
            if (longValue >= 0) {
                return (String) F().submit(new o4(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) b("getAppInstanceId", (Object) null, p4.f4787a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) a("getAppInstanceId", context);
        } else {
            try {
                return (String) F().submit(new r4(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    public final String q(Context context) {
        if (!l(context)) {
            return null;
        }
        if (m(context)) {
            Long l2 = (Long) b("getAdEventId", (Object) null, q4.f4866a);
            if (l2 != null) {
                return Long.toString(l2.longValue());
            }
            return null;
        }
        Object a2 = a("generateEventId", context);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }

    public final String r(Context context) {
        if (!l(context)) {
            return null;
        }
        synchronized (this.f6184b) {
            if (this.f6186d != null) {
                String str = this.f6186d;
                return str;
            }
            if (m(context)) {
                this.f6186d = (String) b("getAppIdOrigin", this.f6186d, h4.f4117a);
            } else {
                this.f6186d = "fa";
            }
            String str2 = this.f6186d;
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String t(Context context) throws Exception {
        return (String) a("getAppInstanceId", context);
    }

    public final void u(Context context, String str) {
        if (l(context)) {
            if (m(context)) {
                j("beginAdUnitExposure", new e4(str));
            } else {
                e(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void v(Context context, String str) {
        if (l(context)) {
            if (m(context)) {
                j("endAdUnitExposure", new l4(str));
            } else {
                e(context, str, "endAdUnitExposure");
            }
        }
    }

    public final void w(Context context, String str) {
        if (!l(context) || !(context instanceof Activity)) {
            return;
        }
        if (m(context)) {
            j("setScreenName", new n4(context, str));
        } else if (k(context, "com.google.firebase.analytics.FirebaseAnalytics", this.h, false)) {
            Method E = E(context, "setCurrentScreen");
            try {
                E.invoke(this.h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception e2) {
                i(e2, "setCurrentScreen", false);
            }
        }
    }

    public final void x(Context context, String str) {
        f(context, "_ac", str, (Bundle) null);
    }

    public final void y(Context context, String str) {
        f(context, "_ai", str, (Bundle) null);
    }

    public final void z(Context context, String str) {
        f(context, "_aq", str, (Bundle) null);
    }
}
