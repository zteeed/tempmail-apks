package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class d6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f9967b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f9968c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzir f9969d;

    d6(zzir zzir, AtomicReference atomicReference, zzn zzn) {
        this.f9969d = zzir;
        this.f9967b = atomicReference;
        this.f9968c = zzn;
    }

    public final void run() {
        synchronized (this.f9967b) {
            try {
                zzem l0 = this.f9969d.f10489d;
                if (l0 == null) {
                    this.f9969d.h().G().a("Failed to get app instance id");
                    this.f9967b.notify();
                    return;
                }
                this.f9967b.set(l0.c2(this.f9968c));
                String str = (String) this.f9967b.get();
                if (str != null) {
                    this.f9969d.q().N(str);
                    this.f9969d.k().l.b(str);
                }
                this.f9969d.f0();
                this.f9967b.notify();
            } catch (RemoteException e2) {
                try {
                    this.f9969d.h().G().b("Failed to get app instance id", e2);
                    this.f9967b.notify();
                } catch (Throwable th) {
                    this.f9967b.notify();
                    throw th;
                }
            }
        }
    }
}
