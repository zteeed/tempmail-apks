package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class oq implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcxz f4577b;

    /* renamed from: c  reason: collision with root package name */
    private final List f4578c;

    /* renamed from: d  reason: collision with root package name */
    private final IObjectWrapper f4579d;

    oq(zzcxz zzcxz, List list, IObjectWrapper iObjectWrapper) {
        this.f4577b = zzcxz;
        this.f4578c = list;
        this.f4579d = iObjectWrapper;
    }

    public final Object call() {
        return this.f4577b.F6(this.f4578c, this.f4579d);
    }
}
