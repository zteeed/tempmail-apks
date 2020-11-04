package okhttp3.internal.http2;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* compiled from: Hpack */
final class c {

    /* renamed from: a  reason: collision with root package name */
    static final b[] f14317a = {new b(b.i, ""), new b(b.f14313f, "GET"), new b(b.f14313f, "POST"), new b(b.g, "/"), new b(b.g, "/index.html"), new b(b.h, "http"), new b(b.h, "https"), new b(b.f14312e, "200"), new b(b.f14312e, "204"), new b(b.f14312e, "206"), new b(b.f14312e, "304"), new b(b.f14312e, "400"), new b(b.f14312e, "404"), new b(b.f14312e, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};

    /* renamed from: b  reason: collision with root package name */
    static final Map<ByteString, Integer> f14318b = b();

    /* compiled from: Hpack */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<b> f14319a;

        /* renamed from: b  reason: collision with root package name */
        private final BufferedSource f14320b;

        /* renamed from: c  reason: collision with root package name */
        private final int f14321c;

        /* renamed from: d  reason: collision with root package name */
        private int f14322d;

        /* renamed from: e  reason: collision with root package name */
        b[] f14323e;

        /* renamed from: f  reason: collision with root package name */
        int f14324f;
        int g;
        int h;

        a(int i, Source source) {
            this(i, i, source);
        }

        private void a() {
            int i = this.f14322d;
            int i2 = this.h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                b();
            } else {
                d(i2 - i);
            }
        }

        private void b() {
            Arrays.fill(this.f14323e, (Object) null);
            this.f14324f = this.f14323e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private int c(int i) {
            return this.f14324f + 1 + i;
        }

        private int d(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f14323e.length;
                while (true) {
                    length--;
                    if (length < this.f14324f || i <= 0) {
                        b[] bVarArr = this.f14323e;
                        int i3 = this.f14324f;
                        System.arraycopy(bVarArr, i3 + 1, bVarArr, i3 + 1 + i2, this.g);
                        this.f14324f += i2;
                    } else {
                        b[] bVarArr2 = this.f14323e;
                        i -= bVarArr2[length].f14316c;
                        this.h -= bVarArr2[length].f14316c;
                        this.g--;
                        i2++;
                    }
                }
                b[] bVarArr3 = this.f14323e;
                int i32 = this.f14324f;
                System.arraycopy(bVarArr3, i32 + 1, bVarArr3, i32 + 1 + i2, this.g);
                this.f14324f += i2;
            }
            return i2;
        }

