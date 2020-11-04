package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class t extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f9495f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ zzag j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(zzag zzag, String str, String str2, Object obj, boolean z) {
        super(zzag);
        this.j = zzag;
        this.f9495f = str;
        this.g = str2;
        this.h = obj;
        this.i = z;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.j.i.setUserProperty(this.f9495f, this.g, ObjectWrapper.b0(this.h), this.i, this.f9553b);
    }
}
