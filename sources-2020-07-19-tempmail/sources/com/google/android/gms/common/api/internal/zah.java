package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zah extends i0<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private final ListenerHolder.ListenerKey<?> f2887b;

    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f2887b = listenerKey;
    }

    public final /* bridge */ /* synthetic */ void d(zaab zaab, boolean z) {
    }

    public final Feature[] g(GoogleApiManager.zaa<?> zaa) {
        zabw zabw = zaa.u().get(this.f2887b);
        if (zabw == null) {
            return null;
        }
        return zabw.f2862a.c();
    }

    public final boolean h(GoogleApiManager.zaa<?> zaa) {
        zabw zabw = zaa.u().get(this.f2887b);
        return zabw != null && zabw.f2862a.e();
    }

    public final void i(GoogleApiManager.zaa<?> zaa) throws RemoteException {
        zabw remove = zaa.u().remove(this.f2887b);
        if (remove != null) {
            remove.f2863b.a(zaa.l(), this.f2791a);
            remove.f2862a.a();
            return;
        }
        this.f2791a.e(Boolean.FALSE);
    }
}
