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
    private View f2627a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private CustomEventBanner f2628b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    private CustomEventInterstitial f2629c;

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
        CustomEventBanner customEventBanner = this.f2628b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2629c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.f2627a;
    }

    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventBanner customEventBanner = (CustomEventBanner) a(customEventServerParameters.f2631b);
        this.f2628b = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.a(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(customEventServerParameters.f2630a);
        }
        Activity activity2 = activity;
        this.f2628b.requestBannerAd(new zza(this, mediationBannerListener), activity2, customEventServerParameters.f2630a, customEventServerParameters.f2632c, adSize, mediationAdRequest, obj);
    }

    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(customEventServerParameters.f2631b);
        this.f2629c = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.b(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(customEventServerParameters.f2630a);
        }
        Activity activity2 = activity;
        this.f2629c.requestInterstitialAd(new zzb(this, this, mediationInterstitialListener), activity2, customEventServerParameters.f2630a, customEventServerParameters.f2632c, mediationAdRequest, obj);
    }

    public final void showInterstitial() {
        this.f2629c.showInterstitial();
    }
}
