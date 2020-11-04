package com.google.android.gms.iid;

import a.e.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Deprecated
public class InstanceID {

    /* renamed from: c  reason: collision with root package name */
    private static final zzaj<Boolean> f3441c = zzai.b().a("gcm_check_for_different_iid_in_token", true);

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, InstanceID> f3442d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final long f3443e = TimeUnit.DAYS.toMillis(7);

    /* renamed from: f  reason: collision with root package name */
    private static zzak f3444f;
    private static zzaf g;
    private static String h;

    /* renamed from: a  reason: collision with root package name */
    private Context f3445a;

    /* renamed from: b  reason: collision with root package name */
    private String f3446b = "";

    @ShowFirstParty
    private InstanceID(Context context, String str) {
        this.f3445a = context.getApplicationContext();
        this.f3446b = str;
    }

    @Deprecated
    public static InstanceID b(Context context) {
        return c(context, (Bundle) null);
    }

    @KeepForSdk
    public static synchronized InstanceID c(Context context, Bundle bundle) {
        InstanceID instanceID;
        synchronized (InstanceID.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            Context applicationContext = context.getApplicationContext();
            if (f3444f == null) {
                String packageName = applicationContext.getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 73);
                sb.append("Instance ID SDK is deprecated, ");
                sb.append(packageName);
                sb.append(" should update to use Firebase Instance ID");
                Log.w("InstanceID", sb.toString());
                f3444f = new zzak(applicationContext);
                g = new zzaf(applicationContext);
            }
            h = Integer.toString(h(applicationContext));
            instanceID = f3442d.get(string);
            if (instanceID == null) {
                instanceID = new InstanceID(applicationContext, string);
                f3442d.put(string, instanceID);
            }
        }
        return instanceID;
    }

    private final KeyPair d() {
        return f3444f.j(this.f3446b).a();
    }

    static String f(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Never happens: can't find own package ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return 0;
        }
    }

    static String i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Never happens: can't find own package ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return null;
        }
    }

    public static zzak k() {
        return f3444f;
    }

    @Deprecated
    public String a() {
        return f(d());
    }

    @Deprecated
    public String e(String str, String str2, Bundle bundle) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String str3 = null;
            String a2 = f3444f.a("appVersion");
            boolean z = true;
            if (a2 != null && a2.equals(h)) {
                long g2 = f3444f.g(this.f3446b, str, str2);
                if (g2 >= 0 && System.currentTimeMillis() - g2 < f3443e) {
                    z = false;
                }
            }
            if (!z) {
                str3 = f3444f.f(this.f3446b, str, str2);
            }
            if (str3 != null) {
                return str3;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            String g3 = g(str, str2, bundle);
            if (!f3441c.get().booleanValue() || !g3.contains(":") || g3.startsWith(String.valueOf(a()).concat(":"))) {
                if (g3 != null) {
                    f3444f.d(this.f3446b, str, str2, g3, h);
                }
                return g3;
            }
            InstanceIDListenerService.d(this.f3445a, f3444f);
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("MAIN_THREAD");
    }

    public final String g(String str, String str2, Bundle bundle) throws IOException {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.f3446b) ? str : this.f3446b;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        String i = zzaf.i(g.a(bundle, d()));
        if (!"RST".equals(i) && !i.startsWith("RST|")) {
            return i;
        }
        InstanceIDListenerService.d(this.f3445a, f3444f);
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        f3444f.k(this.f3446b);
    }
}
