package b.c.a.b.i.w.j;

import b.c.a.b.i.w.j.d;

/* compiled from: AutoValue_EventStoreConfig */
final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final long f2196b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2197c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2198d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2199e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2200f;

    /* compiled from: AutoValue_EventStoreConfig */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f2201a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f2202b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f2203c;

        /* renamed from: d  reason: collision with root package name */
        private Long f2204d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f2205e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public d a() {
            String str = "";
            if (this.f2201a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f2202b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f2203c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f2204d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f2205e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f2201a.longValue(), this.f2202b.intValue(), this.f2203c.intValue(), this.f2204d.longValue(), this.f2205e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public d.a b(int i) {
            this.f2203c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a c(long j) {
            this.f2204d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a d(int i) {
            this.f2202b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a e(int i) {
            this.f2205e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a f(long j) {
            this.f2201a = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f2198d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f2199e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f2197c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f2200f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2196b == dVar.f() && this.f2197c == dVar.d() && this.f2198d == dVar.b() && this.f2199e == dVar.c() && this.f2200f == dVar.e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.f2196b;
    }

    public int hashCode() {
        long j = this.f2196b;
        long j2 = this.f2199e;
        return this.f2200f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f2197c) * 1000003) ^ this.f2198d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f2196b + ", loadBatchSize=" + this.f2197c + ", criticalSectionEnterTimeoutMs=" + this.f2198d + ", eventCleanUpAge=" + this.f2199e + ", maxBlobByteSizePerRow=" + this.f2200f + "}";
    }

    private a(long j, int i, int i2, long j2, int i3) {
        this.f2196b = j;
        this.f2197c = i;
        this.f2198d = i2;
        this.f2199e = j2;
        this.f2200f = i3;
    }
}
