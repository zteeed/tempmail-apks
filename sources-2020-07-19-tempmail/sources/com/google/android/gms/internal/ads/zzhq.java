package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzhq implements Parcelable {
    public static final Parcelable.Creator<zzhq> CREATOR = new ua0();
    private final int A;
    private int B;

    /* renamed from: b  reason: collision with root package name */
    private final String f8732b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8733c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8734d;

    /* renamed from: e  reason: collision with root package name */
    private final zzme f8735e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8736f;
    public final String g;
    public final int h;
    public final List<byte[]> i;
    public final zzjl j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final float o;
    private final int p;
    private final byte[] q;
    private final zzpt r;
    public final int s;
    public final int t;
    public final int u;
    private final int v;
    private final int w;
    public final long x;
    public final int y;
    public final String z;

    private zzhq(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, zzpt zzpt, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List<byte[]> list, zzjl zzjl, zzme zzme) {
        this.f8732b = str;
        this.f8736f = str2;
        this.g = str3;
        this.f8734d = str4;
        this.f8733c = i2;
        this.h = i3;
        this.k = i4;
        this.l = i5;
        this.m = f2;
        this.n = i6;
        this.o = f3;
        this.q = bArr;
        this.p = i7;
        this.r = zzpt;
        this.s = i8;
        this.t = i9;
        this.u = i10;
        this.v = i11;
        this.w = i12;
        this.y = i13;
        this.z = str5;
        this.A = i14;
        this.x = j2;
        this.i = list == null ? Collections.emptyList() : list;
        this.j = zzjl;
        this.f8735e = zzme;
    }

    public static zzhq c(String str, String str2, long j2) {
        return new zzhq((String) null, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzpt) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzjl) null, (zzme) null);
    }

    public static zzhq d(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, zzpt zzpt, zzjl zzjl) {
        return new zzhq(str, (String) null, str2, (String) null, -1, i3, i4, i5, -1.0f, i6, f3, bArr, i7, zzpt, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, zzjl, (zzme) null);
    }

    public static zzhq e(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, zzjl zzjl, int i7, String str4) {
        return new zzhq(str, (String) null, str2, (String) null, -1, i3, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzpt) null, i4, i5, i6, -1, -1, i7, str4, -1, Long.MAX_VALUE, list, zzjl, (zzme) null);
    }

    public static zzhq f(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, zzjl zzjl, int i6, String str4) {
        return e(str, str2, (String) null, -1, -1, i4, i5, -1, (List<byte[]>) null, zzjl, 0, str4);
    }

    public static zzhq g(String str, String str2, String str3, int i2, int i3, String str4, int i4, zzjl zzjl, long j2, List<byte[]> list) {
        return new zzhq(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzpt) null, -1, -1, -1, -1, -1, i3, str4, -1, j2, list, zzjl, (zzme) null);
    }

    public static zzhq h(String str, String str2, String str3, int i2, int i3, String str4, zzjl zzjl) {
        return g(str, str2, (String) null, -1, i3, str4, -1, zzjl, Long.MAX_VALUE, Collections.emptyList());
    }

    public static zzhq i(String str, String str2, String str3, int i2, zzjl zzjl) {
        return new zzhq(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzpt) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, zzjl, (zzme) null);
    }

    public static zzhq j(String str, String str2, String str3, int i2, List<byte[]> list, String str4, zzjl zzjl) {
        return new zzhq(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzpt) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzjl, (zzme) null);
    }

    @TargetApi(16)
    private static void k(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public final zzhq a(zzjl zzjl) {
        String str = this.f8732b;
        return new zzhq(str, this.f8736f, this.g, this.f8734d, this.f8733c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, this.x, this.i, zzjl, this.f8735e);
    }

    public final zzhq b(zzme zzme) {
        String str = this.f8732b;
        return new zzhq(str, this.f8736f, this.g, this.f8734d, this.f8733c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, this.x, this.i, this.j, zzme);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhq.class == obj.getClass()) {
            zzhq zzhq = (zzhq) obj;
            if (this.f8733c == zzhq.f8733c && this.h == zzhq.h && this.k == zzhq.k && this.l == zzhq.l && this.m == zzhq.m && this.n == zzhq.n && this.o == zzhq.o && this.p == zzhq.p && this.s == zzhq.s && this.t == zzhq.t && this.u == zzhq.u && this.v == zzhq.v && this.w == zzhq.w && this.x == zzhq.x && this.y == zzhq.y && zzpo.g(this.f8732b, zzhq.f8732b) && zzpo.g(this.z, zzhq.z) && this.A == zzhq.A && zzpo.g(this.f8736f, zzhq.f8736f) && zzpo.g(this.g, zzhq.g) && zzpo.g(this.f8734d, zzhq.f8734d) && zzpo.g(this.j, zzhq.j) && zzpo.g(this.f8735e, zzhq.f8735e) && zzpo.g(this.r, zzhq.r) && Arrays.equals(this.q, zzhq.q) && this.i.size() == zzhq.i.size()) {
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    if (!Arrays.equals(this.i.get(i2), zzhq.i.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.B == 0) {
            String str = this.f8732b;
            int i2 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f8736f;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f8734d;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f8733c) * 31) + this.k) * 31) + this.l) * 31) + this.s) * 31) + this.t) * 31;
            String str5 = this.z;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.A) * 31;
            zzjl zzjl = this.j;
            int hashCode6 = (hashCode5 + (zzjl == null ? 0 : zzjl.hashCode())) * 31;
            zzme zzme = this.f8735e;
            if (zzme != null) {
                i2 = zzme.hashCode();
            }
            this.B = hashCode6 + i2;
        }
        return this.B;
    }

    public final zzhq l(int i2, int i3) {
        String str = this.f8732b;
        return new zzhq(str, this.f8736f, this.g, this.f8734d, this.f8733c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, i2, i3, this.y, this.z, this.A, this.x, this.i, this.j, this.f8735e);
    }

    public final zzhq m(long j2) {
        return new zzhq(this.f8732b, this.f8736f, this.g, this.f8734d, this.f8733c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, j2, this.i, this.j, this.f8735e);
    }

    public final int n() {
        int i2;
        int i3 = this.k;
        if (i3 == -1 || (i2 = this.l) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat o() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.g);
        String str = this.z;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        k(mediaFormat, "max-input-size", this.h);
        k(mediaFormat, "width", this.k);
        k(mediaFormat, "height", this.l);
        float f2 = this.m;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        k(mediaFormat, "rotation-degrees", this.n);
        k(mediaFormat, "channel-count", this.s);
        k(mediaFormat, "sample-rate", this.t);
        k(mediaFormat, "encoder-delay", this.v);
        k(mediaFormat, "encoder-padding", this.w);
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.i.get(i2)));
        }
        zzpt zzpt = this.r;
        if (zzpt != null) {
            k(mediaFormat, "color-transfer", zzpt.f9005d);
            k(mediaFormat, "color-standard", zzpt.f9003b);
            k(mediaFormat, "color-range", zzpt.f9004c);
            byte[] bArr = zzpt.f9006e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final zzhq p(int i2) {
        String str = this.f8732b;
        return new zzhq(str, this.f8736f, this.g, this.f8734d, this.f8733c, i2, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, this.x, this.i, this.j, this.f8735e);
    }

    public final String toString() {
        String str = this.f8732b;
        String str2 = this.f8736f;
        String str3 = this.g;
        int i2 = this.f8733c;
        String str4 = this.z;
        int i3 = this.k;
        int i4 = this.l;
        float f2 = this.m;
        int i5 = this.s;
        int i6 = this.t;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f8732b);
        parcel.writeString(this.f8736f);
        parcel.writeString(this.g);
        parcel.writeString(this.f8734d);
        parcel.writeInt(this.f8733c);
        parcel.writeInt(this.h);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.n);
        parcel.writeFloat(this.o);
        parcel.writeInt(this.q != null ? 1 : 0);
        byte[] bArr = this.q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.p);
        parcel.writeParcelable(this.r, i2);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A);
        parcel.writeLong(this.x);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.i.get(i3));
        }
        parcel.writeParcelable(this.j, 0);
        parcel.writeParcelable(this.f8735e, 0);
    }

    zzhq(Parcel parcel) {
        this.f8732b = parcel.readString();
        this.f8736f = parcel.readString();
        this.g = parcel.readString();
        this.f8734d = parcel.readString();
        this.f8733c = parcel.readInt();
        this.h = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readFloat();
        this.n = parcel.readInt();
        this.o = parcel.readFloat();
        this.q = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.p = parcel.readInt();
        this.r = (zzpt) parcel.readParcelable(zzpt.class.getClassLoader());
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readString();
        this.A = parcel.readInt();
        this.x = parcel.readLong();
        int readInt = parcel.readInt();
        this.i = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.i.add(parcel.createByteArray());
        }
        this.j = (zzjl) parcel.readParcelable(zzjl.class.getClassLoader());
        this.f8735e = (zzme) parcel.readParcelable(zzme.class.getClassLoader());
    }
}
