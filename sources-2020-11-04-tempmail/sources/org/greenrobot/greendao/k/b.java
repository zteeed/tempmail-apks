package org.greenrobot.greendao.k;

import org.greenrobot.greendao.a;
import rx.Scheduler;

/* compiled from: RxDao */
public class b<T, K> extends a {
    public b(a<T, K> aVar) {
        this(aVar, (Scheduler) null);
    }

    public b(a<T, K> aVar, Scheduler scheduler) {
        super(scheduler);
    }
}
