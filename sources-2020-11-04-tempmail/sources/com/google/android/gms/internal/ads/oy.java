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
    private final zzdqu f4769a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdqm f4770b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4771c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f4772d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4773e = false;

    oy(Context context, Looper looper, zzdqm zzdqm) {
        this.f4770b = zzdqm;
        this.f4769a = new zzdqu(context, looper, this, this, 12800000);
    }

    private final void a() {
        synchronized (this.f4771c) {
            if (this.f4769a.isConnected() || this.f4769a.isConnecting()) {
                this.f4769a.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public final void B(int i) {
    }

    public final void H(Bundle bundle) {
        synchronized (this.f4771c) {
            if (!this.f4773e) {
                this.f4773e = true;
                try {
                    this.f4769a.e().P0(new zzdqs(this.f4770b.g()));
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
        synchronized (this.f4771c) {
            if (!this.f4772d) {
                this.f4772d = true;
                this.f4769a.checkAvailabilityAndConnect();
            }
        }
    }

    public final void h0(ConnectionResult connectionResult) {
    }
}
