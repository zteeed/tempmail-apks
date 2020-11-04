package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;

public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zab {

    /* renamed from: a  reason: collision with root package name */
    private final A f3069a;

    public zae(int i, A a2) {
        super(i);
        this.f3069a = a2;
    }

    public final void b(Status status) {
        this.f3069a.x(status);
    }

    public final void c(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            this.f3069a.v(zaa.l());
        } catch (RuntimeException e2) {
            e(e2);
        }
    }

    public final void d(zaab zaab, boolean z) {
        zaab.b(this.f3069a, z);
    }

    public final void e(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f3069a.x(new Status(10, sb.toString()));
    }
}
