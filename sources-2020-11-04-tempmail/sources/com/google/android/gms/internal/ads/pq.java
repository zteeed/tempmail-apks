package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class pq implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcxz f4838b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f4839c;

    /* renamed from: d  reason: collision with root package name */
    private final IObjectWrapper f4840d;

    pq(zzcxz zzcxz, Uri uri, IObjectWrapper iObjectWrapper) {
        this.f4838b = zzcxz;
        this.f4839c = uri;
        this.f4840d = iObjectWrapper;
    }

    public final Object call() {
        return this.f4838b.p7(this.f4839c, this.f4840d);
    }
}
