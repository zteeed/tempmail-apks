package b.c.a.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: BaseProxy */
public class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f2203b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2204c;

    protected a(IBinder iBinder, String str) {
        this.f2203b = iBinder;
        this.f2204c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2204c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel H(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f2203b.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2203b;
    }
}
