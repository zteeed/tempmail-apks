package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadf extends zzads {

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f5629b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f5630c;

    /* renamed from: d  reason: collision with root package name */
    private final double f5631d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5632e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5633f;

    public zzadf(Drawable drawable, Uri uri, double d2, int i, int i2) {
        this.f5629b = drawable;
        this.f5630c = uri;
        this.f5631d = d2;
        this.f5632e = i;
        this.f5633f = i2;
    }

    public final double E3() {
        return this.f5631d;
    }

    public final Uri e0() throws RemoteException {
        return this.f5630c;
    }

    public final int getHeight() {
        return this.f5633f;
    }

    public final int getWidth() {
        return this.f5632e;
    }

    public final IObjectWrapper s2() throws RemoteException {
        return ObjectWrapper.b0(this.f5629b);
    }
}
