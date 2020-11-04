package com.google.android.datatransport.cct.b;

import java.util.List;

final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List<m> f2472a;

    d(List<m> list) {
        if (list != null) {
            this.f2472a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public List<m> b() {
        return this.f2472a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f2472a.equals(((j) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f2472a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f2472a + "}";
    }
}
