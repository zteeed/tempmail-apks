package d.a.e0;

import java.util.concurrent.TimeUnit;

/* compiled from: Timed */
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    final T f13924a;

    /* renamed from: b  reason: collision with root package name */
    final long f13925b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f13926c;

    public b(T t, long j, TimeUnit timeUnit) {
        this.f13924a = t;
        this.f13925b = j;
        d.a.a0.b.b.e(timeUnit, "unit is null");
        this.f13926c = timeUnit;
    }

    public long a() {
        return this.f13925b;
    }

    public T b() {
        return this.f13924a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!d.a.a0.b.b.c(this.f13924a, bVar.f13924a) || this.f13925b != bVar.f13925b || !d.a.a0.b.b.c(this.f13926c, bVar.f13926c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f13924a;
        int hashCode = t != null ? t.hashCode() : 0;
        long j = this.f13925b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.f13926c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f13925b + ", unit=" + this.f13926c + ", value=" + this.f13924a + "]";
    }
}
