package com.google.android.play.core.assetpacks;

final class g0 extends b {

    /* renamed from: a  reason: collision with root package name */
    private final String f11253a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11254b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11255c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11256d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11257e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11258f;

    g0(String str, int i, int i2, long j, long j2, int i3) {
        if (str != null) {
            this.f11253a = str;
            this.f11254b = i;
            this.f11255c = i2;
            this.f11256d = j;
            this.f11257e = j2;
            this.f11258f = i3;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final long c() {
        return this.f11256d;
    }

    public final int d() {
        return this.f11255c;
    }

    public final String e() {
        return this.f11253a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f11253a.equals(bVar.e()) && this.f11254b == bVar.f() && this.f11255c == bVar.d() && this.f11256d == bVar.c() && this.f11257e == bVar.g() && this.f11258f == bVar.h();
        }
    }

    public final int f() {
        return this.f11254b;
    }

    public final long g() {
        return this.f11257e;
    }

    public final int h() {
        return this.f11258f;
    }

    public final int hashCode() {
        int hashCode = this.f11253a.hashCode();
        int i = this.f11254b;
        int i2 = this.f11255c;
        long j = this.f11256d;
        long j2 = this.f11257e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f11258f;
    }

    public final String toString() {
        String str = this.f11253a;
        int i = this.f11254b;
        int i2 = this.f11255c;
        long j = this.f11256d;
        long j2 = this.f11257e;
        int i3 = this.f11258f;
        StringBuilder sb = new StringBuilder(str.length() + 185);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
