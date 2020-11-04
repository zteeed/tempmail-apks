package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class x extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Activity f9703f;
    private final /* synthetic */ zzag.b g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x(zzag.b bVar, Activity activity) {
        super(zzag.this);
        this.g = bVar;
        this.f9703f = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        zzag.this.i.onActivityPaused(ObjectWrapper.h0(this.f9703f), this.f9737c);
    }
}
