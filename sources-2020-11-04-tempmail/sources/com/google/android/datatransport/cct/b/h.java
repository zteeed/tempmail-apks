package com.google.android.datatransport.cct.b;

final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f2689a;

    h(long j) {
        this.f2689a = j;
    }

    public long a() {
        return this.f2689a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n) || this.f2689a != ((n) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f2689a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f2689a + "}";
    }
}
