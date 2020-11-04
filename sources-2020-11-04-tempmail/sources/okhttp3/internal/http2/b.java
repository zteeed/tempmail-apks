package okhttp3.internal.http2;

import e.m0.e;
import okio.ByteString;

/* compiled from: Header */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final ByteString f14872d = ByteString.encodeUtf8(":");

    /* renamed from: e  reason: collision with root package name */
    public static final ByteString f14873e = ByteString.encodeUtf8(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final ByteString f14874f = ByteString.encodeUtf8(":method");
    public static final ByteString g = ByteString.encodeUtf8(":path");
    public static final ByteString h = ByteString.encodeUtf8(":scheme");
    public static final ByteString i = ByteString.encodeUtf8(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final ByteString f14875a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteString f14876b;

    /* renamed from: c  reason: collision with root package name */
    final int f14877c;

    public b(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f14875a.equals(bVar.f14875a) || !this.f14876b.equals(bVar.f14876b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f14875a.hashCode()) * 31) + this.f14876b.hashCode();
    }

    public String toString() {
        return e.p("%s: %s", this.f14875a.utf8(), this.f14876b.utf8());
    }

    public b(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public b(ByteString byteString, ByteString byteString2) {
        this.f14875a = byteString;
        this.f14876b = byteString2;
        this.f14877c = byteString.size() + 32 + byteString2.size();
    }
}
