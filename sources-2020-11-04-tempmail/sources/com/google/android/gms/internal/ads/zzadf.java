package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadf extends zzads {

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f5812b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f5813c;

    /* renamed from: d  reason: collision with root package name */
    private final double f5814d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5815e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5816f;

    public zzadf(Drawable drawable, Uri uri, double d2, int i, int i2) {
        this.f5812b = drawable;
        this.f5813c = uri;
        this.f5814d = d2;
        this.f5815e = i;
        this.f5816f = i2;
    }

    public final IObjectWrapper E2() throws RemoteException {
        return ObjectWrapper.h0(this.f5812b);
    }

    public final double S3() {
        return this.f5814d;
    }

    public final int getHeight() {
        return this.f5816f;
    }

    public final int getWidth() {
        return this.f5815e;
    }

    public final Uri k0() throws RemoteException {
        return this.f5813c;
    }
}
