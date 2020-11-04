package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.measurement.internal.zzha;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class s extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzha f9673f;
    private final /* synthetic */ zzag g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s(zzag zzag, zzha zzha) {
        super(zzag);
        this.g = zzag;
        this.f9673f = zzha;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        for (int i = 0; i < this.g.f9734e.size(); i++) {
            if (this.f9673f.equals(((Pair) this.g.f9734e.get(i)).first)) {
                Log.w(this.g.f9730a, "OnEventListener already registered.");
                return;
            }
        }
        zzag.c cVar = new zzag.c(this.f9673f);
        this.g.f9734e.add(new Pair(this.f9673f, cVar));
        this.g.i.registerOnMeasurementEventListener(cVar);
    }
}
