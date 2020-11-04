package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class n5 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzhc f10140b;

    private n5(zzhc zzhc) {
        this.f10140b = zzhc;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1 A[SYNTHETIC, Splitter:B:33:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe A[Catch:{ Exception -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f A[SYNTHETIC, Splitter:B:51:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013e A[Catch:{ Exception -> 0x01d6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f A[Catch:{ Exception -> 0x01d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r21
            com.google.android.gms.measurement.internal.zzhc r3 = r1.f10140b
            r3.c()
            com.google.android.gms.measurement.internal.zzhc r3 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzy r3 = r3.l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.i0     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r3.t(r4)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r4 = "Activity created with data 'referrer' without required params"
            java.lang.String r5 = "utm_medium"
            java.lang.String r6 = "_cis"
            java.lang.String r7 = "utm_source"
            java.lang.String r8 = "utm_campaign"
            java.lang.String r10 = "gclid"
            if (r3 != 0) goto L_0x0044
            com.google.android.gms.measurement.internal.zzhc r3 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzy r3 = r3.l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzaq.k0     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r3.t(r11)     // Catch:{ Exception -> 0x01d6 }
            if (r3 != 0) goto L_0x0044
            com.google.android.gms.measurement.internal.zzhc r3 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzy r3 = r3.l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzaq.j0     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r3.t(r11)     // Catch:{ Exception -> 0x01d6 }
            if (r3 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r3 = 0
            goto L_0x009b
        L_0x0044:
            com.google.android.gms.measurement.internal.zzhc r3 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzkr r3 = r3.j()     // Catch:{ Exception -> 0x01d6 }
            boolean r11 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01d6 }
            if (r11 == 0) goto L_0x0051
            goto L_0x0042
        L_0x0051:
            boolean r11 = r2.contains(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            boolean r11 = r2.contains(r8)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            boolean r11 = r2.contains(r7)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            boolean r11 = r2.contains(r5)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            com.google.android.gms.measurement.internal.zzeu r3 = r3.h()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.N()     // Catch:{ Exception -> 0x01d6 }
            r3.a(r4)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x0042
        L_0x0075:
            java.lang.String r11 = "https://google.com/search?"
            java.lang.String r12 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x01d6 }
            int r13 = r12.length()     // Catch:{ Exception -> 0x01d6 }
            if (r13 == 0) goto L_0x0086
            java.lang.String r11 = r11.concat(r12)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x008c
        L_0x0086:
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x01d6 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x01d6 }
            r11 = r12
        L_0x008c:
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x01d6 }
            android.os.Bundle r3 = r3.A(r11)     // Catch:{ Exception -> 0x01d6 }
            if (r3 == 0) goto L_0x009b
            java.lang.String r11 = "referrer"
            r3.putString(r6, r11)     // Catch:{ Exception -> 0x01d6 }
        L_0x009b:
            r11 = 0
            java.lang.String r12 = "_cmp"
            r13 = 1
            if (r18 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.zzhc r14 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzkr r14 = r14.j()     // Catch:{ Exception -> 0x01d6 }
            r15 = r19
            android.os.Bundle r14 = r14.A(r15)     // Catch:{ Exception -> 0x01d6 }
            if (r14 == 0) goto L_0x00ff
            java.lang.String r15 = "intent"
            r14.putString(r6, r15)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzhc r6 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.zzaq.i0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.t(r15)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x00e3
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 != 0) goto L_0x00e3
            if (r3 == 0) goto L_0x00e3
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x00e3
            java.lang.String r6 = "_cer"
            java.lang.String r15 = "gclid=%s"
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r16 = r3.getString(r10)     // Catch:{ Exception -> 0x01d6 }
            r9[r11] = r16     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r9 = java.lang.String.format(r15, r9)     // Catch:{ Exception -> 0x01d6 }
            r14.putString(r6, r9)     // Catch:{ Exception -> 0x01d6 }
        L_0x00e3:
            com.google.android.gms.measurement.internal.zzhc r6 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            r6.R(r0, r12, r14)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzhc r6 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzaq.R0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.t(r9)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x00ff
            com.google.android.gms.measurement.internal.zzhc r6 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzp r6 = r6.h     // Catch:{ Exception -> 0x01d6 }
            r6.b(r0, r14)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x00ff
        L_0x00fe:
            r14 = 0
        L_0x00ff:
            com.google.android.gms.measurement.internal.zzhc r6 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzaq.k0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.t(r9)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r9 = "auto"
            if (r6 == 0) goto L_0x0138
            com.google.android.gms.measurement.internal.zzhc r6 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.zzaq.j0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.t(r15)     // Catch:{ Exception -> 0x01d6 }
            if (r6 != 0) goto L_0x0138
            if (r3 == 0) goto L_0x0138
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x0138
            if (r14 == 0) goto L_0x012d
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 != 0) goto L_0x0138
        L_0x012d:
            com.google.android.gms.measurement.internal.zzhc r6 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r14 = "_lgclid"
            java.lang.String r15 = r3.getString(r10)     // Catch:{ Exception -> 0x01d6 }
            r6.U(r9, r14, r15, r13)     // Catch:{ Exception -> 0x01d6 }
        L_0x0138:
            boolean r6 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x013f
            return
        L_0x013f:
            com.google.android.gms.measurement.internal.zzhc r6 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzeu r6 = r6.h()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.N()     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r14 = "Activity created with referrer"
            r6.b(r14, r2)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzhc r6 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.zzaq.j0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.t(r14)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r14 = "_ldl"
            if (r6 == 0) goto L_0x0191
            if (r3 == 0) goto L_0x017b
            com.google.android.gms.measurement.internal.zzhc r2 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            r2.R(r0, r12, r3)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzhc r2 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.R0     // Catch:{ Exception -> 0x01d6 }
            boolean r2 = r2.t(r4)     // Catch:{ Exception -> 0x01d6 }
            if (r2 == 0) goto L_0x018a
            com.google.android.gms.measurement.internal.zzhc r2 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzp r2 = r2.h     // Catch:{ Exception -> 0x01d6 }
            r2.b(r0, r3)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x018a
        L_0x017b:
            com.google.android.gms.measurement.internal.zzhc r0 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.N()     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.b(r3, r2)     // Catch:{ Exception -> 0x01d6 }
        L_0x018a:
            com.google.android.gms.measurement.internal.zzhc r0 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            r2 = 0
            r0.U(r9, r14, r2, r13)     // Catch:{ Exception -> 0x01d6 }
            return
        L_0x0191:
            boolean r0 = r2.contains(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r2.contains(r8)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r2.contains(r7)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r2.contains(r5)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01d6 }
            if (r0 == 0) goto L_0x01ba
        L_0x01b9:
            r11 = 1
        L_0x01ba:
            if (r11 != 0) goto L_0x01ca
            com.google.android.gms.measurement.internal.zzhc r0 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.h()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.N()     // Catch:{ Exception -> 0x01d6 }
            r0.a(r4)     // Catch:{ Exception -> 0x01d6 }
            return
        L_0x01ca:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01d5
            com.google.android.gms.measurement.internal.zzhc r0 = r1.f10140b     // Catch:{ Exception -> 0x01d6 }
            r0.U(r9, r14, r2, r13)     // Catch:{ Exception -> 0x01d6 }
        L_0x01d5:
            return
        L_0x01d6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhc r2 = r1.f10140b
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.n5.b(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f10140b.h().O().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f10140b.j();
                        this.f10140b.g().z(new q5(this, bundle == null, data, zzkr.Z(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
                        this.f10140b.t().H(activity, bundle);
                        return;
                    }
                }
                this.f10140b.t().H(activity, bundle);
            }
        } catch (Exception e2) {
            this.f10140b.h().G().b("Throwable caught in onActivityCreated", e2);
        } finally {
            this.f10140b.t().H(activity, bundle);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f10140b.t().W(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f10140b.t().U(activity);
        zzjv v = this.f10140b.v();
        v.g().z(new d7(v, v.n().b()));
    }

    public final void onActivityResumed(Activity activity) {
        zzjv v = this.f10140b.v();
        v.g().z(new b7(v, v.n().b()));
        this.f10140b.t().G(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f10140b.t().V(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* synthetic */ n5(zzhc zzhc, x4 x4Var) {
        this(zzhc);
    }
}
