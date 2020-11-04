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
    private final zzadt f5643a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f5644b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f5645c;

    /* renamed from: d  reason: collision with root package name */
    private final double f5646d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5647e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5648f;

    public zzadu(zzadt zzadt) {
        Drawable drawable;
        int i;
        this.f5643a = zzadt;
        Uri uri = null;
        try {
            IObjectWrapper s2 = zzadt.s2();
            if (s2 != null) {
                drawable = (Drawable) ObjectWrapper.P(s2);
                this.f5644b = drawable;
                uri = this.f5643a.e0();
                this.f5645c = uri;
                double d2 = 1.0d;
                d2 = this.f5643a.E3();
                this.f5646d = d2;
                int i2 = -1;
                i = this.f5643a.getWidth();
                this.f5647e = i;
                i2 = this.f5643a.getHeight();
                this.f5648f = i2;
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
        drawable = null;
        this.f5644b = drawable;
        try {
            uri = this.f5643a.e0();
        } catch (RemoteException e3) {
            zzbba.c("", e3);
        }
        this.f5645c = uri;
        double d22 = 1.0d;
        try {
            d22 = this.f5643a.E3();
        } catch (RemoteException e4) {
            zzbba.c("", e4);
        }
        this.f5646d = d22;
        int i22 = -1;
        try {
            i = this.f5643a.getWidth();
        } catch (RemoteException e5) {
            zzbba.c("", e5);
            i = -1;
        }
        this.f5647e = i;
        try {
            i22 = this.f5643a.getHeight();
        } catch (RemoteException e6) {
            zzbba.c("", e6);
        }
        this.f5648f = i22;
    }

    public final Drawable getDrawable() {
        return this.f5644b;
    }

    public final int getHeight() {
        return this.f5648f;
    }

    public final double getScale() {
        return this.f5646d;
    }

    public final Uri getUri() {
        return this.f5645c;
    }

    public final int getWidth() {
        return this.f5647e;
    }
}
