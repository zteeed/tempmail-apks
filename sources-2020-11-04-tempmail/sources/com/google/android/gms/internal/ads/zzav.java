package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzav implements zzk {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, v4> f6153a;

    /* renamed from: b  reason: collision with root package name */
    private long f6154b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaz f6155c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6156d;

    public zzav(File file, int i) {
        this.f6153a = new LinkedHashMap(16, 0.75f, true);
        this.f6154b = 0;
        this.f6155c = new f5(this, file);
        this.f6156d = 20971520;
    }

    private final synchronized void a(String str) {
        boolean delete = o(str).delete();
        b(str);
        if (!delete) {
            zzaq.a("Could not delete cache entry for key=%s, filename=%s", str, n(str));
        }
    }

    private final void b(String str) {
        v4 remove = this.f6153a.remove(str);
        if (remove != null) {
            this.f6154b -= remove.f5281a;
        }
    }

    private static int c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static InputStream d(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    static String e(e6 e6Var) throws IOException {
        return new String(j(e6Var, m(e6Var)), "UTF-8");
    }

    static void f(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static void g(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void h(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        g(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void i(String str, v4 v4Var) {
        if (!this.f6153a.containsKey(str)) {
            this.f6154b += v4Var.f5281a;
        } else {
            this.f6154b += v4Var.f5281a - this.f6153a.get(str).f5281a;
        }
        this.f6153a.put(str, v4Var);
    }

    private static byte[] j(e6 e6Var, long j) throws IOException {
        long a2 = e6Var.a();
        if (j >= 0 && j <= a2) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(e6Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a2);
        throw new IOException(sb.toString());
    }

    static int k(InputStream inputStream) throws IOException {
        return (c(inputStream) << 24) | c(inputStream) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16);
    }

    static List<zzu> l(e6 e6Var) throws IOException {
        int k = k(e6Var);
        if (k >= 0) {
            List<zzu> emptyList = k == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < k; i++) {
                emptyList.add(new zzu(e(e6Var).intern(), e(e6Var).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(k);
        throw new IOException(sb.toString());
    }

    static long m(InputStream inputStream) throws IOException {
        return (((long) c(inputStream)) & 255) | 0 | ((((long) c(inputStream)) & 255) << 8) | ((((long) c(inputStream)) & 255) << 16) | ((((long) c(inputStream)) & 255) << 24) | ((((long) c(inputStream)) & 255) << 32) | ((((long) c(inputStream)) & 255) << 40) | ((((long) c(inputStream)) & 255) << 48) | ((255 & ((long) c(inputStream))) << 56);
    }

    private static String n(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File o(String str) {
        return new File(this.f6155c.k(), n(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void I() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzaz r0 = r9.f6155c     // Catch:{ all -> 0x005f }
            java.io.File r0 = r0.k()     // Catch:{ all -> 0x005f }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x005f }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x005f }
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "Unable to create cache dir %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x005f }
            r3[r2] = r0     // Catch:{ all -> 0x005f }
            com.google.android.gms.internal.ads.zzaq.b(r1, r3)     // Catch:{ all -> 0x005f }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x002c
            monitor-exit(r9)
            return
        L_0x002c:
            int r1 = r0.length     // Catch:{ all -> 0x005f }
        L_0x002d:
            if (r2 >= r1) goto L_0x005d
            r3 = r0[r2]     // Catch:{ all -> 0x005f }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.ads.e6 r6 = new com.google.android.gms.internal.ads.e6     // Catch:{ IOException -> 0x0057 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0057 }
            java.io.InputStream r8 = d(r3)     // Catch:{ IOException -> 0x0057 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0057 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.ads.v4 r7 = com.google.android.gms.internal.ads.v4.b(r6)     // Catch:{ all -> 0x0052 }
            r7.f5281a = r4     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = r7.f5282b     // Catch:{ all -> 0x0052 }
            r9.i(r4, r7)     // Catch:{ all -> 0x0052 }
            r6.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005a
        L_0x0052:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0057 }
            throw r4     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r3.delete()     // Catch:{ all -> 0x005f }
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x005d:
            monitor-exit(r9)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzav.I():void");
    }

    public final synchronized zzn J(String str) {
        e6 e6Var;
        v4 v4Var = this.f6153a.get(str);
        if (v4Var == null) {
            return null;
        }
        File o = o(str);
        try {
            e6Var = new e6(new BufferedInputStream(d(o)), o.length());
            v4 b2 = v4.b(e6Var);
            if (!TextUtils.equals(str, b2.f5282b)) {
                zzaq.a("%s: key=%s, found=%s", o.getAbsolutePath(), str, b2.f5282b);
                b(str);
                e6Var.close();
                return null;
            }
            byte[] j = j(e6Var, e6Var.a());
            zzn zzn = new zzn();
            zzn.f9066a = j;
            zzn.f9067b = v4Var.f5283c;
            zzn.f9068c = v4Var.f5284d;
            zzn.f9069d = v4Var.f5285e;
            zzn.f9070e = v4Var.f5286f;
            zzn.f9071f = v4Var.g;
            List<zzu> list = v4Var.h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzu next : list) {
                treeMap.put(next.a(), next.b());
            }
            zzn.g = treeMap;
            zzn.h = Collections.unmodifiableList(v4Var.h);
            e6Var.close();
            return zzn;
        } catch (IOException e2) {
            zzaq.a("%s: %s", o.getAbsolutePath(), e2.toString());
            a(str);
            return null;
        } catch (Throwable th) {
            e6Var.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0115, code lost:
        if (r3.delete() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        com.google.android.gms.internal.ads.zzaq.a("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void K(java.lang.String r16, com.google.android.gms.internal.ads.zzn r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.f6154b     // Catch:{ all -> 0x0126 }
            byte[] r5 = r2.f9066a     // Catch:{ all -> 0x0126 }
            int r5 = r5.length     // Catch:{ all -> 0x0126 }
            long r5 = (long) r5     // Catch:{ all -> 0x0126 }
            long r3 = r3 + r5
            int r5 = r1.f6156d     // Catch:{ all -> 0x0126 }
            long r5 = (long) r5     // Catch:{ all -> 0x0126 }
            r7 = 1063675494(0x3f666666, float:0.9)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0026
            byte[] r3 = r2.f9066a     // Catch:{ all -> 0x0126 }
            int r3 = r3.length     // Catch:{ all -> 0x0126 }
            float r3 = (float) r3     // Catch:{ all -> 0x0126 }
            int r4 = r1.f6156d     // Catch:{ all -> 0x0126 }
            float r4 = (float) r4
            float r4 = r4 * r7
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            monitor-exit(r15)
            return
        L_0x0026:
            java.io.File r3 = r15.o(r16)     // Catch:{ all -> 0x0126 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0111 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0111 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x0111 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.v4 r8 = new com.google.android.gms.internal.ads.v4     // Catch:{ IOException -> 0x0111 }
            r8.<init>(r0, r2)     // Catch:{ IOException -> 0x0111 }
            boolean r9 = r8.a(r6)     // Catch:{ IOException -> 0x0111 }
            if (r9 == 0) goto L_0x00fb
            byte[] r2 = r2.f9066a     // Catch:{ IOException -> 0x0111 }
            r6.write(r2)     // Catch:{ IOException -> 0x0111 }
            r6.close()     // Catch:{ IOException -> 0x0111 }
            long r9 = r3.length()     // Catch:{ IOException -> 0x0111 }
            r8.f5281a = r9     // Catch:{ IOException -> 0x0111 }
            r15.i(r0, r8)     // Catch:{ IOException -> 0x0111 }
            long r8 = r1.f6154b     // Catch:{ IOException -> 0x0111 }
            int r0 = r1.f6156d     // Catch:{ IOException -> 0x0111 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x0111 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00f9
            boolean r0 = com.google.android.gms.internal.ads.zzaq.f6038b     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.zzaq.c(r0, r2)     // Catch:{ IOException -> 0x0111 }
        L_0x0066:
            long r8 = r1.f6154b     // Catch:{ IOException -> 0x0111 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0111 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.v4> r0 = r1.f6153a     // Catch:{ IOException -> 0x0111 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x0111 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0111 }
            r2 = 0
        L_0x0077:
            boolean r6 = r0.hasNext()     // Catch:{ IOException -> 0x0111 }
            r12 = 2
            if (r6 == 0) goto L_0x00d0
            java.lang.Object r6 = r0.next()     // Catch:{ IOException -> 0x0111 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0111 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.v4 r6 = (com.google.android.gms.internal.ads.v4) r6     // Catch:{ IOException -> 0x0111 }
            java.lang.String r13 = r6.f5282b     // Catch:{ IOException -> 0x0111 }
            java.io.File r13 = r15.o(r13)     // Catch:{ IOException -> 0x0111 }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x0111 }
            if (r13 == 0) goto L_0x00a0
            long r13 = r1.f6154b     // Catch:{ IOException -> 0x0111 }
            r16 = r8
            long r7 = r6.f5281a     // Catch:{ IOException -> 0x0111 }
            long r13 = r13 - r7
            r1.f6154b = r13     // Catch:{ IOException -> 0x0111 }
            goto L_0x00b5
        L_0x00a0:
            r16 = r8
            java.lang.String r7 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x0111 }
            java.lang.String r9 = r6.f5282b     // Catch:{ IOException -> 0x0111 }
            r8[r5] = r9     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = r6.f5282b     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = n(r6)     // Catch:{ IOException -> 0x0111 }
            r8[r4] = r6     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.zzaq.a(r7, r8)     // Catch:{ IOException -> 0x0111 }
        L_0x00b5:
            r0.remove()     // Catch:{ IOException -> 0x0111 }
            int r2 = r2 + 1
            long r6 = r1.f6154b     // Catch:{ IOException -> 0x0111 }
            float r6 = (float) r6     // Catch:{ IOException -> 0x0111 }
            int r7 = r1.f6156d     // Catch:{ IOException -> 0x0111 }
            float r7 = (float) r7     // Catch:{ IOException -> 0x0111 }
            r8 = 1063675494(0x3f666666, float:0.9)
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ca
            goto L_0x00d2
        L_0x00ca:
            r8 = r16
            r7 = 1063675494(0x3f666666, float:0.9)
            goto L_0x0077
        L_0x00d0:
            r16 = r8
        L_0x00d2:
            boolean r0 = com.google.android.gms.internal.ads.zzaq.f6038b     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = "pruned %d files, %d bytes, %d ms"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0111 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0111 }
            r6[r5] = r2     // Catch:{ IOException -> 0x0111 }
            long r7 = r1.f6154b     // Catch:{ IOException -> 0x0111 }
            long r7 = r7 - r16
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0111 }
            r6[r4] = r2     // Catch:{ IOException -> 0x0111 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0111 }
            long r7 = r7 - r10
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0111 }
            r6[r12] = r2     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.zzaq.c(r0, r6)     // Catch:{ IOException -> 0x0111 }
        L_0x00f9:
            monitor-exit(r15)
            return
        L_0x00fb:
            r6.close()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0111 }
            r2[r5] = r6     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.zzaq.a(r0, r2)     // Catch:{ IOException -> 0x0111 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0111 }
            r0.<init>()     // Catch:{ IOException -> 0x0111 }
            throw r0     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "Could not clean up file %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x0126 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0126 }
            r2[r5] = r3     // Catch:{ all -> 0x0126 }
            com.google.android.gms.internal.ads.zzaq.a(r0, r2)     // Catch:{ all -> 0x0126 }
        L_0x0124:
            monitor-exit(r15)
            return
        L_0x0126:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzav.K(java.lang.String, com.google.android.gms.internal.ads.zzn):void");
    }

    private zzav(zzaz zzaz, int i) {
        this.f6153a = new LinkedHashMap(16, 0.75f, true);
        this.f6154b = 0;
        this.f6155c = zzaz;
        this.f6156d = 5242880;
    }

    public zzav(zzaz zzaz) {
        this(zzaz, 5242880);
    }
}
