package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v4 {

    /* renamed from: a  reason: collision with root package name */
    long f5098a;

    /* renamed from: b  reason: collision with root package name */
    final String f5099b;

    /* renamed from: c  reason: collision with root package name */
    final String f5100c;

    /* renamed from: d  reason: collision with root package name */
    final long f5101d;

    /* renamed from: e  reason: collision with root package name */
    final long f5102e;

    /* renamed from: f  reason: collision with root package name */
    final long f5103f;
    final long g;
    final List<zzu> h;

    private v4(String str, String str2, long j, long j2, long j3, long j4, List<zzu> list) {
        this.f5099b = str;
        this.f5100c = "".equals(str2) ? null : str2;
        this.f5101d = j;
        this.f5102e = j2;
        this.f5103f = j3;
        this.g = j4;
        this.h = list;
    }

    static v4 b(e6 e6Var) throws IOException {
        if (zzav.k(e6Var) == 538247942) {
            return new v4(zzav.e(e6Var), zzav.e(e6Var), zzav.m(e6Var), zzav.m(e6Var), zzav.m(e6Var), zzav.m(e6Var), zzav.l(e6Var));
        }
        throw new IOException();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(OutputStream outputStream) {
        try {
            zzav.f(outputStream, 538247942);
            zzav.h(outputStream, this.f5099b);
            zzav.h(outputStream, this.f5100c == null ? "" : this.f5100c);
            zzav.g(outputStream, this.f5101d);
            zzav.g(outputStream, this.f5102e);
            zzav.g(outputStream, this.f5103f);
            zzav.g(outputStream, this.g);
            List<zzu> list = this.h;
            if (list != null) {
                zzav.f(outputStream, list.size());
                for (zzu next : list) {
                    zzav.h(outputStream, next.a());
                    zzav.h(outputStream, next.b());
                }
            } else {
                zzav.f(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            zzaq.a("%s", e2.toString());
            return false;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    v4(java.lang.String r14, com.google.android.gms.internal.ads.zzn r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f8884b
            long r3 = r15.f8885c
            long r5 = r15.f8886d
            long r7 = r15.f8887e
            long r9 = r15.f8888f
            java.util.List<com.google.android.gms.internal.ads.zzu> r0 = r15.h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzu r11 = new com.google.android.gms.internal.ads.zzu
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v4.<init>(java.lang.String, com.google.android.gms.internal.ads.zzn):void");
    }
}
