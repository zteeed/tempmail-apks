package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzxy implements MuteThisAdReason {

    /* renamed from: a  reason: collision with root package name */
    private final String f9405a;

    /* renamed from: b  reason: collision with root package name */
    private zzxt f9406b;

    public zzxy(zzxt zzxt) {
        String str;
        this.f9406b = zzxt;
        try {
            str = zzxt.getDescription();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            str = null;
        }
        this.f9405a = str;
    }

    public final zzxt a() {
        return this.f9406b;
    }

    public final String getDescription() {
        return this.f9405a;
    }

    public final String toString() {
        return this.f9405a;
    }
}
