package com.google.android.gms.common.api.internal;

import a.e.a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;

final class s0 implements OnCompleteListener<Map<zai<?>, String>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zax f2817a;

    private s0(zax zax) {
        this.f2817a = zax;
    }

    public final void a(Task<Map<zai<?>, String>> task) {
        this.f2817a.g.lock();
        try {
            if (this.f2817a.o) {
                if (task.r()) {
                    Map unused = this.f2817a.p = new a(this.f2817a.f2908b.size());
                    for (zaw j : this.f2817a.f2908b.values()) {
                        this.f2817a.p.put(j.j(), ConnectionResult.f2653f);
                    }
                } else if (task.m() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.m();
                    if (this.f2817a.m) {
                        Map unused2 = this.f2817a.p = new a(this.f2817a.f2908b.size());
                        for (zaw zaw : this.f2817a.f2908b.values()) {
                            zai j2 = zaw.j();
                            ConnectionResult a2 = availabilityException.a(zaw);
                            if (this.f2817a.g(zaw, a2)) {
                                this.f2817a.p.put(j2, new ConnectionResult(16));
                            } else {
                                this.f2817a.p.put(j2, a2);
                            }
                        }
                    } else {
                        Map unused3 = this.f2817a.p = availabilityException.b();
                    }
                    ConnectionResult unused4 = this.f2817a.s = this.f2817a.l();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.m());
                    Map unused5 = this.f2817a.p = Collections.emptyMap();
                    ConnectionResult unused6 = this.f2817a.s = new ConnectionResult(8);
                }
                if (this.f2817a.q != null) {
                    this.f2817a.p.putAll(this.f2817a.q);
                    ConnectionResult unused7 = this.f2817a.s = this.f2817a.l();
                }
                if (this.f2817a.s == null) {
                    this.f2817a.j();
                    this.f2817a.k();
                } else {
                    boolean unused8 = this.f2817a.o = false;
                    this.f2817a.f2912f.a(this.f2817a.s);
                }
                this.f2817a.j.signalAll();
                this.f2817a.g.unlock();
            }
        } finally {
            this.f2817a.g.unlock();
        }
    }
}
