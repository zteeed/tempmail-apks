package b.c.a.e.a.a;

final class r extends d {

    /* renamed from: a  reason: collision with root package name */
    private final int f2463a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2464b;

    /* synthetic */ r(int i, boolean z) {
        this.f2463a = i;
        this.f2464b = z;
    }

    public final boolean a() {
        return this.f2464b;
    }

    public final int b() {
        return this.f2463a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f2463a == dVar.b() && this.f2464b == dVar.a();
        }
    }

    public final int hashCode() {
        return ((this.f2463a ^ 1000003) * 1000003) ^ (true != this.f2464b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f2463a;
        boolean z = this.f2464b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
