package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbt;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class z7 extends c8 {
    private zzbt.zzb g;
    private final /* synthetic */ w7 h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z7(w7 w7Var, String str, int i, zzbt.zzb zzb) {
        super(str, i);
        this.h = w7Var;
        this.g = zzb;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.g.J();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return this.g.O();
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v15, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.zzcb.zzc r18, long r19, com.google.android.gms.measurement.internal.h r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = com.google.android.gms.internal.measurement.zzki.b()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.measurement.internal.w7 r1 = r0.h
            com.google.android.gms.measurement.internal.zzy r1 = r1.l()
            java.lang.String r4 = r0.f10137a
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzaq.g0
            boolean r1 = r1.z(r4, r5)
            if (r1 == 0) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            com.google.android.gms.internal.measurement.zzbt$zzb r4 = r0.g
            boolean r4 = r4.T()
            if (r4 == 0) goto L_0x0029
            r4 = r21
            long r4 = r4.f10216e
            goto L_0x002b
        L_0x0029:
            r4 = r19
        L_0x002b:
            com.google.android.gms.measurement.internal.w7 r6 = r0.h
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()
            r7 = 2
            boolean r6 = r6.C(r7)
            r7 = 0
            if (r6 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.w7 r6 = r0.h
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.O()
            int r8 = r0.f10138b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.android.gms.internal.measurement.zzbt$zzb r9 = r0.g
            boolean r9 = r9.I()
            if (r9 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.zzbt$zzb r9 = r0.g
            int r9 = r9.J()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x005d
        L_0x005c:
            r9 = r7
        L_0x005d:
            com.google.android.gms.measurement.internal.w7 r10 = r0.h
            com.google.android.gms.measurement.internal.zzes r10 = r10.e()
            com.google.android.gms.internal.measurement.zzbt$zzb r11 = r0.g
            java.lang.String r11 = r11.K()
            java.lang.String r10 = r10.w(r11)
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            r6.d(r11, r8, r9, r10)
            com.google.android.gms.measurement.internal.w7 r6 = r0.h
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.O()
            com.google.android.gms.measurement.internal.w7 r8 = r0.h
            com.google.android.gms.measurement.internal.zzkn r8 = r8.o()
            com.google.android.gms.internal.measurement.zzbt$zzb r9 = r0.g
            java.lang.String r8 = r8.B(r9)
            java.lang.String r9 = "Filter definition"
            r6.b(r9, r8)
        L_0x008d:
            com.google.android.gms.internal.measurement.zzbt$zzb r6 = r0.g
            boolean r6 = r6.I()
            if (r6 == 0) goto L_0x03ff
            com.google.android.gms.internal.measurement.zzbt$zzb r6 = r0.g
            int r6 = r6.J()
            r8 = 256(0x100, float:3.59E-43)
            if (r6 <= r8) goto L_0x00a1
            goto L_0x03ff
        L_0x00a1:
            com.google.android.gms.internal.measurement.zzbt$zzb r6 = r0.g
            boolean r6 = r6.Q()
            com.google.android.gms.internal.measurement.zzbt$zzb r8 = r0.g
            boolean r8 = r8.R()
            com.google.android.gms.internal.measurement.zzbt$zzb r9 = r0.g
            boolean r9 = r9.T()
            if (r6 != 0) goto L_0x00bc
            if (r8 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r6 = 0
            goto L_0x00bd
        L_0x00bc:
            r6 = 1
        L_0x00bd:
            if (r22 == 0) goto L_0x00e9
            if (r6 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.w7 r1 = r0.h
            com.google.android.gms.measurement.internal.zzeu r1 = r1.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.O()
            int r2 = r0.f10138b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.zzbt$zzb r4 = r0.g
            boolean r4 = r4.I()
            if (r4 == 0) goto L_0x00e3
            com.google.android.gms.internal.measurement.zzbt$zzb r4 = r0.g
            int r4 = r4.J()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x00e3:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r4, r2, r7)
            return r3
        L_0x00e9:
            com.google.android.gms.internal.measurement.zzbt$zzb r8 = r0.g
            java.lang.String r9 = r18.W()
            boolean r10 = r8.O()
            if (r10 == 0) goto L_0x010b
            com.google.android.gms.internal.measurement.zzbt$zzd r10 = r8.P()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c8.c(r4, r10)
            if (r4 != 0) goto L_0x0101
            goto L_0x03a2
        L_0x0101:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x010b
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x010b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r8.L()
            java.util.Iterator r5 = r5.iterator()
        L_0x0118:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0151
            java.lang.Object r10 = r5.next()
            com.google.android.gms.internal.measurement.zzbt$zzc r10 = (com.google.android.gms.internal.measurement.zzbt.zzc) r10
            java.lang.String r11 = r10.M()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()
            com.google.android.gms.measurement.internal.w7 r5 = r0.h
            com.google.android.gms.measurement.internal.zzes r5 = r5.e()
            java.lang.String r5 = r5.w(r9)
            java.lang.String r8 = "null or empty param name in filter. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0149:
            java.lang.String r10 = r10.M()
            r4.add(r10)
            goto L_0x0118
        L_0x0151:
            a.e.a r5 = new a.e.a
            r5.<init>()
            java.util.List r10 = r18.E()
            java.util.Iterator r10 = r10.iterator()
        L_0x015e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01eb
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.zzcb$zze r11 = (com.google.android.gms.internal.measurement.zzcb.zze) r11
            java.lang.String r12 = r11.P()
            boolean r12 = r4.contains(r12)
            if (r12 == 0) goto L_0x015e
            boolean r12 = r11.Y()
            if (r12 == 0) goto L_0x0192
            java.lang.String r12 = r11.P()
            boolean r13 = r11.Y()
            if (r13 == 0) goto L_0x018d
            long r13 = r11.Z()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x018e
        L_0x018d:
            r11 = r7
        L_0x018e:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x0192:
            boolean r12 = r11.c0()
            if (r12 == 0) goto L_0x01b0
            java.lang.String r12 = r11.P()
            boolean r13 = r11.c0()
            if (r13 == 0) goto L_0x01ab
            double r13 = r11.d0()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ac
        L_0x01ab:
            r11 = r7
        L_0x01ac:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01b0:
            boolean r12 = r11.U()
            if (r12 == 0) goto L_0x01c2
            java.lang.String r12 = r11.P()
            java.lang.String r11 = r11.V()
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01c2:
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()
            com.google.android.gms.measurement.internal.w7 r5 = r0.h
            com.google.android.gms.measurement.internal.zzes r5 = r5.e()
            java.lang.String r5 = r5.w(r9)
            com.google.android.gms.measurement.internal.w7 r8 = r0.h
            com.google.android.gms.measurement.internal.zzes r8 = r8.e()
            java.lang.String r9 = r11.P()
            java.lang.String r8 = r8.z(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x01eb:
            java.util.List r4 = r8.L()
            java.util.Iterator r4 = r4.iterator()
        L_0x01f3:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x03a0
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.zzbt$zzc r8 = (com.google.android.gms.internal.measurement.zzbt.zzc) r8
            boolean r10 = r8.J()
            if (r10 == 0) goto L_0x020d
            boolean r10 = r8.K()
            if (r10 == 0) goto L_0x020d
            r10 = 1
            goto L_0x020e
        L_0x020d:
            r10 = 0
        L_0x020e:
            java.lang.String r11 = r8.M()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0233
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()
            com.google.android.gms.measurement.internal.w7 r5 = r0.h
            com.google.android.gms.measurement.internal.zzes r5 = r5.e()
            java.lang.String r5 = r5.w(r9)
            java.lang.String r8 = "Event has empty param name. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0233:
            java.lang.Object r12 = r5.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0282
            boolean r13 = r8.H()
            if (r13 != 0) goto L_0x0266
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()
            com.google.android.gms.measurement.internal.w7 r5 = r0.h
            com.google.android.gms.measurement.internal.zzes r5 = r5.e()
            java.lang.String r5 = r5.w(r9)
            com.google.android.gms.measurement.internal.w7 r8 = r0.h
            com.google.android.gms.measurement.internal.zzes r8 = r8.e()
            java.lang.String r8 = r8.z(r11)
            java.lang.String r9 = "No number filter for long param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0266:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.zzbt$zzd r8 = r8.I()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.c8.c(r11, r8)
            if (r8 != 0) goto L_0x0278
            goto L_0x03a2
        L_0x0278:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x0282:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02cd
            boolean r13 = r8.H()
            if (r13 != 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()
            com.google.android.gms.measurement.internal.w7 r5 = r0.h
            com.google.android.gms.measurement.internal.zzes r5 = r5.e()
            java.lang.String r5 = r5.w(r9)
            com.google.android.gms.measurement.internal.w7 r8 = r0.h
            com.google.android.gms.measurement.internal.zzes r8 = r8.e()
            java.lang.String r8 = r8.z(r11)
            java.lang.String r9 = "No number filter for double param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x02b1:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.zzbt$zzd r8 = r8.I()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.c8.b(r11, r8)
            if (r8 != 0) goto L_0x02c3
            goto L_0x03a2
        L_0x02c3:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x02cd:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0354
            boolean r13 = r8.F()
            if (r13 == 0) goto L_0x02e8
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.zzbt$zzf r8 = r8.G()
            com.google.android.gms.measurement.internal.w7 r11 = r0.h
            com.google.android.gms.measurement.internal.zzeu r11 = r11.h()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.c8.g(r12, r8, r11)
            goto L_0x02fe
        L_0x02e8:
            boolean r13 = r8.H()
            if (r13 == 0) goto L_0x0330
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.zzkn.T(r12)
            if (r13 == 0) goto L_0x030c
            com.google.android.gms.internal.measurement.zzbt$zzd r8 = r8.I()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.c8.e(r12, r8)
        L_0x02fe:
            if (r8 != 0) goto L_0x0302
            goto L_0x03a2
        L_0x0302:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x030c:
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()
            com.google.android.gms.measurement.internal.w7 r5 = r0.h
            com.google.android.gms.measurement.internal.zzes r5 = r5.e()
            java.lang.String r5 = r5.w(r9)
            com.google.android.gms.measurement.internal.w7 r8 = r0.h
            com.google.android.gms.measurement.internal.zzes r8 = r8.e()
            java.lang.String r8 = r8.z(r11)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0330:
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()
            com.google.android.gms.measurement.internal.w7 r5 = r0.h
            com.google.android.gms.measurement.internal.zzes r5 = r5.e()
            java.lang.String r5 = r5.w(r9)
            com.google.android.gms.measurement.internal.w7 r8 = r0.h
            com.google.android.gms.measurement.internal.zzes r8 = r8.e()
            java.lang.String r8 = r8.z(r11)
            java.lang.String r9 = "No filter for String param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0354:
            if (r12 != 0) goto L_0x037c
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.O()
            com.google.android.gms.measurement.internal.w7 r5 = r0.h
            com.google.android.gms.measurement.internal.zzes r5 = r5.e()
            java.lang.String r5 = r5.w(r9)
            com.google.android.gms.measurement.internal.w7 r7 = r0.h
            com.google.android.gms.measurement.internal.zzes r7 = r7.e()
            java.lang.String r7 = r7.z(r11)
            java.lang.String r8 = "Missing param for filter. event, param"
            r4.c(r8, r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x037c:
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.J()
            com.google.android.gms.measurement.internal.w7 r5 = r0.h
            com.google.android.gms.measurement.internal.zzes r5 = r5.e()
            java.lang.String r5 = r5.w(r9)
            com.google.android.gms.measurement.internal.w7 r8 = r0.h
            com.google.android.gms.measurement.internal.zzes r8 = r8.e()
            java.lang.String r8 = r8.z(r11)
            java.lang.String r9 = "Unknown param type. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x03a0:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x03a2:
            com.google.android.gms.measurement.internal.w7 r4 = r0.h
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.O()
            if (r7 != 0) goto L_0x03b1
            java.lang.String r5 = "null"
            goto L_0x03b2
        L_0x03b1:
            r5 = r7
        L_0x03b2:
            java.lang.String r8 = "Event filter result"
            r4.b(r8, r5)
            if (r7 != 0) goto L_0x03ba
            return r2
        L_0x03ba:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f10139c = r2
            boolean r2 = r7.booleanValue()
            if (r2 != 0) goto L_0x03c5
            return r3
        L_0x03c5:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f10140d = r2
            if (r6 == 0) goto L_0x03fe
            boolean r2 = r18.X()
            if (r2 == 0) goto L_0x03fe
            long r4 = r18.Y()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.measurement.zzbt$zzb r4 = r0.g
            boolean r4 = r4.R()
            if (r4 == 0) goto L_0x03f0
            if (r1 == 0) goto L_0x03ed
            com.google.android.gms.internal.measurement.zzbt$zzb r1 = r0.g
            boolean r1 = r1.O()
            if (r1 == 0) goto L_0x03ed
            r2 = r16
        L_0x03ed:
            r0.f10142f = r2
            goto L_0x03fe
        L_0x03f0:
            if (r1 == 0) goto L_0x03fc
            com.google.android.gms.internal.measurement.zzbt$zzb r1 = r0.g
            boolean r1 = r1.O()
            if (r1 == 0) goto L_0x03fc
            r2 = r17
        L_0x03fc:
            r0.f10141e = r2
        L_0x03fe:
            return r3
        L_0x03ff:
            com.google.android.gms.measurement.internal.w7 r1 = r0.h
            com.google.android.gms.measurement.internal.zzeu r1 = r1.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.J()
            java.lang.String r4 = r0.f10137a
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r4)
            com.google.android.gms.internal.measurement.zzbt$zzb r5 = r0.g
            boolean r5 = r5.I()
            if (r5 == 0) goto L_0x0421
            com.google.android.gms.internal.measurement.zzbt$zzb r5 = r0.g
            int r5 = r5.J()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
        L_0x0421:
            java.lang.String r5 = java.lang.String.valueOf(r7)
            java.lang.String r6 = "Invalid event filter ID. appId, id"
            r1.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.w7 r1 = r0.h
            com.google.android.gms.measurement.internal.zzy r1 = r1.l()
            java.lang.String r4 = r0.f10137a
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzaq.d0
            boolean r1 = r1.z(r4, r5)
            if (r1 == 0) goto L_0x043b
            return r2
        L_0x043b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z7.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzcb$zzc, long, com.google.android.gms.measurement.internal.h, boolean):boolean");
    }
}
