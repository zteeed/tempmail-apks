package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class u2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AdRequest.ErrorCode f5026b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzanu f5027c;

    u2(zzanu zzanu, AdRequest.ErrorCode errorCode) {
        this.f5027c = zzanu;
        this.f5026b = errorCode;
    }

    public final void run() {
        try {
            this.f5027c.f5822a.onAdFailedToLoad(zzaog.a(this.f5026b));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
