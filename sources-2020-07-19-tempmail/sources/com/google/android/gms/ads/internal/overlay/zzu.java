package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzuu;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzu extends zzaqh {
    private Activity zzaar;
    private boolean zzdnh = false;
    private AdOverlayInfoParcel zzdoo;
    private boolean zzdop = false;

    public zzu(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdoo = adOverlayInfoParcel;
        this.zzaar = activity;
    }

    private final synchronized void zzuv() {
        if (!this.zzdop) {
            if (this.zzdoo.zzdoe != null) {
                this.zzdoo.zzdoe.zzud();
            }
            this.zzdop = true;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    public final void onBackPressed() throws RemoteException {
    }

    public final void onCreate(Bundle bundle) {
        zzo zzo;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdoo;
        if (adOverlayInfoParcel == null) {
            this.zzaar.finish();
        } else if (z) {
            this.zzaar.finish();
        } else {
            if (bundle == null) {
                zzuu zzuu = adOverlayInfoParcel.zzcgl;
                if (zzuu != null) {
                    zzuu.onAdClicked();
                }
                if (!(this.zzaar.getIntent() == null || !this.zzaar.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (zzo = this.zzdoo.zzdoe) == null)) {
                    zzo.zzue();
                }
            }
            zzq.zzku();
            Activity activity = this.zzaar;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdoo;
            if (!zzb.zza((Context) activity, adOverlayInfoParcel2.zzdod, adOverlayInfoParcel2.zzdoi)) {
                this.zzaar.finish();
            }
        }
    }

    public final void onDestroy() throws RemoteException {
        if (this.zzaar.isFinishing()) {
            zzuv();
        }
    }

    public final void onPause() throws RemoteException {
        zzo zzo = this.zzdoo.zzdoe;
        if (zzo != null) {
            zzo.onPause();
        }
        if (this.zzaar.isFinishing()) {
            zzuv();
        }
    }

    public final void onRestart() throws RemoteException {
    }

    public final void onResume() throws RemoteException {
        if (this.zzdnh) {
            this.zzaar.finish();
            return;
        }
        this.zzdnh = true;
        zzo zzo = this.zzdoo.zzdoe;
        if (zzo != null) {
            zzo.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdnh);
    }

    public final void onStart() throws RemoteException {
    }

    public final void onStop() throws RemoteException {
        if (this.zzaar.isFinishing()) {
            zzuv();
        }
    }

    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzdp() throws RemoteException {
    }

    public final boolean zzul() throws RemoteException {
        return false;
    }
}
