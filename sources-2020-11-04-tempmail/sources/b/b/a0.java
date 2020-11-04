package b.b;

final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private String f2070a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2071b;

    enum a {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: b  reason: collision with root package name */
        private int f2075b;

        private a(int i) {
            this.f2075b = i;
        }

        public final String toString() {
            return String.valueOf(this.f2075b);
        }
    }

    a0(a aVar, String str, boolean z) {
        this.f2070a = str;
        this.f2071b = z;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.f2070a;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f2071b;
    }

    public final String toString() {
        return String.format("%s,%s", new Object[]{this.f2070a, Boolean.valueOf(this.f2071b)});
    }
}
