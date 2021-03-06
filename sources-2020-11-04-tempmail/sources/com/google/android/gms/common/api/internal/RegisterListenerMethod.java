package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {

    /* renamed from: a  reason: collision with root package name */
    private final ListenerHolder<L> f2949a;

    /* renamed from: b  reason: collision with root package name */
    private final Feature[] f2950b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2951c;

    @KeepForSdk
    public void a() {
        this.f2949a.a();
    }

    @KeepForSdk
    public ListenerHolder.ListenerKey<L> b() {
        return this.f2949a.b();
    }

    @KeepForSdk
    public Feature[] c() {
        return this.f2950b;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void d(A a2, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    public final boolean e() {
        return this.f2951c;
    }
}
