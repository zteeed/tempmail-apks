package org.greenrobot.greendao.j;

/* compiled from: DeleteQuery */
public class e<T> extends a<T> {

    /* compiled from: DeleteQuery */
    private static final class b<T2> extends b<T2, e<T2>> {
        /* access modifiers changed from: protected */
        /* renamed from: e */
        public e<T2> a() {
            return new e(this, this.f15119b, this.f15118a, (String[]) this.f15120c.clone());
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
        org.greenrobot.greendao.g.a database = this.f15113a.getDatabase();
        if (database.h()) {
            this.f15113a.getDatabase().g(this.f15115c, this.f15116d);
            return;
        }
        database.a();
        try {
            this.f15113a.getDatabase().g(this.f15115c, this.f15116d);
            database.e();
        } finally {
            database.i();
        }
    }

    private e(b<T> bVar, org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        super(aVar, str, strArr);
    }
}
