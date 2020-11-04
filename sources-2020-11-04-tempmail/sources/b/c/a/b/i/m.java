package b.c.a.b.i;

import android.util.Base64;
import b.c.a.b.d;
import b.c.a.b.i.c;

/* compiled from: TransportContext */
public abstract class m {

    /* compiled from: TransportContext */
    public static abstract class a {
        public abstract m a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(d dVar);
    }

    public static a a() {
        c.b bVar = new c.b();
        bVar.d(d.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public m e(d dVar) {
        a a2 = a();
        a2.b(b());
        a2.d(dVar);
        a2.c(c());
        return a2.a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
