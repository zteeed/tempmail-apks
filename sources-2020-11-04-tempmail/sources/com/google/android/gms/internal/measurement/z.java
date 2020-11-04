package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class z extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Activity f9714f;
    private final /* synthetic */ zzt g;
    private final /* synthetic */ zzag.b h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z(zzag.b bVar, Activity activity, zzt zzt) {
        super(zzag.this);
        this.h = bVar;
        this.f9714f = activity;
        this.g = zzt;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        zzag.this.i.onActivitySaveInstanceState(ObjectWrapper.h0(this.f9714f), this.g, this.f9737c);
    }
}
