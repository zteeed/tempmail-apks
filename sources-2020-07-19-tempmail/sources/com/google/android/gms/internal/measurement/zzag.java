package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzha;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
public class zzag {
    private static volatile zzag j = null;
    /* access modifiers changed from: private */
    public static Boolean k = null;
    @VisibleForTesting
    private static String l = "allow_remote_dynamite";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f9547a;

    /* renamed from: b  reason: collision with root package name */
    protected final Clock f9548b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f9549c;

    /* renamed from: d  reason: collision with root package name */
    private final AppMeasurementSdk f9550d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<Pair<zzha, c>> f9551e;

    /* renamed from: f  reason: collision with root package name */
    private int f9552f;
    /* access modifiers changed from: private */
    public boolean g;
    private String h;
    /* access modifiers changed from: private */
    public zzv i;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
    abstract class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final long f9553b;

        /* renamed from: c  reason: collision with root package name */
        final long f9554c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f9555d;

        a(zzag zzag) {
            this(true);
        }

        /* access modifiers changed from: package-private */
        public abstract void a() throws RemoteException;

        /* access modifiers changed from: protected */
        public void b() {
        }

        public void run() {
            if (zzag.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                zzag.this.p(e2, false, this.f9555d);
                b();
            }
        }

        a(boolean z) {
            this.f9553b = zzag.this.f9548b.a();
            this.f9554c = zzag.this.f9548b.b();
            this.f9555d = z;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzag.this.l(new w(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            zzag.this.l(new b0(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            zzag.this.l(new x(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            zzag.this.l(new y(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzt zzt = new zzt();
            zzag.this.l(new z(this, activity, zzt));
            Bundle P = zzt.P(50);
            if (P != null) {
                bundle.putAll(P);
            }
        }

        public final void onActivityStarted(Activity activity) {
            zzag.this.l(new v(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            zzag.this.l(new a0(this, activity));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
    static class c extends zzaa {

        /* renamed from: b  reason: collision with root package name */
        private final zzha f9558b;

        c(zzha zzha) {
            this.f9558b = zzha;
        }

        public final int a() {
            return System.identityHashCode(this.f9558b);
        }

        public final void a4(String str, String str2, Bundle bundle, long j) {
            this.f9558b.a(str, str2, bundle, j);
        }
    }

    private zzag(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !I(str2, str3)) {
            this.f9547a = "FA";
        } else {
            this.f9547a = str;
        }
        this.f9548b = DefaultClock.d();
        this.f9549c = zzi.a().a(new f(this), zzr.f9822a);
        this.f9550d = new AppMeasurementSdk(this);
        boolean z = false;
        if (!(!O(context) || W())) {
            this.h = null;
            this.g = true;
            Log.w(this.f9547a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!I(str2, str3)) {
            this.h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.f9547a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f9547a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.h = str2;
        }
        l(new b(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f9547a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    /* access modifiers changed from: private */
    public static boolean I(String str, String str2) {
        return (str2 == null || str == null || W()) ? false : true;
    }

    private static boolean O(Context context) {
        try {
            if (new StringResourceValueReader(context).a("google_app_id") != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    public static int P(Context context) {
        return DynamiteModule.c(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    public static int R(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    public static void T(Context context) {
        synchronized (zzag.class) {
            try {
                if (k == null) {
                    if (v(context, "app_measurement_internal_disable_startup_flags")) {
                        k = Boolean.FALSE;
                        return;
                    }
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                    k = Boolean.valueOf(sharedPreferences.getBoolean(l, false));
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove(l);
                    edit.apply();
                }
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                k = Boolean.FALSE;
            }
        }
    }

    private static boolean W() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static zzag b(Context context) {
        return c(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static zzag c(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.k(context);
        if (j == null) {
            synchronized (zzag.class) {
                if (j == null) {
                    j = new zzag(context, str, str2, str3, bundle);
                }
            }
        }
        return j;
    }

    /* access modifiers changed from: private */
    public final void l(a aVar) {
        this.f9549c.execute(aVar);
    }

    /* access modifiers changed from: private */
    public final void p(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (z) {
            Log.w(this.f9547a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            i(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f9547a, "Error with data collection. Data lost.", exc);
    }

    private final void s(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        l(new u(this, l2, str, str2, bundle, z, z2));
    }

    private final void u(String str, String str2, Object obj, boolean z) {
        l(new t(this, str, str2, obj, z));
    }

    private static boolean v(Context context, String str) {
        Preconditions.g(str);
        try {
            ApplicationInfo c2 = Wrappers.a(context).c(context.getPackageName(), 128);
            if (c2 != null) {
                if (c2.metaData != null) {
                    return c2.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void B(String str) {
        l(new g(this, str));
    }

    public final void C(String str, String str2, Bundle bundle) {
        l(new d(this, str, str2, bundle));
    }

    public final void D(boolean z) {
        l(new r(this, z));
    }

    public final String G() {
        zzt zzt = new zzt();
        l(new h(this, zzt));
        return zzt.E(500);
    }

    public final void H(String str) {
        l(new i(this, str));
    }

    public final int K(String str) {
        zzt zzt = new zzt();
        l(new p(this, str, zzt));
        Integer num = (Integer) zzt.y(zzt.P(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String L() {
        zzt zzt = new zzt();
        l(new k(this, zzt));
        return zzt.E(50);
    }

    public final long N() {
        zzt zzt = new zzt();
        l(new j(this, zzt));
        Long l2 = (Long) zzt.y(zzt.P(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f9548b.a()).nextLong();
        int i2 = this.f9552f + 1;
        this.f9552f = i2;
        return nextLong + ((long) i2);
    }

    public final String Q() {
        zzt zzt = new zzt();
        l(new m(this, zzt));
        return zzt.E(500);
    }

    public final String S() {
        zzt zzt = new zzt();
        l(new l(this, zzt));
        return zzt.E(500);
    }

    public final String U() {
        return this.h;
    }

    public final Bundle a(Bundle bundle, boolean z) {
        zzt zzt = new zzt();
        l(new q(this, bundle, zzt));
        if (z) {
            return zzt.P(5000);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final zzv d(Context context, boolean z) {
        DynamiteModule.VersionPolicy versionPolicy;
        if (z) {
            try {
                versionPolicy = DynamiteModule.l;
            } catch (DynamiteModule.LoadingException e2) {
                p(e2, true, false);
                return null;
            }
        } else {
            versionPolicy = DynamiteModule.j;
        }
        return zzu.asInterface(DynamiteModule.e(context, versionPolicy, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    public final AppMeasurementSdk f() {
        return this.f9550d;
    }

    public final Map<String, Object> h(String str, String str2, boolean z) {
        zzt zzt = new zzt();
        l(new o(this, str, str2, z, zzt));
        Bundle P = zzt.P(5000);
        if (P == null || P.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(P.size());
        for (String str3 : P.keySet()) {
            Object obj = P.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void i(int i2, String str, Object obj, Object obj2, Object obj3) {
        l(new n(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    public final void j(Activity activity, String str, String str2) {
        l(new e(this, activity, str, str2));
    }

    public final void k(Bundle bundle) {
        l(new a(this, bundle));
    }

    public final void o(zzha zzha) {
        Preconditions.k(zzha);
        l(new s(this, zzha));
    }

    public final void q(String str, Bundle bundle) {
        s((String) null, str, bundle, false, true, (Long) null);
    }

    public final void r(String str, String str2, Bundle bundle) {
        s(str, str2, bundle, true, true, (Long) null);
    }

    public final void t(String str, String str2, Object obj) {
        u(str, str2, obj, true);
    }

    public final List<Bundle> z(String str, String str2) {
        zzt zzt = new zzt();
        l(new c(this, str, str2, zzt));
        List<Bundle> list = (List) zzt.y(zzt.P(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }
}
