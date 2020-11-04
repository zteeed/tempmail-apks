package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class oy implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    private final zzdqu f4586a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdqm f4587b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4588c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f4589d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4590e = false;

    oy(Context context, Looper looper, zzdqm zzdqm) {
        this.f4587b = zzdqm;
        this.f4586a = new zzdqu(context, looper, this, this, 12800000);
    }

    private final void a() {
        synchronized (this.f4588c) {
            if (this.f4586a.isConnected() || this.f4586a.isConnecting()) {
                this.f4586a.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public final void E(Bundle bundle) {
        synchronized (this.f4588c) {
            if (!this.f4590e) {
                this.f4590e = true;
                try {
                    this.f4586a.e().I0(new zzdqs(this.f4587b.g()));
                    a();
                } catch (Exception unused) {
                    a();
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        synchronized (this.f4588c) {
            if (!this.f4589d) {
                this.f4589d = true;
                this.f4586a.checkAvailabilityAndConnect();
            }
        }
    }

    public final void b0(ConnectionResult connectionResult) {
    }

    public final void y(int i) {
    }
}
