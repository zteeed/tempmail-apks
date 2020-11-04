package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaut {

    /* renamed from: a  reason: collision with root package name */
    private final zzaui f6147a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6148b;

    public zzaut(Context context, String str) {
        this.f6148b = context.getApplicationContext();
        this.f6147a = zzwg.b().k(context, str, new zzamo());
    }

    public final Bundle a() {
        try {
            return this.f6147a.getAdMetadata();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return new Bundle();
        }
    }

    public final String b() {
        try {
            return this.f6147a.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return "";
        }
    }

    public final ResponseInfo c() {
        zzyd zzyd;
        try {
            zzyd = this.f6147a.zzkj();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            zzyd = null;
        }
        return ResponseInfo.zza(zzyd);
    }

    public final RewardItem d() {
        try {
            zzaud K2 = this.f6147a.K2();
            if (K2 == null) {
                return null;
            }
            return new zzauw(K2);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final boolean e() {
        try {
            return this.f6147a.isLoaded();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final void f(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f6147a.e1(new zzzs(onAdMetadataChangedListener));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void g(OnPaidEventListener onPaidEventListener) {
        try {
            this.f6147a.zza(new zzzv(onPaidEventListener));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void h(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.f6147a.Z5(new zzauz(serverSideVerificationOptions));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void i(Activity activity, RewardedAdCallback rewardedAdCallback) {
        try {
            this.f6147a.e5(new zzauv(rewardedAdCallback));
            this.f6147a.l2(ObjectWrapper.h0(activity));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void j(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        try {
            this.f6147a.e5(new zzauv(rewardedAdCallback));
            this.f6147a.b7(ObjectWrapper.h0(activity), z);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void k(zzyq zzyq, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            this.f6147a.o0(zzvf.b(this.f6148b, zzyq), new zzava(rewardedAdLoadCallback));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
