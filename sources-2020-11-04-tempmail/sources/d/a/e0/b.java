package d.a.e0;

import java.util.concurrent.TimeUnit;

/* compiled from: Timed */
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    final T f14520a;

    /* renamed from: b  reason: collision with root package name */
    final long f14521b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f14522c;

    public b(T t, long j, TimeUnit timeUnit) {
        this.f14520a = t;
        this.f14521b = j;
        d.a.a0.b.b.e(timeUnit, "unit is null");
        this.f14522c = timeUnit;
    }

    public long a() {
        return this.f14521b;
    }

    public T b() {
        return this.f14520a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!d.a.a0.b.b.c(this.f14520a, bVar.f14520a) || this.f14521b != bVar.f14521b || !d.a.a0.b.b.c(this.f14522c, bVar.f14522c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f14520a;
        int hashCode = t != null ? t.hashCode() : 0;
        long j = this.f14521b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.f14522c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f14521b + ", unit=" + this.f14522c + ", value=" + this.f14520a + "]";
    }
}
