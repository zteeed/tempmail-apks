package b.b;

final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private String f1972a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1973b;

    enum a {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: b  reason: collision with root package name */
        private int f1977b;

        private a(int i) {
            this.f1977b = i;
        }

        public final String toString() {
            return String.valueOf(this.f1977b);
        }
    }

    a0(a aVar, String str, boolean z) {
        this.f1972a = str;
        this.f1973b = z;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.f1972a;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f1973b;
    }

    public final String toString() {
        return String.format("%s,%s", new Object[]{this.f1972a, Boolean.valueOf(this.f1973b)});
    }
}
