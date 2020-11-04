package org.greenrobot.greendao;

import java.util.HashMap;
import java.util.Map;
import org.greenrobot.greendao.h.d;
import org.greenrobot.greendao.i.a;

/* compiled from: AbstractDaoMaster */
public abstract class b {
    protected final Map<Class<? extends a<?, ?>>, a> daoConfigMap = new HashMap();
    protected final org.greenrobot.greendao.g.a db;
    protected final int schemaVersion;

    public b(org.greenrobot.greendao.g.a aVar, int i) {
        this.db = aVar;
        this.schemaVersion = i;
    }

    public org.greenrobot.greendao.g.a getDatabase() {
        return this.db;
    }

    public int getSchemaVersion() {
        return this.schemaVersion;
    }

    public abstract c newSession();

    public abstract c newSession(d dVar);

    /* access modifiers changed from: protected */
    public void registerDaoClass(Class<? extends a<?, ?>> cls) {
        this.daoConfigMap.put(cls, new a(this.db, cls));
    }
}
