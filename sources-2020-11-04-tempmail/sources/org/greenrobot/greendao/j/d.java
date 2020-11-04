package org.greenrobot.greendao.j;

import android.database.Cursor;
import org.greenrobot.greendao.DaoException;

/* compiled from: CountQuery */
public class d<T> extends a<T> {

    /* compiled from: CountQuery */
    private static final class b<T2> extends b<T2, d<T2>> {
        /* access modifiers changed from: protected */
        /* renamed from: e */
        public d<T2> a() {
            return new d(this, this.f15119b, this.f15118a, (String[]) this.f15120c.clone());
        }

        private b(org.greenrobot.greendao.a<T2, ?> aVar, String str, String[] strArr) {
            super(aVar, str, strArr);
        }
    }

    static <T2> d<T2> e(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr) {
        return (d) new b(aVar, str, a.c(objArr)).b();
    }

    public long d() {
        a();
        Cursor f2 = this.f15113a.getDatabase().f(this.f15115c, this.f15116d);
        try {
            if (!f2.moveToNext()) {
                throw new DaoException("No result for count");
            } else if (!f2.isLast()) {
                throw new DaoException("Unexpected row count: " + f2.getCount());
            } else if (f2.getColumnCount() == 1) {
                return f2.getLong(0);
            } else {
                throw new DaoException("Unexpected column count: " + f2.getColumnCount());
            }
        } finally {
            f2.close();
        }
    }

    private d(b<T> bVar, org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        super(aVar, str, strArr);
    }
}
