package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class u2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AdRequest.ErrorCode f5209b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzanu f5210c;

    u2(zzanu zzanu, AdRequest.ErrorCode errorCode) {
        this.f5210c = zzanu;
        this.f5209b = errorCode;
    }

    public final void run() {
        try {
            this.f5210c.f6005a.onAdFailedToLoad(zzaog.a(this.f5209b));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
