package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
final class d extends g.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f2572a;

    /* renamed from: b  reason: collision with root package name */
    private final long f2573b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<g.c> f2574c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    static final class b extends g.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f2575a;

        /* renamed from: b  reason: collision with root package name */
        private Long f2576b;

        /* renamed from: c  reason: collision with root package name */
        private Set<g.c> f2577c;

        b() {
        }

        public g.b a() {
            String str = "";
            if (this.f2575a == null) {
                str = str + " delta";
            }
            if (this.f2576b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f2577c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f2575a.longValue(), this.f2576b.longValue(), this.f2577c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public g.b.a b(long j) {
            this.f2575a = Long.valueOf(j);
            return this;
        }

        public g.b.a c(Set<g.c> set) {
            if (set != null) {
                this.f2577c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public g.b.a d(long j) {
            this.f2576b = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f2572a;
    }

    /* access modifiers changed from: package-private */
    public Set<g.c> c() {
        return this.f2574c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f2573b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        if (this.f2572a == bVar.b() && this.f2573b == bVar.d() && this.f2574c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f2572a;
        long j2 = this.f2573b;
        return this.f2574c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f2572a + ", maxAllowedDelay=" + this.f2573b + ", flags=" + this.f2574c + "}";
    }

    private d(long j, long j2, Set<g.c> set) {
        this.f2572a = j;
        this.f2573b = j2;
        this.f2574c = set;
    }
}
