package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class n extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ int f9459f = 5;
    private final /* synthetic */ String g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ Object i;
    private final /* synthetic */ Object j;
    private final /* synthetic */ zzag k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n(zzag zzag, boolean z, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.k = zzag;
        this.g = str;
        this.h = obj;
        this.i = null;
        this.j = null;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.k.i.logHealthData(this.f9459f, this.g, ObjectWrapper.b0(this.h), ObjectWrapper.b0(this.i), ObjectWrapper.b0(this.j));
    }
}
