package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class q6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10385b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10386c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10387d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10388e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f10389f;
    private final /* synthetic */ zzn g;
    private final /* synthetic */ zzir h;

    q6(zzir zzir, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzn zzn) {
        this.h = zzir;
        this.f10385b = atomicReference;
        this.f10386c = str;
        this.f10387d = str2;
        this.f10388e = str3;
        this.f10389f = z;
        this.g = zzn;
    }

    public final void run() {
        synchronized (this.f10385b) {
            try {
                zzem l0 = this.h.f10675d;
                if (l0 == null) {
                    this.h.h().G().d("(legacy) Failed to get user properties; not connected to service", zzeu.x(this.f10386c), this.f10387d, this.f10388e);
                    this.f10385b.set(Collections.emptyList());
                    this.f10385b.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f10386c)) {
                    this.f10385b.set(l0.P3(this.f10387d, this.f10388e, this.f10389f, this.g));
                } else {
                    this.f10385b.set(l0.v1(this.f10386c, this.f10387d, this.f10388e, this.f10389f));
                }
                this.h.f0();
                this.f10385b.notify();
            } catch (RemoteException e2) {
                try {
                    this.h.h().G().d("(legacy) Failed to get user properties; remote exception", zzeu.x(this.f10386c), this.f10387d, e2);
                    this.f10385b.set(Collections.emptyList());
                    this.f10385b.notify();
                } catch (Throwable th) {
                    this.f10385b.notify();
                    throw th;
                }
            }
        }
    }
}
