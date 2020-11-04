package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.GoogleApiManager;

public final class zaf extends i0<Void> {

    /* renamed from: b  reason: collision with root package name */
    private final RegisterListenerMethod<Api.AnyClient, ?> f2882b;

    /* renamed from: c  reason: collision with root package name */
    private final UnregisterListenerMethod<Api.AnyClient, ?> f2883c;

    public final /* bridge */ /* synthetic */ void d(zaab zaab, boolean z) {
    }

    public final Feature[] g(GoogleApiManager.zaa<?> zaa) {
        return this.f2882b.c();
    }

    public final boolean h(GoogleApiManager.zaa<?> zaa) {
        return this.f2882b.e();
    }

    public final void i(GoogleApiManager.zaa<?> zaa) throws RemoteException {
        this.f2882b.d(zaa.l(), this.f2791a);
        if (this.f2882b.b() != null) {
            zaa.u().put(this.f2882b.b(), new zabw(this.f2882b, this.f2883c));
        }
    }
}
