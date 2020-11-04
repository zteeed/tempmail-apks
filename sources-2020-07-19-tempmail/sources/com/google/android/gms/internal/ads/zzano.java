package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzano implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* renamed from: a  reason: collision with root package name */
    private final zzamx f5808a;

    /* renamed from: b  reason: collision with root package name */
    private NativeAdMapper f5809b;

    /* renamed from: c  reason: collision with root package name */
    private UnifiedNativeAdMapper f5810c;

    /* renamed from: d  reason: collision with root package name */
    private NativeCustomTemplateAd f5811d;

    public zzano(zzamx zzamx) {
        this.f5808a = zzamx;
    }

    private static void a(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper, NativeAdMapper nativeAdMapper) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zza(new zzanl());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zza(videoController);
            }
            if (nativeAdMapper != null && nativeAdMapper.hasVideoContent()) {
                nativeAdMapper.zza(videoController);
            }
        }
    }

    public final NativeAdMapper b() {
        return this.f5809b;
    }

    public final UnifiedNativeAdMapper c() {
        return this.f5810c;
    }

    public final NativeCustomTemplateAd d() {
        return this.f5811d;
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClicked.");
        try {
            this.f5808a.onAdClicked();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClosed.");
        try {
            this.f5808a.onAdClosed();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        zzbba.f(sb.toString());
        try {
            this.f5808a.onAdFailedToLoad(i);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f5809b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f5810c;
        if (this.f5811d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzbba.e("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzbba.f("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideImpressionRecording()) {
                zzbba.f("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzbba.f("Adapter called onAdImpression.");
        try {
            this.f5808a.onAdImpression();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLeftApplication.");
        try {
            this.f5808a.onAdLeftApplication();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLoaded.");
        try {
            this.f5808a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdOpened.");
        try {
            this.f5808a.onAdOpened();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onVideoEnd.");
        try {
            this.f5808a.S();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAppEvent.");
        try {
            this.f5808a.onAppEvent(str, str2);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClicked.");
        try {
            this.f5808a.onAdClicked();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClosed.");
        try {
            this.f5808a.onAdClosed();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        zzbba.f(sb.toString());
        try {
            this.f5808a.onAdFailedToLoad(i);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLeftApplication.");
        try {
            this.f5808a.onAdLeftApplication();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLoaded.");
        try {
            this.f5808a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdOpened.");
        try {
            this.f5808a.onAdOpened();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        zzbba.f(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f5811d = nativeCustomTemplateAd;
        try {
            this.f5808a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f5809b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f5810c;
        if (this.f5811d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzbba.e("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzbba.f("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideClickHandling()) {
                zzbba.f("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzbba.f("Adapter called onAdClicked.");
        try {
            this.f5808a.onAdClicked();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClosed.");
        try {
            this.f5808a.onAdClosed();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        zzbba.f(sb.toString());
        try {
            this.f5808a.onAdFailedToLoad(i);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLeftApplication.");
        try {
            this.f5808a.onAdLeftApplication();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLoaded.");
        this.f5809b = nativeAdMapper;
        this.f5810c = null;
        a(mediationNativeAdapter, (UnifiedNativeAdMapper) null, nativeAdMapper);
        try {
            this.f5808a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdOpened.");
        try {
            this.f5808a.onAdOpened();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof zzaeq) {
            try {
                this.f5808a.V(((zzaeq) nativeCustomTemplateAd).a(), str);
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        } else {
            zzbba.i("Unexpected native custom template ad type.");
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLoaded.");
        this.f5810c = unifiedNativeAdMapper;
        this.f5809b = null;
        a(mediationNativeAdapter, unifiedNativeAdMapper, (NativeAdMapper) null);
        try {
            this.f5808a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
