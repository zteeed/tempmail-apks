package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class v2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AdRequest.ErrorCode f5276b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzanu f5277c;

    v2(zzanu zzanu, AdRequest.ErrorCode errorCode) {
        this.f5277c = zzanu;
        this.f5276b = errorCode;
    }

    public final void run() {
        try {
            this.f5277c.f6005a.onAdFailedToLoad(zzaog.a(this.f5276b));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
