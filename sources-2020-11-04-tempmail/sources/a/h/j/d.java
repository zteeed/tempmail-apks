package a.h.j;

/* compiled from: Pair */
public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f353a;

    /* renamed from: b  reason: collision with root package name */
    public final S f354b;

    public d(F f2, S s) {
        this.f353a = f2;
        this.f354b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.f353a, this.f353a) || !c.a(dVar.f354b, this.f354b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f2 = this.f353a;
        int i = 0;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f354b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f353a) + " " + String.valueOf(this.f354b) + "}";
    }
}
