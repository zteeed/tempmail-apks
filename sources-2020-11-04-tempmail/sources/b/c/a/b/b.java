package b.c.a.b;

/* compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2208a;

    private b(String str) {
        if (str != null) {
            this.f2208a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f2208a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f2208a.equals(((b) obj).f2208a);
    }

    public int hashCode() {
        return this.f2208a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f2208a + "\"}";
    }
}
