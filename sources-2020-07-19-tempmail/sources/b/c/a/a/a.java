package b.c.a.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: BaseProxy */
public class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f2105b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2106c;

    protected a(IBinder iBinder, String str) {
        this.f2105b = iBinder;
        this.f2106c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel E(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f2105b.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2105b;
    }

    /* access modifiers changed from: protected */
    public final Parcel y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2106c);
        return obtain;
    }
}
