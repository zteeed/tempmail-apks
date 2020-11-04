package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zznw {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8921a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8922b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8923c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8924d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8925e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8926f;
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
            return this.f8921a == zznw.f8921a && this.f8922b == zznw.f8922b && this.f8923c == zznw.f8923c && this.f8925e == zznw.f8925e && this.f8926f == zznw.f8926f && this.i == zznw.i && this.g == zznw.g && this.h == zznw.h && this.f8924d == zznw.f8924d && TextUtils.equals((CharSequence) null, (CharSequence) null) && TextUtils.equals((CharSequence) null, (CharSequence) null);
        }
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.f8921a ? 1 : 0)) * 31) + this.f8922b) * 31) + this.f8923c) * 31) + this.f8924d) * 31) + (this.f8925e ? 1 : 0)) * 31) + (this.f8926f ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + this.g) * 31) + this.h;
    }

    private zznw(String str, String str2, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, int i5, int i6, boolean z5) {
        this.f8921a = true;
        this.f8922b = Integer.MAX_VALUE;
        this.f8923c = Integer.MAX_VALUE;
        this.f8924d = Integer.MAX_VALUE;
        this.f8925e = true;
        this.f8926f = true;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
    }
}
