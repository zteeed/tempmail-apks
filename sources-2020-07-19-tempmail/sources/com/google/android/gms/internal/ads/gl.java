package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class gl implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzeg f3899b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f3900c;

    gl(zzeg zzeg, Context context) {
        this.f3899b = zzeg;
        this.f3900c = context;
    }

    public final Object call() {
        zzeg zzeg = this.f3899b;
        return zzeg.h().zzb(this.f3900c);
    }
}
