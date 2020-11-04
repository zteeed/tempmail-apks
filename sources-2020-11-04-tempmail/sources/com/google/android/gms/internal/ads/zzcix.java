package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcix {

    /* renamed from: a  reason: collision with root package name */
    private final zzcis f7292a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<zzamr> f7293b = new AtomicReference<>();

    zzcix(zzcis zzcis) {
        this.f7292a = zzcis;
    }

    private final zzamr b() throws RemoteException {
        zzamr zzamr = this.f7293b.get();
        if (zzamr != null) {
            return zzamr;
        }
        zzbba.i("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    private final zzams f(String str, JSONObject jSONObject) throws RemoteException {
        zzamr b2 = b();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                if (b2.s4(jSONObject.getString("class_name"))) {
                    return b2.O6("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                }
                return b2.O6("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e2) {
                zzbba.c("Invalid custom event.", e2);
            }
        }
        return b2.O6(str);
    }

    public final boolean a() {
        return this.f7293b.get() != null;
    }

    public final void c(zzamr zzamr) {
        this.f7293b.compareAndSet((Object) null, zzamr);
    }

    public final zzdlm d(String str, JSONObject jSONObject) throws zzdlg {
        zzams zzams;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzams = new zzann((MediationAdapter) new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zzams = new zzann((MediationAdapter) new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzams = new zzann((MediationAdapter) new zzapn());
            } else {
                zzams = f(str, jSONObject);
            }
            zzdlm zzdlm = new zzdlm(zzams);
            this.f7292a.b(str, zzdlm);
            return zzdlm;
        } catch (Throwable th) {
            throw new zzdlg(th);
        }
    }

    public final zzaox e(String str) throws RemoteException {
        zzaox g3 = b().g3(str);
        this.f7292a.a(str, g3);
        return g3;
    }
}
