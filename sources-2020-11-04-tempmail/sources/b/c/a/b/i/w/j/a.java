package b.c.a.b.i.w.j;

import b.c.a.b.i.w.j.d;

/* compiled from: AutoValue_EventStoreConfig */
final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final long f2294b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2295c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2296d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2297e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2298f;

    /* compiled from: AutoValue_EventStoreConfig */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f2299a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f2300b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f2301c;

        /* renamed from: d  reason: collision with root package name */
        private Long f2302d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f2303e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public d a() {
            String str = "";
            if (this.f2299a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f2300b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f2301c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f2302d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f2303e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f2299a.longValue(), this.f2300b.intValue(), this.f2301c.intValue(), this.f2302d.longValue(), this.f2303e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public d.a b(int i) {
            this.f2301c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a c(long j) {
            this.f2302d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a d(int i) {
            this.f2300b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a e(int i) {
            this.f2303e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a f(long j) {
            this.f2299a = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f2296d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f2297e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f2295c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f2298f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2294b == dVar.f() && this.f2295c == dVar.d() && this.f2296d == dVar.b() && this.f2297e == dVar.c() && this.f2298f == dVar.e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.f2294b;
    }

    public int hashCode() {
        long j = this.f2294b;
        long j2 = this.f2297e;
        return this.f2298f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f2295c) * 1000003) ^ this.f2296d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f2294b + ", loadBatchSize=" + this.f2295c + ", criticalSectionEnterTimeoutMs=" + this.f2296d + ", eventCleanUpAge=" + this.f2297e + ", maxBlobByteSizePerRow=" + this.f2298f + "}";
    }

    private a(long j, int i, int i2, long j2, int i3) {
        this.f2294b = j;
        this.f2295c = i;
        this.f2296d = i2;
        this.f2297e = j2;
        this.f2298f = i3;
    }
}
