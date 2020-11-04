package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

final class h implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<zaak> f2974a;

    /* renamed from: b  reason: collision with root package name */
    private final Api<?> f2975b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2976c;

    public h(zaak zaak, Api<?> api, boolean z) {
        this.f2974a = new WeakReference<>(zaak);
        this.f2975b = api;
        this.f2976c = z;
    }

    public final void a(ConnectionResult connectionResult) {
        zaak zaak = (zaak) this.f2974a.get();
        if (zaak != null) {
            Preconditions.o(Looper.myLooper() == zaak.f3025a.o.k(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zaak.f3026b.lock();
            try {
                if (zaak.r(0)) {
                    if (!connectionResult.G()) {
                        zaak.n(connectionResult, this.f2975b, this.f2976c);
                    }
                    if (zaak.g()) {
                        zaak.h();
                    }
                    zaak.f3026b.unlock();
                }
            } finally {
                zaak.f3026b.unlock();
            }
        }
    }
}
