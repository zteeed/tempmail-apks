package com.tempmail.utils;

import e.a0;
import e.m0.j.f;
import e.y;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.Buffer;

/* compiled from: MyHttpLoggingInterceptor */
public final class p implements a0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Charset f13122c = StandardCharsets.UTF_8;

    /* renamed from: a  reason: collision with root package name */
    private final b f13123a;

    /* renamed from: b  reason: collision with root package name */
    private volatile a f13124b;

    /* compiled from: MyHttpLoggingInterceptor */
    public enum a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: MyHttpLoggingInterceptor */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13130a = new a();

        /* compiled from: MyHttpLoggingInterceptor */
        static class a implements b {
            a() {
            }

            public void a(String str) {
                f.j().p(4, str, (Throwable) null);
                if (m.e()) {
                    m.a("okhttp", str);
                }
            }
        }

        void a(String str);
    }

    public p() {
        this(b.f13130a);
    }

    private boolean b(y yVar) {
        String c2 = yVar.c("Content-Encoding");
        return c2 != null && !c2.equalsIgnoreCase("identity") && !c2.equalsIgnoreCase("gzip");
    }

    static boolean c(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0, buffer.size() < 64 ? buffer.size() : 64);
            for (int i = 0; i < 16; i++) {
                if (buffer2.exhausted()) {
                    return true;
                }
                int readUtf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r2v28, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0335  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.i0 a(e.a0.a r22) throws java.io.IOException {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            com.tempmail.utils.p$a r2 = r1.f13124b
            e.g0 r3 = r22.request()
            com.tempmail.utils.p$a r4 = com.tempmail.utils.p.a.NONE
            if (r2 != r4) goto L_0x0013
            e.i0 r0 = r0.d(r3)
            return r0
        L_0x0013:
            com.tempmail.utils.p$a r4 = com.tempmail.utils.p.a.BODY
            r5 = 1
            if (r2 != r4) goto L_0x001a
            r4 = 1
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            if (r4 != 0) goto L_0x0024
            com.tempmail.utils.p$a r7 = com.tempmail.utils.p.a.HEADERS
            if (r2 != r7) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            e.h0 r7 = r3.a()
            if (r7 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            e.n r8 = r22.a()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "--> "
            r9.append(r10)
            java.lang.String r10 = r3.f()
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            e.z r11 = r3.i()
            r9.append(r11)
            java.lang.String r11 = ""
            if (r8 == 0) goto L_0x0068
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = " "
            r12.append(r13)
            e.e0 r8 = r8.a()
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            goto L_0x0069
        L_0x0068:
            r8 = r11
        L_0x0069:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "-byte body)"
            java.lang.String r12 = " ("
            if (r2 != 0) goto L_0x0091
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r12)
            long r14 = r7.contentLength()
            r13.append(r14)
            r13.append(r9)
            java.lang.String r8 = r13.toString()
        L_0x0091:
            com.tempmail.utils.p$b r13 = r1.f13123a
            r13.a(r8)
            java.lang.String r8 = "-byte body omitted)"
            java.lang.String r13 = ": "
            if (r2 == 0) goto L_0x01ee
            if (r5 == 0) goto L_0x00e2
            e.b0 r16 = r7.contentType()
            if (r16 == 0) goto L_0x00be
            com.tempmail.utils.p$b r6 = r1.f13123a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "Content-Type: "
            r10.append(r14)
            e.b0 r14 = r7.contentType()
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r6.a(r10)
        L_0x00be:
            long r14 = r7.contentLength()
            r17 = -1
            int r6 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r6 == 0) goto L_0x00e2
            com.tempmail.utils.p$b r6 = r1.f13123a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "Content-Length: "
            r10.append(r14)
            long r14 = r7.contentLength()
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r6.a(r10)
        L_0x00e2:
            e.y r6 = r3.d()
            int r10 = r6.h()
            r14 = 0
        L_0x00eb:
            if (r14 >= r10) goto L_0x012a
            java.lang.String r15 = r6.e(r14)
            r19 = r10
            java.lang.String r10 = "Content-Type"
            boolean r10 = r10.equalsIgnoreCase(r15)
            if (r10 != 0) goto L_0x0121
            java.lang.String r10 = "Content-Length"
            boolean r10 = r10.equalsIgnoreCase(r15)
            if (r10 != 0) goto L_0x0121
            com.tempmail.utils.p$b r10 = r1.f13123a
            r20 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r13)
            java.lang.String r15 = r6.i(r14)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r10.a(r2)
            goto L_0x0123
        L_0x0121:
            r20 = r2
        L_0x0123:
            int r14 = r14 + 1
            r10 = r19
            r2 = r20
            goto L_0x00eb
        L_0x012a:
            r20 = r2
            java.lang.String r2 = "--> END "
            if (r4 == 0) goto L_0x01d5
            if (r5 != 0) goto L_0x0134
            goto L_0x01d5
        L_0x0134:
            e.y r5 = r3.d()
            boolean r5 = r1.b(r5)
            if (r5 == 0) goto L_0x015d
            com.tempmail.utils.p$b r5 = r1.f13123a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.f()
            r6.append(r2)
            java.lang.String r2 = " (encoded body omitted)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.a(r2)
            goto L_0x01f0
        L_0x015d:
            okio.Buffer r5 = new okio.Buffer
            r5.<init>()
            r7.writeTo(r5)
            java.nio.charset.Charset r6 = f13122c
            e.b0 r10 = r7.contentType()
            if (r10 == 0) goto L_0x0173
            java.nio.charset.Charset r6 = f13122c
            java.nio.charset.Charset r6 = r10.b(r6)
        L_0x0173:
            com.tempmail.utils.p$b r10 = r1.f13123a
            r10.a(r11)
            boolean r10 = c(r5)
            if (r10 == 0) goto L_0x01ad
            com.tempmail.utils.p$b r10 = r1.f13123a
            java.lang.String r5 = r5.readString(r6)
            r10.a(r5)
            com.tempmail.utils.p$b r5 = r1.f13123a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.f()
            r6.append(r2)
            r6.append(r12)
            long r14 = r7.contentLength()
            r6.append(r14)
            r6.append(r9)
            java.lang.String r2 = r6.toString()
            r5.a(r2)
            goto L_0x01f0
        L_0x01ad:
            com.tempmail.utils.p$b r5 = r1.f13123a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.f()
            r6.append(r2)
            java.lang.String r2 = " (binary "
            r6.append(r2)
            long r14 = r7.contentLength()
            r6.append(r14)
            r6.append(r8)
            java.lang.String r2 = r6.toString()
            r5.a(r2)
            goto L_0x01f0
        L_0x01d5:
            com.tempmail.utils.p$b r5 = r1.f13123a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = r3.f()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.a(r2)
            goto L_0x01f0
        L_0x01ee:
            r20 = r2
        L_0x01f0:
            long r5 = java.lang.System.nanoTime()
            e.i0 r0 = r0.d(r3)     // Catch:{ Exception -> 0x03d8 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r14 = java.lang.System.nanoTime()
            long r14 = r14 - r5
            long r2 = r2.toMillis(r14)
            e.j0 r5 = r0.a()
            long r6 = r5.contentLength()
            r14 = -1
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0223
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r14 = "-byte"
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            goto L_0x0225
        L_0x0223:
            java.lang.String r10 = "unknown-length"
        L_0x0225:
            com.tempmail.utils.p$b r14 = r1.f13123a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r17 = r9
            java.lang.String r9 = "<-- "
            r15.append(r9)
            int r9 = r0.d()
            r15.append(r9)
            java.lang.String r9 = r0.m()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x024a
            r18 = r6
            r7 = r11
            r6 = 32
            goto L_0x0261
        L_0x024a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r18 = r6
            r6 = 32
            r9.append(r6)
            java.lang.String r7 = r0.m()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
        L_0x0261:
            r15.append(r7)
            r15.append(r6)
            e.g0 r6 = r0.q()
            e.z r6 = r6.i()
            r15.append(r6)
            r15.append(r12)
            r15.append(r2)
            java.lang.String r2 = "ms"
            r15.append(r2)
            if (r20 != 0) goto L_0x0296
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = " body"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0297
        L_0x0296:
            r2 = r11
        L_0x0297:
            r15.append(r2)
            r2 = 41
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r14.a(r2)
            if (r20 == 0) goto L_0x03d7
            e.y r2 = r0.h()
            int r3 = r2.h()
            r6 = 0
        L_0x02b1:
            if (r6 >= r3) goto L_0x02d5
            com.tempmail.utils.p$b r7 = r1.f13123a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r2.e(r6)
            r9.append(r10)
            r9.append(r13)
            java.lang.String r10 = r2.i(r6)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r7.a(r9)
            int r6 = r6 + 1
            goto L_0x02b1
        L_0x02d5:
            if (r4 == 0) goto L_0x03d0
            boolean r3 = e.m0.h.e.c(r0)
            if (r3 != 0) goto L_0x02df
            goto L_0x03d0
        L_0x02df:
            e.y r3 = r0.h()
            boolean r3 = r1.b(r3)
            if (r3 == 0) goto L_0x02f2
            com.tempmail.utils.p$b r2 = r1.f13123a
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            r2.a(r3)
            goto L_0x03d7
        L_0x02f2:
            okio.BufferedSource r3 = r5.source()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r6)
            okio.Buffer r3 = r3.buffer()
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r2 = r2.c(r4)
            java.lang.String r4 = "gzip"
            boolean r2 = r4.equalsIgnoreCase(r2)
            r4 = 0
            if (r2 == 0) goto L_0x0339
            long r6 = r3.size()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            okio.GzipSource r6 = new okio.GzipSource     // Catch:{ all -> 0x0332 }
            okio.Buffer r3 = r3.clone()     // Catch:{ all -> 0x0332 }
            r6.<init>(r3)     // Catch:{ all -> 0x0332 }
            okio.Buffer r3 = new okio.Buffer     // Catch:{ all -> 0x032f }
            r3.<init>()     // Catch:{ all -> 0x032f }
            r3.writeAll(r6)     // Catch:{ all -> 0x032f }
            r6.close()
            r4 = r2
            goto L_0x0339
        L_0x032f:
            r0 = move-exception
            r4 = r6
            goto L_0x0333
        L_0x0332:
            r0 = move-exception
        L_0x0333:
            if (r4 == 0) goto L_0x0338
            r4.close()
        L_0x0338:
            throw r0
        L_0x0339:
            java.nio.charset.Charset r2 = f13122c
            e.b0 r5 = r5.contentType()
            if (r5 == 0) goto L_0x0347
            java.nio.charset.Charset r2 = f13122c
            java.nio.charset.Charset r2 = r5.b(r2)
        L_0x0347:
            boolean r5 = c(r3)
            if (r5 != 0) goto L_0x0370
            com.tempmail.utils.p$b r2 = r1.f13123a
            r2.a(r11)
            com.tempmail.utils.p$b r2 = r1.f13123a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "<-- END HTTP (binary "
            r4.append(r5)
            long r5 = r3.size()
            r4.append(r5)
            r4.append(r8)
            java.lang.String r3 = r4.toString()
            r2.a(r3)
            return r0
        L_0x0370:
            r5 = 0
            int r7 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0388
            com.tempmail.utils.p$b r5 = r1.f13123a
            r5.a(r11)
            com.tempmail.utils.p$b r5 = r1.f13123a
            okio.Buffer r6 = r3.clone()
            java.lang.String r2 = r6.readString(r2)
            r5.a(r2)
        L_0x0388:
            java.lang.String r2 = "<-- END HTTP ("
            if (r4 == 0) goto L_0x03b2
            com.tempmail.utils.p$b r5 = r1.f13123a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            long r2 = r3.size()
            r6.append(r2)
            java.lang.String r2 = "-byte, "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = "-gzipped-byte body)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.a(r2)
            goto L_0x03d7
        L_0x03b2:
            com.tempmail.utils.p$b r4 = r1.f13123a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            long r2 = r3.size()
            r5.append(r2)
            r2 = r17
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.a(r2)
            goto L_0x03d7
        L_0x03d0:
            com.tempmail.utils.p$b r2 = r1.f13123a
            java.lang.String r3 = "<-- END HTTP"
            r2.a(r3)
        L_0x03d7:
            return r0
        L_0x03d8:
            r0 = move-exception
            r2 = r0
            com.tempmail.utils.p$b r0 = r1.f13123a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.a(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.utils.p.a(e.a0$a):e.i0");
    }

    public p d(a aVar) {
        if (aVar != null) {
            this.f13124b = aVar;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public p(b bVar) {
        this.f13124b = a.NONE;
        this.f13123a = bVar;
    }
}
