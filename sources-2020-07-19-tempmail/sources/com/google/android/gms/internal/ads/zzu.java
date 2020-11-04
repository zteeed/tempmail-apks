package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzu {

    /* renamed from: a  reason: collision with root package name */
    private final String f9162a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9163b;

    public zzu(String str, String str2) {
        this.f9162a = str;
        this.f9163b = str2;
    }

    public final String a() {
        return this.f9162a;
    }

    public final String b() {
        return this.f9163b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzu.class == obj.getClass()) {
            zzu zzu = (zzu) obj;
            return TextUtils.equals(this.f9162a, zzu.f9162a) && TextUtils.equals(this.f9163b, zzu.f9163b);
        }
    }

    public final int hashCode() {
        return (this.f9162a.hashCode() * 31) + this.f9163b.hashCode();
    }

    public final String toString() {
        String str = this.f9162a;
        String str2 = this.f9163b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
