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
    private final /* synthetic */ zax f3005a;

    private s0(zax zax) {
        this.f3005a = zax;
    }

    public final void a(Task<Map<zai<?>, String>> task) {
        this.f3005a.g.lock();
        try {
            if (this.f3005a.o) {
                if (task.r()) {
                    Map unused = this.f3005a.p = new a(this.f3005a.f3096b.size());
                    for (zaw j : this.f3005a.f3096b.values()) {
                        this.f3005a.p.put(j.j(), ConnectionResult.f2841f);
                    }
                } else if (task.m() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.m();
                    if (this.f3005a.m) {
                        Map unused2 = this.f3005a.p = new a(this.f3005a.f3096b.size());
                        for (zaw zaw : this.f3005a.f3096b.values()) {
                            zai j2 = zaw.j();
                            ConnectionResult a2 = availabilityException.a(zaw);
                            if (this.f3005a.g(zaw, a2)) {
                                this.f3005a.p.put(j2, new ConnectionResult(16));
                            } else {
                                this.f3005a.p.put(j2, a2);
                            }
                        }
                    } else {
                        Map unused3 = this.f3005a.p = availabilityException.b();
                    }
                    ConnectionResult unused4 = this.f3005a.s = this.f3005a.l();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.m());
                    Map unused5 = this.f3005a.p = Collections.emptyMap();
                    ConnectionResult unused6 = this.f3005a.s = new ConnectionResult(8);
                }
                if (this.f3005a.q != null) {
                    this.f3005a.p.putAll(this.f3005a.q);
                    ConnectionResult unused7 = this.f3005a.s = this.f3005a.l();
                }
                if (this.f3005a.s == null) {
                    this.f3005a.j();
                    this.f3005a.k();
                } else {
                    boolean unused8 = this.f3005a.o = false;
                    this.f3005a.f3100f.a(this.f3005a.s);
                }
                this.f3005a.j.signalAll();
                this.f3005a.g.unlock();
            }
        } finally {
            this.f3005a.g.unlock();
        }
    }
}
