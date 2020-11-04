package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzw;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzir extends x3 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final zzji f10488c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public zzem f10489d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f10490e;

    /* renamed from: f  reason: collision with root package name */
    private final f f10491f;
    private final j7 g;
    private final List<Runnable> h = new ArrayList();
    private final f i;

    protected zzir(zzfy zzfy) {
        super(zzfy);
        this.g = new j7(zzfy.n());
        this.f10488c = new zzji(this);
        this.f10491f = new b6(this, zzfy);
        this.i = new k6(this, zzfy);
    }

    private final zzn E(boolean z) {
        m();
        return r().C(z ? h().P() : null);
    }

    /* access modifiers changed from: private */
    public final void F(ComponentName componentName) {
        c();
        if (this.f10489d != null) {
            this.f10489d = null;
            h().O().b("Disconnected from device MeasurementService", componentName);
            c();
            a0();
        }
    }

    private final void S(Runnable runnable) throws IllegalStateException {
        c();
        if (W()) {
            runnable.run();
        } else if (((long) this.h.size()) >= 1000) {
            h().G().a("Discarding data. Max runnable queue size reached");
        } else {
            this.h.add(runnable);
            this.i.c(60000);
            a0();
        }
    }

    private final boolean e0() {
        m();
        return true;
    }

    /* access modifiers changed from: private */
    public final void f0() {
        c();
        this.g.a();
        this.f10491f.c(zzaq.J.a(null).longValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean g0() {
        /*
            r5 = this;
            r5.c()
            r5.y()
            java.lang.Boolean r0 = r5.f10490e
            if (r0 != 0) goto L_0x0104
            r5.c()
            r5.y()
            com.google.android.gms.measurement.internal.q3 r0 = r5.k()
            java.lang.Boolean r0 = r0.F()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00fe
        L_0x0023:
            r5.m()
            com.google.android.gms.measurement.internal.zzer r2 = r5.r()
            int r2 = r2.I()
            r3 = 0
            if (r2 != r1) goto L_0x0034
        L_0x0031:
            r0 = 1
            goto L_0x00da
        L_0x0034:
            com.google.android.gms.measurement.internal.zzeu r2 = r5.h()
            com.google.android.gms.measurement.internal.zzew r2 = r2.O()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.zzkr r2 = r5.j()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.u(r4)
            if (r2 == 0) goto L_0x00cb
            if (r2 == r1) goto L_0x00bb
            r4 = 2
            if (r2 == r4) goto L_0x009b
            r0 = 3
            if (r2 == r0) goto L_0x008c
            r0 = 9
            if (r2 == r0) goto L_0x007e
            r0 = 18
            if (r2 == r0) goto L_0x0070
            com.google.android.gms.measurement.internal.zzeu r0 = r5.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.J()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
            goto L_0x0099
        L_0x0070:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.J()
            java.lang.String r2 = "Service updating"
            r0.a(r2)
            goto L_0x0031
        L_0x007e:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.J()
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L_0x0099
        L_0x008c:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.J()
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
        L_0x0099:
            r0 = 0
            goto L_0x00c9
        L_0x009b:
            com.google.android.gms.measurement.internal.zzeu r2 = r5.h()
            com.google.android.gms.measurement.internal.zzew r2 = r2.N()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.zzkr r2 = r5.j()
            int r2 = r2.K0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00b5
            goto L_0x00c8
        L_0x00b5:
            if (r0 != 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            r0 = 0
            goto L_0x00da
        L_0x00bb:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.O()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
        L_0x00c8:
            r0 = 1
        L_0x00c9:
            r1 = 0
            goto L_0x00da
        L_0x00cb:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.O()
            java.lang.String r2 = "Service available"
            r0.a(r2)
            goto L_0x0031
        L_0x00da:
            if (r1 != 0) goto L_0x00f4
            com.google.android.gms.measurement.internal.zzy r2 = r5.l()
            boolean r2 = r2.R()
            if (r2 == 0) goto L_0x00f4
            com.google.android.gms.measurement.internal.zzeu r0 = r5.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto L_0x00f5
        L_0x00f4:
            r3 = r0
        L_0x00f5:
            if (r3 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.q3 r0 = r5.k()
            r0.v(r1)
        L_0x00fe:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f10490e = r0
        L_0x0104:
            java.lang.Boolean r0 = r5.f10490e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzir.g0():boolean");
    }

    /* access modifiers changed from: private */
    public final void h0() {
        c();
        if (W()) {
            h().O().a("Inactivity, disconnecting from the service");
            c0();
        }
    }

    /* access modifiers changed from: private */
    public final void i0() {
        c();
        h().O().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        for (Runnable run : this.h) {
            try {
                run.run();
            } catch (Exception e2) {
                h().G().b("Task exception while flushing queue", e2);
            }
        }
        this.h.clear();
        this.i.e();
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return false;
    }

    public final void G(Bundle bundle) {
        c();
        y();
        S(new h6(this, bundle, E(false)));
    }

    public final void H(zzw zzw) {
        c();
        y();
        S(new g6(this, E(false), zzw));
    }

    public final void I(zzw zzw, zzao zzao, String str) {
        c();
        y();
        if (j().u(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            h().J().a("Not bundling data. Service unavailable or out of date");
            j().U(zzw, new byte[0]);
            return;
        }
        S(new l6(this, zzao, str, zzw));
    }

    /* access modifiers changed from: protected */
    public final void J(zzw zzw, String str, String str2) {
        c();
        y();
        S(new r6(this, str, str2, E(false), zzw));
    }

    /* access modifiers changed from: protected */
    public final void K(zzw zzw, String str, String str2, boolean z) {
        c();
        y();
        S(new s6(this, str, str2, z, E(false), zzw));
    }

    /* access modifiers changed from: protected */
    public final void L(zzao zzao, String str) {
        Preconditions.k(zzao);
        c();
        y();
        boolean e0 = e0();
        S(new m6(this, e0, e0 && u().F(zzao), zzao, E(true), str));
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final void M(zzem zzem) {
        c();
        Preconditions.k(zzem);
        this.f10489d = zzem;
        f0();
        i0();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void N(zzem zzem, AbstractSafeParcelable abstractSafeParcelable, zzn zzn) {
        int i2;
        List<AbstractSafeParcelable> D;
        c();
        a();
        y();
        boolean e0 = e0();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!e0 || (D = u().D(100)) == null) {
                i2 = 0;
            } else {
                arrayList.addAll(D);
                i2 = D.size();
            }
            if (abstractSafeParcelable != null && i2 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzao) {
                    try {
                        zzem.d4((zzao) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e2) {
                        h().G().b("Failed to send event to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkq) {
                    try {
                        zzem.i3((zzkq) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e3) {
                        h().G().b("Failed to send user property to the service", e3);
                    }
                } else if (abstractSafeParcelable2 instanceof zzw) {
                    try {
                        zzem.l0((zzw) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e4) {
                        h().G().b("Failed to send conditional user property to the service", e4);
                    }
                } else {
                    h().G().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i2;
        }
    }

    /* access modifiers changed from: protected */
    public final void O(zzij zzij) {
        c();
        y();
        S(new i6(this, zzij));
    }

    /* access modifiers changed from: protected */
    public final void Q(zzkq zzkq) {
        c();
        y();
        S(new c6(this, e0() && u().G(zzkq), zzkq, E(true)));
    }

    /* access modifiers changed from: protected */
    public final void R(zzw zzw) {
        Preconditions.k(zzw);
        c();
        y();
        m();
        S(new p6(this, true, u().H(zzw), new zzw(zzw), E(true), zzw));
    }

    public final void T(AtomicReference<String> atomicReference) {
        c();
        y();
        S(new d6(this, atomicReference, E(false)));
    }

    /* access modifiers changed from: protected */
    public final void U(AtomicReference<List<zzw>> atomicReference, String str, String str2, String str3) {
        c();
        y();
        S(new o6(this, atomicReference, str, str2, str3, E(false)));
    }

    /* access modifiers changed from: protected */
    public final void V(AtomicReference<List<zzkq>> atomicReference, String str, String str2, String str3, boolean z) {
        c();
        y();
        S(new q6(this, atomicReference, str, str2, str3, z, E(false)));
    }

    public final boolean W() {
        c();
        y();
        return this.f10489d != null;
    }

    /* access modifiers changed from: protected */
    public final void X() {
        c();
        y();
        S(new n6(this, E(true)));
    }

    /* access modifiers changed from: protected */
    public final void Y() {
        c();
        a();
        y();
        zzn E = E(false);
        if (e0()) {
            u().I();
        }
        S(new e6(this, E));
    }

    /* access modifiers changed from: protected */
    public final void Z() {
        c();
        y();
        zzn E = E(true);
        u().J();
        S(new f6(this, E));
    }

    /* access modifiers changed from: package-private */
    public final void a0() {
        c();
        y();
        if (!W()) {
            if (g0()) {
                this.f10488c.d();
            } else if (!l().R()) {
                m();
                List<ResolveInfo> queryIntentServices = f().getPackageManager().queryIntentServices(new Intent().setClassName(f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context f2 = f();
                    m();
                    intent.setComponent(new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f10488c.b(intent);
                    return;
                }
                h().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean b0() {
        return this.f10490e;
    }

    public final void c0() {
        c();
        y();
        this.f10488c.a();
        try {
            ConnectionTracker.b().c(f(), this.f10488c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f10489d = null;
    }

    /* access modifiers changed from: package-private */
    public final boolean d0() {
        c();
        y();
        if (g0() && j().K0() < 200900) {
            return false;
        }
        return true;
    }
}
