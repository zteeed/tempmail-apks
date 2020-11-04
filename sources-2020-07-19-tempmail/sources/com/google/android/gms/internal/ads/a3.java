package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class a3 implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaor f3335a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzamx f3336b;

    a3(zzapc zzapc, zzaor zzaor, zzamx zzamx) {
        this.f3335a = zzaor;
        this.f3336b = zzamx;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationNativeAdCallback onSuccess(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        if (unifiedNativeAdMapper == null) {
            zzbba.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f3335a.q("Adapter returned null.");
                return null;
            } catch (RemoteException e2) {
                zzbba.c("", e2);
                return null;
            }
        } else {
            try {
                this.f3335a.n4(new zzaoi(unifiedNativeAdMapper));
            } catch (RemoteException e3) {
                zzbba.c("", e3);
            }
            return new b3(this.f3336b);
        }
    }

    public final void onFailure(String str) {
        try {
            this.f3335a.q(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
