package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzanv<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzamv {

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f5823b;

    /* renamed from: c  reason: collision with root package name */
    private final NETWORK_EXTRAS f5824c;

    public zzanv(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f5823b = mediationAdapter;
        this.f5824c = network_extras;
    }

    private final SERVER_PARAMETERS A6(String str) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                zzbba.c("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f5823b.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (MediationServerParameters) serverParametersType.newInstance();
        server_parameters.a(hashMap);
        return server_parameters;
    }

    private static boolean z6(zzve zzve) {
        if (zzve.g) {
            return true;
        }
        zzwg.a();
        return zzbaq.x();
    }

    public final void J3(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final IObjectWrapper K5() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.f5823b;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbba.i(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.b0(((MediationBannerAdapter) mediationAdapter).getBannerView());
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final void L1(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        M3(iObjectWrapper, zzve, str, (String) null, zzamx);
    }

    public final void M3(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.f5823b;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbba.i(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbba.f("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5823b).requestInterstitialAd(new zzanu(zzamx), (Activity) ObjectWrapper.P(iObjectWrapper), A6(str), zzaog.b(zzve, z6(zzve)), this.f5824c);
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final void P2(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx, zzadj zzadj, List<String> list) {
    }

    public final void P3(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.f5823b;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbba.i(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzbba.f("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5823b;
            zzanu zzanu = new zzanu(zzamx);
            Activity activity = (Activity) ObjectWrapper.P(iObjectWrapper);
            MediationServerParameters A6 = A6(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.f2423b, AdSize.f2424c, AdSize.f2425d, AdSize.f2426e, AdSize.f2427f, AdSize.g};
            while (true) {
                if (i < 6) {
                    if (adSizeArr[i].b() == zzvh.f9193f && adSizeArr[i].a() == zzvh.f9190c) {
                        adSize = adSizeArr[i];
                        break;
                    }
                    i++;
                } else {
                    adSize = new AdSize(zzb.zza(zzvh.f9193f, zzvh.f9190c, zzvh.f9189b));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzanu, activity, A6, adSize, zzaog.b(zzve, z6(zzve)), this.f5824c);
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final void R2(IObjectWrapper iObjectWrapper, zzatx zzatx, List<String> list) {
    }

    public final void S4(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzatx zzatx, String str2) throws RemoteException {
    }

    public final zzanf U3() {
        return null;
    }

    public final void U5(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
    }

    public final void W5(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final zzana X4() {
        return null;
    }

    public final zzapl Y() {
        return null;
    }

    public final void Z4(zzve zzve, String str) {
    }

    public final zzapl a0() {
        return null;
    }

    public final void destroy() throws RemoteException {
        try {
            this.f5823b.destroy();
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final zzang g6() {
        return null;
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final zzyi getVideoController() {
        return null;
    }

    public final boolean isInitialized() {
        return true;
    }

    public final Bundle j2() {
        return new Bundle();
    }

    public final void m1(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        P3(iObjectWrapper, zzvh, zzve, str, (String) null, zzamx);
    }

    public final void p4(zzve zzve, String str, String str2) {
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean r1() {
        return false;
    }

    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    public final void s5(IObjectWrapper iObjectWrapper, zzaie zzaie, List<zzaim> list) throws RemoteException {
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void showInterstitial() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.f5823b;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbba.i(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbba.f("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5823b).showInterstitial();
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final void showVideo() {
    }

    public final zzaep u0() {
        return null;
    }

    public final void w6(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
    }

    public final Bundle zztm() {
        return new Bundle();
    }
}
