package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcxj {

    /* renamed from: a  reason: collision with root package name */
    private final zzcxn<zzbpb> f7675a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7676b;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public zzyd f7677c;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public boolean f7678d;

    public zzcxj(zzcxn<zzbpb> zzcxn, String str) {
        this.f7675a = zzcxn;
        this.f7676b = str;
    }

    public final synchronized String a() {
        try {
            if (this.f7677c == null) {
                return null;
            }
            return this.f7677c.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final synchronized boolean b() throws RemoteException {
        return this.f7675a.isLoading();
    }

    public final synchronized void d(zzve zzve, int i) throws RemoteException {
        this.f7677c = null;
        this.f7675a.a(zzve, this.f7676b, new zzcxo(i), new hq(this));
    }

    public final synchronized String f() {
        try {
            if (this.f7677c == null) {
                return null;
            }
            return this.f7677c.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }
}