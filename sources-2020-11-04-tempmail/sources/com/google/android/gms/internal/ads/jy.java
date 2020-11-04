package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class jy extends zzdpn {

    /* renamed from: a  reason: collision with root package name */
    private final String f4351a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4352b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4353c;

    private jy(String str, boolean z, boolean z2) {
        this.f4351a = str;
        this.f4352b = z;
        this.f4353c = z2;
    }

    public final String a() {
        return this.f4351a;
    }

    public final boolean b() {
        return this.f4352b;
    }

    public final boolean d() {
        return this.f4353c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdpn) {
            zzdpn zzdpn = (zzdpn) obj;
            return this.f4351a.equals(zzdpn.a()) && this.f4352b == zzdpn.b() && this.f4353c == zzdpn.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.f4351a.hashCode() ^ 1000003) * 1000003) ^ (this.f4352b ? 1231 : 1237)) * 1000003;
        if (!this.f4353c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f4351a;
        boolean z = this.f4352b;
        boolean z2 = this.f4353c;
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
