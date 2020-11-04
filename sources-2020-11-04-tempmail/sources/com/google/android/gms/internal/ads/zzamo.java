package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzamo extends zzamq {

    /* renamed from: b  reason: collision with root package name */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f5977b;

    static {
        new zzapd();
    }

    private final <NetworkExtrasT extends com.google.ads.mediation.NetworkExtras, ServerParametersT extends MediationServerParameters> zzams f7(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, zzamo.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                MediationAdapter mediationAdapter = (MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new zzanv(mediationAdapter, (com.google.ads.mediation.NetworkExtras) this.f5977b.get(mediationAdapter.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(cls)) {
                return new zzann((com.google.android.gms.ads.mediation.MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzann((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                zzbba.i(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return g7(str);
        }
    }

    private final zzams g7(String str) throws RemoteException {
        try {
            zzbba.f("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzann((com.google.android.gms.ads.mediation.MediationAdapter) new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new zzann((com.google.android.gms.ads.mediation.MediationAdapter) new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzann((com.google.android.gms.ads.mediation.MediationAdapter) new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new zzanv(customEventAdapter, (CustomEventExtras) this.f5977b.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            zzbba.d(sb.toString(), th);
        }
    }

    public final zzams O6(String str) throws RemoteException {
        return f7(str);
    }

    public final zzaox g3(String str) throws RemoteException {
        return zzapd.a(str);
    }

    public final void h7(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f5977b = map;
    }

    public final boolean s4(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzamo.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            zzbba.i(sb.toString());
            return false;
        }
    }
}
