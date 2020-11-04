package org.greenrobot.greendao.j;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.e;

/* compiled from: AbstractQuery */
abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final org.greenrobot.greendao.a<T, ?> f15113a;

    /* renamed from: b  reason: collision with root package name */
    protected final e<T> f15114b;

    /* renamed from: c  reason: collision with root package name */
    protected final String f15115c;

    /* renamed from: d  reason: collision with root package name */
    protected final String[] f15116d;

    /* renamed from: e  reason: collision with root package name */
    protected final Thread f15117e = Thread.currentThread();

    protected a(org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        this.f15113a = aVar;
        this.f15114b = new e<>(aVar);
        this.f15115c = str;
        this.f15116d = strArr;
    }

    protected static String[] c(Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                strArr[i] = obj.toString();
            } else {
                strArr[i] = null;
            }
        }
        return strArr;
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (Thread.currentThread() != this.f15117e) {
            throw new DaoException("Method may be called only in owner thread, use forCurrentThread to get an instance for this thread");
        }
    }

    public a<T> b(int i, Object obj) {
        a();
        if (obj != null) {
            this.f15116d[i] = obj.toString();
        } else {
            this.f15116d[i] = null;
        }
        return this;
    }
}
