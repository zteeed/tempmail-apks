package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class j0 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzch f9426a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j0(zzch zzch, Handler handler) {
        super((Handler) null);
        this.f9426a = zzch;
    }

    public final void onChange(boolean z) {
        this.f9426a.c();
    }
}
