package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.g;

/* compiled from: AutoValue_BackendResponse */
final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f2729a;

    /* renamed from: b  reason: collision with root package name */
    private final long f2730b;

    b(g.a aVar, long j) {
        if (aVar != null) {
            this.f2729a = aVar;
            this.f2730b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public long b() {
        return this.f2730b;
    }

    public g.a c() {
        return this.f2729a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f2729a.equals(gVar.c()) || this.f2730b != gVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f2730b;
        return ((this.f2729a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f2729a + ", nextRequestWaitMillis=" + this.f2730b + "}";
    }
}
