package e;

import e.m0.e;
import e.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: MultipartBody */
public final class c0 extends h0 {

    /* renamed from: e  reason: collision with root package name */
    public static final b0 f14547e = b0.c("multipart/mixed");

    /* renamed from: f  reason: collision with root package name */
    public static final b0 f14548f = b0.c("multipart/form-data");
    private static final byte[] g = {58, 32};
    private static final byte[] h = {13, 10};
    private static final byte[] i = {45, 45};

    /* renamed from: a  reason: collision with root package name */
    private final ByteString f14549a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f14550b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f14551c;

    /* renamed from: d  reason: collision with root package name */
    private long f14552d = -1;

    /* compiled from: MultipartBody */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ByteString f14553a;

        /* renamed from: b  reason: collision with root package name */
        private b0 f14554b;

        /* renamed from: c  reason: collision with root package name */
        private final List<b> f14555c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a a(String str, String str2) {
            d(b.b(str, str2));
            return this;
        }

        public a b(String str, @Nullable String str2, h0 h0Var) {
            d(b.c(str, str2, h0Var));
            return this;
        }

        public a c(@Nullable y yVar, h0 h0Var) {
            d(b.a(yVar, h0Var));
            return this;
        }

        public a d(b bVar) {
            if (bVar != null) {
                this.f14555c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public c0 e() {
            if (!this.f14555c.isEmpty()) {
                return new c0(this.f14553a, this.f14554b, this.f14555c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public a f(b0 b0Var) {
            if (b0Var == null) {
                throw new NullPointerException("type == null");
            } else if (b0Var.e().equals("multipart")) {
                this.f14554b = b0Var;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + b0Var);
            }
        }

        public a(String str) {
            this.f14554b = c0.f14547e;
            this.f14555c = new ArrayList();
            this.f14553a = ByteString.encodeUtf8(str);
        }
    }

    /* compiled from: MultipartBody */
    public static final class b {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        final y f14556a;

        /* renamed from: b  reason: collision with root package name */
        final h0 f14557b;

        private b(@Nullable y yVar, h0 h0Var) {
            this.f14556a = yVar;
            this.f14557b = h0Var;
        }

        public static b a(@Nullable y yVar, h0 h0Var) {
            if (h0Var == null) {
                throw new NullPointerException("body == null");
            } else if (yVar != null && yVar.c("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (yVar == null || yVar.c("Content-Length") == null) {
                return new b(yVar, h0Var);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static b b(String str, String str2) {
            return c(str, (String) null, h0.create((b0) null, str2));
        }

        public static b c(String str, @Nullable String str2, h0 h0Var) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                c0.a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    c0.a(sb, str2);
                }
                y.a aVar = new y.a();
                aVar.e("Content-Disposition", sb.toString());
                return a(aVar.f(), h0Var);
            }
            throw new NullPointerException("name == null");
        }
    }

    static {
        b0.c("multipart/alternative");
        b0.c("multipart/digest");
        b0.c("multipart/parallel");
    }

    c0(ByteString byteString, b0 b0Var, List<b> list) {
        this.f14549a = byteString;
        this.f14550b = b0.c(b0Var + "; boundary=" + byteString.utf8());
        this.f14551c = e.s(list);
    }

    static void a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: okio.BufferedSink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: okio.Buffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: okio.Buffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: okio.BufferedSink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: okio.Buffer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long b(@javax.annotation.Nullable okio.BufferedSink r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            okio.Buffer r13 = new okio.Buffer
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<e.c0$b> r1 = r12.f14551c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a6
            java.util.List<e.c0$b> r6 = r12.f14551c
            java.lang.Object r6 = r6.get(r5)
            e.c0$b r6 = (e.c0.b) r6
            e.y r7 = r6.f14556a
            e.h0 r6 = r6.f14557b
            byte[] r8 = i
            r13.write((byte[]) r8)
            okio.ByteString r8 = r12.f14549a
            r13.write((okio.ByteString) r8)
            byte[] r8 = h
            r13.write((byte[]) r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.h()
            r9 = 0
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.e(r9)
            okio.BufferedSink r10 = r13.writeUtf8(r10)
            byte[] r11 = g
            okio.BufferedSink r10 = r10.write((byte[]) r11)
            java.lang.String r11 = r7.i(r9)
            okio.BufferedSink r10 = r10.writeUtf8(r11)
            byte[] r11 = h
            r10.write((byte[]) r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            e.b0 r7 = r6.contentType()
            if (r7 == 0) goto L_0x0071
            java.lang.String r8 = "Content-Type: "
            okio.BufferedSink r8 = r13.writeUtf8(r8)
            java.lang.String r7 = r7.toString()
            okio.BufferedSink r7 = r8.writeUtf8(r7)
            byte[] r8 = h
            r7.write((byte[]) r8)
        L_0x0071:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008b
            java.lang.String r9 = "Content-Length: "
            okio.BufferedSink r9 = r13.writeUtf8(r9)
            okio.BufferedSink r9 = r9.writeDecimalLong(r7)
            byte[] r10 = h
            r9.write((byte[]) r10)
            goto L_0x0091
        L_0x008b:
            if (r14 == 0) goto L_0x0091
            r0.clear()
            return r9
        L_0x0091:
            byte[] r9 = h
            r13.write((byte[]) r9)
            if (r14 == 0) goto L_0x009a
            long r3 = r3 + r7
            goto L_0x009d
        L_0x009a:
            r6.writeTo(r13)
        L_0x009d:
            byte[] r6 = h
            r13.write((byte[]) r6)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a6:
            byte[] r1 = i
            r13.write((byte[]) r1)
            okio.ByteString r1 = r12.f14549a
            r13.write((okio.ByteString) r1)
            byte[] r1 = i
            r13.write((byte[]) r1)
            byte[] r1 = h
            r13.write((byte[]) r1)
            if (r14 == 0) goto L_0x00c4
            long r13 = r0.size()
            long r3 = r3 + r13
            r0.clear()
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c0.b(okio.BufferedSink, boolean):long");
    }

    public long contentLength() throws IOException {
        long j = this.f14552d;
        if (j != -1) {
            return j;
        }
        long b2 = b((BufferedSink) null, true);
        this.f14552d = b2;
        return b2;
    }

    public b0 contentType() {
        return this.f14550b;
    }

    public void writeTo(BufferedSink bufferedSink) throws IOException {
        b(bufferedSink, false);
    }
}
