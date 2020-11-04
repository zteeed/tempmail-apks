package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class v2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AdRequest.ErrorCode f5093b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzanu f5094c;

    v2(zzanu zzanu, AdRequest.ErrorCode errorCode) {
        this.f5094c = zzanu;
        this.f5093b = errorCode;
    }

    public final void run() {
        try {
            this.f5094c.f5822a.onAdFailedToLoad(zzaog.a(this.f5093b));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}