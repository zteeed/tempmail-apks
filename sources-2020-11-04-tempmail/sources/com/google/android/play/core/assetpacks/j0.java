package com.google.android.play.core.assetpacks;

import java.util.Arrays;

final class j0 extends q2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f11296a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11297b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11298c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11299d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f11300e;

    j0(String str, long j, int i, boolean z, byte[] bArr) {
        this.f11296a = str;
        this.f11297b = j;
        this.f11298c = i;
        this.f11299d = z;
        this.f11300e = bArr;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return this.f11296a;
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return this.f11297b;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.f11298c;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return this.f11299d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            String str = this.f11296a;
            if (str == null ? q2Var.b() == null : str.equals(q2Var.b())) {
                if (this.f11297b == q2Var.c() && this.f11298c == q2Var.d() && this.f11299d == q2Var.e()) {
                    if (Arrays.equals(this.f11300e, q2Var instanceof j0 ? ((j0) q2Var).f11300e : q2Var.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final byte[] f() {
        return this.f11300e;
    }

    public final int hashCode() {
        String str = this.f11296a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f11297b;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f11298c) * 1000003) ^ (true != this.f11299d ? 1237 : 1231)) * 1000003) ^ Arrays.hashCode(this.f11300e);
    }

    public final String toString() {
        String str = this.f11296a;
        long j = this.f11297b;
        int i = this.f11298c;
        boolean z = this.f11299d;
        String arrays = Arrays.toString(this.f11300e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
