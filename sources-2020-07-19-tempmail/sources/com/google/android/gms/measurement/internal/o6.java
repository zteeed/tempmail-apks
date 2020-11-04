package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class o6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10155b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10156c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10157d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10158e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzn f10159f;
    private final /* synthetic */ zzir g;

    o6(zzir zzir, AtomicReference atomicReference, String str, String str2, String str3, zzn zzn) {
        this.g = zzir;
        this.f10155b = atomicReference;
        this.f10156c = str;
        this.f10157d = str2;
        this.f10158e = str3;
        this.f10159f = zzn;
    }

    public final void run() {
        synchronized (this.f10155b) {
            try {
                zzem l0 = this.g.f10489d;
                if (l0 == null) {
                    this.g.h().G().d("(legacy) Failed to get conditional properties; not connected to service", zzeu.x(this.f10156c), this.f10157d, this.f10158e);
                    this.f10155b.set(Collections.emptyList());
                    this.f10155b.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f10156c)) {
                    this.f10155b.set(l0.Z2(this.f10157d, this.f10158e, this.f10159f));
                } else {
                    this.f10155b.set(l0.X2(this.f10156c, this.f10157d, this.f10158e));
                }
                this.g.f0();
                this.f10155b.notify();
            } catch (RemoteException e2) {
                try {
                    this.g.h().G().d("(legacy) Failed to get conditional properties; remote exception", zzeu.x(this.f10156c), this.f10157d, e2);
                    this.f10155b.set(Collections.emptyList());
                    this.f10155b.notify();
                } catch (Throwable th) {
                    this.f10155b.notify();
                    throw th;
                }
            }
        }
    }
}
