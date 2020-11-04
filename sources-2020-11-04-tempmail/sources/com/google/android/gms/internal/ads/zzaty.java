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
    private final zzatj f6135a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6136b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f6137c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final zzatt f6138d = new zzatt((RewardedVideoAdListener) null);

    /* renamed from: e  reason: collision with root package name */
    private String f6139e;

    /* renamed from: f  reason: collision with root package name */
    private String f6140f;

    public zzaty(Context context, zzatj zzatj) {
        this.f6135a = zzatj == null ? new zzzq() : zzatj;
        this.f6136b = context.getApplicationContext();
    }

    private final void a(String str, zzyq zzyq) {
        synchronized (this.f6137c) {
            if (this.f6135a != null) {
                try {
                    this.f6135a.W5(zzvf.a(this.f6136b, zzyq, str));
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
        synchronized (this.f6137c) {
            if (this.f6135a != null) {
                try {
                    Bundle adMetadata = this.f6135a.getAdMetadata();
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
        synchronized (this.f6137c) {
            str = this.f6140f;
        }
        return str;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.f6135a != null) {
                return this.f6135a.getMediationAdapterClassName();
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
            if (this.f6135a != null) {
                zzyd = this.f6135a.zzkj();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zza(zzyd);
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener f7;
        synchronized (this.f6137c) {
            f7 = this.f6138d.f7();
        }
        return f7;
    }

    public final String getUserId() {
        String str;
        synchronized (this.f6137c) {
            str = this.f6139e;
        }
        return str;
    }

    public final boolean isLoaded() {
        synchronized (this.f6137c) {
            if (this.f6135a == null) {
                return false;
            }
            try {
                boolean isLoaded = this.f6135a.isLoaded();
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
        synchronized (this.f6137c) {
            if (this.f6135a != null) {
                try {
                    this.f6135a.zza((zzwz) new zzvb(adMetadataListener));
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void setCustomData(String str) {
        synchronized (this.f6137c) {
            if (this.f6135a != null) {
                try {
                    this.f6135a.setCustomData(str);
                    this.f6140f = str;
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.f6137c) {
            if (this.f6135a != null) {
                try {
                    this.f6135a.setImmersiveMode(z);
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f6137c) {
            this.f6138d.g7(rewardedVideoAdListener);
            if (this.f6135a != null) {
                try {
                    this.f6135a.zza((zzatq) this.f6138d);
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void setUserId(String str) {
        synchronized (this.f6137c) {
            this.f6139e = str;
            if (this.f6135a != null) {
                try {
                    this.f6135a.setUserId(str);
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void show() {
        synchronized (this.f6137c) {
            if (this.f6135a != null) {
                try {
                    this.f6135a.show();
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void destroy(Context context) {
        synchronized (this.f6137c) {
            this.f6138d.g7((RewardedVideoAdListener) null);
            if (this.f6135a != null) {
                try {
                    this.f6135a.N6(ObjectWrapper.h0(context));
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
        synchronized (this.f6137c) {
            if (this.f6135a != null) {
                try {
                    this.f6135a.o5(ObjectWrapper.h0(context));
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void resume(Context context) {
        synchronized (this.f6137c) {
            if (this.f6135a != null) {
                try {
                    this.f6135a.y4(ObjectWrapper.h0(context));
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }
}
