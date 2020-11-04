package b.c.a.b.i.w.j;

import b.c.a.b.i.h;
import b.c.a.b.i.m;

/* compiled from: AutoValue_PersistedEvent */
final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final long f2306a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2307b;

    /* renamed from: c  reason: collision with root package name */
    private final h f2308c;

    b(long j, m mVar, h hVar) {
        this.f2306a = j;
        if (mVar != null) {
            this.f2307b = mVar;
            if (hVar != null) {
                this.f2308c = hVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public h b() {
        return this.f2308c;
    }

    public long c() {
        return this.f2306a;
    }

    public m d() {
        return this.f2307b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f2306a != iVar.c() || !this.f2307b.equals(iVar.d()) || !this.f2308c.equals(iVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f2306a;
        return this.f2308c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f2307b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f2306a + ", transportContext=" + this.f2307b + ", event=" + this.f2308c + "}";
    }
}
