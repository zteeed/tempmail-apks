package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class zh implements zzdrx {

    /* renamed from: a  reason: collision with root package name */
    private final String f5469a;

    /* renamed from: b  reason: collision with root package name */
    private final double f5470b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5471c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5472d;

    zh(String str, double d2, int i, int i2) {
        this.f5469a = str;
        this.f5470b = d2;
        this.f5471c = i;
        this.f5472d = i2;
    }

    public final Object apply(Object obj) {
        String str = this.f5469a;
        return new zzadf(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f5470b, this.f5471c, this.f5472d);
    }
}
