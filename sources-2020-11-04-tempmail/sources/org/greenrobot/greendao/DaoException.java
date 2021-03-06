package org.greenrobot.greendao;

import android.database.SQLException;

public class DaoException extends SQLException {
    private static final long serialVersionUID = -5877937327907457779L;

    public DaoException() {
    }

    /* access modifiers changed from: protected */
    public void a(Throwable th) {
        try {
            initCause(th);
        } catch (Throwable th2) {
            d.b("Could not set initial cause", th2);
            d.b("Initial cause is:", th);
        }
    }

    public DaoException(String str) {
        super(str);
    }

    public DaoException(String str, Throwable th) {
        super(str);
        a(th);
    }
}
