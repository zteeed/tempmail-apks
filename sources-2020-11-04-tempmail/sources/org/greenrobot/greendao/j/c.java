package org.greenrobot.greendao.j;

import org.greenrobot.greendao.a;

/* compiled from: AbstractQueryWithLimit */
abstract class c<T> extends a<T> {

    /* renamed from: f  reason: collision with root package name */
    protected final int f15122f;
    protected final int g;

    protected c(a<T, ?> aVar, String str, String[] strArr, int i, int i2) {
        super(aVar, str, strArr);
        this.f15122f = i;
        this.g = i2;
    }

    public c<T> d(int i, Object obj) {
        if (i < 0 || !(i == this.f15122f || i == this.g)) {
            super.b(i, obj);
            return this;
        }
        throw new IllegalArgumentException("Illegal parameter index: " + i);
    }
}
