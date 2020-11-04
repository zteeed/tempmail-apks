package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.f;

public abstract class l {

    public static abstract class a {
        public abstract a a(long j);

        public abstract a b(o oVar);

        public abstract a c(Integer num);

        public abstract l d();

        public abstract a e(long j);

        public abstract a f(long j);
    }

    public static a a(String str) {
        f.b bVar = new f.b();
        bVar.g(str);
        return bVar;
    }

    public static a b(byte[] bArr) {
        f.b bVar = new f.b();
        bVar.h(bArr);
        return bVar;
    }

    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    public abstract o f();

    public abstract byte[] g();

    public abstract String h();

    public abstract long i();
}
