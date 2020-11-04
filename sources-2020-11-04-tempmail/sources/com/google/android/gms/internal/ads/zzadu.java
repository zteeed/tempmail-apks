package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadu extends NativeAd.Image {

    /* renamed from: a  reason: collision with root package name */
    private final zzadt f5826a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f5827b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f5828c;

    /* renamed from: d  reason: collision with root package name */
    private final double f5829d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5830e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5831f;

    public zzadu(zzadt zzadt) {
        Drawable drawable;
        int i;
        this.f5826a = zzadt;
        Uri uri = null;
        try {
            IObjectWrapper E2 = zzadt.E2();
            if (E2 != null) {
                drawable = (Drawable) ObjectWrapper.V(E2);
                this.f5827b = drawable;
                uri = this.f5826a.k0();
                this.f5828c = uri;
                double d2 = 1.0d;
                d2 = this.f5826a.S3();
                this.f5829d = d2;
                int i2 = -1;
                i = this.f5826a.getWidth();
                this.f5830e = i;
                i2 = this.f5826a.getHeight();
                this.f5831f = i2;
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
        drawable = null;
        this.f5827b = drawable;
        try {
            uri = this.f5826a.k0();
        } catch (RemoteException e3) {
            zzbba.c("", e3);
        }
        this.f5828c = uri;
        double d22 = 1.0d;
        try {
            d22 = this.f5826a.S3();
        } catch (RemoteException e4) {
            zzbba.c("", e4);
        }
        this.f5829d = d22;
        int i22 = -1;
        try {
            i = this.f5826a.getWidth();
        } catch (RemoteException e5) {
            zzbba.c("", e5);
            i = -1;
        }
        this.f5830e = i;
        try {
            i22 = this.f5826a.getHeight();
        } catch (RemoteException e6) {
            zzbba.c("", e6);
        }
        this.f5831f = i22;
    }

    public final Drawable getDrawable() {
        return this.f5827b;
    }

    public final int getHeight() {
        return this.f5831f;
    }

    public final double getScale() {
        return this.f5829d;
    }

    public final Uri getUri() {
        return this.f5828c;
    }

    public final int getWidth() {
        return this.f5830e;
    }
}
