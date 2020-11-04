package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzcny implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    protected final zzbbn<InputStream> f7299a = new zzbbn<>();

    /* renamed from: b  reason: collision with root package name */
    protected final Object f7300b = new Object();

    /* renamed from: c  reason: collision with root package name */
    protected boolean f7301c = false;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f7302d = false;

    /* renamed from: e  reason: collision with root package name */
    protected zzasm f7303e;

    /* renamed from: f  reason: collision with root package name */
    protected zzaru f7304f;

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.f7300b) {
            this.f7302d = true;
            if (this.f7304f.isConnected() || this.f7304f.isConnecting()) {
                this.f7304f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public void b0(ConnectionResult connectionResult) {
        zzbba.f("Disconnected from remote ad request service.");
        this.f7299a.c(new zzcop(zzdls.f8180a));
    }

    public void y(int i) {
        zzbba.f("Cannot connect to remote service, fallback to local instance.");
    }
}
