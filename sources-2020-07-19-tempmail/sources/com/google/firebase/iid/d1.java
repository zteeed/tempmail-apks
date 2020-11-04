package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.c;
import com.google.firebase.g.c;
import com.google.firebase.installations.l;
import com.google.firebase.j.h;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private final c f11176a;

    /* renamed from: b  reason: collision with root package name */
    private final q f11177b;

    /* renamed from: c  reason: collision with root package name */
    private final w f11178c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f11179d;

    /* renamed from: e  reason: collision with root package name */
    private final h f11180e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.g.c f11181f;
    private final com.google.firebase.installations.h g;

    public d1(c cVar, q qVar, Executor executor, h hVar, com.google.firebase.g.c cVar2, com.google.firebase.installations.h hVar2) {
        this(cVar, qVar, executor, new w(cVar.g(), qVar), hVar, cVar2, hVar2);
    }

    private static <T> Task<Void> a(Task<T> task) {
        return task.j(s0.a(), f1.f11197a);
    }

    private final Task<Bundle> c(String str, String str2, String str3, Bundle bundle) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11179d.execute(new c1(this, str, str2, str3, bundle, taskCompletionSource));
        return taskCompletionSource.a();
    }

    private final String d() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.f11176a.i().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private final Bundle f(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f11176a.j().c());
        bundle.putString("gmsv", Integer.toString(this.f11177b.g()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f11177b.e());
        bundle.putString("app_ver_name", this.f11177b.f());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b2 = ((l) Tasks.a(this.g.a(false))).b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e2);
        }
        String b3 = LibraryVersion.a().b("firebase-iid");
        if ("UNKNOWN".equals(b3)) {
            int i = GoogleApiAvailabilityLight.f2668a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            b3 = sb.toString();
        }
        String valueOf = String.valueOf(b3);
        bundle.putString("cliv", valueOf.length() != 0 ? "fiid-".concat(valueOf) : new String("fiid-"));
        c.a a2 = this.f11181f.a("fire-iid");
        if (a2 != c.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a2.f()));
            bundle.putString("Firebase-Client", this.f11180e.a());
        }
        return bundle;
    }

    private final Task<String> g(Task<Bundle> task) {
        return task.j(this.f11179d, new e1(this));
    }

    public final Task<String> b(String str, String str2, String str3) {
        return g(c(str, str2, str3, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(String str, String str2, String str3, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        try {
            f(str, str2, str3, bundle);
            taskCompletionSource.c(this.f11178c.a(bundle));
        } catch (IOException e2) {
            taskCompletionSource.b(e2);
        }
    }

    public final Task<Void> h(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return a(g(c(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    public final Task<Void> i(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return a(g(c(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    private d1(com.google.firebase.c cVar, q qVar, Executor executor, w wVar, h hVar, com.google.firebase.g.c cVar2, com.google.firebase.installations.h hVar2) {
        this.f11176a = cVar;
        this.f11177b = qVar;
        this.f11178c = wVar;
        this.f11179d = executor;
        this.f11180e = hVar;
        this.f11181f = cVar2;
        this.g = hVar2;
    }
}
