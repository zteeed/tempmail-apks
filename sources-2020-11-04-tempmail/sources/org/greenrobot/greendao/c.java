package org.greenrobot.greendao;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.async.d;
import org.greenrobot.greendao.g.a;
import org.greenrobot.greendao.j.h;
import rx.schedulers.Schedulers;

/* compiled from: AbstractDaoSession */
public class c {
    private final a db;
    private final Map<Class<?>, a<?, ?>> entityToDao = new HashMap();
    private volatile org.greenrobot.greendao.k.c rxTxIo;
    private volatile org.greenrobot.greendao.k.c rxTxPlain;

    public c(a aVar) {
        this.db = aVar;
    }

    public <V> V callInTx(Callable<V> callable) throws Exception {
        this.db.a();
        try {
            V call = callable.call();
            this.db.e();
            return call;
        } finally {
            this.db.i();
        }
    }

    public <V> V callInTxNoException(Callable<V> callable) {
        this.db.a();
        try {
            V call = callable.call();
            this.db.e();
            this.db.i();
            return call;
        } catch (Exception e2) {
            throw new DaoException("Callable failed", e2);
        } catch (Throwable th) {
            this.db.i();
            throw th;
        }
    }

    public <T> void delete(T t) {
        getDao(t.getClass()).delete(t);
    }

    public <T> void deleteAll(Class<T> cls) {
        getDao(cls).deleteAll();
    }

    public Collection<a<?, ?>> getAllDaos() {
        return Collections.unmodifiableCollection(this.entityToDao.values());
    }

    public a<?, ?> getDao(Class<? extends Object> cls) {
        a<?, ?> aVar = this.entityToDao.get(cls);
        if (aVar != null) {
            return aVar;
        }
        throw new DaoException("No DAO registered for " + cls);
    }

    public a getDatabase() {
        return this.db;
    }

    public <T> long insert(T t) {
        return getDao(t.getClass()).insert(t);
    }

    public <T> long insertOrReplace(T t) {
        return getDao(t.getClass()).insertOrReplace(t);
    }

    public <T, K> T load(Class<T> cls, K k) {
        return getDao(cls).load(k);
    }

    public <T, K> List<T> loadAll(Class<T> cls) {
        return getDao(cls).loadAll();
    }

    public <T> h<T> queryBuilder(Class<T> cls) {
        return getDao(cls).queryBuilder();
    }

    public <T, K> List<T> queryRaw(Class<T> cls, String str, String... strArr) {
        return getDao(cls).queryRaw(str, strArr);
    }

    public <T> void refresh(T t) {
        getDao(t.getClass()).refresh(t);
    }

    /* access modifiers changed from: protected */
    public <T> void registerDao(Class<T> cls, a<T, ?> aVar) {
        this.entityToDao.put(cls, aVar);
    }

    public void runInTx(Runnable runnable) {
        this.db.a();
        try {
            runnable.run();
            this.db.e();
        } finally {
            this.db.i();
        }
    }

    public org.greenrobot.greendao.k.c rxTx() {
        if (this.rxTxIo == null) {
            this.rxTxIo = new org.greenrobot.greendao.k.c(this, Schedulers.io());
        }
        return this.rxTxIo;
    }

    public org.greenrobot.greendao.k.c rxTxPlain() {
        if (this.rxTxPlain == null) {
            this.rxTxPlain = new org.greenrobot.greendao.k.c(this);
        }
        return this.rxTxPlain;
    }

    public d startAsyncSession() {
        return new d(this);
    }

    public <T> void update(T t) {
        getDao(t.getClass()).update(t);
    }
}
