package com.google.firebase.dynamiclinks.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.a.a;
import com.google.firebase.e.b;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
final class j extends TaskApiCall<d, b> {

    /* renamed from: c  reason: collision with root package name */
    private final String f11652c;

    /* renamed from: d  reason: collision with root package name */
    private final a f11653d;

    j(a aVar, String str) {
        this.f11652c = str;
        this.f11653d = aVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        d dVar = (d) anyClient;
        try {
            ((k) dVar.getService()).I4(new h(this.f11653d, taskCompletionSource), this.f11652c);
        } catch (RemoteException unused) {
        }
    }
}
