package org.greenrobot.greendao.j;

import java.util.List;

/* compiled from: Query */
public class g<T> extends c<T> {
    private final b<T> h;

    /* compiled from: Query */
    private static final class b<T2> extends b<T2, g<T2>> {

        /* renamed from: e  reason: collision with root package name */
        private final int f14560e;

        /* renamed from: f  reason: collision with root package name */
        private final int f14561f;

        b(org.greenrobot.greendao.a<T2, ?> aVar, String str, String[] strArr, int i, int i2) {
            super(aVar, str, strArr);
            this.f14560e = i;
            this.f14561f = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public g<T2> a() {
            return new g(this, this.f14550b, this.f14549a, (String[]) this.f14551c.clone(), this.f14560e, this.f14561f);
        }
    }

    static <T2> g<T2> e(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr, int i, int i2) {
        return (g) new b(aVar, str, a.c(objArr), i, i2).b();
    }

    public g<T> f() {
        return (g) this.h.c(this);
    }

    public List<T> g() {
        a();
        return this.f14545b.a(this.f14544a.o().f(this.f14546c, this.f14547d));
    }

    public g<T> h(int i, Object obj) {
        return (g) super.d(i, obj);
    }

    private g(b<T> bVar, org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr, int i, int i2) {
        super(aVar, str, strArr, i, i2);
        this.h = bVar;
    }
}
