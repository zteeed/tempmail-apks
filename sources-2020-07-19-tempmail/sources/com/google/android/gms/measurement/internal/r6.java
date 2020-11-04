package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class r6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10214b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10215c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzn f10216d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzw f10217e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzir f10218f;

    r6(zzir zzir, String str, String str2, zzn zzn, zzw zzw) {
        this.f10218f = zzir;
        this.f10214b = str;
        this.f10215c = str2;
        this.f10216d = zzn;
        this.f10217e = zzw;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzem l0 = this.f10218f.f10489d;
            if (l0 == null) {
                this.f10218f.h().G().c("Failed to get conditional properties; not connected to service", this.f10214b, this.f10215c);
                return;
            }
            arrayList = zzkr.r0(l0.Z2(this.f10214b, this.f10215c, this.f10216d));
            this.f10218f.f0();
            this.f10218f.j().S(this.f10217e, arrayList);
        } catch (RemoteException e2) {
            this.f10218f.h().G().d("Failed to get conditional properties; remote exception", this.f10214b, this.f10215c, e2);
        } finally {
            this.f10218f.j().S(this.f10217e, arrayList);
        }
    }
}
