package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzji implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f10678a;

    /* renamed from: b  reason: collision with root package name */
    private volatile zzev f10679b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzir f10680c;

    protected zzji(zzir zzir) {
        this.f10680c = zzir;
    }

    public final void B(int i) {
        Preconditions.f("MeasurementServiceConnection.onConnectionSuspended");
        this.f10680c.h().N().a("Service connection suspended");
        this.f10680c.g().z(new v6(this));
    }

    public final void H(Bundle bundle) {
        Preconditions.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f10680c.g().z(new w6(this, (zzem) this.f10679b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f10679b = null;
                this.f10678a = false;
            }
        }
    }

    public final void a() {
        if (this.f10679b != null && (this.f10679b.isConnected() || this.f10679b.isConnecting())) {
            this.f10679b.disconnect();
        }
        this.f10679b = null;
    }

    public final void b(Intent intent) {
        this.f10680c.c();
        Context f2 = this.f10680c.f();
        ConnectionTracker b2 = ConnectionTracker.b();
        synchronized (this) {
            if (this.f10678a) {
                this.f10680c.h().O().a("Connection attempt already in progress");
                return;
            }
            this.f10680c.h().O().a("Using local app measurement service");
            this.f10678a = true;
            b2.a(f2, intent, this.f10680c.f10674c, 129);
        }
    }

    public final void d() {
        this.f10680c.c();
        Context f2 = this.f10680c.f();
        synchronized (this) {
            if (this.f10678a) {
                this.f10680c.h().O().a("Connection attempt already in progress");
            } else if (this.f10679b == null || (!this.f10679b.isConnecting() && !this.f10679b.isConnected())) {
                this.f10679b = new zzev(f2, Looper.getMainLooper(), this, this);
                this.f10680c.h().O().a("Connecting to remote service");
                this.f10678a = true;
                this.f10679b.checkAvailabilityAndConnect();
            } else {
                this.f10680c.h().O().a("Already awaiting connection attempt");
            }
        }
    }

    public final void h0(ConnectionResult connectionResult) {
        Preconditions.f("MeasurementServiceConnection.onConnectionFailed");
        zzeu B = this.f10680c.f10357a.B();
        if (B != null) {
            B.J().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f10678a = false;
            this.f10679b = null;
        }
        this.f10680c.g().z(new x6(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f10680c.h().G().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.Preconditions.f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f10678a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzir r4 = r3.f10680c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzew r4 = r4.G()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0099
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0062 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.zzem     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.zzem r1 = (com.google.android.gms.measurement.internal.zzem) r1     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.measurement.internal.zzeo r1 = new com.google.android.gms.measurement.internal.zzeo     // Catch:{ RemoteException -> 0x0062 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0041:
            r0 = r1
        L_0x0042:
            com.google.android.gms.measurement.internal.zzir r5 = r3.f10680c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.zzeu r5 = r5.h()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.O()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0052:
            com.google.android.gms.measurement.internal.zzir r5 = r3.f10680c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.zzeu r5 = r5.h()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.G()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.measurement.internal.zzir r5 = r3.f10680c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzeu r5 = r5.h()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzew r5 = r5.G()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x0071:
            if (r0 != 0) goto L_0x0089
            r3.f10678a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.ConnectionTracker r4 = com.google.android.gms.common.stats.ConnectionTracker.b()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzir r5 = r3.f10680c     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.f()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzir r0 = r3.f10680c     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzji r0 = r0.f10674c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.zzir r4 = r3.f10680c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.zzfv r4 = r4.g()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.u6 r5 = new com.google.android.gms.measurement.internal.u6     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.z(r5)     // Catch:{ all -> 0x001c }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzji.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.f("MeasurementServiceConnection.onServiceDisconnected");
        this.f10680c.h().N().a("Service disconnected");
        this.f10680c.g().z(new t6(this, componentName));
    }
}
