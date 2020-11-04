package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zznw {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9104a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9105b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9106c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9107d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9108e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9109f;
    public final int g;
    public final int h;
    public final boolean i;

    public zznw() {
        this((String) null, (String) null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznw.class == obj.getClass()) {
            zznw zznw = (zznw) obj;
            return this.f9104a == zznw.f9104a && this.f9105b == zznw.f9105b && this.f9106c == zznw.f9106c && this.f9108e == zznw.f9108e && this.f9109f == zznw.f9109f && this.i == zznw.i && this.g == zznw.g && this.h == zznw.h && this.f9107d == zznw.f9107d && TextUtils.equals((CharSequence) null, (CharSequence) null) && TextUtils.equals((CharSequence) null, (CharSequence) null);
        }
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.f9104a ? 1 : 0)) * 31) + this.f9105b) * 31) + this.f9106c) * 31) + this.f9107d) * 31) + (this.f9108e ? 1 : 0)) * 31) + (this.f9109f ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + this.g) * 31) + this.h;
    }

    private zznw(String str, String str2, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, int i5, int i6, boolean z5) {
        this.f9104a = true;
        this.f9105b = Integer.MAX_VALUE;
        this.f9106c = Integer.MAX_VALUE;
        this.f9107d = Integer.MAX_VALUE;
        this.f9108e = true;
        this.f9109f = true;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
    }
}
