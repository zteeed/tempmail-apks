package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzcny implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    protected final zzbbn<InputStream> f7482a = new zzbbn<>();

    /* renamed from: b  reason: collision with root package name */
    protected final Object f7483b = new Object();

    /* renamed from: c  reason: collision with root package name */
    protected boolean f7484c = false;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f7485d = false;

    /* renamed from: e  reason: collision with root package name */
    protected zzasm f7486e;

    /* renamed from: f  reason: collision with root package name */
    protected zzaru f7487f;

    public void B(int i) {
        zzbba.f("Cannot connect to remote service, fallback to local instance.");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.f7483b) {
            this.f7485d = true;
            if (this.f7487f.isConnected() || this.f7487f.isConnecting()) {
                this.f7487f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public void h0(ConnectionResult connectionResult) {
        zzbba.f("Disconnected from remote ad request service.");
        this.f7482a.c(new zzcop(zzdls.f8363a));
    }
}
