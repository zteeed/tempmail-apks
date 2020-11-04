package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcb;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class a8 {

    /* renamed from: a  reason: collision with root package name */
    private zzcb.zzc f10104a;

    /* renamed from: b  reason: collision with root package name */
    private Long f10105b;

    /* renamed from: c  reason: collision with root package name */
    private long f10106c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ w7 f10107d;

    private a8(w7 w7Var) {
        this.f10107d = w7Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzcb.zzc a(java.lang.String r18, com.google.android.gms.internal.measurement.zzcb.zzc r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r8 = r19
            java.lang.String r9 = r19.W()
            java.util.List r10 = r19.E()
            com.google.android.gms.measurement.internal.w7 r2 = r1.f10107d
            com.google.android.gms.measurement.internal.zzkn r2 = r2.o()
            java.lang.String r3 = "_eid"
            java.lang.Object r2 = r2.V(r8, r3)
            r4 = r2
            java.lang.Long r4 = (java.lang.Long) r4
            r2 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0023
            r6 = 1
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            if (r6 == 0) goto L_0x0030
            java.lang.String r7 = "_ep"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0030
            r7 = 1
            goto L_0x0031
        L_0x0030:
            r7 = 0
        L_0x0031:
            r11 = 0
            if (r7 == 0) goto L_0x0147
            com.google.android.gms.measurement.internal.w7 r6 = r1.f10107d
            com.google.android.gms.measurement.internal.zzkn r6 = r6.o()
            java.lang.String r7 = "_en"
            java.lang.Object r6 = r6.V(r8, r7)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r6 == 0) goto L_0x005b
            com.google.android.gms.measurement.internal.w7 r0 = r1.f10107d
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.H()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.b(r2, r4)
            return r7
        L_0x005b:
            com.google.android.gms.internal.measurement.zzcb$zzc r6 = r1.f10104a
            if (r6 == 0) goto L_0x0071
            java.lang.Long r6 = r1.f10105b
            if (r6 == 0) goto L_0x0071
            long r13 = r4.longValue()
            java.lang.Long r6 = r1.f10105b
            long r15 = r6.longValue()
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x00a1
        L_0x0071:
            com.google.android.gms.measurement.internal.w7 r6 = r1.f10107d
            com.google.android.gms.measurement.internal.c r6 = r6.p()
            android.util.Pair r6 = r6.A(r0, r4)
            if (r6 == 0) goto L_0x0137
            java.lang.Object r13 = r6.first
            if (r13 != 0) goto L_0x0083
            goto L_0x0137
        L_0x0083:
            com.google.android.gms.internal.measurement.zzcb$zzc r13 = (com.google.android.gms.internal.measurement.zzcb.zzc) r13
            r1.f10104a = r13
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r1.f10106c = r6
            com.google.android.gms.measurement.internal.w7 r6 = r1.f10107d
            com.google.android.gms.measurement.internal.zzkn r6 = r6.o()
            com.google.android.gms.internal.measurement.zzcb$zzc r7 = r1.f10104a
            java.lang.Object r3 = r6.V(r7, r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r1.f10105b = r3
        L_0x00a1:
            long r6 = r1.f10106c
            r13 = 1
            long r6 = r6 - r13
            r1.f10106c = r6
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x00df
            com.google.android.gms.measurement.internal.w7 r3 = r1.f10107d
            com.google.android.gms.measurement.internal.c r3 = r3.p()
            r3.c()
            com.google.android.gms.measurement.internal.zzeu r4 = r3.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.O()
            java.lang.String r6 = "Clearing complex main event info. appId"
            r4.b(r6, r0)
            android.database.sqlite.SQLiteDatabase r4 = r3.w()     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r6 = "delete from main_event_params where app_id=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00d0 }
            r2[r5] = r0     // Catch:{ SQLiteException -> 0x00d0 }
            r4.execSQL(r6, r2)     // Catch:{ SQLiteException -> 0x00d0 }
            goto L_0x00ee
        L_0x00d0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzeu r2 = r3.h()
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()
            java.lang.String r3 = "Error clearing complex main event"
            r2.b(r3, r0)
            goto L_0x00ee
        L_0x00df:
            com.google.android.gms.measurement.internal.w7 r2 = r1.f10107d
            com.google.android.gms.measurement.internal.c r2 = r2.p()
            long r5 = r1.f10106c
            com.google.android.gms.internal.measurement.zzcb$zzc r7 = r1.f10104a
            r3 = r18
            r2.X(r3, r4, r5, r7)
        L_0x00ee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.zzcb$zzc r2 = r1.f10104a
            java.util.List r2 = r2.E()
            java.util.Iterator r2 = r2.iterator()
        L_0x00fd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzcb$zze r3 = (com.google.android.gms.internal.measurement.zzcb.zze) r3
            com.google.android.gms.measurement.internal.w7 r4 = r1.f10107d
            r4.o()
            java.lang.String r4 = r3.P()
            com.google.android.gms.internal.measurement.zzcb$zze r4 = com.google.android.gms.measurement.internal.zzkn.z(r8, r4)
            if (r4 != 0) goto L_0x00fd
            r0.add(r3)
            goto L_0x00fd
        L_0x011c:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0127
            r0.addAll(r10)
            r10 = r0
            goto L_0x018c
        L_0x0127:
            com.google.android.gms.measurement.internal.w7 r0 = r1.f10107d
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.H()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.b(r2, r9)
            goto L_0x018c
        L_0x0137:
            com.google.android.gms.measurement.internal.w7 r0 = r1.f10107d
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.H()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.c(r2, r9, r4)
            return r7
        L_0x0147:
            if (r6 == 0) goto L_0x018c
            r1.f10105b = r4
            r1.f10104a = r8
            com.google.android.gms.measurement.internal.w7 r2 = r1.f10107d
            com.google.android.gms.measurement.internal.zzkn r2 = r2.o()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            java.lang.String r5 = "_epc"
            java.lang.Object r2 = r2.V(r8, r5)
            if (r2 != 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r3 = r2
        L_0x0161:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.f10106c = r2
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x017d
            com.google.android.gms.measurement.internal.w7 r0 = r1.f10107d
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.H()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            r0.b(r2, r9)
            goto L_0x018c
        L_0x017d:
            com.google.android.gms.measurement.internal.w7 r2 = r1.f10107d
            com.google.android.gms.measurement.internal.c r2 = r2.p()
            long r5 = r1.f10106c
            r3 = r18
            r7 = r19
            r2.X(r3, r4, r5, r7)
        L_0x018c:
            com.google.android.gms.internal.measurement.zzfo$zza r0 = r19.x()
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r0 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r0
            r0.L(r9)
            r0.T()
            r0.I(r10)
            com.google.android.gms.internal.measurement.zzgw r0 = r0.q()
            com.google.android.gms.internal.measurement.zzfo r0 = (com.google.android.gms.internal.measurement.zzfo) r0
            com.google.android.gms.internal.measurement.zzcb$zzc r0 = (com.google.android.gms.internal.measurement.zzcb.zzc) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a8.a(java.lang.String, com.google.android.gms.internal.measurement.zzcb$zzc):com.google.android.gms.internal.measurement.zzcb$zzc");
    }

    /* synthetic */ a8(w7 w7Var, y7 y7Var) {
        this(w7Var);
    }
}
