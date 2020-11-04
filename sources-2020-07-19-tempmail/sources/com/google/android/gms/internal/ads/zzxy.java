package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzxy implements MuteThisAdReason {

    /* renamed from: a  reason: collision with root package name */
    private final String f9222a;

    /* renamed from: b  reason: collision with root package name */
    private zzxt f9223b;

    public zzxy(zzxt zzxt) {
        String str;
        this.f9223b = zzxt;
        try {
            str = zzxt.getDescription();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            str = null;
        }
        this.f9222a = str;
    }

    public final zzxt a() {
        return this.f9223b;
    }

    public final String getDescription() {
        return this.f9222a;
    }

    public final String toString() {
        return this.f9222a;
    }
}
