package org.greenrobot.greendao;

import android.database.Cursor;
import java.util.List;

/* compiled from: InternalQueryDaoAccess */
public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final a<T, ?> f14508a;

    public e(a<T, ?> aVar) {
        this.f14508a = aVar;
    }

    public List<T> a(Cursor cursor) {
        return this.f14508a.z(cursor);
    }
}
