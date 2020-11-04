package org.greenrobot.greendao.j;

/* compiled from: DeleteQuery */
public class e<T> extends a<T> {

    /* compiled from: DeleteQuery */
    private static final class b<T2> extends b<T2, e<T2>> {
        /* access modifiers changed from: protected */
        /* renamed from: e */
        public e<T2> a() {
            return new e(this, this.f14550b, this.f14549a, (String[]) this.f14551c.clone());
        }

        private b(org.greenrobot.greendao.a<T2, ?> aVar, String str, String[] strArr) {
            super(aVar, str, strArr);
        }
    }

    static <T2> e<T2> d(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr) {
        return (e) new b(aVar, str, a.c(objArr)).b();
    }

    public void e() {
        a();
        org.greenrobot.greendao.g.a o = this.f14544a.o();
        if (o.h()) {
            this.f14544a.o().g(this.f14546c, this.f14547d);
            return;
        }
        o.a();
        try {
            this.f14544a.o().g(this.f14546c, this.f14547d);
            o.e();
        } finally {
            o.i();
        }
    }

    private e(b<T> bVar, org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        super(aVar, str, strArr);
    }
}
