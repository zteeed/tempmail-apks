package org.greenrobot.greendao;

import java.util.HashMap;
import java.util.Map;
import org.greenrobot.greendao.g.a;
import org.greenrobot.greendao.j.h;

/* compiled from: AbstractDaoSession */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a<?, ?>> f14507a = new HashMap();

    public c(a aVar) {
    }

    public a<?, ?> a(Class<? extends Object> cls) {
        a<?, ?> aVar = this.f14507a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        throw new DaoException("No DAO registered for " + cls);
    }

    public <T> h<T> b(Class<T> cls) {
        return a(cls).E();
    }

    /* access modifiers changed from: protected */
    public <T> void c(Class<T> cls, a<T, ?> aVar) {
        this.f14507a.put(cls, aVar);
    }
}
