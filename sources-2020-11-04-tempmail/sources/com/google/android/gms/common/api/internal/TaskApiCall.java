package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Feature[] f2953a = null;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2954b = false;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        private Builder() {
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void a(A a2, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public boolean b() {
        return this.f2954b;
    }

    public final Feature[] c() {
        return this.f2953a;
    }
}
