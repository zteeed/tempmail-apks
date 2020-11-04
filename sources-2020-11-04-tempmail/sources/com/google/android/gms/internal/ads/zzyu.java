package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzyu {

    /* renamed from: a  reason: collision with root package name */
    private final zzamo f9439a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9440b;

    /* renamed from: c  reason: collision with root package name */
    private AdListener f9441c;

    /* renamed from: d  reason: collision with root package name */
    private zzuu f9442d;

    /* renamed from: e  reason: collision with root package name */
    private zzww f9443e;

    /* renamed from: f  reason: collision with root package name */
    private String f9444f;
    private AdMetadataListener g;
    private AppEventListener h;
    private OnCustomRenderedAdLoadedListener i;
    private RewardedVideoAdListener j;
    private boolean k;
    private boolean l;
    private OnPaidEventListener m;

    public zzyu(Context context) {
        this(context, zzvf.f9371a, (PublisherInterstitialAd) null);
    }

    private final void u(String str) {
        if (this.f9443e == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final AdListener a() {
        return this.f9441c;
    }

    public final Bundle b() {
        try {
            if (this.f9443e != null) {
                return this.f9443e.getAdMetadata();
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
        return new Bundle();
    }

    public final String c() {
        return this.f9444f;
    }

    public final AppEventListener d() {
        return this.h;
    }

    public final String e() {
        try {
            if (this.f9443e != null) {
                return this.f9443e.zzki();
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
            return null;
        }
    }

    public final OnCustomRenderedAdLoadedListener f() {
        return this.i;
    }

    public final ResponseInfo g() {
        zzyd zzyd = null;
        try {
            if (this.f9443e != null) {
                zzyd = this.f9443e.zzkj();
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
        return ResponseInfo.zza(zzyd);
    }

    public final boolean h() {
        try {
            if (this.f9443e == null) {
                return false;
            }
            return this.f9443e.isReady();
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
            return false;
        }
    }

    public final boolean i() {
        try {
            if (this.f9443e == null) {
                return false;
            }
            return this.f9443e.isLoading();
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
            return false;
        }
    }

    public final void j(AdListener adListener) {
        try {
            this.f9441c = adListener;
            if (this.f9443e != null) {
                this.f9443e.zza((zzwj) adListener != null ? new zzva(adListener) : null);
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void k(AdMetadataListener adMetadataListener) {
        try {
            this.g = adMetadataListener;
            if (this.f9443e != null) {
                this.f9443e.zza((zzwz) adMetadataListener != null ? new zzvb(adMetadataListener) : null);
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void l(String str) {
        if (this.f9444f == null) {
            this.f9444f = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void m(AppEventListener appEventListener) {
        try {
            this.h = appEventListener;
            if (this.f9443e != null) {
                this.f9443e.zza((zzxe) appEventListener != null ? new zzvl(appEventListener) : null);
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void n(boolean z) {
        try {
            this.l = z;
            if (this.f9443e != null) {
                this.f9443e.setImmersiveMode(z);
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void o(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.i = onCustomRenderedAdLoadedListener;
            if (this.f9443e != null) {
                this.f9443e.zza((zzabo) onCustomRenderedAdLoadedListener != null ? new zzabt(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void p(OnPaidEventListener onPaidEventListener) {
        try {
            this.m = onPaidEventListener;
            if (this.f9443e != null) {
                this.f9443e.zza((zzyc) new zzzv(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void q(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.j = rewardedVideoAdListener;
            if (this.f9443e != null) {
                this.f9443e.zza((zzatq) rewardedVideoAdListener != null ? new zzatt(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void r() {
        try {
            u("show");
            this.f9443e.showInterstitial();
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void s(zzuu zzuu) {
        try {
            this.f9442d = zzuu;
            if (this.f9443e != null) {
                this.f9443e.zza((zzwi) zzuu != null ? new zzut(zzuu) : null);
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void t(zzyq zzyq) {
        try {
            if (this.f9443e == null) {
                if (this.f9444f == null) {
                    u("loadAd");
                }
                zzvh G = this.k ? zzvh.G() : new zzvh();
                zzvp b2 = zzwg.b();
                Context context = this.f9440b;
                zzww zzww = (zzww) new hg0(b2, context, G, this.f9444f, this.f9439a).b(context, false);
                this.f9443e = zzww;
                if (this.f9441c != null) {
                    zzww.zza((zzwj) new zzva(this.f9441c));
                }
                if (this.f9442d != null) {
                    this.f9443e.zza((zzwi) new zzut(this.f9442d));
                }
                if (this.g != null) {
                    this.f9443e.zza((zzwz) new zzvb(this.g));
                }
                if (this.h != null) {
                    this.f9443e.zza((zzxe) new zzvl(this.h));
                }
                if (this.i != null) {
                    this.f9443e.zza((zzabo) new zzabt(this.i));
                }
                if (this.j != null) {
                    this.f9443e.zza((zzatq) new zzatt(this.j));
                }
                this.f9443e.zza((zzyc) new zzzv(this.m));
                this.f9443e.setImmersiveMode(this.l);
            }
            if (this.f9443e.zza(zzvf.b(this.f9440b, zzyq))) {
                this.f9439a.h7(zzyq.r());
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void v(boolean z) {
        this.k = true;
    }

    public zzyu(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzvf.f9371a, publisherInterstitialAd);
    }

    @VisibleForTesting
    private zzyu(Context context, zzvf zzvf, PublisherInterstitialAd publisherInterstitialAd) {
        this.f9439a = new zzamo();
        this.f9440b = context;
    }
}
