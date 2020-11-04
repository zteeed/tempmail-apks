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
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f6006b;

    /* renamed from: c  reason: collision with root package name */
    private final NETWORK_EXTRAS f6007c;

    public zzanv(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f6006b = mediationAdapter;
        this.f6007c = network_extras;
    }

    private static boolean e7(zzve zzve) {
        if (zzve.g) {
            return true;
        }
        zzwg.a();
        return zzbaq.x();
    }

    private final SERVER_PARAMETERS f7(String str) throws RemoteException {
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
        Class<SERVER_PARAMETERS> serverParametersType = this.f6006b.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (MediationServerParameters) serverParametersType.newInstance();
        server_parameters.a(hashMap);
        return server_parameters;
    }

    public final zzaep A0() {
        return null;
    }

    public final zzang I6() {
        return null;
    }

    public final void J4(zzve zzve, String str, String str2) {
    }

    public final void O5(IObjectWrapper iObjectWrapper, zzaie zzaie, List<zzaim> list) throws RemoteException {
    }

    public final void U1(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        a4(iObjectWrapper, zzve, str, (String) null, zzamx);
    }

    public final void X3(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void a4(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.f6006b;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbba.i(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbba.f("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f6006b).requestInterstitialAd(new zzanu(zzamx), (Activity) ObjectWrapper.V(iObjectWrapper), f7(str), zzaog.b(zzve, e7(zzve)), this.f6007c);
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final void a7(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
    }

    public final void b3(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx, zzadj zzadj, List<String> list) {
    }

    public final void d3(IObjectWrapper iObjectWrapper, zzatx zzatx, List<String> list) {
    }

    public final void destroy() throws RemoteException {
        try {
            this.f6006b.destroy();
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final zzapl e0() {
        return null;
    }

    public final zzapl g0() {
        return null;
    }

    public final void g4(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.f6006b;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbba.i(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzbba.f("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f6006b;
            zzanu zzanu = new zzanu(zzamx);
            Activity activity = (Activity) ObjectWrapper.V(iObjectWrapper);
            MediationServerParameters f7 = f7(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.f2611b, AdSize.f2612c, AdSize.f2613d, AdSize.f2614e, AdSize.f2615f, AdSize.g};
            while (true) {
                if (i < 6) {
                    if (adSizeArr[i].b() == zzvh.f9376f && adSizeArr[i].a() == zzvh.f9373c) {
                        adSize = adSizeArr[i];
                        break;
                    }
                    i++;
                } else {
                    adSize = new AdSize(zzb.zza(zzvh.f9376f, zzvh.f9373c, zzvh.f9372b));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzanu, activity, f7, adSize, zzaog.b(zzve, e7(zzve)), this.f6007c);
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final zzyi getVideoController() {
        return null;
    }

    public final IObjectWrapper i6() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.f6006b;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbba.i(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.h0(((MediationBannerAdapter) mediationAdapter).getBannerView());
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() {
        return true;
    }

    public final zzanf m4() {
        return null;
    }

    public final void m5(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzatx zzatx, String str2) throws RemoteException {
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    public final void s1(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        g4(iObjectWrapper, zzvh, zzve, str, (String) null, zzamx);
    }

    public final zzana s5() {
        return null;
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void showInterstitial() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.f6006b;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbba.i(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbba.f("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f6006b).showInterstitial();
        } catch (Throwable th) {
            zzbba.c("", th);
            throw new RemoteException();
        }
    }

    public final void showVideo() {
    }

    public final Bundle t2() {
        return new Bundle();
    }

    public final void u5(zzve zzve, String str) {
    }

    public final void u6(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
    }

    public final void w6(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final boolean z1() {
        return false;
    }

    public final Bundle zztm() {
        return new Bundle();
    }
}
