package org.greenrobot.greendao.j;

import java.util.List;

/* compiled from: Query */
public class g<T> extends c<T> {
    private final b<T> h;

    /* compiled from: Query */
    private static final class b<T2> extends b<T2, g<T2>> {

        /* renamed from: e  reason: collision with root package name */
        private final int f15129e;

        /* renamed from: f  reason: collision with root package name */
        private final int f15130f;

        b(org.greenrobot.greendao.a<T2, ?> aVar, String str, String[] strArr, int i, int i2) {
            super(aVar, str, strArr);
            this.f15129e = i;
            this.f15130f = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public g<T2> a() {
            return new g(this, this.f15119b, this.f15118a, (String[]) this.f15120c.clone(), this.f15129e, this.f15130f);
        }
    }

    static <T2> g<T2> e(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr, int i, int i2) {
        return (g) new b(aVar, str, a.c(objArr), i, i2).b();
    }

    public static <T2> g<T2> g(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr) {
        return e(aVar, str, objArr, -1, -1);
    }

    public g<T> f() {
        return (g) this.h.c(this);
    }

    public List<T> h() {
        a();
        return this.f15114b.a(this.f15113a.getDatabase().f(this.f15115c, this.f15116d));
    }

    public g<T> i(int i, Object obj) {
        return (g) super.d(i, obj);
    }

    public T j() {
        a();
        return this.f15114b.b(this.f15113a.getDatabase().f(this.f15115c, this.f15116d));
    }

    private g(b<T> bVar, org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr, int i, int i2) {
        super(aVar, str, strArr, i, i2);
        this.h = bVar;
    }
}
