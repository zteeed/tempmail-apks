package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaty implements RewardedVideoAd {

    /* renamed from: a  reason: collision with root package name */
    private final zzatj f5952a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5953b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5954c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final zzatt f5955d = new zzatt((RewardedVideoAdListener) null);

    /* renamed from: e  reason: collision with root package name */
    private String f5956e;

    /* renamed from: f  reason: collision with root package name */
    private String f5957f;

    public zzaty(Context context, zzatj zzatj) {
        this.f5952a = zzatj == null ? new zzzq() : zzatj;
        this.f5953b = context.getApplicationContext();
    }

    private final void a(String str, zzyq zzyq) {
        synchronized (this.f5954c) {
            if (this.f5952a != null) {
                try {
                    this.f5952a.y5(zzvf.a(this.f5953b, zzyq, str));
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void destroy() {
        destroy((Context) null);
    }

    public final Bundle getAdMetadata() {
        synchronized (this.f5954c) {
            if (this.f5952a != null) {
                try {
                    Bundle adMetadata = this.f5952a.getAdMetadata();
                    return adMetadata;
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
            Bundle bundle = new Bundle();
            return bundle;
        }
    }

    public final String getCustomData() {
        String str;
        synchronized (this.f5954c) {
            str = this.f5957f;
        }
        return str;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.f5952a != null) {
                return this.f5952a.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyd zzyd = null;
        try {
            if (this.f5952a != null) {
                zzyd = this.f5952a.zzkj();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zza(zzyd);
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener A6;
        synchronized (this.f5954c) {
            A6 = this.f5955d.A6();
        }
        return A6;
    }

    public final String getUserId() {
        String str;
        synchronized (this.f5954c) {
            str = this.f5956e;
        }
        return str;
    }

    public final boolean isLoaded() {
        synchronized (this.f5954c) {
            if (this.f5952a == null) {
                return false;
            }
            try {
                boolean isLoaded = this.f5952a.isLoaded();
                return isLoaded;
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
                return false;
            }
        }
    }

    public final void loadAd(String str, AdRequest adRequest) {
        a(str, adRequest.zzdq());
    }

    public final void pause() {
        pause((Context) null);
    }

    public final void resume() {
        resume((Context) null);
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.f5954c) {
            if (this.f5952a != null) {
                try {
                    this.f5952a.zza((zzwz) new zzvb(adMetadataListener));
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void setCustomData(String str) {
        synchronized (this.f5954c) {
            if (this.f5952a != null) {
                try {
                    this.f5952a.setCustomData(str);
                    this.f5957f = str;
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.f5954c) {
            if (this.f5952a != null) {
                try {
                    this.f5952a.setImmersiveMode(z);
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f5954c) {
            this.f5955d.B6(rewardedVideoAdListener);
            if (this.f5952a != null) {
                try {
                    this.f5952a.zza((zzatq) this.f5955d);
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void setUserId(String str) {
        synchronized (this.f5954c) {
            this.f5956e = str;
            if (this.f5952a != null) {
                try {
                    this.f5952a.setUserId(str);
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void show() {
        synchronized (this.f5954c) {
            if (this.f5952a != null) {
                try {
                    this.f5952a.show();
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void destroy(Context context) {
        synchronized (this.f5954c) {
            this.f5955d.B6((RewardedVideoAdListener) null);
            if (this.f5952a != null) {
                try {
                    this.f5952a.l6(ObjectWrapper.b0(context));
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        a(str, publisherAdRequest.zzdq());
    }

    public final void pause(Context context) {
        synchronized (this.f5954c) {
            if (this.f5952a != null) {
                try {
                    this.f5952a.U4(ObjectWrapper.b0(context));
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void resume(Context context) {
        synchronized (this.f5954c) {
            if (this.f5952a != null) {
                try {
                    this.f5952a.e4(ObjectWrapper.b0(context));
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }
}
