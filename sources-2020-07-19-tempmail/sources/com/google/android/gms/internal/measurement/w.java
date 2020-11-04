package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class w extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Activity f9513f;
    private final /* synthetic */ Bundle g;
    private final /* synthetic */ zzag.b h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    w(zzag.b bVar, Activity activity, Bundle bundle) {
        super(zzag.this);
        this.h = bVar;
        this.f9513f = activity;
        this.g = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        zzag.this.i.onActivityCreated(ObjectWrapper.b0(this.f9513f), this.g, this.f9554c);
    }
}
