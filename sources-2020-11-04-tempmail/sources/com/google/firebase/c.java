package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.f;
import com.google.firebase.components.h;
import com.google.firebase.components.l;
import com.google.firebase.components.q;
import com.google.firebase.j.g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class c {
    /* access modifiers changed from: private */
    public static final Object i = new Object();
    private static final Executor j = new d();
    @GuardedBy("LOCK")
    static final Map<String, c> k = new a.e.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f11577a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11578b;

    /* renamed from: c  reason: collision with root package name */
    private final d f11579c;

    /* renamed from: d  reason: collision with root package name */
    private final l f11580d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f11581e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f11582f = new AtomicBoolean();
    private final q<com.google.firebase.i.a> g;
    private final List<b> h = new CopyOnWriteArrayList();

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    public interface b {
        @KeepForSdk
        void a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.c$c  reason: collision with other inner class name */
    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    private static class C0101c implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<C0101c> f11583a = new AtomicReference<>();

        private C0101c() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (PlatformVersion.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f11583a.get() == null) {
                    C0101c cVar = new C0101c();
                    if (f11583a.compareAndSet((Object) null, cVar)) {
                        BackgroundDetector.c(application);
                        BackgroundDetector.b().a(cVar);
                    }
                }
            }
        }

        public void a(boolean z) {
            synchronized (c.i) {
                Iterator it = new ArrayList(c.k.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.f11581e.get()) {
                        cVar.t(z);
                    }
                }
            }
        }
    }

    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    private static class d implements Executor {

        /* renamed from: b  reason: collision with root package name */
        private static final Handler f11584b = new Handler(Looper.getMainLooper());

        private d() {
        }

        public void execute(Runnable runnable) {
            f11584b.post(runnable);
        }
    }

    @TargetApi(24)
    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    private static class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<e> f11585b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f11586a;

        public e(Context context) {
            this.f11586a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (f11585b.get() == null) {
                e eVar = new e(context);
                if (f11585b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f11586a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (c.i) {
                for (c b2 : c.k.values()) {
                    b2.l();
                }
            }
            c();
        }
    }

    protected c(Context context, String str, d dVar) {
        new CopyOnWriteArrayList();
        Preconditions.k(context);
        this.f11577a = context;
        Preconditions.g(str);
        this.f11578b = str;
        Preconditions.k(dVar);
        this.f11579c = dVar;
        List<h> a2 = f.b(context, ComponentDiscoveryService.class).a();
        String a3 = com.google.firebase.j.e.a();
        Executor executor = j;
        com.google.firebase.components.d[] dVarArr = new com.google.firebase.components.d[8];
        dVarArr[0] = com.google.firebase.components.d.n(context, Context.class, new Class[0]);
        dVarArr[1] = com.google.firebase.components.d.n(this, c.class, new Class[0]);
        dVarArr[2] = com.google.firebase.components.d.n(dVar, d.class, new Class[0]);
        dVarArr[3] = g.a("fire-android", "");
        dVarArr[4] = g.a("fire-core", "19.3.0");
        dVarArr[5] = a3 != null ? g.a("kotlin", a3) : null;
        dVarArr[6] = com.google.firebase.j.c.b();
        dVarArr[7] = com.google.firebase.g.b.b();
        this.f11580d = new l(executor, a2, dVarArr);
        this.g = new q<>(b.a(this, context));
    }

    private void e() {
        Preconditions.o(!this.f11582f.get(), "FirebaseApp was deleted");
    }

    public static c h() {
        c cVar;
        synchronized (i) {
            cVar = k.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    public void l() {
        if (!androidx.core.os.c.a(this.f11577a)) {
            e.b(this.f11577a);
        } else {
            this.f11580d.e(q());
        }
    }

    public static c m(Context context) {
        synchronized (i) {
            if (k.containsKey("[DEFAULT]")) {
                c h2 = h();
                return h2;
            }
            d a2 = d.a(context);
            if (a2 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            c n = n(context, a2);
            return n;
        }
    }

    public static c n(Context context, d dVar) {
        return o(context, dVar, "[DEFAULT]");
    }

    public static c o(Context context, d dVar, String str) {
        c cVar;
        C0101c.c(context);
        String s = s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (i) {
            boolean z = !k.containsKey(s);
            Preconditions.o(z, "FirebaseApp name " + s + " already exists!");
            Preconditions.l(context, "Application context cannot be null.");
            cVar = new c(context, s, dVar);
            k.put(s, cVar);
        }
        cVar.l();
        return cVar;
    }

    static /* synthetic */ com.google.firebase.i.a r(c cVar, Context context) {
        return new com.google.firebase.i.a(context, cVar.k(), (com.google.firebase.f.c) cVar.f11580d.a(com.google.firebase.f.c.class));
    }

    private static String s(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void t(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b a2 : this.h) {
            a2.a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f11578b.equals(((c) obj).i());
    }

    @KeepForSdk
    public <T> T f(Class<T> cls) {
        e();
        return this.f11580d.a(cls);
    }

    public Context g() {
        e();
        return this.f11577a;
    }

    public int hashCode() {
        return this.f11578b.hashCode();
    }

    public String i() {
        e();
        return this.f11578b;
    }

    public d j() {
        e();
        return this.f11579c;
    }

    @KeepForSdk
    public String k() {
        return Base64Utils.c(i().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.c(j().c().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    public boolean p() {
        e();
        return this.g.get().b();
    }

    @KeepForSdk
    public boolean q() {
        return "[DEFAULT]".equals(i());
    }

    public String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("name", this.f11578b);
        c2.a("options", this.f11579c);
        return c2.toString();
    }
}
