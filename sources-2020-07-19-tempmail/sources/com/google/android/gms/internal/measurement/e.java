package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class e extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Activity f9385f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ zzag i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e(zzag zzag, Activity activity, String str, String str2) {
        super(zzag);
        this.i = zzag;
        this.f9385f = activity;
        this.g = str;
        this.h = str2;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.i.i.setCurrentScreen(ObjectWrapper.b0(this.f9385f), this.g, this.h, this.f9553b);
    }
}
