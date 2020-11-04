package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzuu;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzyi;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, com.google.android.gms.ads.mediation.zza, MediationRewardedVideoAdAdapter, zzbic {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzmi;
    private InterstitialAd zzmj;
    private AdLoader zzmk;
    private Context zzml;
    /* access modifiers changed from: private */
    public InterstitialAd zzmm;
    /* access modifiers changed from: private */
    public MediationRewardedVideoAdListener zzmn;
    @VisibleForTesting
    private final RewardedVideoAdListener zzmo = new zzb(this);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static class zza extends NativeContentAdMapper {

        /* renamed from: a  reason: collision with root package name */
        private final NativeContentAd f2617a;

        public zza(NativeContentAd nativeContentAd) {
            this.f2617a = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f2617a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbnp.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.f2617a);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static class zzb extends NativeAppInstallAdMapper {

        /* renamed from: a  reason: collision with root package name */
        private final NativeAppInstallAd f2618a;

        public zzb(NativeAppInstallAd nativeAppInstallAd) {
            this.f2618a = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f2618a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbnp.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.f2618a);
            }
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class zzc extends AdListener implements AppEventListener, zzuu {
        @VisibleForTesting

        /* renamed from: b  reason: collision with root package name */
        private final AbstractAdViewAdapter f2619b;
        @VisibleForTesting

        /* renamed from: c  reason: collision with root package name */
        private final MediationBannerListener f2620c;

        public zzc(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.f2619b = abstractAdViewAdapter;
            this.f2620c = mediationBannerListener;
        }

        public final void onAdClicked() {
            this.f2620c.onAdClicked(this.f2619b);
        }

        public final void onAdClosed() {
            this.f2620c.onAdClosed(this.f2619b);
        }

        public final void onAdFailedToLoad(int i) {
            this.f2620c.onAdFailedToLoad(this.f2619b, i);
        }

        public final void onAdLeftApplication() {
            this.f2620c.onAdLeftApplication(this.f2619b);
        }

        public final void onAdLoaded() {
            this.f2620c.onAdLoaded(this.f2619b);
        }

        public final void onAdOpened() {
            this.f2620c.onAdOpened(this.f2619b);
        }

        public final void onAppEvent(String str, String str2) {
            this.f2620c.zza(this.f2619b, str, str2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static class zzd extends UnifiedNativeAdMapper {

        /* renamed from: a  reason: collision with root package name */
        private final UnifiedNativeAd f2621a;

        public zzd(UnifiedNativeAd unifiedNativeAd) {
            this.f2621a = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzn(unifiedNativeAd.zzjw());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.f2621a);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbnp.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f2621a);
            }
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class zze extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {
        @VisibleForTesting

        /* renamed from: b  reason: collision with root package name */
        private final AbstractAdViewAdapter f2622b;
        @VisibleForTesting

        /* renamed from: c  reason: collision with root package name */
        private final MediationNativeListener f2623c;

        public zze(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.f2622b = abstractAdViewAdapter;
            this.f2623c = mediationNativeListener;
        }

        public final void onAdClicked() {
            this.f2623c.onAdClicked(this.f2622b);
        }

        public final void onAdClosed() {
            this.f2623c.onAdClosed(this.f2622b);
        }

        public final void onAdFailedToLoad(int i) {
            this.f2623c.onAdFailedToLoad(this.f2622b, i);
        }

        public final void onAdImpression() {
            this.f2623c.onAdImpression(this.f2622b);
        }

        public final void onAdLeftApplication() {
            this.f2623c.onAdLeftApplication(this.f2622b);
        }

        public final void onAdLoaded() {
        }

        public final void onAdOpened() {
            this.f2623c.onAdOpened(this.f2622b);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.f2623c.onAdLoaded((MediationNativeAdapter) this.f2622b, (NativeAdMapper) new zzb(nativeAppInstallAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.f2623c.onAdLoaded((MediationNativeAdapter) this.f2622b, (NativeAdMapper) new zza(nativeContentAd));
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.f2623c.zza(this.f2622b, nativeCustomTemplateAd, str);
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.f2623c.zza(this.f2622b, nativeCustomTemplateAd);
        }

        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.f2623c.onAdLoaded((MediationNativeAdapter) this.f2622b, (UnifiedNativeAdMapper) new zzd(unifiedNativeAd));
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class zzf extends AdListener implements zzuu {
        @VisibleForTesting

        /* renamed from: b  reason: collision with root package name */
        private final AbstractAdViewAdapter f2624b;
        @VisibleForTesting

        /* renamed from: c  reason: collision with root package name */
        private final MediationInterstitialListener f2625c;

        public zzf(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f2624b = abstractAdViewAdapter;
            this.f2625c = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            this.f2625c.onAdClicked(this.f2624b);
        }

        public final void onAdClosed() {
            this.f2625c.onAdClosed(this.f2624b);
        }

        public final void onAdFailedToLoad(int i) {
            this.f2625c.onAdFailedToLoad(this.f2624b, i);
        }

        public final void onAdLeftApplication() {
            this.f2625c.onAdLeftApplication(this.f2624b);
        }

        public final void onAdLoaded() {
            this.f2625c.onAdLoaded(this.f2624b);
        }

        public final void onAdOpened() {
            this.f2625c.onAdOpened(this.f2624b);
        }
    }

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzwg.a();
            builder.addTestDevice(zzbaq.l(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            builder.tagForChildDirectedTreatment(z);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzmi;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzdt(1).zzacx();
    }

    public zzyi getVideoController() {
        VideoController videoController;
        AdView adView = this.zzmi;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.zzdu();
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzml = context.getApplicationContext();
        this.zzmn = mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
    }

    public boolean isInitialized() {
        return this.zzmn != null;
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Context context = this.zzml;
        if (context == null || this.zzmn == null) {
            zzbba.g("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzmm = interstitialAd;
        interstitialAd.zzd(true);
        this.zzmm.setAdUnitId(getAdUnitId(bundle));
        this.zzmm.setRewardedVideoAdListener(this.zzmo);
        this.zzmm.setAdMetadataListener(new zza(this));
        this.zzmm.loadAd(zza(this.zzml, mediationAdRequest, bundle2, bundle));
    }

    public void onDestroy() {
        AdView adView = this.zzmi;
        if (adView != null) {
            adView.destroy();
            this.zzmi = null;
        }
        if (this.zzmj != null) {
            this.zzmj = null;
        }
        if (this.zzmk != null) {
            this.zzmk = null;
        }
        if (this.zzmm != null) {
            this.zzmm = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzmj;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        InterstitialAd interstitialAd2 = this.zzmm;
        if (interstitialAd2 != null) {
            interstitialAd2.setImmersiveMode(z);
        }
    }

    public void onPause() {
        AdView adView = this.zzmi;
        if (adView != null) {
            adView.pause();
        }
    }

    public void onResume() {
        AdView adView = this.zzmi;
        if (adView != null) {
            adView.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzmi = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzmi.setAdUnitId(getAdUnitId(bundle));
        this.zzmi.setAdListener(new zzc(this, mediationBannerListener));
        this.zzmi.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzmj = interstitialAd;
        interstitialAd.setAdUnitId(getAdUnitId(bundle));
        this.zzmj.setAdListener(new zzf(this, mediationInterstitialListener));
        this.zzmj.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        zze zze2 = new zze(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(zze2);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(zze2);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(zze2);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(zze2);
        }
        if (nativeMediationAdRequest.zzua()) {
            for (String next : nativeMediationAdRequest.zzub().keySet()) {
                withAdListener.forCustomTemplateAd(next, zze2, nativeMediationAdRequest.zzub().get(next).booleanValue() ? zze2 : null);
            }
        }
        AdLoader build = withAdListener.build();
        this.zzmk = build;
        build.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzmj.show();
    }

    public void showVideo() {
        this.zzmm.show();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
