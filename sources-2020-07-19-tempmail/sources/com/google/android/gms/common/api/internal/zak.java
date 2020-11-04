package com.google.android.gms.common.api.internal;

import a.e.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;

public final class zak {

    /* renamed from: a  reason: collision with root package name */
    private final a<zai<?>, ConnectionResult> f2896a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private final a<zai<?>, String> f2897b = new a<>();

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource<Map<zai<?>, String>> f2898c = new TaskCompletionSource<>();

    /* renamed from: d  reason: collision with root package name */
    private int f2899d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2900e = false;

    public zak(Iterable<? extends GoogleApi<?>> iterable) {
        for (GoogleApi j : iterable) {
            this.f2896a.put(j.j(), null);
        }
        this.f2899d = this.f2896a.keySet().size();
    }

    public final Task<Map<zai<?>, String>> a() {
        return this.f2898c.a();
    }

    public final void b(zai<?> zai, ConnectionResult connectionResult, String str) {
        this.f2896a.put(zai, connectionResult);
        this.f2897b.put(zai, str);
        this.f2899d--;
        if (!connectionResult.G()) {
            this.f2900e = true;
        }
        if (this.f2899d != 0) {
            return;
        }
        if (this.f2900e) {
            this.f2898c.b(new AvailabilityException(this.f2896a));
            return;
        }
        this.f2898c.c(this.f2897b);
    }

    public final Set<zai<?>> c() {
        return this.f2896a.keySet();
    }
}
