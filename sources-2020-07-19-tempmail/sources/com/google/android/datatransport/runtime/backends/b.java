package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.g;

/* compiled from: AutoValue_BackendResponse */
final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f2541a;

    /* renamed from: b  reason: collision with root package name */
    private final long f2542b;

    b(g.a aVar, long j) {
        if (aVar != null) {
            this.f2541a = aVar;
            this.f2542b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public long b() {
        return this.f2542b;
    }

    public g.a c() {
        return this.f2541a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f2541a.equals(gVar.c()) || this.f2542b != gVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f2542b;
        return ((this.f2541a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f2541a + ", nextRequestWaitMillis=" + this.f2542b + "}";
    }
}
