package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class r6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10400b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10401c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzn f10402d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzw f10403e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzir f10404f;

    r6(zzir zzir, String str, String str2, zzn zzn, zzw zzw) {
        this.f10404f = zzir;
        this.f10400b = str;
        this.f10401c = str2;
        this.f10402d = zzn;
        this.f10403e = zzw;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzem l0 = this.f10404f.f10675d;
            if (l0 == null) {
                this.f10404f.h().G().c("Failed to get conditional properties; not connected to service", this.f10400b, this.f10401c);
                return;
            }
            arrayList = zzkr.r0(l0.l3(this.f10400b, this.f10401c, this.f10402d));
            this.f10404f.f0();
            this.f10404f.j().S(this.f10403e, arrayList);
        } catch (RemoteException e2) {
            this.f10404f.h().G().d("Failed to get conditional properties; remote exception", this.f10400b, this.f10401c, e2);
        } finally {
            this.f10404f.j().S(this.f10403e, arrayList);
        }
    }
}
