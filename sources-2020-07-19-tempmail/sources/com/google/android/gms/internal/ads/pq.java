package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class pq implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcxz f4655b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f4656c;

    /* renamed from: d  reason: collision with root package name */
    private final IObjectWrapper f4657d;

    pq(zzcxz zzcxz, Uri uri, IObjectWrapper iObjectWrapper) {
        this.f4655b = zzcxz;
        this.f4656c = uri;
        this.f4657d = iObjectWrapper;
    }

    public final Object call() {
        return this.f4655b.K6(this.f4656c, this.f4657d);
    }
}
