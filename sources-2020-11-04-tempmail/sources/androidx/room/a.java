package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMultiInstanceInvalidationCallback */
public interface a extends IInterface {

    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class C0051a extends Binder implements a {

        /* renamed from: androidx.room.a$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationCallback */
        private static class C0052a implements a {

            /* renamed from: b  reason: collision with root package name */
            private IBinder f1949b;

            C0052a(IBinder iBinder) {
                this.f1949b = iBinder;
            }

            public IBinder asBinder() {
                return this.f1949b;
            }

            public void x1(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f1949b.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0052a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    void x1(String[] strArr) throws RemoteException;
}
