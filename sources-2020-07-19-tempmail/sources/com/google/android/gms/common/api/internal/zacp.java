package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.Set;

public final class zacp {

    /* renamed from: d  reason: collision with root package name */
    public static final Status f2876d = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: e  reason: collision with root package name */
    private static final BasePendingResult<?>[] f2877e = new BasePendingResult[0];
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final Set<BasePendingResult<?>> f2878a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f2879b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Api.AnyClientKey<?>, Api.Client> f2880c;

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.ResultCallback, com.google.android.gms.common.api.internal.f0, com.google.android.gms.common.api.zac, com.google.android.gms.common.api.internal.h0] */
    public final void a() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f2878a.toArray(f2877e)) {
            ? r5 = 0;
            basePendingResult.l(r5);
            if (basePendingResult.o() != null) {
                basePendingResult.i(r5);
                IBinder serviceBrokerBinder = this.f2880c.get(((BaseImplementation.ApiMethodImpl) basePendingResult).t()).getServiceBrokerBinder();
                if (basePendingResult.g()) {
                    basePendingResult.l(new g0(basePendingResult, r5, serviceBrokerBinder, r5));
                } else if (serviceBrokerBinder == null || !serviceBrokerBinder.isBinderAlive()) {
                    basePendingResult.l(r5);
                    basePendingResult.b();
                    r5.a(basePendingResult.o().intValue());
                } else {
                    g0 g0Var = new g0(basePendingResult, r5, serviceBrokerBinder, r5);
                    basePendingResult.l(g0Var);
                    try {
                        serviceBrokerBinder.linkToDeath(g0Var, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.b();
                        r5.a(basePendingResult.o().intValue());
                    }
                }
                this.f2878a.remove(basePendingResult);
            } else if (basePendingResult.p()) {
                this.f2878a.remove(basePendingResult);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(BasePendingResult<? extends Result> basePendingResult) {
        this.f2878a.add(basePendingResult);
        basePendingResult.l(this.f2879b);
    }

    public final void c() {
        for (BasePendingResult n : (BasePendingResult[]) this.f2878a.toArray(f2877e)) {
            n.n(f2876d);
        }
    }
}
