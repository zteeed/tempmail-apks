package b.c.a.b;

/* compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f2107a;

    /* renamed from: b  reason: collision with root package name */
    private final T f2108b;

    /* renamed from: c  reason: collision with root package name */
    private final d f2109c;

    a(Integer num, T t, d dVar) {
        this.f2107a = num;
        if (t != null) {
            this.f2108b = t;
            if (dVar != null) {
                this.f2109c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public Integer a() {
        return this.f2107a;
    }

    public T b() {
        return this.f2108b;
    }

    public d c() {
        return this.f2109c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f2107a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (!this.f2108b.equals(cVar.b()) || !this.f2109c.equals(cVar.c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f2107a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f2108b.hashCode()) * 1000003) ^ this.f2109c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f2107a + ", payload=" + this.f2108b + ", priority=" + this.f2109c + "}";
    }
}
