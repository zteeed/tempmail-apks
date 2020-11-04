package org.greenrobot.greendao;

import android.database.Cursor;
import java.util.List;

/* compiled from: InternalQueryDaoAccess */
public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final a<T, ?> f15074a;

    public e(a<T, ?> aVar) {
        this.f15074a = aVar;
    }

    public List<T> a(Cursor cursor) {
        return this.f15074a.loadAllAndCloseCursor(cursor);
    }

    public T b(Cursor cursor) {
        return this.f15074a.loadUniqueAndCloseCursor(cursor);
    }
}
