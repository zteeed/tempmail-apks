package a.h.j;

/* compiled from: Pair */
public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f352a;

    /* renamed from: b  reason: collision with root package name */
    public final S f353b;

    public d(F f2, S s) {
        this.f352a = f2;
        this.f353b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.f352a, this.f352a) || !c.a(dVar.f353b, this.f353b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f2 = this.f352a;
        int i = 0;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f353b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f352a) + " " + String.valueOf(this.f353b) + "}";
    }
}
