package com.google.android.gms.internal.location;

import android.os.DeadObjectException;
import android.os.IInterface;

final class g implements zzbj<zzao> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzk f9321a;

    g(zzk zzk) {
        this.f9321a = zzk;
    }

    public final void a() {
        this.f9321a.checkConnected();
    }

    public final /* synthetic */ IInterface b() throws DeadObjectException {
        return (zzao) this.f9321a.getService();
    }
}
