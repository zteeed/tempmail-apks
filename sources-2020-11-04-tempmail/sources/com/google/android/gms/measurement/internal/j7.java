package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class j7 {

    /* renamed from: a  reason: collision with root package name */
    private final Clock f10265a;

    /* renamed from: b  reason: collision with root package name */
    private long f10266b;

    public j7(Clock clock) {
        Preconditions.k(clock);
        this.f10265a = clock;
    }

    public final void a() {
        this.f10266b = this.f10265a.b();
    }

    public final boolean b(long j) {
        if (this.f10266b != 0 && this.f10265a.b() - this.f10266b < 3600000) {
            return false;
        }
        return true;
    }

    public final void c() {
        this.f10266b = 0;
    }
}
