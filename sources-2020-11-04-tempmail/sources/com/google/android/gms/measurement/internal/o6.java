package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class o6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10341b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10342c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10343d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10344e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzn f10345f;
    private final /* synthetic */ zzir g;

    o6(zzir zzir, AtomicReference atomicReference, String str, String str2, String str3, zzn zzn) {
        this.g = zzir;
        this.f10341b = atomicReference;
        this.f10342c = str;
        this.f10343d = str2;
        this.f10344e = str3;
        this.f10345f = zzn;
    }

    public final void run() {
        synchronized (this.f10341b) {
            try {
                zzem l0 = this.g.f10675d;
                if (l0 == null) {
                    this.g.h().G().d("(legacy) Failed to get conditional properties; not connected to service", zzeu.x(this.f10342c), this.f10343d, this.f10344e);
                    this.f10341b.set(Collections.emptyList());
                    this.f10341b.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f10342c)) {
                    this.f10341b.set(l0.l3(this.f10343d, this.f10344e, this.f10345f));
                } else {
                    this.f10341b.set(l0.j3(this.f10342c, this.f10343d, this.f10344e));
                }
                this.g.f0();
                this.f10341b.notify();
            } catch (RemoteException e2) {
                try {
                    this.g.h().G().d("(legacy) Failed to get conditional properties; remote exception", zzeu.x(this.f10342c), this.f10343d, e2);
                    this.f10341b.set(Collections.emptyList());
                    this.f10341b.notify();
                } catch (Throwable th) {
                    this.f10341b.notify();
                    throw th;
                }
            }
        }
    }
}
