package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbdt implements zzok {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f6374a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6375b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f6376c;

    /* renamed from: d  reason: collision with root package name */
    private final zzok f6377d;

    /* renamed from: e  reason: collision with root package name */
    private final zzoy<zzok> f6378e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbdw f6379f;
    private Uri g;

    public zzbdt(Context context, zzok zzok, zzoy<zzok> zzoy, zzbdw zzbdw) {
        this.f6376c = context;
        this.f6377d = zzok;
        this.f6378e = zzoy;
        this.f6379f = zzbdw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6.cancel(true);
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d0, code lost:
        r6 = com.google.android.gms.ads.internal.zzq.zzld().b() - r11;
        r1.f6379f.a(false, r6);
        r4 = new java.lang.StringBuilder(44);
        r4.append("Cache connection took ");
        r4.append(r6);
        r4.append("ms");
        com.google.android.gms.internal.ads.zzaxv.m(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        r4 = com.google.android.gms.ads.internal.zzq.zzld().b() - r11;
        r1.f6379f.a(false, r4);
        r6 = new java.lang.StringBuilder(44);
        r6.append("Cache connection took ");
        r6.append(r4);
        r6.append("ms");
        com.google.android.gms.internal.ads.zzaxv.m(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0117, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x009f, B:21:0x00cd] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00cd */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x00cd=Splitter:B:21:0x00cd, B:18:0x009f=Splitter:B:18:0x009f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.zzop r21) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "ms"
            java.lang.String r3 = "Cache connection took "
            boolean r4 = r1.f6375b
            if (r4 != 0) goto L_0x015e
            r4 = 1
            r1.f6375b = r4
            android.net.Uri r5 = r0.f9133a
            r1.g = r5
            com.google.android.gms.internal.ads.zzoy<com.google.android.gms.internal.ads.zzok> r5 = r1.f6378e
            if (r5 == 0) goto L_0x001a
            r5.n(r1, r0)
        L_0x001a:
            android.net.Uri r5 = r0.f9133a
            com.google.android.gms.internal.ads.zzsy r5 = com.google.android.gms.internal.ads.zzsy.v(r5)
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzaav.P1
            com.google.android.gms.internal.ads.zzaar r7 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r6 = r7.c(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = -1
            if (r6 == 0) goto L_0x0118
            if (r5 == 0) goto L_0x0136
            long r9 = r0.f9136d
            r5.i = r9
            boolean r6 = r5.h
            if (r6 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzaag<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzaav.R1
            com.google.android.gms.internal.ads.zzaar r9 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r6 = r9.c(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            goto L_0x0057
        L_0x004b:
            com.google.android.gms.internal.ads.zzaag<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzaav.Q1
            com.google.android.gms.internal.ads.zzaar r9 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r6 = r9.c(r6)
            java.lang.Long r6 = (java.lang.Long) r6
        L_0x0057:
            long r9 = r6.longValue()
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzq.zzld()
            long r11 = r6.b()
            com.google.android.gms.ads.internal.zzq.zzlq()
            android.content.Context r6 = r1.f6376c
            java.util.concurrent.Future r6 = com.google.android.gms.internal.ads.zztn.a(r6, r5)
            r13 = 0
            r14 = 44
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            java.lang.Object r9 = r6.get(r9, r15)     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            r1.f6374a = r9     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzq.zzld()
            long r5 = r0.b()
            long r5 = r5 - r11
            com.google.android.gms.internal.ads.zzbdw r0 = r1.f6379f
            r0.a(r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzaxv.m(r0)
            return r7
        L_0x009d:
            r0 = move-exception
            goto L_0x00f4
        L_0x009f:
            r6.cancel(r4)     // Catch:{ all -> 0x009d }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x009d }
            r4.interrupt()     // Catch:{ all -> 0x009d }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzq.zzld()
            long r6 = r4.b()
            long r6 = r6 - r11
            com.google.android.gms.internal.ads.zzbdw r4 = r1.f6379f
            r4.a(r13, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzaxv.m(r2)
            goto L_0x0136
        L_0x00cd:
            r6.cancel(r4)     // Catch:{ all -> 0x009d }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzq.zzld()
            long r6 = r4.b()
            long r6 = r6 - r11
            com.google.android.gms.internal.ads.zzbdw r4 = r1.f6379f
            r4.a(r13, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzaxv.m(r2)
            goto L_0x0136
        L_0x00f4:
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzq.zzld()
            long r4 = r4.b()
            long r4 = r4 - r11
            com.google.android.gms.internal.ads.zzbdw r6 = r1.f6379f
            r6.a(r13, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r14)
            r6.append(r3)
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.google.android.gms.internal.ads.zzaxv.m(r2)
            throw r0
        L_0x0118:
            r2 = 0
            if (r5 == 0) goto L_0x0127
            long r2 = r0.f9136d
            r5.i = r2
            com.google.android.gms.internal.ads.zzsq r2 = com.google.android.gms.ads.internal.zzq.zzlc()
            com.google.android.gms.internal.ads.zzsx r2 = r2.d(r5)
        L_0x0127:
            if (r2 == 0) goto L_0x0136
            boolean r3 = r2.u()
            if (r3 == 0) goto L_0x0136
            java.io.InputStream r0 = r2.v()
            r1.f6374a = r0
            return r7
        L_0x0136:
            if (r5 == 0) goto L_0x0157
            com.google.android.gms.internal.ads.zzop r2 = new com.google.android.gms.internal.ads.zzop
            java.lang.String r3 = r5.f9282b
            android.net.Uri r10 = android.net.Uri.parse(r3)
            byte[] r11 = r0.f9134b
            long r12 = r0.f9135c
            long r14 = r0.f9136d
            long r3 = r0.f9137e
            java.lang.String r5 = r0.f9138f
            int r0 = r0.g
            r9 = r2
            r16 = r3
            r18 = r5
            r19 = r0
            r9.<init>(r10, r11, r12, r14, r16, r18, r19)
            r0 = r2
        L_0x0157:
            com.google.android.gms.internal.ads.zzok r2 = r1.f6377d
            long r2 = r2.a(r0)
            return r2
        L_0x015e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdt.a(com.google.android.gms.internal.ads.zzop):long");
    }

    public final void close() throws IOException {
        if (this.f6375b) {
            this.f6375b = false;
            this.g = null;
            InputStream inputStream = this.f6374a;
            if (inputStream != null) {
                IOUtils.a(inputStream);
                this.f6374a = null;
            } else {
                this.f6377d.close();
            }
            zzoy<zzok> zzoy = this.f6378e;
            if (zzoy != null) {
                zzoy.d(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    public final Uri k0() {
        return this.g;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f6375b) {
            InputStream inputStream = this.f6374a;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f6377d.read(bArr, i, i2);
            }
            zzoy<zzok> zzoy = this.f6378e;
            if (zzoy != null) {
                zzoy.q(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }
}
