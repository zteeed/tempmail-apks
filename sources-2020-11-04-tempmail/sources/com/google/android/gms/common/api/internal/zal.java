package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zal extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: c  reason: collision with root package name */
    protected volatile boolean f3089c;

    /* renamed from: d  reason: collision with root package name */
    protected final AtomicReference<j0> f3090d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f3091e;

    /* renamed from: f  reason: collision with root package name */
    protected final GoogleApiAvailability f3092f;

    private static int l(j0 j0Var) {
        if (j0Var == null) {
            return -1;
        }
        return j0Var.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.j0> r0 = r3.f3090d
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.j0 r0 = (com.google.android.gms.common.api.internal.j0) r0
            r1 = 1
            r2 = 0
            if (r4 == r1) goto L_0x0030
            r5 = 2
            if (r4 == r5) goto L_0x0010
            goto L_0x0055
        L_0x0010:
            com.google.android.gms.common.GoogleApiAvailability r4 = r3.f3092f
            android.app.Activity r5 = r3.b()
            int r4 = r4.i(r5)
            if (r4 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.common.ConnectionResult r5 = r0.a()
            int r5 = r5.u()
            r6 = 18
            if (r5 != r6) goto L_0x0056
            if (r4 != r6) goto L_0x0056
            return
        L_0x0030:
            r4 = -1
            if (r5 != r4) goto L_0x0034
            goto L_0x0056
        L_0x0034:
            if (r5 != 0) goto L_0x0055
            r4 = 13
            if (r6 == 0) goto L_0x0040
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x0040:
            com.google.android.gms.common.api.internal.j0 r5 = new com.google.android.gms.common.api.internal.j0
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = l(r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.j0> r4 = r3.f3090d
            r4.set(r5)
            r0 = r5
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x005c
            r3.p()
            return
        L_0x005c:
            if (r0 == 0) goto L_0x0069
            com.google.android.gms.common.ConnectionResult r4 = r0.a()
            int r5 = r0.b()
            r3.m(r4, r5)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zal.e(int, int, android.content.Intent):void");
    }

    public void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f3090d.set(bundle.getBoolean("resolving_error", false) ? new j0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public void i(Bundle bundle) {
        super.i(bundle);
        j0 j0Var = this.f3090d.get();
        if (j0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", j0Var.b());
            bundle.putInt("failed_status", j0Var.a().u());
            bundle.putParcelable("failed_resolution", j0Var.a().A());
        }
    }

    public void j() {
        super.j();
        this.f3089c = true;
    }

    public void k() {
        super.k();
        this.f3089c = false;
    }

    /* access modifiers changed from: protected */
    public abstract void m(ConnectionResult connectionResult, int i);

    public final void n(ConnectionResult connectionResult, int i) {
        j0 j0Var = new j0(connectionResult, i);
        if (this.f3090d.compareAndSet((Object) null, j0Var)) {
            this.f3091e.post(new k0(this, j0Var));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void o();

    public void onCancel(DialogInterface dialogInterface) {
        m(new ConnectionResult(13, (PendingIntent) null), l(this.f3090d.get()));
        p();
    }

    /* access modifiers changed from: protected */
    public final void p() {
        this.f3090d.set((Object) null);
        o();
    }
}
