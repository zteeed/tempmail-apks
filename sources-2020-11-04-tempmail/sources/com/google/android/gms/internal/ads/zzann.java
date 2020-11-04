package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzann extends zzamv {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f5986b;

    /* renamed from: c  reason: collision with root package name */
    private zzano f5987c;

    /* renamed from: d  reason: collision with root package name */
    private zzatx f5988d;

    /* renamed from: e  reason: collision with root package name */
    private IObjectWrapper f5989e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public MediationRewardedAd f5990f;

    public zzann(MediationAdapter mediationAdapter) {
        this.f5986b = mediationAdapter;
    }

    private final Bundle e7(String str, zzve zzve, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbba.f(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f5986b instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzve != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzve.h);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f7(zzamx zzamx) {
        return new t2(this, zzamx);
    }

    private static String i7(String str, zzve zzve) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzve.v;
        }
    }

    private static boolean j7(zzve zzve) {
        if (zzve.g) {
            return true;
        }
        zzwg.a();
        return zzbaq.x();
    }

    private final Bundle k7(zzve zzve) {
        Bundle bundle;
        Bundle bundle2 = zzve.n;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f5986b.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    public final zzaep A0() {
        NativeCustomTemplateAd d2 = this.f5987c.d();
        if (d2 instanceof zzaeq) {
            return ((zzaeq) d2).a();
        }
        return null;
    }

    public final zzang I6() {
        UnifiedNativeAdMapper c2 = this.f5987c.c();
        if (c2 != null) {
            return new zzaoi(c2);
        }
        return null;
    }

    public final void J4(zzve zzve, String str, String str2) throws RemoteException {
        Date date;
        zzve zzve2 = zzve;
        String str3 = str;
        Object obj = this.f5986b;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbba.f("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f5986b;
                Bundle bundle = null;
                HashSet hashSet = zzve2.f9370f != null ? new HashSet(zzve2.f9370f) : null;
                if (zzve2.f9367c == -1) {
                    date = null;
                } else {
                    date = new Date(zzve2.f9367c);
                }
                zzank zzank = new zzank(date, zzve2.f9369e, hashSet, zzve2.l, j7(zzve), zzve2.h, zzve2.s, zzve2.u, i7(str3, zzve2));
                if (zzve2.n != null) {
                    bundle = zzve2.n.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(zzank, e7(str3, zzve2, str2), bundle);
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            u6(this.f5989e, zzve2, str3, new zzanr((Adapter) obj, this.f5988d));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final void O5(IObjectWrapper iObjectWrapper, zzaie zzaie, List<zzaim> list) throws RemoteException {
        AdFormat adFormat;
        if (this.f5986b instanceof Adapter) {
            s2 s2Var = new s2(this, zzaie);
            ArrayList arrayList = new ArrayList();
            for (zzaim next : list) {
                String str = next.f5909b;
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c2 = 1;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    adFormat = AdFormat.BANNER;
                } else if (c2 == 1) {
                    adFormat = AdFormat.INTERSTITIAL;
                } else if (c2 == 2) {
                    adFormat = AdFormat.REWARDED;
                } else if (c2 == 3) {
                    adFormat = AdFormat.NATIVE;
                } else {
                    throw new RemoteException();
                }
                arrayList.add(new MediationConfiguration(adFormat, next.f5910c));
            }
            ((Adapter) this.f5986b).initialize((Context) ObjectWrapper.V(iObjectWrapper), s2Var, arrayList);
            return;
        }
        throw new RemoteException();
    }

    public final void U1(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        a4(iObjectWrapper, zzve, str, (String) null, zzamx);
    }

    public final void X3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.V(iObjectWrapper);
        Object obj = this.f5986b;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    public final void a4(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        Date date;
        zzve zzve2 = zzve;
        String str3 = str;
        if (this.f5986b instanceof MediationInterstitialAdapter) {
            zzbba.f("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f5986b;
                Bundle bundle = null;
                HashSet hashSet = zzve2.f9370f != null ? new HashSet(zzve2.f9370f) : null;
                if (zzve2.f9367c == -1) {
                    date = null;
                } else {
                    date = new Date(zzve2.f9367c);
                }
                zzank zzank = new zzank(date, zzve2.f9369e, hashSet, zzve2.l, j7(zzve), zzve2.h, zzve2.s, zzve2.u, i7(str3, zzve2));
                if (zzve2.n != null) {
                    bundle = zzve2.n.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.V(iObjectWrapper), new zzano(zzamx), e7(str3, zzve2, str2), zzank, bundle);
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final void a7(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        zzve zzve2 = zzve;
        String str2 = str;
        if (this.f5986b instanceof Adapter) {
            zzbba.f("Requesting rewarded interstitial ad from adapter.");
            try {
                MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f7 = f7(zzamx);
                Bundle e7 = e7(str2, zzve2, (String) null);
                Bundle k7 = k7(zzve2);
                boolean j7 = j7(zzve);
                Location location = zzve2.l;
                int i = zzve2.h;
                int i2 = zzve2.u;
                String i7 = i7(str2, zzve2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.V(iObjectWrapper), "", e7, k7, j7, location, i, i2, i7, "");
                ((Adapter) this.f5986b).loadRewardedInterstitialAd(mediationRewardedAdConfiguration, f7);
            } catch (Exception e2) {
                zzbba.c("", e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final void b3(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx, zzadj zzadj, List<String> list) throws RemoteException {
        Date date;
        zzve zzve2 = zzve;
        String str3 = str;
        Object obj = this.f5986b;
        if (obj instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                Bundle bundle = null;
                HashSet hashSet = zzve2.f9370f != null ? new HashSet(zzve2.f9370f) : null;
                if (zzve2.f9367c == -1) {
                    date = null;
                } else {
                    date = new Date(zzve2.f9367c);
                }
                zzans zzans = new zzans(date, zzve2.f9369e, hashSet, zzve2.l, j7(zzve), zzve2.h, zzadj, list, zzve2.s, zzve2.u, i7(str3, zzve2));
                if (zzve2.n != null) {
                    bundle = zzve2.n.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.f5987c = new zzano(zzamx);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.V(iObjectWrapper), this.f5987c, e7(str3, zzve2, str2), zzans, bundle);
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final void d3(IObjectWrapper iObjectWrapper, zzatx zzatx, List<String> list) throws RemoteException {
        if (this.f5986b instanceof InitializableMediationRewardedVideoAdAdapter) {
            zzbba.f("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f5986b;
                ArrayList arrayList = new ArrayList();
                for (String e7 : list) {
                    arrayList.add(e7(e7, (zzve) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.V(iObjectWrapper), new zzauc(zzatx), arrayList);
            } catch (Throwable th) {
                zzbba.d("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final void destroy() throws RemoteException {
        Object obj = this.f5986b;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        }
    }

    public final zzapl e0() {
        Object obj = this.f5986b;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzapl.u(((Adapter) obj).getSDKVersionInfo());
    }

    public final zzapl g0() {
        Object obj = this.f5986b;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzapl.u(((Adapter) obj).getVersionInfo());
    }

    public final void g4(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        Date date;
        AdSize zza;
        zzvh zzvh2 = zzvh;
        zzve zzve2 = zzve;
        String str3 = str;
        if (this.f5986b instanceof MediationBannerAdapter) {
            zzbba.f("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5986b;
                Bundle bundle = null;
                HashSet hashSet = zzve2.f9370f != null ? new HashSet(zzve2.f9370f) : null;
                if (zzve2.f9367c == -1) {
                    date = null;
                } else {
                    date = new Date(zzve2.f9367c);
                }
                zzank zzank = new zzank(date, zzve2.f9369e, hashSet, zzve2.l, j7(zzve), zzve2.h, zzve2.s, zzve2.u, i7(str3, zzve2));
                if (zzve2.n != null) {
                    bundle = zzve2.n.getBundle(mediationBannerAdapter.getClass().getName());
                }
                Bundle bundle2 = bundle;
                if (zzvh2.o) {
                    zza = zzb.zza(zzvh2.f9376f, zzvh2.f9373c);
                } else {
                    zza = zzb.zza(zzvh2.f9376f, zzvh2.f9373c, zzvh2.f9372b);
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.V(iObjectWrapper), new zzano(zzamx), e7(str3, zzve2, str2), zza, zzank, bundle2);
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.f5986b;
        if (obj instanceof zzbic) {
            return ((zzbic) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbic.class.getCanonicalName();
        String canonicalName2 = this.f5986b.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbba.i(sb.toString());
        return new Bundle();
    }

    public final zzyi getVideoController() {
        Object obj = this.f5986b;
        if (!(obj instanceof zza)) {
            return null;
        }
        try {
            return ((zza) obj).getVideoController();
        } catch (Throwable th) {
            zzbba.c("", th);
            return null;
        }
    }

    public final IObjectWrapper i6() throws RemoteException {
        Object obj = this.f5986b;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.h0(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() throws RemoteException {
        Object obj = this.f5986b;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbba.f("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f5986b).isInitialized();
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return this.f5988d != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final zzanf m4() {
        NativeAdMapper b2 = this.f5987c.b();
        if (b2 instanceof NativeContentAdMapper) {
            return new zzant((NativeContentAdMapper) b2);
        }
        return null;
    }

    public final void m5(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzatx zzatx, String str2) throws RemoteException {
        Bundle bundle;
        zzank zzank;
        Date date;
        zzve zzve2 = zzve;
        zzatx zzatx2 = zzatx;
        String str3 = str2;
        Object obj = this.f5986b;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbba.f("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f5986b;
                Bundle e7 = e7(str3, zzve2, (String) null);
                if (zzve2 != null) {
                    HashSet hashSet = zzve2.f9370f != null ? new HashSet(zzve2.f9370f) : null;
                    if (zzve2.f9367c == -1) {
                        date = null;
                    } else {
                        date = new Date(zzve2.f9367c);
                    }
                    zzank zzank2 = new zzank(date, zzve2.f9369e, hashSet, zzve2.l, j7(zzve), zzve2.h, zzve2.s, zzve2.u, i7(str3, zzve2));
                    bundle = zzve2.n != null ? zzve2.n.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    zzank = zzank2;
                } else {
                    zzank = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.V(iObjectWrapper), zzank, str, new zzauc(zzatx2), e7, bundle);
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            this.f5989e = iObjectWrapper;
            this.f5988d = zzatx2;
            zzatx2.v3(ObjectWrapper.h0(obj));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final void pause() throws RemoteException {
        Object obj = this.f5986b;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        }
    }

    public final void resume() throws RemoteException {
        Object obj = this.f5986b;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        }
    }

    public final void s1(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        g4(iObjectWrapper, zzvh, zzve, str, (String) null, zzamx);
    }

    public final zzana s5() {
        NativeAdMapper b2 = this.f5987c.b();
        if (b2 instanceof NativeAppInstallAdMapper) {
            return new zzanq((NativeAppInstallAdMapper) b2);
        }
        return null;
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Object obj = this.f5986b;
        if (!(obj instanceof OnImmersiveModeUpdatedListener)) {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.f(sb.toString());
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzbba.c("", th);
        }
    }

    public final void showInterstitial() throws RemoteException {
        if (this.f5986b instanceof MediationInterstitialAdapter) {
            zzbba.f("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f5986b).showInterstitial();
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final void showVideo() throws RemoteException {
        Object obj = this.f5986b;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbba.f("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f5986b).showVideo();
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f5990f;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.V(this.f5989e));
            } else {
                zzbba.g("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final Bundle t2() {
        return new Bundle();
    }

    public final void u5(zzve zzve, String str) throws RemoteException {
        J4(zzve, str, (String) null);
    }

    public final void u6(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        zzve zzve2 = zzve;
        String str2 = str;
        if (this.f5986b instanceof Adapter) {
            zzbba.f("Requesting rewarded ad from adapter.");
            try {
                MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f7 = f7(zzamx);
                Bundle e7 = e7(str2, zzve2, (String) null);
                Bundle k7 = k7(zzve2);
                boolean j7 = j7(zzve);
                Location location = zzve2.l;
                int i = zzve2.h;
                int i2 = zzve2.u;
                String i7 = i7(str2, zzve2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.V(iObjectWrapper), "", e7, k7, j7, location, i, i2, i7, "");
                ((Adapter) this.f5986b).loadRewardedAd(mediationRewardedAdConfiguration, f7);
            } catch (Exception e2) {
                zzbba.c("", e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final void w6(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f5986b instanceof Adapter) {
            zzbba.f("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.f5990f;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.V(iObjectWrapper));
            } else {
                zzbba.g("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbba.i(sb.toString());
            throw new RemoteException();
        }
    }

    public final boolean z1() {
        return this.f5986b instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final Bundle zztm() {
        Object obj = this.f5986b;
        if (obj instanceof zzbid) {
            return ((zzbid) obj).zztm();
        }
        String canonicalName = zzbid.class.getCanonicalName();
        String canonicalName2 = this.f5986b.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbba.i(sb.toString());
        return new Bundle();
    }

    public zzann(Adapter adapter) {
        this.f5986b = adapter;
    }
}
