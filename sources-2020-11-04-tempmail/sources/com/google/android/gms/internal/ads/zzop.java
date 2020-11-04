package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzop {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f9133a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f9134b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9135c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9136d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9137e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9138f;
    public final int g;

    public zzop(Uri uri) {
        this(uri, 0);
    }

    public final boolean a(int i) {
        return (this.g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9133a);
        String arrays = Arrays.toString(this.f9134b);
        long j = this.f9135c;
        long j2 = this.f9136d;
        long j3 = this.f9137e;
        String str = this.f9138f;
        int i = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    private zzop(Uri uri, int i) {
        this(uri, 0, -1, (String) null, 0);
    }

    public zzop(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    private zzop(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, (String) null, 0);
    }

    private zzop(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public zzop(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        zzpb.a(j >= 0);
        zzpb.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        zzpb.a(z);
        this.f9133a = uri;
        this.f9134b = bArr;
        this.f9135c = j;
        this.f9136d = j2;
        this.f9137e = j3;
        this.f9138f = str;
        this.g = i;
    }
}
