package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import java.util.HashMap;
import java.util.Map;

public final class zzas {

    /* renamed from: a  reason: collision with root package name */
    private final zzbj<zzao> f9325a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9326b = false;

    /* renamed from: c  reason: collision with root package name */
    private final Map<ListenerHolder.ListenerKey<LocationListener>, e> f9327c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<ListenerHolder.ListenerKey<Object>, d> f9328d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<ListenerHolder.ListenerKey<LocationCallback>, a> f9329e = new HashMap();

    public zzas(Context context, zzbj<zzao> zzbj) {
        this.f9325a = zzbj;
    }

    public final void a() throws RemoteException {
        synchronized (this.f9327c) {
            for (e next : this.f9327c.values()) {
                if (next != null) {
                    this.f9325a.b().r5(zzbf.v(next, (zzaj) null));
                }
            }
            this.f9327c.clear();
        }
        synchronized (this.f9329e) {
            for (a next2 : this.f9329e.values()) {
                if (next2 != null) {
                    this.f9325a.b().r5(zzbf.u(next2, (zzaj) null));
                }
            }
            this.f9329e.clear();
        }
        synchronized (this.f9328d) {
            for (d next3 : this.f9328d.values()) {
                if (next3 != null) {
                    this.f9325a.b().n3(new zzo(2, (zzm) null, next3.asBinder(), (IBinder) null));
                }
            }
            this.f9328d.clear();
        }
    }

    public final void b(boolean z) throws RemoteException {
        this.f9325a.a();
        this.f9325a.b().T4(z);
        this.f9326b = z;
    }

    public final void c() throws RemoteException {
        if (this.f9326b) {
            b(false);
        }
    }
}
