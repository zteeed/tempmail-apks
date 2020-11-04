package org.greenrobot.greendao;

import java.util.HashMap;
import java.util.Map;
import org.greenrobot.greendao.g.a;

/* compiled from: AbstractDaoMaster */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected final a f14505a;

    /* renamed from: b  reason: collision with root package name */
    protected final Map<Class<? extends a<?, ?>>, org.greenrobot.greendao.i.a> f14506b = new HashMap();

    public b(a aVar, int i) {
        this.f14505a = aVar;
    }

    /* access modifiers changed from: protected */
    public void a(Class<? extends a<?, ?>> cls) {
        this.f14506b.put(cls, new org.greenrobot.greendao.i.a(this.f14505a, cls));
    }
}
