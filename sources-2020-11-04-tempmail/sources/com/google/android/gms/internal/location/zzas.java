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
    private final zzbj<zzao> f9508a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9509b = false;

    /* renamed from: c  reason: collision with root package name */
    private final Map<ListenerHolder.ListenerKey<LocationListener>, e> f9510c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<ListenerHolder.ListenerKey<Object>, d> f9511d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<ListenerHolder.ListenerKey<LocationCallback>, a> f9512e = new HashMap();

    public zzas(Context context, zzbj<zzao> zzbj) {
        this.f9508a = zzbj;
    }

    public final void a() throws RemoteException {
        synchronized (this.f9510c) {
            for (e next : this.f9510c.values()) {
                if (next != null) {
                    this.f9508a.b().N5(zzbf.v(next, (zzaj) null));
                }
            }
            this.f9510c.clear();
        }
        synchronized (this.f9512e) {
            for (a next2 : this.f9512e.values()) {
                if (next2 != null) {
                    this.f9508a.b().N5(zzbf.u(next2, (zzaj) null));
                }
            }
            this.f9512e.clear();
        }
        synchronized (this.f9511d) {
            for (d next3 : this.f9511d.values()) {
                if (next3 != null) {
                    this.f9508a.b().D3(new zzo(2, (zzm) null, next3.asBinder(), (IBinder) null));
                }
            }
            this.f9511d.clear();
        }
    }

    public final void b(boolean z) throws RemoteException {
        this.f9508a.a();
        this.f9508a.b().n5(z);
        this.f9509b = z;
    }

    public final void c() throws RemoteException {
        if (this.f9509b) {
            b(false);
        }
    }
}
