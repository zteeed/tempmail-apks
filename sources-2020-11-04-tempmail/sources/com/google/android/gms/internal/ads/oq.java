package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class oq implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcxz f4760b;

    /* renamed from: c  reason: collision with root package name */
    private final List f4761c;

    /* renamed from: d  reason: collision with root package name */
    private final IObjectWrapper f4762d;

    oq(zzcxz zzcxz, List list, IObjectWrapper iObjectWrapper) {
        this.f4760b = zzcxz;
        this.f4761c = list;
        this.f4762d = iObjectWrapper;
    }

    public final Object call() {
        return this.f4760b.k7(this.f4761c, this.f4762d);
    }
}
