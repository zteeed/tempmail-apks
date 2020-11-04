package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbt;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class b8 extends c8 {
    private zzbt.zze g;
    private final /* synthetic */ w7 h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b8(w7 w7Var, String str, int i, zzbt.zze zze) {
        super(str, i);
        this.h = w7Var;
        this.g = zze;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.g.G();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.zzcb.zzk r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = com.google.android.gms.internal.measurement.zzki.b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.w7 r0 = r10.h
            com.google.android.gms.measurement.internal.zzy r0 = r0.l()
            java.lang.String r3 = r10.f10137a
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.e0
            boolean r0 = r0.z(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            com.google.android.gms.internal.measurement.zzbt$zze r3 = r10.g
            boolean r3 = r3.J()
            com.google.android.gms.internal.measurement.zzbt$zze r4 = r10.g
            boolean r4 = r4.K()
            com.google.android.gms.internal.measurement.zzbt$zze r5 = r10.g
            boolean r5 = r5.M()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = 0
            goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.w7 r11 = r10.h
            com.google.android.gms.measurement.internal.zzeu r11 = r11.h()
            com.google.android.gms.measurement.internal.zzew r11 = r11.O()
            int r12 = r10.f10138b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.zzbt$zze r13 = r10.g
            boolean r13 = r13.F()
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.measurement.zzbt$zze r13 = r10.g
            int r13 = r13.G()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.c(r13, r12, r4)
            return r2
        L_0x0064:
            com.google.android.gms.internal.measurement.zzbt$zze r6 = r10.g
            com.google.android.gms.internal.measurement.zzbt$zzc r6 = r6.I()
            boolean r7 = r6.K()
            boolean r8 = r13.W()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.H()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.w7 r6 = r10.h
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.J()
            com.google.android.gms.measurement.internal.w7 r7 = r10.h
            com.google.android.gms.measurement.internal.zzes r7 = r7.e()
            java.lang.String r8 = r13.S()
            java.lang.String r7 = r7.A(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0099:
            long r8 = r13.X()
            com.google.android.gms.internal.measurement.zzbt$zzd r4 = r6.I()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c8.c(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c8.d(r4, r7)
            goto L_0x0189
        L_0x00ab:
            boolean r8 = r13.Y()
            if (r8 == 0) goto L_0x00e8
            boolean r8 = r6.H()
            if (r8 != 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.w7 r6 = r10.h
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.J()
            com.google.android.gms.measurement.internal.w7 r7 = r10.h
            com.google.android.gms.measurement.internal.zzes r7 = r7.e()
            java.lang.String r8 = r13.S()
            java.lang.String r7 = r7.A(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x00d6:
            double r8 = r13.Z()
            com.google.android.gms.internal.measurement.zzbt$zzd r4 = r6.I()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c8.b(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c8.d(r4, r7)
            goto L_0x0189
        L_0x00e8:
            boolean r8 = r13.U()
            if (r8 == 0) goto L_0x016c
            boolean r8 = r6.F()
            if (r8 != 0) goto L_0x0155
            boolean r8 = r6.H()
            if (r8 != 0) goto L_0x0118
            com.google.android.gms.measurement.internal.w7 r6 = r10.h
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.J()
            com.google.android.gms.measurement.internal.w7 r7 = r10.h
            com.google.android.gms.measurement.internal.zzes r7 = r7.e()
            java.lang.String r8 = r13.S()
            java.lang.String r7 = r7.A(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0118:
            java.lang.String r8 = r13.V()
            boolean r8 = com.google.android.gms.measurement.internal.zzkn.T(r8)
            if (r8 == 0) goto L_0x0133
            java.lang.String r4 = r13.V()
            com.google.android.gms.internal.measurement.zzbt$zzd r6 = r6.I()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c8.e(r4, r6)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c8.d(r4, r7)
            goto L_0x0189
        L_0x0133:
            com.google.android.gms.measurement.internal.w7 r6 = r10.h
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.J()
            com.google.android.gms.measurement.internal.w7 r7 = r10.h
            com.google.android.gms.measurement.internal.zzes r7 = r7.e()
            java.lang.String r8 = r13.S()
            java.lang.String r7 = r7.A(r8)
            java.lang.String r8 = r13.V()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x0189
        L_0x0155:
            java.lang.String r4 = r13.V()
            com.google.android.gms.internal.measurement.zzbt$zzf r6 = r6.G()
            com.google.android.gms.measurement.internal.w7 r8 = r10.h
            com.google.android.gms.measurement.internal.zzeu r8 = r8.h()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c8.g(r4, r6, r8)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c8.d(r4, r7)
            goto L_0x0189
        L_0x016c:
            com.google.android.gms.measurement.internal.w7 r6 = r10.h
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.J()
            com.google.android.gms.measurement.internal.w7 r7 = r10.h
            com.google.android.gms.measurement.internal.zzes r7 = r7.e()
            java.lang.String r8 = r13.S()
            java.lang.String r7 = r7.A(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.b(r8, r7)
        L_0x0189:
            com.google.android.gms.measurement.internal.w7 r6 = r10.h
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.O()
            if (r4 != 0) goto L_0x0198
            java.lang.String r7 = "null"
            goto L_0x0199
        L_0x0198:
            r7 = r4
        L_0x0199:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r4 != 0) goto L_0x01a1
            return r1
        L_0x01a1:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.f10139c = r1
            if (r5 == 0) goto L_0x01ae
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x01ae
            return r2
        L_0x01ae:
            if (r14 == 0) goto L_0x01b8
            com.google.android.gms.internal.measurement.zzbt$zze r14 = r10.g
            boolean r14 = r14.J()
            if (r14 == 0) goto L_0x01ba
        L_0x01b8:
            r10.f10140d = r4
        L_0x01ba:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01ff
            if (r3 == 0) goto L_0x01ff
            boolean r14 = r13.K()
            if (r14 == 0) goto L_0x01ff
            long r13 = r13.L()
            if (r11 == 0) goto L_0x01d2
            long r13 = r11.longValue()
        L_0x01d2:
            if (r0 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.zzbt$zze r11 = r10.g
            boolean r11 = r11.J()
            if (r11 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.zzbt$zze r11 = r10.g
            boolean r11 = r11.K()
            if (r11 != 0) goto L_0x01ea
            if (r12 == 0) goto L_0x01ea
            long r13 = r12.longValue()
        L_0x01ea:
            com.google.android.gms.internal.measurement.zzbt$zze r11 = r10.g
            boolean r11 = r11.K()
            if (r11 == 0) goto L_0x01f9
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f10142f = r11
            goto L_0x01ff
        L_0x01f9:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f10141e = r11
        L_0x01ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b8.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzcb$zzk, boolean):boolean");
    }
}
