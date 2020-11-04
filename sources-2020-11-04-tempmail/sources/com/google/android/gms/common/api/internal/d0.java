package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

final class d0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Result f2966b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zacm f2967c;

    d0(zacm zacm, Result result) {
        this.f2967c = zacm;
        this.f2966b = result;
    }

    public final void run() {
        try {
            BasePendingResult.p.set(Boolean.TRUE);
            this.f2967c.g.sendMessage(this.f2967c.g.obtainMessage(0, this.f2967c.f3058a.b(this.f2966b)));
            BasePendingResult.p.set(Boolean.FALSE);
            zacm.c(this.f2966b);
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f2967c.f3063f.get();
            if (googleApiClient != null) {
                googleApiClient.h(this.f2967c);
            }
        } catch (RuntimeException e2) {
            this.f2967c.g.sendMessage(this.f2967c.g.obtainMessage(1, e2));
            BasePendingResult.p.set(Boolean.FALSE);
            zacm.c(this.f2966b);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.f2967c.f3063f.get();
            if (googleApiClient2 != null) {
                googleApiClient2.h(this.f2967c);
            }
        } catch (Throwable th) {
            BasePendingResult.p.set(Boolean.FALSE);
            zacm.c(this.f2966b);
            GoogleApiClient googleApiClient3 = (GoogleApiClient) this.f2967c.f3063f.get();
            if (googleApiClient3 != null) {
                googleApiClient3.h(this.f2967c);
            }
            throw th;
        }
    }
}
