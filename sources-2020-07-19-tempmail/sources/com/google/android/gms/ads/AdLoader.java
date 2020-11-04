package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzadj;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.internal.ads.zzagd;
import com.google.android.gms.internal.ads.zzagf;
import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzamo;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzva;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwo;
import com.google.android.gms.internal.ads.zzwp;
import com.google.android.gms.internal.ads.zzyq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class AdLoader {
    private final zzvf zzacq;
    private final zzwo zzacr;
    private final Context zzvr;

    AdLoader(Context context, zzwo zzwo) {
        this(context, zzwo, zzvf.f9188a);
    }

    private final void zza(zzyq zzyq) {
        try {
            this.zzacr.X5(zzvf.b(this.zzvr, zzyq));
        } catch (RemoteException e2) {
            zzbba.c("Failed to load ad.", e2);
        }
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.zzacr.zzki();
        } catch (RemoteException e2) {
            zzbba.d("Failed to get the mediation adapter class name.", e2);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.zzacr.isLoading();
        } catch (RemoteException e2) {
            zzbba.d("Failed to check if ad is loading.", e2);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzdq());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzacr.J4(zzvf.b(this.zzvr, adRequest.zzdq()), i);
        } catch (RemoteException e2) {
            zzbba.c("Failed to load ads.", e2);
        }
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzdq());
    }

    private AdLoader(Context context, zzwo zzwo, zzvf zzvf) {
        this.zzvr = context;
        this.zzacr = zzwo;
        this.zzacq = zzvf;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static class Builder {
        private final zzwp zzacp;
        private final Context zzvr;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Context context, String str) {
            this(context, zzwg.b().i(context, str, new zzamo()));
            Preconditions.l(context, "context cannot be null");
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zzvr, this.zzacp.j5());
            } catch (RemoteException e2) {
                zzbba.c("Failed to build AdLoader.", e2);
                return null;
            }
        }

        @Deprecated
        public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzacp.s4(new zzagd(onAppInstallAdLoadedListener));
            } catch (RemoteException e2) {
                zzbba.d("Failed to add app install ad listener", e2);
            }
            return this;
        }

        @Deprecated
        public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzacp.G3(new zzagc(onContentAdLoadedListener));
            } catch (RemoteException e2) {
                zzbba.d("Failed to add content ad listener", e2);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzafz zzafz = new zzafz(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzacp.c5(str, zzafz.e(), zzafz.f());
            } catch (RemoteException e2) {
                zzbba.d("Failed to add custom template ad listener", e2);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzacp.O5(new zzagf(onPublisherAdViewLoadedListener), new zzvh(this.zzvr, adSizeArr));
            } catch (RemoteException e2) {
                zzbba.d("Failed to add publisher banner ad listener", e2);
            }
            return this;
        }

        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzacp.s3(new zzagh(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e2) {
                zzbba.d("Failed to add google native ad listener", e2);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzacp.j1(new zzva(adListener));
            } catch (RemoteException e2) {
                zzbba.d("Failed to set AdListener.", e2);
            }
            return this;
        }

        @KeepForSdk
        @Deprecated
        public Builder withCorrelator(Correlator correlator) {
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzacp.S3(new zzadj(nativeAdOptions));
            } catch (RemoteException e2) {
                zzbba.d("Failed to specify native ad options", e2);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.zzacp.F1(publisherAdViewOptions);
            } catch (RemoteException e2) {
                zzbba.d("Failed to specify DFP banner ad options", e2);
            }
            return this;
        }

        private Builder(Context context, zzwp zzwp) {
            this.zzvr = context;
            this.zzacp = zzwp;
        }
    }
}
