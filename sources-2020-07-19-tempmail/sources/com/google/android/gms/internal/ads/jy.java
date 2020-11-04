package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class jy extends zzdpn {

    /* renamed from: a  reason: collision with root package name */
    private final String f4168a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4169b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4170c;

    private jy(String str, boolean z, boolean z2) {
        this.f4168a = str;
        this.f4169b = z;
        this.f4170c = z2;
    }

    public final String a() {
        return this.f4168a;
    }

    public final boolean b() {
        return this.f4169b;
    }

    public final boolean d() {
        return this.f4170c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdpn) {
            zzdpn zzdpn = (zzdpn) obj;
            return this.f4168a.equals(zzdpn.a()) && this.f4169b == zzdpn.b() && this.f4170c == zzdpn.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.f4168a.hashCode() ^ 1000003) * 1000003) ^ (this.f4169b ? 1231 : 1237)) * 1000003;
        if (!this.f4170c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f4168a;
        boolean z = this.f4169b;
        boolean z2 = this.f4170c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
