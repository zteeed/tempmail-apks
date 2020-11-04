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
    private final a<zai<?>, ConnectionResult> f3084a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private final a<zai<?>, String> f3085b = new a<>();

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource<Map<zai<?>, String>> f3086c = new TaskCompletionSource<>();

    /* renamed from: d  reason: collision with root package name */
    private int f3087d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3088e = false;

    public zak(Iterable<? extends GoogleApi<?>> iterable) {
        for (GoogleApi j : iterable) {
            this.f3084a.put(j.j(), null);
        }
        this.f3087d = this.f3084a.keySet().size();
    }

    public final Task<Map<zai<?>, String>> a() {
        return this.f3086c.a();
    }

    public final void b(zai<?> zai, ConnectionResult connectionResult, String str) {
        this.f3084a.put(zai, connectionResult);
        this.f3085b.put(zai, str);
        this.f3087d--;
        if (!connectionResult.G()) {
            this.f3088e = true;
        }
        if (this.f3087d != 0) {
            return;
        }
        if (this.f3088e) {
            this.f3086c.b(new AvailabilityException(this.f3084a));
            return;
        }
        this.f3086c.c(this.f3085b);
    }

    public final Set<zai<?>> c() {
        return this.f3084a.keySet();
    }
}
