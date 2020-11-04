package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;

public final class q extends p {

    /* renamed from: b  reason: collision with root package name */
    private final p f11499b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11500c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11501d;

    public q(p pVar, long j, long j2) {
        this.f11499b = pVar;
        long e2 = e(j);
        this.f11500c = e2;
        this.f11501d = e(e2 + j2);
    }

    private final long e(long j) {
        if (j >= 0) {
            return j > this.f11499b.a() ? this.f11499b.a() : j;
        }
        return 0;
    }

    public final long a() {
        return this.f11501d - this.f11500c;
    }

    /* access modifiers changed from: protected */
    public final InputStream b(long j, long j2) throws IOException {
        long e2 = e(this.f11500c + j);
        return this.f11499b.b(e2, e(j2 + e2) - e2);
    }

    public final void close() throws IOException {
    }
}
