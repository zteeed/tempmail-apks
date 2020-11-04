package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class c8 implements zzok {
    private static final Pattern q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> r = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private SSLSocketFactory f3522a = new e8(this);

    /* renamed from: b  reason: collision with root package name */
    private final int f3523b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3524c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3525d;

    /* renamed from: e  reason: collision with root package name */
    private final zzos f3526e;

    /* renamed from: f  reason: collision with root package name */
    private final zzoy<? super c8> f3527f;
    private zzop g;
    private HttpURLConnection h;
    private InputStream i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    /* access modifiers changed from: private */
    public int o;
    private Set<Socket> p = new HashSet();

    c8(String str, zzoy<? super c8> zzoy, int i2, int i3, int i4) {
        zzpb.c(str);
        this.f3525d = str;
        this.f3527f = zzoy;
        this.f3526e = new zzos();
        this.f3523b = i2;
        this.f3524c = i3;
        this.o = i4;
    }

    /* access modifiers changed from: private */
    public final void e(Socket socket) {
        this.p.add(socket);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long f(java.net.HttpURLConnection r9) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r9.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            if (r1 != 0) goto L_0x0034
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0013 }
            goto L_0x0036
        L_0x0013:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzbba.g(r1)
        L_0x0034:
            r3 = -1
        L_0x0036:
            java.lang.String r1 = "Content-Range"
            java.lang.String r9 = r9.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x00c9
            java.util.regex.Pattern r1 = q
            java.util.regex.Matcher r1 = r1.matcher(r9)
            boolean r5 = r1.find()
            if (r5 == 0) goto L_0x00c9
            r5 = 2
            java.lang.String r5 = r1.group(r5)     // Catch:{ NumberFormatException -> 0x00a8 }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x00a8 }
            r7 = 1
            java.lang.String r1 = r1.group(r7)     // Catch:{ NumberFormatException -> 0x00a8 }
            long r7 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00a8 }
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x006c
            r3 = r5
            goto L_0x00c9
        L_0x006c:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00a8 }
            int r1 = r1.length()     // Catch:{ NumberFormatException -> 0x00a8 }
            int r1 = r1 + 26
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch:{ NumberFormatException -> 0x00a8 }
            int r7 = r7.length()     // Catch:{ NumberFormatException -> 0x00a8 }
            int r1 = r1 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00a8 }
            r7.<init>(r1)     // Catch:{ NumberFormatException -> 0x00a8 }
            java.lang.String r1 = "Inconsistent headers ["
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x00a8 }
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00a8 }
            java.lang.String r0 = "] ["
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00a8 }
            r7.append(r9)     // Catch:{ NumberFormatException -> 0x00a8 }
            r7.append(r2)     // Catch:{ NumberFormatException -> 0x00a8 }
            java.lang.String r0 = r7.toString()     // Catch:{ NumberFormatException -> 0x00a8 }
            com.google.android.gms.internal.ads.zzbba.i(r0)     // Catch:{ NumberFormatException -> 0x00a8 }
            long r0 = java.lang.Math.max(r3, r5)     // Catch:{ NumberFormatException -> 0x00a8 }
            r3 = r0
            goto L_0x00c9
        L_0x00a8:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            com.google.android.gms.internal.ads.zzbba.g(r9)
        L_0x00c9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c8.f(java.net.HttpURLConnection):long");
    }

    private final void g() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzbba.c("Unexpected error while disconnecting", e2);
            }
            this.h = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x012b A[EDGE_INSN: B:121:0x012b->B:50:0x012b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d9 A[Catch:{ IOException -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e6 A[Catch:{ IOException -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8 A[Catch:{ IOException -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ee A[Catch:{ IOException -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0121 A[Catch:{ IOException -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.zzop r24) throws com.google.android.gms.internal.ads.zzoq {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "Unable to connect to "
            r1.g = r2
            r4 = 0
            r1.n = r4
            r1.m = r4
            r6 = 1
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0245 }
            android.net.Uri r7 = r2.f8950a     // Catch:{ IOException -> 0x0245 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0245 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0245 }
            byte[] r7 = r2.f8951b     // Catch:{ IOException -> 0x0245 }
            long r8 = r2.f8953d     // Catch:{ IOException -> 0x0245 }
            long r10 = r2.f8954e     // Catch:{ IOException -> 0x0245 }
            boolean r12 = r2.a(r6)     // Catch:{ IOException -> 0x0245 }
            r14 = 0
        L_0x0025:
            int r15 = r14 + 1
            r6 = 20
            if (r14 > r6) goto L_0x022c
            java.net.URLConnection r14 = r0.openConnection()     // Catch:{ IOException -> 0x0245 }
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch:{ IOException -> 0x0245 }
            boolean r13 = r14 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0245 }
            if (r13 == 0) goto L_0x003d
            r13 = r14
            javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch:{ IOException -> 0x0245 }
            javax.net.ssl.SSLSocketFactory r6 = r1.f3522a     // Catch:{ IOException -> 0x0245 }
            r13.setSSLSocketFactory(r6)     // Catch:{ IOException -> 0x0245 }
        L_0x003d:
            int r6 = r1.f3523b     // Catch:{ IOException -> 0x0245 }
            r14.setConnectTimeout(r6)     // Catch:{ IOException -> 0x0245 }
            int r6 = r1.f3524c     // Catch:{ IOException -> 0x0245 }
            r14.setReadTimeout(r6)     // Catch:{ IOException -> 0x0245 }
            com.google.android.gms.internal.ads.zzos r6 = r1.f3526e     // Catch:{ IOException -> 0x0245 }
            java.util.Map r6 = r6.a()     // Catch:{ IOException -> 0x0245 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ IOException -> 0x0245 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x0245 }
        L_0x0055:
            boolean r13 = r6.hasNext()     // Catch:{ IOException -> 0x0245 }
            if (r13 == 0) goto L_0x0075
            java.lang.Object r13 = r6.next()     // Catch:{ IOException -> 0x0245 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ IOException -> 0x0245 }
            java.lang.Object r17 = r13.getKey()     // Catch:{ IOException -> 0x0245 }
            r4 = r17
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0245 }
            java.lang.Object r5 = r13.getValue()     // Catch:{ IOException -> 0x0245 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0245 }
            r14.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0245 }
            r4 = 0
            goto L_0x0055
        L_0x0075:
            r4 = -1
            r17 = 0
            int r6 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r6 != 0) goto L_0x0085
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            r16 = r8
            goto L_0x00d0
        L_0x0085:
            r6 = 27
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0245 }
            r13.<init>(r6)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r6 = "bytes="
            r13.append(r6)     // Catch:{ IOException -> 0x0245 }
            r13.append(r8)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r6 = "-"
            r13.append(r6)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r6 = r13.toString()     // Catch:{ IOException -> 0x0245 }
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00c9
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0245 }
            long r19 = r8 + r10
            r21 = 1
            long r4 = r19 - r21
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0245 }
            int r13 = r13.length()     // Catch:{ IOException -> 0x0245 }
            r16 = 20
            int r13 = r13 + 20
            r16 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0245 }
            r8.<init>(r13)     // Catch:{ IOException -> 0x0245 }
            r8.append(r6)     // Catch:{ IOException -> 0x0245 }
            r8.append(r4)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r6 = r8.toString()     // Catch:{ IOException -> 0x0245 }
            goto L_0x00cb
        L_0x00c9:
            r16 = r8
        L_0x00cb:
            java.lang.String r4 = "Range"
            r14.setRequestProperty(r4, r6)     // Catch:{ IOException -> 0x0245 }
        L_0x00d0:
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = r1.f3525d     // Catch:{ IOException -> 0x0245 }
            r14.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0245 }
            if (r12 != 0) goto L_0x00e0
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "identity"
            r14.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0245 }
        L_0x00e0:
            r4 = 0
            r14.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x0245 }
            if (r7 == 0) goto L_0x00e8
            r4 = 1
            goto L_0x00e9
        L_0x00e8:
            r4 = 0
        L_0x00e9:
            r14.setDoOutput(r4)     // Catch:{ IOException -> 0x0245 }
            if (r7 == 0) goto L_0x0108
            java.lang.String r4 = "POST"
            r14.setRequestMethod(r4)     // Catch:{ IOException -> 0x0245 }
            int r4 = r7.length     // Catch:{ IOException -> 0x0245 }
            if (r4 == 0) goto L_0x0108
            int r4 = r7.length     // Catch:{ IOException -> 0x0245 }
            r14.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x0245 }
            r14.connect()     // Catch:{ IOException -> 0x0245 }
            java.io.OutputStream r4 = r14.getOutputStream()     // Catch:{ IOException -> 0x0245 }
            r4.write(r7)     // Catch:{ IOException -> 0x0245 }
            r4.close()     // Catch:{ IOException -> 0x0245 }
            goto L_0x010b
        L_0x0108:
            r14.connect()     // Catch:{ IOException -> 0x0245 }
        L_0x010b:
            int r4 = r14.getResponseCode()     // Catch:{ IOException -> 0x0245 }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x01d7
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x01d7
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x01d7
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x01d7
            if (r7 != 0) goto L_0x012b
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x01d7
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x012b
            goto L_0x01d7
        L_0x012b:
            r1.h = r14     // Catch:{ IOException -> 0x0245 }
            int r0 = r14.getResponseCode()     // Catch:{ IOException -> 0x01b0 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x0194
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 <= r4) goto L_0x013a
            goto L_0x0194
        L_0x013a:
            if (r0 != r3) goto L_0x0146
            long r3 = r2.f8953d
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0148
            r4 = r3
            goto L_0x0149
        L_0x0146:
            r5 = 0
        L_0x0148:
            r4 = r5
        L_0x0149:
            r1.k = r4
            r3 = 1
            boolean r0 = r2.a(r3)
            if (r0 != 0) goto L_0x0170
            long r3 = r2.f8954e
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x015d
            r1.l = r3
            goto L_0x0174
        L_0x015d:
            java.net.HttpURLConnection r0 = r1.h
            long r3 = f(r0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x016c
            long r5 = r1.k
            long r4 = r3 - r5
            goto L_0x016d
        L_0x016c:
            r4 = r5
        L_0x016d:
            r1.l = r4
            goto L_0x0174
        L_0x0170:
            long r3 = r2.f8954e
            r1.l = r3
        L_0x0174:
            java.net.HttpURLConnection r0 = r1.h     // Catch:{ IOException -> 0x0189 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0189 }
            r1.i = r0     // Catch:{ IOException -> 0x0189 }
            r3 = 1
            r1.j = r3
            com.google.android.gms.internal.ads.zzoy<? super com.google.android.gms.internal.ads.c8> r0 = r1.f3527f
            if (r0 == 0) goto L_0x0186
            r0.n(r1, r2)
        L_0x0186:
            long r2 = r1.l
            return r2
        L_0x0189:
            r0 = move-exception
            r23.g()
            com.google.android.gms.internal.ads.zzoq r3 = new com.google.android.gms.internal.ads.zzoq
            r4 = 1
            r3.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.zzop) r2, (int) r4)
            throw r3
        L_0x0194:
            java.net.HttpURLConnection r3 = r1.h
            java.util.Map r3 = r3.getHeaderFields()
            r23.g()
            com.google.android.gms.internal.ads.zzot r4 = new com.google.android.gms.internal.ads.zzot
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x01af
            com.google.android.gms.internal.ads.zzom r0 = new com.google.android.gms.internal.ads.zzom
            r7 = 0
            r0.<init>(r7)
            r4.initCause(r0)
        L_0x01af:
            throw r4
        L_0x01b0:
            r0 = move-exception
            r4 = r0
            r23.g()
            com.google.android.gms.internal.ads.zzoq r0 = new com.google.android.gms.internal.ads.zzoq
            android.net.Uri r5 = r2.f8950a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x01cc
            java.lang.String r3 = r3.concat(r5)
            goto L_0x01d2
        L_0x01cc:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x01d2:
            r5 = 1
            r0.<init>(r3, r4, r2, r5)
            throw r0
        L_0x01d7:
            r5 = 0
            r7 = 0
            r4 = 0
            java.lang.String r8 = "Location"
            java.lang.String r8 = r14.getHeaderField(r8)     // Catch:{ IOException -> 0x0245 }
            r14.disconnect()     // Catch:{ IOException -> 0x0245 }
            if (r8 == 0) goto L_0x0224
            java.net.URL r9 = new java.net.URL     // Catch:{ IOException -> 0x0245 }
            r9.<init>(r0, r8)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r0 = r9.getProtocol()     // Catch:{ IOException -> 0x0245 }
            java.lang.String r8 = "https"
            boolean r8 = r8.equals(r0)     // Catch:{ IOException -> 0x0245 }
            if (r8 != 0) goto L_0x021b
            java.lang.String r8 = "http"
            boolean r8 = r8.equals(r0)     // Catch:{ IOException -> 0x0245 }
            if (r8 != 0) goto L_0x021b
            java.net.ProtocolException r4 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0245 }
            java.lang.String r5 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0245 }
            int r6 = r0.length()     // Catch:{ IOException -> 0x0245 }
            if (r6 == 0) goto L_0x0212
            java.lang.String r0 = r5.concat(r0)     // Catch:{ IOException -> 0x0245 }
            goto L_0x0217
        L_0x0212:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0245 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0245 }
        L_0x0217:
            r4.<init>(r0)     // Catch:{ IOException -> 0x0245 }
            throw r4     // Catch:{ IOException -> 0x0245 }
        L_0x021b:
            r7 = r4
            r4 = r5
            r0 = r9
            r14 = r15
            r8 = r16
            r6 = 1
            goto L_0x0025
        L_0x0224:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0245 }
            java.lang.String r4 = "Null location redirect"
            r0.<init>(r4)     // Catch:{ IOException -> 0x0245 }
            throw r0     // Catch:{ IOException -> 0x0245 }
        L_0x022c:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0245 }
            r4 = 31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0245 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r4 = "Too many redirects: "
            r5.append(r4)     // Catch:{ IOException -> 0x0245 }
            r5.append(r15)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x0245 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0245 }
            throw r0     // Catch:{ IOException -> 0x0245 }
        L_0x0245:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzoq r4 = new com.google.android.gms.internal.ads.zzoq
            android.net.Uri r5 = r2.f8950a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x025d
            java.lang.String r3 = r3.concat(r5)
            goto L_0x0263
        L_0x025d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x0263:
            r5 = 1
            r4.<init>(r3, r0, r2, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c8.a(com.google.android.gms.internal.ads.zzop):long");
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        this.o = i2;
        for (Socket next : this.p) {
            if (!next.isClosed()) {
                try {
                    next.setReceiveBufferSize(this.o);
                } catch (SocketException e2) {
                    zzbba.d("Failed to update receive buffer size.", e2);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r3 > android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) goto L_0x003a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() throws com.google.android.gms.internal.ads.zzoq {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.i     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x007b
            java.net.HttpURLConnection r2 = r9.h     // Catch:{ all -> 0x0093 }
            long r3 = r9.l     // Catch:{ all -> 0x0093 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r9.l     // Catch:{ all -> 0x0093 }
            goto L_0x0018
        L_0x0013:
            long r3 = r9.l     // Catch:{ all -> 0x0093 }
            long r7 = r9.n     // Catch:{ all -> 0x0093 }
            long r3 = r3 - r7
        L_0x0018:
            int r7 = com.google.android.gms.internal.ads.zzpo.f8995a     // Catch:{ all -> 0x0093 }
            r8 = 19
            if (r7 == r8) goto L_0x0024
            int r7 = com.google.android.gms.internal.ads.zzpo.f8995a     // Catch:{ all -> 0x0093 }
            r8 = 20
            if (r7 != r8) goto L_0x006b
        L_0x0024:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x006b }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0034
            int r3 = r2.read()     // Catch:{ Exception -> 0x006b }
            r4 = -1
            if (r3 != r4) goto L_0x003a
            goto L_0x006b
        L_0x0034:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x006b
        L_0x003a:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x006b }
            if (r4 != 0) goto L_0x0052
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x006b }
            if (r3 == 0) goto L_0x006b
        L_0x0052:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006b }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006b }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006b }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006b }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006b }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            java.io.InputStream r2 = r9.i     // Catch:{ IOException -> 0x0071 }
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007b
        L_0x0071:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzoq r3 = new com.google.android.gms.internal.ads.zzoq     // Catch:{ all -> 0x0093 }
            com.google.android.gms.internal.ads.zzop r4 = r9.g     // Catch:{ all -> 0x0093 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.zzop) r4, (int) r5)     // Catch:{ all -> 0x0093 }
            throw r3     // Catch:{ all -> 0x0093 }
        L_0x007b:
            r9.i = r0
            r9.g()
            boolean r0 = r9.j
            if (r0 == 0) goto L_0x008d
            r9.j = r1
            com.google.android.gms.internal.ads.zzoy<? super com.google.android.gms.internal.ads.c8> r0 = r9.f3527f
            if (r0 == 0) goto L_0x008d
            r0.d(r9)
        L_0x008d:
            java.util.Set<java.net.Socket> r0 = r9.p
            r0.clear()
            return
        L_0x0093:
            r2 = move-exception
            r9.i = r0
            r9.g()
            boolean r0 = r9.j
            if (r0 == 0) goto L_0x00a6
            r9.j = r1
            com.google.android.gms.internal.ads.zzoy<? super com.google.android.gms.internal.ads.c8> r0 = r9.f3527f
            if (r0 == 0) goto L_0x00a6
            r0.d(r9)
        L_0x00a6:
            java.util.Set<java.net.Socket> r0 = r9.p
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c8.close():void");
    }

    public final Uri e0() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final int read(byte[] bArr, int i2, int i3) throws zzoq {
        try {
            if (this.m != this.k) {
                byte[] andSet = r.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                }
                while (this.m != this.k) {
                    int read = this.i.read(andSet, 0, (int) Math.min(this.k - this.m, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.m += (long) read;
                        if (this.f3527f != null) {
                            this.f3527f.q(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                r.set(andSet);
            }
            if (i3 == 0) {
                return 0;
            }
            if (this.l != -1) {
                long j2 = this.l - this.n;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j2);
            }
            int read2 = this.i.read(bArr, i2, i3);
            if (read2 != -1) {
                this.n += (long) read2;
                if (this.f3527f != null) {
                    this.f3527f.q(this, read2);
                }
                return read2;
            } else if (this.l == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new zzoq(e2, this.g, 2);
        }
    }
}
