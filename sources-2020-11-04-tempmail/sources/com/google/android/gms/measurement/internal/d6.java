package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class d6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10153b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f10154c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzir f10155d;

    d6(zzir zzir, AtomicReference atomicReference, zzn zzn) {
        this.f10155d = zzir;
        this.f10153b = atomicReference;
        this.f10154c = zzn;
    }

    public final void run() {
        synchronized (this.f10153b) {
            try {
                zzem l0 = this.f10155d.f10675d;
                if (l0 == null) {
                    this.f10155d.h().G().a("Failed to get app instance id");
                    this.f10153b.notify();
                    return;
                }
                this.f10153b.set(l0.m2(this.f10154c));
                String str = (String) this.f10153b.get();
                if (str != null) {
                    this.f10155d.q().N(str);
                    this.f10155d.k().l.b(str);
                }
                this.f10155d.f0();
                this.f10153b.notify();
            } catch (RemoteException e2) {
                try {
                    this.f10155d.h().G().b("Failed to get app instance id", e2);
                    this.f10153b.notify();
                } catch (Throwable th) {
                    this.f10153b.notify();
                    throw th;
                }
            }
        }
    }
}
