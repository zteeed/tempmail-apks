package b.a.b.a;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: InstallReferrerClient */
public abstract class a {

    /* compiled from: InstallReferrerClient */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f1954a;

        private b(Context context) {
            this.f1954a = context;
        }

        public a a() {
            Context context = this.f1954a;
            if (context != null) {
                return new b(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static b d(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract d b() throws RemoteException;

    public abstract boolean c();

    public abstract void e(c cVar);
}
