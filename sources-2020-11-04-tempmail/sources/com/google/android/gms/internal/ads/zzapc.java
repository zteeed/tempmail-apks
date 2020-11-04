package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzapc extends zzaow {

    /* renamed from: b  reason: collision with root package name */
    private final RtbAdapter f6009b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public MediationInterstitialAd f6010c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public MediationRewardedAd f6011d;

    /* renamed from: e  reason: collision with root package name */
    private String f6012e = "";

    public zzapc(RtbAdapter rtbAdapter) {
        this.f6009b = rtbAdapter;
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f7(zzaos zzaos, zzamx zzamx) {
        return new c3(this, zzaos, zzamx);
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
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f6009b.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    private static Bundle l7(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbba.i(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e2) {
            zzbba.c("", e2);
            throw new RemoteException();
        }
    }

    public final void A4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaom zzaom, zzamx zzamx) throws RemoteException {
        zzve zzve2 = zzve;
        try {
            this.f6009b.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.V(iObjectWrapper), str, l7(str2), k7(zzve2), j7(zzve), zzve2.l, zzve2.h, zzve2.u, i7(str2, zzve), this.f6012e), new x2(this, zzaom, zzamx));
        } catch (Throwable th) {
            zzbba.c("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final boolean C6(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.f6011d;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.V(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbba.c("", th);
            return true;
        }
    }

    public final void E6(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaor zzaor, zzamx zzamx) throws RemoteException {
        zzve zzve2 = zzve;
        try {
            this.f6009b.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.V(iObjectWrapper), str, l7(str2), k7(zzve2), j7(zzve), zzve2.l, zzve2.h, zzve2.u, i7(str2, zzve), this.f6012e), new a3(this, zzaor, zzamx));
        } catch (Throwable th) {
            zzbba.c("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final boolean I2(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.f6010c;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.V(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbba.c("", th);
            return true;
        }
    }

    public final void Q1(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvh zzvh, zzaoy zzaoy) throws RemoteException {
        AdFormat adFormat;
        try {
            z2 z2Var = new z2(this, zzaoy);
            RtbAdapter rtbAdapter = this.f6009b;
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
                throw new IllegalArgumentException("Internal Error");
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.V(iObjectWrapper), arrayList, bundle, zzb.zza(zzvh.f9376f, zzvh.f9373c, zzvh.f9372b)), z2Var);
        } catch (Throwable th) {
            zzbba.c("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    public final void V3(String str) {
        this.f6012e = str;
    }

    public final void W4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException {
        zzve zzve2 = zzve;
        try {
            this.f6009b.loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.V(iObjectWrapper), str, l7(str2), k7(zzve2), j7(zzve), zzve2.l, zzve2.h, zzve2.u, i7(str2, zzve), this.f6012e), f7(zzaos, zzamx));
        } catch (Throwable th) {
            zzbba.c("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final void a2(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException {
        zzve zzve2 = zzve;
        try {
            this.f6009b.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.V(iObjectWrapper), str, l7(str2), k7(zzve2), j7(zzve), zzve2.l, zzve2.h, zzve2.u, i7(str2, zzve), this.f6012e), f7(zzaos, zzamx));
        } catch (Throwable th) {
            zzbba.c("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final zzapl e0() throws RemoteException {
        return zzapl.u(this.f6009b.getSDKVersionInfo());
    }

    public final zzapl g0() throws RemoteException {
        return zzapl.u(this.f6009b.getVersionInfo());
    }

    public final zzyi getVideoController() {
        RtbAdapter rtbAdapter = this.f6009b;
        if (!(rtbAdapter instanceof zza)) {
            return null;
        }
        try {
            return ((zza) rtbAdapter).getVideoController();
        } catch (Throwable th) {
            zzbba.c("", th);
            return null;
        }
    }

    public final void j5(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaol zzaol, zzamx zzamx, zzvh zzvh) throws RemoteException {
        zzve zzve2 = zzve;
        zzvh zzvh2 = zzvh;
        try {
            y2 y2Var = new y2(this, zzaol, zzamx);
            RtbAdapter rtbAdapter = this.f6009b;
            Bundle l7 = l7(str2);
            Bundle k7 = k7(zzve2);
            boolean j7 = j7(zzve);
            Location location = zzve2.l;
            int i = zzve2.h;
            int i2 = zzve2.u;
            String i7 = i7(str2, zzve);
            AdSize zza = zzb.zza(zzvh2.f9376f, zzvh2.f9373c, zzvh2.f9372b);
            String str3 = this.f6012e;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.V(iObjectWrapper), str, l7, k7, j7, location, i, i2, i7, zza, str3);
            rtbAdapter.loadBannerAd(mediationBannerAdConfiguration, y2Var);
        } catch (Throwable th) {
            zzbba.c("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    public final void q2(IObjectWrapper iObjectWrapper) {
    }

    public final void v5(String[] strArr, Bundle[] bundleArr) {
    }
}
