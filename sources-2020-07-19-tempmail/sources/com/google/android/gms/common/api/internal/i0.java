package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class i0<T> extends zac {

    /* renamed from: a  reason: collision with root package name */
    protected final TaskCompletionSource<T> f2791a;

    public i0(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.f2791a = taskCompletionSource;
    }

    public void b(Status status) {
        this.f2791a.d(new ApiException(status));
    }

    public final void c(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            i(zaa);
        } catch (DeadObjectException e2) {
            b(zab.a(e2));
            throw e2;
        } catch (RemoteException e3) {
            b(zab.a(e3));
        } catch (RuntimeException e4) {
            e(e4);
        }
    }

    public void e(RuntimeException runtimeException) {
        this.f2791a.d(runtimeException);
    }

    /* access modifiers changed from: protected */
    public abstract void i(GoogleApiManager.zaa<?> zaa) throws RemoteException;
}
