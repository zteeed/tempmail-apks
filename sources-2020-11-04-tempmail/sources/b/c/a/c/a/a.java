package b.c.a.c.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import b.c.a.a.b;
import b.c.a.a.c;

/* compiled from: IGetInstallReferrerService */
public interface a extends IInterface {

    /* renamed from: b.c.a.c.a.a$a  reason: collision with other inner class name */
    /* compiled from: IGetInstallReferrerService */
    public static abstract class C0063a extends b implements a {

        /* renamed from: b.c.a.c.a.a$a$a  reason: collision with other inner class name */
        /* compiled from: IGetInstallReferrerService */
        public static class C0064a extends b.c.a.a.a implements a {
            C0064a(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            public final Bundle l(Bundle bundle) throws RemoteException {
                Parcel B = B();
                c.b(B, bundle);
                Parcel H = H(B);
                Bundle bundle2 = (Bundle) c.a(H, Bundle.CREATOR);
                H.recycle();
                return bundle2;
            }
        }

        public static a B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new C0064a(iBinder);
        }
    }

    Bundle l(Bundle bundle) throws RemoteException;
}