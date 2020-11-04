package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.a;

/* compiled from: IMultiInstanceInvalidationService */
public interface b extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService */
    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int f2 = f2(a.C0051a.B(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(f2);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                S6(a.C0051a.B(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                D6(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    void D6(int i, String[] strArr) throws RemoteException;

    void S6(a aVar, int i) throws RemoteException;

    int f2(a aVar, String str) throws RemoteException;
}
