package b.c.a.b.i;

import b.c.a.b.b;
import b.c.a.b.c;
import b.c.a.b.e;
import b.c.a.b.i.b;

/* compiled from: SendRequest */
abstract class l {

    /* compiled from: SendRequest */
    public static abstract class a {
        public abstract l a();

        /* access modifiers changed from: package-private */
        public abstract a b(b bVar);

        /* access modifiers changed from: package-private */
        public abstract a c(c<?> cVar);

        /* access modifiers changed from: package-private */
        public abstract a d(e<?, byte[]> eVar);

        public abstract a e(m mVar);

        public abstract a f(String str);
    }

    l() {
    }

    public static a a() {
        return new b.C0061b();
    }

    public abstract b.c.a.b.b b();

    /* access modifiers changed from: package-private */
    public abstract c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* access modifiers changed from: package-private */
    public abstract e<?, byte[]> e();

    public abstract m f();

    public abstract String g();
}
