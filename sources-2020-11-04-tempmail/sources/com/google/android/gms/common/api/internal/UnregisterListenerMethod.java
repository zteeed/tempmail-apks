package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void a(A a2, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
