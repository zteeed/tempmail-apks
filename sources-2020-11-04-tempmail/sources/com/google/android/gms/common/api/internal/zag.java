package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zag<ResultT> extends zac {

    /* renamed from: a  reason: collision with root package name */
    private final TaskApiCall<Api.AnyClient, ResultT> f3072a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<ResultT> f3073b;

    /* renamed from: c  reason: collision with root package name */
    private final StatusExceptionMapper f3074c;

    public zag(int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.f3073b = taskCompletionSource;
        this.f3072a = taskApiCall;
        this.f3074c = statusExceptionMapper;
    }

    public final void b(Status status) {
        this.f3073b.d(this.f3074c.a(status));
    }

    public final void c(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            this.f3072a.a(zaa.l(), this.f3073b);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            b(zab.a(e3));
        } catch (RuntimeException e4) {
            e(e4);
        }
    }

    public final void d(zaab zaab, boolean z) {
        zaab.c(this.f3073b, z);
    }

    public final void e(RuntimeException runtimeException) {
        this.f3073b.d(runtimeException);
    }

    public final Feature[] g(GoogleApiManager.zaa<?> zaa) {
        return this.f3072a.c();
    }

    public final boolean h(GoogleApiManager.zaa<?> zaa) {
        return this.f3072a.b();
    }
}
