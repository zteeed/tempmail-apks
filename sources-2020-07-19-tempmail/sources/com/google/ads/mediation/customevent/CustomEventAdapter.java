package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbba;

@KeepName
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {

    /* renamed from: a  reason: collision with root package name */
    private View f2439a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private CustomEventBanner f2440b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    private CustomEventInterstitial f2441c;

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class zza implements CustomEventBannerListener {
        public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    class zzb implements CustomEventInterstitialListener {
        public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        }
    }

    private static <T> T a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzbba.i(sb.toString());
            return null;
        }
    }

    public final void destroy() {
        CustomEventBanner customEventBanner = this.f2440b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2441c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.f2439a;
    }

    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventBanner customEventBanner = (CustomEventBanner) a(customEventServerParameters.f2443b);
        this.f2440b = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.a(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(customEventServerParameters.f2442a);
        }
        Activity activity2 = activity;
        this.f2440b.requestBannerAd(new zza(this, mediationBannerListener), activity2, customEventServerParameters.f2442a, customEventServerParameters.f2444c, adSize, mediationAdRequest, obj);
    }

    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(customEventServerParameters.f2443b);
        this.f2441c = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.b(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(customEventServerParameters.f2442a);
        }
        Activity activity2 = activity;
        this.f2441c.requestInterstitialAd(new zzb(this, this, mediationInterstitialListener), activity2, customEventServerParameters.f2442a, customEventServerParameters.f2444c, mediationAdRequest, obj);
    }

    public final void showInterstitial() {
        this.f2441c.showInterstitial();
    }
}