        private ByteString f(int i) throws IOException {
            if (h(i)) {
                return c.f14317a[i].f14314a;
            }
            int c2 = c(i - c.f14317a.length);
            if (c2 >= 0) {
                b[] bVarArr = this.f14323e;
                if (c2 < bVarArr.length) {
                    return bVarArr[c2].f14314a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void g(int i, b bVar) {
            this.f14319a.add(bVar);
            int i2 = bVar.f14316c;
            if (i != -1) {
                i2 -= this.f14323e[c(i)].f14316c;
            }
            int i3 = this.f14322d;
            if (i2 > i3) {
                b();
                return;
            }
            int d2 = d((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                b[] bVarArr = this.f14323e;
                if (i4 > bVarArr.length) {
                    b[] bVarArr2 = new b[(bVarArr.length * 2)];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f14324f = this.f14323e.length - 1;
                    this.f14323e = bVarArr2;
                }
                int i5 = this.f14324f;
                this.f14324f = i5 - 1;
                this.f14323e[i5] = bVar;
                this.g++;
            } else {
                this.f14323e[i + c(i) + d2] = bVar;
            }
            this.h += i2;
        }

        private boolean h(int i) {
            return i >= 0 && i <= c.f14317a.length - 1;
        }

        private int i() throws IOException {
            return this.f14320b.readByte() & 255;
        }

        private void l(int i) throws IOException {
            if (h(i)) {
                this.f14319a.add(c.f14317a[i]);
                return;
            }
            int c2 = c(i - c.f14317a.length);
            if (c2 >= 0) {
                b[] bVarArr = this.f14323e;
                if (c2 < bVarArr.length) {
                    this.f14319a.add(bVarArr[c2]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void n(int i) throws IOException {
            g(-1, new b(f(i), j()));
        }

        private void o() throws IOException {
            ByteString j = j();
            c.a(j);
            g(-1, new b(j, j()));
        }

        private void p(int i) throws IOException {
            this.f14319a.add(new b(f(i), j()));
        }

        private void q() throws IOException {
            ByteString j = j();
            c.a(j);
            this.f14319a.add(new b(j, j()));
        }

        public List<b> e() {
            ArrayList arrayList = new ArrayList(this.f14319a);
            this.f14319a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public ByteString j() throws IOException {
            int i = i();
            boolean z = (i & 128) == 128;
            int m = m(i, 127);
            if (z) {
                return ByteString.of(j.f().c(this.f14320b.readByteArray((long) m)));
            }
            return this.f14320b.readByteString((long) m);
        }

        /* access modifiers changed from: package-private */
        public void k() throws IOException {
            while (!this.f14320b.exhausted()) {
                byte readByte = this.f14320b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    l(m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    o();
                } else if ((readByte & 64) == 64) {
                    n(m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m = m(readByte, 31);
                    this.f14322d = m;
                    if (m < 0 || m > this.f14321c) {
                        throw new IOException("Invalid dynamic table size update " + this.f14322d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    q();
                } else {
                    p(m(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        a(int i, int i2, Source source) {
            this.f14319a = new ArrayList();
            b[] bVarArr = new b[8];
            this.f14323e = bVarArr;
            this.f14324f = bVarArr.length - 1;
            this.g = 0;
            this.h = 0;
            this.f14321c = i;
            this.f14322d = i2;
            this.f14320b = Okio.buffer(source);
        }
    }

    /* compiled from: Hpack */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Buffer f14325a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f14326b;

        /* renamed from: c  reason: collision with root package name */
        private int f14327c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f14328d;

        /* renamed from: e  reason: collision with root package name */
        int f14329e;

        /* renamed from: f  reason: collision with root package name */
        b[] f14330f;
        int g;
        int h;
        int i;

        b(Buffer buffer) {
            this(CodedOutputStream.DEFAULT_BUFFER_SIZE, true, buffer);
        }

        private void a() {
            int i2 = this.f14329e;
            int i3 = this.i;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                c(i3 - i2);
            }
        }

        private void b() {
            Arrays.fill(this.f14330f, (Object) null);
            this.g = this.f14330f.length - 1;
            this.h = 0;
            this.i = 0;
        }

        private int c(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.f14330f.length;
                while (true) {
                    length--;
                    if (length < this.g || i2 <= 0) {
                        b[] bVarArr = this.f14330f;
                        int i4 = this.g;
                        System.arraycopy(bVarArr, i4 + 1, bVarArr, i4 + 1 + i3, this.h);
                        b[] bVarArr2 = this.f14330f;
                        int i5 = this.g;
                        Arrays.fill(bVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                        this.g += i3;
                    } else {
                        b[] bVarArr3 = this.f14330f;
                        i2 -= bVarArr3[length].f14316c;
                        this.i -= bVarArr3[length].f14316c;
                        this.h--;
                        i3++;
                    }
                }
                b[] bVarArr4 = this.f14330f;
                int i42 = this.g;
                System.arraycopy(bVarArr4, i42 + 1, bVarArr4, i42 + 1 + i3, this.h);
                b[] bVarArr22 = this.f14330f;
                int i52 = this.g;
                Arrays.fill(bVarArr22, i52 + 1, i52 + 1 + i3, (Object) null);
                this.g += i3;
            }
            return i3;
        }

        private void d(b bVar) {
            int i2 = bVar.f14316c;
            int i3 = this.f14329e;
            if (i2 > i3) {
                b();
                return;
            }
            c((this.i + i2) - i3);
            int i4 = this.h + 1;
            b[] bVarArr = this.f14330f;
            if (i4 > bVarArr.length) {
                b[] bVarArr2 = new b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.g = this.f14330f.length - 1;
                this.f14330f = bVarArr2;
            }
            int i5 = this.g;
            this.g = i5 - 1;
            this.f14330f[i5] = bVar;
            this.h++;
            this.i += i2;
        }

        /* access modifiers changed from: package-private */
        public void e(int i2) {
            int min = Math.min(i2, 16384);
            int i3 = this.f14329e;
            if (i3 != min) {
                if (min < i3) {
                    this.f14327c = Math.min(this.f14327c, min);
                }
                this.f14328d = true;
                this.f14329e = min;
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void f(ByteString byteString) throws IOException {
            if (!this.f14326b || j.f().e(byteString) >= byteString.size()) {
                h(byteString.size(), 127, 0);
                this.f14325a.write(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            j.f().d(byteString, buffer);
            ByteString readByteString = buffer.readByteString();
            h(readByteString.size(), 127, 128);
            this.f14325a.write(readByteString);
        }

        /* access modifiers changed from: package-private */
        public void g(List<b> list) throws IOException {
            int i2;
            int i3;
            if (this.f14328d) {
                int i4 = this.f14327c;
                if (i4 < this.f14329e) {
                    h(i4, 31, 32);
                }
                this.f14328d = false;
                this.f14327c = Integer.MAX_VALUE;
                h(this.f14329e, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                b bVar = list.get(i5);
                ByteString asciiLowercase = bVar.f14314a.toAsciiLowercase();
                ByteString byteString = bVar.f14315b;
                Integer num = c.f14318b.get(asciiLowercase);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (Objects.equals(c.f14317a[i3 - 1].f14315b, byteString)) {
                            i2 = i3;
                        } else if (Objects.equals(c.f14317a[i3].f14315b, byteString)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.g + 1;
                    int length = this.f14330f.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f14330f[i6].f14314a, asciiLowercase)) {
                            if (Objects.equals(this.f14330f[i6].f14315b, byteString)) {
                                i3 = c.f14317a.length + (i6 - this.g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i6 - this.g) + c.f14317a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i3 != -1) {
                    h(i3, 127, 128);
                } else if (i2 == -1) {
                    this.f14325a.writeByte(64);
                    f(asciiLowercase);
                    f(byteString);
                    d(bVar);
                } else if (!asciiLowercase.startsWith(b.f14311d) || b.i.equals(asciiLowercase)) {
                    h(i2, 63, 64);
                    f(byteString);
                    d(bVar);
                } else {
                    h(i2, 15, 0);
                    f(byteString);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.f14325a.writeByte(i2 | i4);
                return;
            }
            this.f14325a.writeByte(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.f14325a.writeByte(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.f14325a.writeByte(i5);
        }

        b(int i2, boolean z, Buffer buffer) {
            this.f14327c = Integer.MAX_VALUE;
            b[] bVarArr = new b[8];
            this.f14330f = bVarArr;
            this.g = bVarArr.length - 1;
            this.h = 0;
            this.i = 0;
            this.f14329e = i2;
            this.f14326b = z;
            this.f14325a = buffer;
        }
    }

    static ByteString a(ByteString byteString) throws IOException {
        int size = byteString.size();
        int i = 0;
        while (i < size) {
            byte b2 = byteString.getByte(i);
            if (b2 < 65 || b2 > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    private static Map<ByteString, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f14317a.length);
        int i = 0;
        while (true) {
            b[] bVarArr = f14317a;
            if (i >= bVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(bVarArr[i].f14314a)) {
                linkedHashMap.put(f14317a[i].f14314a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
