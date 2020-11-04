package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzor implements zzok {
    private static final Pattern o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> p = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8956a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8957b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8958c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8959d;

    /* renamed from: e  reason: collision with root package name */
    private final zzos f8960e = new zzos();

    /* renamed from: f  reason: collision with root package name */
    private final zzoy<? super zzor> f8961f;
    private zzop g;
    private HttpURLConnection h;
    private InputStream i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;

    public zzor(String str, zzpk<String> zzpk, zzoy<? super zzor> zzoy, int i2, int i3, boolean z, zzos zzos) {
        zzpb.c(str);
        this.f8959d = str;
        this.f8961f = zzoy;
        this.f8957b = i2;
        this.f8958c = i3;
        this.f8956a = true;
    }

    private final HttpURLConnection c(URL url, byte[] bArr, long j2, long j3, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f8957b);
        httpURLConnection.setReadTimeout(this.f8958c);
        for (Map.Entry next : this.f8960e.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        if (!(j2 == 0 && j3 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            String sb2 = sb.toString();
            if (j3 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j2 + j3) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty(AbstractSpiCall.HEADER_USER_AGENT, this.f8959d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long d(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x0036
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x0038
        L_0x0015:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r3, r1)
        L_0x0036:
            r4 = -1
        L_0x0038:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00cb
            java.util.regex.Pattern r1 = o
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00cb
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x00aa }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x00aa }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x006e
            r4 = r6
            goto L_0x00cb
        L_0x006e:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + 26
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            int r8 = r8.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00aa }
            r8.<init>(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r1 = "Inconsistent headers ["
            r8.append(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = "] ["
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r2)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = r8.toString()     // Catch:{ NumberFormatException -> 0x00aa }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x00aa }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r4 = r0
            goto L_0x00cb
        L_0x00aa:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            android.util.Log.e(r3, r10)
        L_0x00cb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzor.d(java.net.HttpURLConnection):long");
    }

    private final void e() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.h = null;
        }
    }

    public final long a(zzop zzop) throws zzoq {
        HttpURLConnection httpURLConnection;
        HttpURLConnection c2;
        zzop zzop2 = zzop;
        this.g = zzop2;
        long j2 = 0;
        this.n = 0;
        this.m = 0;
        try {
            URL url = new URL(zzop2.f8950a.toString());
            byte[] bArr = zzop2.f8951b;
            long j3 = zzop2.f8953d;
            long j4 = zzop2.f8954e;
            boolean a2 = zzop2.a(1);
            if (!this.f8956a) {
                httpURLConnection = c(url, bArr, j3, j4, a2, true);
            } else {
                URL url2 = url;
                byte[] bArr2 = bArr;
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (i2 <= 20) {
                        URL url3 = url2;
                        int i4 = i3;
                        long j5 = j4;
                        long j6 = j3;
                        c2 = c(url2, bArr2, j3, j4, a2, false);
                        int responseCode = c2.getResponseCode();
                        if (!(responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303)) {
                            if (bArr2 == null) {
                                if (responseCode != 307) {
                                    if (responseCode != 308) {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        bArr2 = null;
                        String headerField = c2.getHeaderField("Location");
                        c2.disconnect();
                        if (headerField != null) {
                            url2 = new URL(url3, headerField);
                            String protocol = url2.getProtocol();
                            if ("https".equals(protocol) || "http".equals(protocol)) {
                                i2 = i4;
                                j4 = j5;
                                j3 = j6;
                            } else {
                                String valueOf = String.valueOf(protocol);
                                throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
                            }
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i3);
                        throw new NoRouteToHostException(sb.toString());
                    }
                }
                httpURLConnection = c2;
            }
            this.h = httpURLConnection;
            try {
                int responseCode2 = httpURLConnection.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map headerFields = this.h.getHeaderFields();
                    e();
                    zzot zzot = new zzot(responseCode2, headerFields, zzop2);
                    if (responseCode2 == 416) {
                        zzot.initCause(new zzom(0));
                    }
                    throw zzot;
                }
                this.h.getContentType();
                if (responseCode2 == 200) {
                    long j7 = zzop2.f8953d;
                    if (j7 != 0) {
                        j2 = j7;
                    }
                }
                this.k = j2;
                if (!zzop2.a(1)) {
                    long j8 = zzop2.f8954e;
                    long j9 = -1;
                    if (j8 != -1) {
                        this.l = j8;
                    } else {
                        long d2 = d(this.h);
                        if (d2 != -1) {
                            j9 = d2 - this.k;
                        }
                        this.l = j9;
                    }
                } else {
                    this.l = zzop2.f8954e;
                }
                try {
                    this.i = this.h.getInputStream();
                    this.j = true;
                    zzoy<? super zzor> zzoy = this.f8961f;
                    if (zzoy != null) {
                        zzoy.n(this, zzop2);
                    }
                    return this.l;
                } catch (IOException e2) {
                    e();
                    throw new zzoq(e2, zzop2, 1);
                }
            } catch (IOException e3) {
                IOException iOException = e3;
                e();
                String valueOf2 = String.valueOf(zzop2.f8950a.toString());
                throw new zzoq(valueOf2.length() != 0 ? "Unable to connect to ".concat(valueOf2) : new String("Unable to connect to "), iOException, zzop2, 1);
            }
        } catch (IOException e4) {
            String valueOf3 = String.valueOf(zzop2.f8950a.toString());
            throw new zzoq(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e4, zzop2, 1);
        }
    }

    public final Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
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
            java.io.InputStream r2 = r9.i     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007b
            java.net.HttpURLConnection r2 = r9.h     // Catch:{ all -> 0x008e }
            long r3 = r9.l     // Catch:{ all -> 0x008e }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r9.l     // Catch:{ all -> 0x008e }
            goto L_0x0018
        L_0x0013:
            long r3 = r9.l     // Catch:{ all -> 0x008e }
            long r7 = r9.n     // Catch:{ all -> 0x008e }
            long r3 = r3 - r7
        L_0x0018:
            int r7 = com.google.android.gms.internal.ads.zzpo.f8995a     // Catch:{ all -> 0x008e }
            r8 = 19
            if (r7 == r8) goto L_0x0024
            int r7 = com.google.android.gms.internal.ads.zzpo.f8995a     // Catch:{ all -> 0x008e }
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
            com.google.android.gms.internal.ads.zzoq r3 = new com.google.android.gms.internal.ads.zzoq     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.zzop r4 = r9.g     // Catch:{ all -> 0x008e }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.zzop) r4, (int) r5)     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x007b:
            r9.i = r0
            r9.e()
            boolean r0 = r9.j
            if (r0 == 0) goto L_0x008d
            r9.j = r1
            com.google.android.gms.internal.ads.zzoy<? super com.google.android.gms.internal.ads.zzor> r0 = r9.f8961f
            if (r0 == 0) goto L_0x008d
            r0.d(r9)
        L_0x008d:
            return
        L_0x008e:
            r2 = move-exception
            r9.i = r0
            r9.e()
            boolean r0 = r9.j
            if (r0 == 0) goto L_0x00a1
            r9.j = r1
            com.google.android.gms.internal.ads.zzoy<? super com.google.android.gms.internal.ads.zzor> r0 = r9.f8961f
            if (r0 == 0) goto L_0x00a1
            r0.d(r9)
        L_0x00a1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzor.close():void");
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
                byte[] andSet = p.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                }
                while (this.m != this.k) {
                    int read = this.i.read(andSet, 0, (int) Math.min(this.k - this.m, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.m += (long) read;
                        if (this.f8961f != null) {
                            this.f8961f.q(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                p.set(andSet);
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
                if (this.f8961f != null) {
                    this.f8961f.q(this, read2);
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
