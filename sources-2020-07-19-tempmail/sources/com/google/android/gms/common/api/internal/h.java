package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

final class h implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<zaak> f2786a;

    /* renamed from: b  reason: collision with root package name */
    private final Api<?> f2787b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2788c;

    public h(zaak zaak, Api<?> api, boolean z) {
        this.f2786a = new WeakReference<>(zaak);
        this.f2787b = api;
        this.f2788c = z;
    }

    public final void a(ConnectionResult connectionResult) {
        zaak zaak = (zaak) this.f2786a.get();
        if (zaak != null) {
            Preconditions.o(Looper.myLooper() == zaak.f2837a.o.k(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zaak.f2838b.lock();
            try {
                if (zaak.r(0)) {
                    if (!connectionResult.G()) {
                        zaak.n(connectionResult, this.f2787b, this.f2788c);
                    }
                    if (zaak.g()) {
                        zaak.h();
                    }
                    zaak.f2838b.unlock();
                }
            } finally {
                zaak.f2838b.unlock();
            }
        }
    }
}
