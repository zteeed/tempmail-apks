package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzyd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class ResponseInfo {
    private final zzyd zzadl;

    private ResponseInfo(zzyd zzyd) {
        this.zzadl = zzyd;
    }

    public static ResponseInfo zza(zzyd zzyd) {
        if (zzyd != null) {
            return new ResponseInfo(zzyd);
        }
        return null;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.zzadl.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbba.c("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
            return null;
        }
    }

    public final String getResponseId() {
        try {
            return this.zzadl.M4();
        } catch (RemoteException e2) {
            zzbba.c("Could not forward getResponseId to ResponseInfo.", e2);
            return null;
        }
    }
}
