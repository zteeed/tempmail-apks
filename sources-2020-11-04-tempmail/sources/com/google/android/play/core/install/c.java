package com.google.android.play.core.install;

final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final int f11470a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11471b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11472c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11473d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11474e;

    c(int i, long j, long j2, int i2, String str) {
        this.f11470a = i;
        this.f11471b = j;
        this.f11472c = j2;
        this.f11473d = i2;
        if (str != null) {
            this.f11474e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final long b() {
        return this.f11471b;
    }

    public final int c() {
        return this.f11473d;
    }

    public final int d() {
        return this.f11470a;
    }

    public final String e() {
        return this.f11474e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f11470a == aVar.d() && this.f11471b == aVar.b() && this.f11472c == aVar.f() && this.f11473d == aVar.c() && this.f11474e.equals(aVar.e());
        }
    }

    public final long f() {
        return this.f11472c;
    }

    public final int hashCode() {
        int i = this.f11470a;
        long j = this.f11471b;
        long j2 = this.f11472c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f11473d) * 1000003) ^ this.f11474e.hashCode();
    }

    public final String toString() {
        int i = this.f11470a;
        long j = this.f11471b;
        long j2 = this.f11472c;
        int i2 = this.f11473d;
        String str = this.f11474e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
