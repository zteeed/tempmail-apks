package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class zh implements zzdrx {

    /* renamed from: a  reason: collision with root package name */
    private final String f5652a;

    /* renamed from: b  reason: collision with root package name */
    private final double f5653b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5654c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5655d;

    zh(String str, double d2, int i, int i2) {
        this.f5652a = str;
        this.f5653b = d2;
        this.f5654c = i;
        this.f5655d = i2;
    }

    public final Object apply(Object obj) {
        String str = this.f5652a;
        return new zzadf(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f5653b, this.f5654c, this.f5655d);
    }
}
