package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class b extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f9544f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Context h;
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ zzag j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b(zzag zzag, String str, String str2, Context context, Bundle bundle) {
        super(zzag);
        this.j = zzag;
        this.f9544f = str;
        this.g = str2;
        this.h = context;
        this.i = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ Exception -> 0x00a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.zzag r2 = r14.j     // Catch:{ Exception -> 0x00a0 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a0 }
            r3.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.util.List unused = r2.f9734e = r3     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzag r2 = r14.j     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = r14.f9544f     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = r14.g     // Catch:{ Exception -> 0x00a0 }
            boolean r2 = com.google.android.gms.internal.measurement.zzag.I(r3, r4)     // Catch:{ Exception -> 0x00a0 }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.g     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r14.f9544f     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzag r4 = r14.j     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = r4.f9730a     // Catch:{ Exception -> 0x00a0 }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.h     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzag.T(r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.zzag.k     // Catch:{ Exception -> 0x00a0 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x00a0 }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            com.google.android.gms.internal.measurement.zzag r3 = r14.j     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzag r4 = r14.j     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r5 = r14.h     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzv r4 = r4.d(r5, r2)     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzv unused = r3.i = r4     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzag r3 = r14.j     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzv r3 = r3.i     // Catch:{ Exception -> 0x00a0 }
            if (r3 != 0) goto L_0x0060
            com.google.android.gms.internal.measurement.zzag r2 = r14.j     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r2.f9730a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x0060:
            android.content.Context r3 = r14.h     // Catch:{ Exception -> 0x00a0 }
            int r3 = com.google.android.gms.internal.measurement.zzag.R(r3)     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r4 = r14.h     // Catch:{ Exception -> 0x00a0 }
            int r4 = com.google.android.gms.internal.measurement.zzag.P(r4)     // Catch:{ Exception -> 0x00a0 }
            if (r2 == 0) goto L_0x0079
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x00a0 }
            if (r4 >= r3) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            r8 = r3
            goto L_0x0083
        L_0x0079:
            if (r3 <= 0) goto L_0x007c
            r4 = r3
        L_0x007c:
            if (r3 <= 0) goto L_0x0080
            r2 = 1
            goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            r8 = r2
            r2 = r4
        L_0x0083:
            com.google.android.gms.internal.measurement.zzae r13 = new com.google.android.gms.internal.measurement.zzae     // Catch:{ Exception -> 0x00a0 }
            r4 = 29000(0x7148, double:1.4328E-319)
            long r6 = (long) r2     // Catch:{ Exception -> 0x00a0 }
            android.os.Bundle r12 = r14.i     // Catch:{ Exception -> 0x00a0 }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzag r2 = r14.j     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzv r2 = r2.i     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r3 = r14.h     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.h0(r3)     // Catch:{ Exception -> 0x00a0 }
            long r4 = r14.f9736b     // Catch:{ Exception -> 0x00a0 }
            r2.initialize(r3, r13, r4)     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x00a0:
            r2 = move-exception
            com.google.android.gms.internal.measurement.zzag r3 = r14.j
            r3.p(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b.a():void");
    }
}
