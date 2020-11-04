package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbdt implements zzok {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f6191a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6192b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f6193c;

    /* renamed from: d  reason: collision with root package name */
    private final zzok f6194d;

    /* renamed from: e  reason: collision with root package name */
    private final zzoy<zzok> f6195e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbdw f6196f;
    private Uri g;

    public zzbdt(Context context, zzok zzok, zzoy<zzok> zzoy, zzbdw zzbdw) {
        this.f6193c = context;
        this.f6194d = zzok;
        this.f6195e = zzoy;
        this.f6196f = zzbdw;
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
        r1.f6196f.a(false, r6);
        r4 = new java.lang.StringBuilder(44);
        r4.append("Cache connection took ");
        r4.append(r6);
        r4.append("ms");
        com.google.android.gms.internal.ads.zzaxv.m(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        r4 = com.google.android.gms.ads.internal.zzq.zzld().b() - r11;
        r1.f6196f.a(false, r4);
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
            boolean r4 = r1.f6192b
            if (r4 != 0) goto L_0x015e
            r4 = 1
            r1.f6192b = r4
            android.net.Uri r5 = r0.f8950a
            r1.g = r5
            com.google.android.gms.internal.ads.zzoy<com.google.android.gms.internal.ads.zzok> r5 = r1.f6195e
            if (r5 == 0) goto L_0x001a
            r5.n(r1, r0)
        L_0x001a:
            android.net.Uri r5 = r0.f8950a
            com.google.android.gms.internal.ads.zzsy r5 = com.google.android.gms.internal.ads.zzsy.v(r5)
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzaav.P1
            com.google.android.gms.internal.ads.zzaar r7 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r6 = r7.c(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = -1
            if (r6 == 0) goto L_0x0118
            if (r5 == 0) goto L_0x0136
            long r9 = r0.f8953d
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
            android.content.Context r6 = r1.f6193c
            java.util.concurrent.Future r6 = com.google.android.gms.internal.ads.zztn.a(r6, r5)
            r13 = 0
            r14 = 44
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            java.lang.Object r9 = r6.get(r9, r15)     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            r1.f6191a = r9     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzq.zzld()
            long r5 = r0.b()
            long r5 = r5 - r11
            com.google.android.gms.internal.ads.zzbdw r0 = r1.f6196f
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
            com.google.android.gms.internal.ads.zzbdw r4 = r1.f6196f
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
            com.google.android.gms.internal.ads.zzbdw r4 = r1.f6196f
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
            com.google.android.gms.internal.ads.zzbdw r6 = r1.f6196f
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
            long r2 = r0.f8953d
            r5.i = r2
            com.google.android.gms.internal.ads.zzsq r2 = com.google.android.gms.ads.internal.zzq.zzlc()
            com.google.android.gms.internal.ads.zzsx r2 = r2.d(r5)
        L_0x0127:
            if (r2 == 0) goto L_0x0136
            boolean r3 = r2.u()
            if (r3 == 0) goto L_0x0136
            java.io.InputStream r0 = r2.v()
            r1.f6191a = r0
            return r7
        L_0x0136:
            if (r5 == 0) goto L_0x0157
            com.google.android.gms.internal.ads.zzop r2 = new com.google.android.gms.internal.ads.zzop
            java.lang.String r3 = r5.f9099b
            android.net.Uri r10 = android.net.Uri.parse(r3)
            byte[] r11 = r0.f8951b
            long r12 = r0.f8952c
            long r14 = r0.f8953d
            long r3 = r0.f8954e
            java.lang.String r5 = r0.f8955f
            int r0 = r0.g
            r9 = r2
            r16 = r3
            r18 = r5
            r19 = r0
            r9.<init>(r10, r11, r12, r14, r16, r18, r19)
            r0 = r2
        L_0x0157:
            com.google.android.gms.internal.ads.zzok r2 = r1.f6194d
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
        if (this.f6192b) {
            this.f6192b = false;
            this.g = null;
            InputStream inputStream = this.f6191a;
            if (inputStream != null) {
                IOUtils.a(inputStream);
                this.f6191a = null;
            } else {
                this.f6194d.close();
            }
            zzoy<zzok> zzoy = this.f6195e;
            if (zzoy != null) {
                zzoy.d(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    public final Uri e0() {
        return this.g;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f6192b) {
            InputStream inputStream = this.f6191a;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f6194d.read(bArr, i, i2);
            }
            zzoy<zzok> zzoy = this.f6195e;
            if (zzoy != null) {
                zzoy.q(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }
}
