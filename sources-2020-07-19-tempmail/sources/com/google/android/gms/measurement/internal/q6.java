package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class q6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10199b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10200c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10201d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10202e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f10203f;
    private final /* synthetic */ zzn g;
    private final /* synthetic */ zzir h;

    q6(zzir zzir, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzn zzn) {
        this.h = zzir;
        this.f10199b = atomicReference;
        this.f10200c = str;
        this.f10201d = str2;
        this.f10202e = str3;
        this.f10203f = z;
        this.g = zzn;
    }

    public final void run() {
        synchronized (this.f10199b) {
            try {
                zzem l0 = this.h.f10489d;
                if (l0 == null) {
                    this.h.h().G().d("(legacy) Failed to get user properties; not connected to service", zzeu.x(this.f10200c), this.f10201d, this.f10202e);
                    this.f10199b.set(Collections.emptyList());
                    this.f10199b.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f10200c)) {
                    this.f10199b.set(l0.B3(this.f10201d, this.f10202e, this.f10203f, this.g));
                } else {
                    this.f10199b.set(l0.o1(this.f10200c, this.f10201d, this.f10202e, this.f10203f));
                }
                this.h.f0();
                this.f10199b.notify();
            } catch (RemoteException e2) {
                try {
                    this.h.h().G().d("(legacy) Failed to get user properties; remote exception", zzeu.x(this.f10200c), this.f10201d, e2);
                    this.f10199b.set(Collections.emptyList());
                    this.f10199b.notify();
                } catch (Throwable th) {
                    this.f10199b.notify();
                    throw th;
                }
            }
        }
    }
}
