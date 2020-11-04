package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbfe extends zzbes implements zzoy<zzok> {

    /* renamed from: e  reason: collision with root package name */
    private String f6405e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbdc f6406f;
    private boolean g;
    private final x8 h = new x8();
    private final zzbek i = new zzbek();
    private ByteBuffer j;
    private boolean k;
    private final Object l = new Object();
    private boolean m;

    public zzbfe(zzbdb zzbdb, zzbdc zzbdc) {
        super(zzbdb);
        this.f6406f = zzbdc;
    }

    private final void B() {
        int b2 = (int) this.h.b();
        int a2 = (int) this.i.a(this.j);
        int position = this.j.position();
        int round = Math.round(((float) a2) * (((float) position) / ((float) b2)));
        boolean z = round > 0;
        int A = zzbdy.A();
        int B = zzbdy.B();
        String str = this.f6405e;
        j(str, w(str), position, b2, (long) round, (long) a2, z, A, B);
    }

    public final boolean A() {
        return this.m;
    }

    public final void c() {
        this.g = true;
    }

    public final /* bridge */ /* synthetic */ void d(Object obj) {
    }

    public final /* synthetic */ void n(Object obj, zzop zzop) {
        zzok zzok = (zzok) obj;
        if (zzok instanceof zzor) {
            this.h.a((zzor) zzok);
        }
    }

    public final /* bridge */ /* synthetic */ void q(Object obj, int i2) {
    }

    /* JADX WARNING: type inference failed for: r1v31, types: [com.google.android.gms.internal.ads.zzbdt] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r9.j.remaining() > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        if (r9.g != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        r12 = r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        if ((r12 - r16) < r4) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        B();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1 = new java.lang.StringBuilder(49);
        r1.append("Timeout exceeded. Limit: ");
        r1.append(r6);
        r1.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010a, code lost:
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010b, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1 = r9.j.limit();
        r3 = new java.lang.StringBuilder(35);
        r3.append("Precache abort at ");
        r3.append(r1);
        r3.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0130, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0136, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0137, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(java.lang.String r22) {
        /*
            r21 = this;
            r9 = r21
            r10 = r22
            r9.f6405e = r10
            java.lang.String r11 = r21.w(r22)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.zzor r0 = new com.google.android.gms.internal.ads.zzor     // Catch:{ Exception -> 0x013c }
            java.lang.String r2 = r9.f6399c     // Catch:{ Exception -> 0x013c }
            r3 = 0
            com.google.android.gms.internal.ads.zzbdc r1 = r9.f6406f     // Catch:{ Exception -> 0x013c }
            int r5 = r1.f6356d     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbdc r1 = r9.f6406f     // Catch:{ Exception -> 0x013c }
            int r6 = r1.f6357e     // Catch:{ Exception -> 0x013c }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbdc r1 = r9.f6406f     // Catch:{ Exception -> 0x013c }
            boolean r1 = r1.i     // Catch:{ Exception -> 0x013c }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzbdt r1 = new com.google.android.gms.internal.ads.zzbdt     // Catch:{ Exception -> 0x0032 }
            android.content.Context r2 = r9.f6398b     // Catch:{ Exception -> 0x0032 }
            r3 = 0
            r1.<init>(r2, r0, r3, r3)     // Catch:{ Exception -> 0x0032 }
            r0 = r1
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            goto L_0x013f
        L_0x0035:
            android.net.Uri r1 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzop r2 = new com.google.android.gms.internal.ads.zzop     // Catch:{ Exception -> 0x013c }
            r2.<init>(r1)     // Catch:{ Exception -> 0x013c }
            r0.a(r2)     // Catch:{ Exception -> 0x013c }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzbdb> r1 = r9.f6400d     // Catch:{ Exception -> 0x013c }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbdb r1 = (com.google.android.gms.internal.ads.zzbdb) r1     // Catch:{ Exception -> 0x013c }
            if (r1 == 0) goto L_0x004e
            r1.g(r11, r9)     // Catch:{ Exception -> 0x0032 }
        L_0x004e:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzq.zzld()     // Catch:{ Exception -> 0x013c }
            long r2 = r1.a()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzaag<java.lang.Long> r4 = com.google.android.gms.internal.ads.zzaav.q     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzaar r5 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ Exception -> 0x013c }
            java.lang.Object r4 = r5.c(r4)     // Catch:{ Exception -> 0x013c }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x013c }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzaag<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzaav.p     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzaar r7 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ Exception -> 0x013c }
            java.lang.Object r6 = r7.c(r6)     // Catch:{ Exception -> 0x013c }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x013c }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbdc r8 = r9.f6406f     // Catch:{ Exception -> 0x013c }
            int r8 = r8.f6355c     // Catch:{ Exception -> 0x013c }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x013c }
            r9.j = r8     // Catch:{ Exception -> 0x013c }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x013c }
            r16 = r2
        L_0x0086:
            java.nio.ByteBuffer r14 = r9.j     // Catch:{ Exception -> 0x013c }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x013c }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x013c }
            int r14 = r0.read(r15, r13, r14)     // Catch:{ Exception -> 0x013c }
            r8 = -1
            if (r14 != r8) goto L_0x00a9
            r8 = 1
            r9.m = r8     // Catch:{ Exception -> 0x0032 }
            com.google.android.gms.internal.ads.zzbek r0 = r9.i     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.j     // Catch:{ Exception -> 0x0032 }
            long r0 = r0.a(r1)     // Catch:{ Exception -> 0x0032 }
            int r1 = (int) r0     // Catch:{ Exception -> 0x0032 }
            long r0 = (long) r1     // Catch:{ Exception -> 0x0032 }
            r9.o(r10, r11, r0)     // Catch:{ Exception -> 0x0032 }
        L_0x00a7:
            r1 = 1
            goto L_0x00c8
        L_0x00a9:
            java.lang.Object r8 = r9.l     // Catch:{ Exception -> 0x013c }
            monitor-enter(r8)     // Catch:{ Exception -> 0x013c }
            boolean r13 = r9.g     // Catch:{ all -> 0x0131 }
            if (r13 != 0) goto L_0x00b9
            java.nio.ByteBuffer r13 = r9.j     // Catch:{ all -> 0x0131 }
            r18 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x013a }
            goto L_0x00bb
        L_0x00b9:
            r18 = r12
        L_0x00bb:
            monitor-exit(r8)     // Catch:{ all -> 0x013a }
            java.nio.ByteBuffer r8 = r9.j     // Catch:{ Exception -> 0x0136 }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x0136 }
            if (r8 > 0) goto L_0x00c9
            r21.B()     // Catch:{ Exception -> 0x0136 }
            goto L_0x00a7
        L_0x00c8:
            return r1
        L_0x00c9:
            boolean r8 = r9.g     // Catch:{ Exception -> 0x0136 }
            if (r8 != 0) goto L_0x010b
            long r12 = r1.a()     // Catch:{ Exception -> 0x0136 }
            long r19 = r12 - r16
            int r8 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00dc
            r21.B()     // Catch:{ Exception -> 0x0136 }
            r16 = r12
        L_0x00dc:
            long r12 = r12 - r2
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r6
            int r8 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r8 > 0) goto L_0x00eb
            r12 = r18
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x0086
        L_0x00eb:
            java.lang.String r12 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            r1.append(r6)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = " sec"
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0032 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            throw r1     // Catch:{ Exception -> 0x0032 }
        L_0x010b:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.j     // Catch:{ Exception -> 0x0032 }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x0032 }
            r2 = 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = "Precache abort at "
            r3.append(r2)     // Catch:{ Exception -> 0x0032 }
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = " bytes"
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0032 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0032 }
            throw r0     // Catch:{ Exception -> 0x0032 }
        L_0x0131:
            r0 = move-exception
            r18 = r12
        L_0x0134:
            monitor-exit(r8)     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            r12 = r18
            goto L_0x013f
        L_0x013a:
            r0 = move-exception
            goto L_0x0134
        L_0x013c:
            r0 = move-exception
            r18 = r12
        L_0x013f:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = java.lang.String.valueOf(r22)
            int r1 = r1.length()
            int r1 = r1 + 34
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzbba.i(r1)
            r9.l(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfe.v(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    public final String w(String str) {
        String valueOf = String.valueOf(super.w(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    public final ByteBuffer y() {
        synchronized (this.l) {
            if (this.j != null && !this.k) {
                this.j.flip();
                this.k = true;
            }
            this.g = true;
        }
        return this.j;
    }

    public final String z() {
        return this.f6405e;
    }
}
