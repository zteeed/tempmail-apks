package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzu {

    /* renamed from: a  reason: collision with root package name */
    private final String f9345a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9346b;

    public zzu(String str, String str2) {
        this.f9345a = str;
        this.f9346b = str2;
    }

    public final String a() {
        return this.f9345a;
    }

    public final String b() {
        return this.f9346b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzu.class == obj.getClass()) {
            zzu zzu = (zzu) obj;
            return TextUtils.equals(this.f9345a, zzu.f9345a) && TextUtils.equals(this.f9346b, zzu.f9346b);
        }
    }

    public final int hashCode() {
        return (this.f9345a.hashCode() * 31) + this.f9346b.hashCode();
    }

    public final String toString() {
        String str = this.f9345a;
        String str2 = this.f9346b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
