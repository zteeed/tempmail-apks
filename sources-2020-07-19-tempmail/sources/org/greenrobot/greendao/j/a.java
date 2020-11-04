package org.greenrobot.greendao.j;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.e;

/* compiled from: AbstractQuery */
abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final org.greenrobot.greendao.a<T, ?> f14544a;

    /* renamed from: b  reason: collision with root package name */
    protected final e<T> f14545b;

    /* renamed from: c  reason: collision with root package name */
    protected final String f14546c;

    /* renamed from: d  reason: collision with root package name */
    protected final String[] f14547d;

    /* renamed from: e  reason: collision with root package name */
    protected final Thread f14548e = Thread.currentThread();

    protected a(org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        this.f14544a = aVar;
        this.f14545b = new e<>(aVar);
        this.f14546c = str;
        this.f14547d = strArr;
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
        if (Thread.currentThread() != this.f14548e) {
            throw new DaoException("Method may be called only in owner thread, use forCurrentThread to get an instance for this thread");
        }
    }

    public a<T> b(int i, Object obj) {
        a();
        if (obj != null) {
            this.f14547d[i] = obj.toString();
        } else {
            this.f14547d[i] = null;
        }
        return this;
    }
}
