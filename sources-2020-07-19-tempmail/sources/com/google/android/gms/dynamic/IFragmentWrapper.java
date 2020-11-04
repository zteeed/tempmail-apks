package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends zzb implements IFragmentWrapper {

        public static class zza extends com.google.android.gms.internal.common.zza implements IFragmentWrapper {
            zza(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            public final boolean A1() throws RemoteException {
                Parcel E = E(7, y());
                boolean e2 = zzc.e(E);
                E.recycle();
                return e2;
            }

            public final boolean B0() throws RemoteException {
                Parcel E = E(11, y());
                boolean e2 = zzc.e(E);
                E.recycle();
                return e2;
            }

            public final void D0(boolean z) throws RemoteException {
                Parcel y = y();
                zzc.a(y, z);
                P(24, y);
            }

            public final IObjectWrapper H() throws RemoteException {
                Parcel E = E(6, y());
                IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
                E.recycle();
                return E2;
            }

            public final IObjectWrapper L() throws RemoteException {
                Parcel E = E(2, y());
                IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
                E.recycle();
                return E2;
            }

            public final void N0(Intent intent) throws RemoteException {
                Parcel y = y();
                zzc.d(y, intent);
                P(25, y);
            }

            public final void Q0(boolean z) throws RemoteException {
                Parcel y = y();
                zzc.a(y, z);
                P(22, y);
            }

            public final IFragmentWrapper Q1() throws RemoteException {
                Parcel E = E(9, y());
                IFragmentWrapper E2 = Stub.E(E.readStrongBinder());
                E.recycle();
                return E2;
            }

            public final Bundle Q4() throws RemoteException {
                Parcel E = E(3, y());
                Bundle bundle = (Bundle) zzc.b(E, Bundle.CREATOR);
                E.recycle();
                return bundle;
            }

            public final IFragmentWrapper R() throws RemoteException {
                Parcel E = E(5, y());
                IFragmentWrapper E2 = Stub.E(E.readStrongBinder());
                E.recycle();
                return E2;
            }

            public final IObjectWrapper T5() throws RemoteException {
                Parcel E = E(12, y());
                IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
                E.recycle();
                return E2;
            }

            public final boolean W3() throws RemoteException {
                Parcel E = E(17, y());
                boolean e2 = zzc.e(E);
                E.recycle();
                return e2;
            }

            public final boolean Z3() throws RemoteException {
                Parcel E = E(18, y());
                boolean e2 = zzc.e(E);
                E.recycle();
                return e2;
            }

            public final boolean f4() throws RemoteException {
                Parcel E = E(13, y());
                boolean e2 = zzc.e(E);
                E.recycle();
                return e2;
            }

            public final int g() throws RemoteException {
                Parcel E = E(4, y());
                int readInt = E.readInt();
                E.recycle();
                return readInt;
            }

            public final String getTag() throws RemoteException {
                Parcel E = E(8, y());
                String readString = E.readString();
                E.recycle();
                return readString;
            }

            public final boolean isVisible() throws RemoteException {
                Parcel E = E(19, y());
                boolean e2 = zzc.e(E);
                E.recycle();
                return e2;
            }

            public final boolean j0() throws RemoteException {
                Parcel E = E(15, y());
                boolean e2 = zzc.e(E);
                E.recycle();
                return e2;
            }

            public final boolean l3() throws RemoteException {
                Parcel E = E(16, y());
                boolean e2 = zzc.e(E);
                E.recycle();
                return e2;
            }

            public final boolean n1() throws RemoteException {
                Parcel E = E(14, y());
                boolean e2 = zzc.e(E);
                E.recycle();
                return e2;
            }

            public final void o6(boolean z) throws RemoteException {
                Parcel y = y();
                zzc.a(y, z);
                P(23, y);
            }

            public final void p0(boolean z) throws RemoteException {
                Parcel y = y();
                zzc.a(y, z);
                P(21, y);
            }

            public final void startActivityForResult(Intent intent, int i) throws RemoteException {
                Parcel y = y();
                zzc.d(y, intent);
                y.writeInt(i);
                P(26, y);
            }

            public final int v5() throws RemoteException {
                Parcel E = E(10, y());
                int readInt = E.readInt();
                E.recycle();
                return readInt;
            }

            public final void z(IObjectWrapper iObjectWrapper) throws RemoteException {
                Parcel y = y();
                zzc.c(y, iObjectWrapper);
                P(20, y);
            }

            public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
                Parcel y = y();
                zzc.c(y, iObjectWrapper);
                P(27, y);
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof IFragmentWrapper) {
                return (IFragmentWrapper) queryLocalInterface;
            }
            return new zza(iBinder);
        }

        /* access modifiers changed from: protected */
        public final boolean y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    IObjectWrapper L = L();
                    parcel2.writeNoException();
                    zzc.c(parcel2, L);
                    return true;
                case 3:
                    Bundle Q4 = Q4();
                    parcel2.writeNoException();
                    zzc.f(parcel2, Q4);
                    return true;
                case 4:
                    int g = g();
                    parcel2.writeNoException();
                    parcel2.writeInt(g);
                    return true;
                case 5:
                    IFragmentWrapper R = R();
                    parcel2.writeNoException();
                    zzc.c(parcel2, R);
                    return true;
                case 6:
                    IObjectWrapper H = H();
                    parcel2.writeNoException();
                    zzc.c(parcel2, H);
                    return true;
                case 7:
                    boolean A1 = A1();
                    parcel2.writeNoException();
                    zzc.a(parcel2, A1);
                    return true;
                case 8:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 9:
                    IFragmentWrapper Q1 = Q1();
                    parcel2.writeNoException();
                    zzc.c(parcel2, Q1);
                    return true;
                case 10:
                    int v5 = v5();
                    parcel2.writeNoException();
                    parcel2.writeInt(v5);
                    return true;
                case 11:
                    boolean B0 = B0();
                    parcel2.writeNoException();
                    zzc.a(parcel2, B0);
                    return true;
                case 12:
                    IObjectWrapper T5 = T5();
                    parcel2.writeNoException();
                    zzc.c(parcel2, T5);
                    return true;
                case 13:
                    boolean f4 = f4();
                    parcel2.writeNoException();
                    zzc.a(parcel2, f4);
                    return true;
                case 14:
                    boolean n1 = n1();
                    parcel2.writeNoException();
                    zzc.a(parcel2, n1);
                    return true;
                case 15:
                    boolean j0 = j0();
                    parcel2.writeNoException();
                    zzc.a(parcel2, j0);
                    return true;
                case 16:
                    boolean l3 = l3();
                    parcel2.writeNoException();
                    zzc.a(parcel2, l3);
                    return true;
                case 17:
                    boolean W3 = W3();
                    parcel2.writeNoException();
                    zzc.a(parcel2, W3);
                    return true;
                case 18:
                    boolean Z3 = Z3();
                    parcel2.writeNoException();
                    zzc.a(parcel2, Z3);
                    return true;
                case 19:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    zzc.a(parcel2, isVisible);
                    return true;
                case 20:
                    z(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    p0(zzc.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    Q0(zzc.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    o6(zzc.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    D0(zzc.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    N0((Intent) zzc.b(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    startActivityForResult((Intent) zzc.b(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    zzb(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean A1() throws RemoteException;

    boolean B0() throws RemoteException;

    void D0(boolean z) throws RemoteException;

    IObjectWrapper H() throws RemoteException;

    IObjectWrapper L() throws RemoteException;

    void N0(Intent intent) throws RemoteException;

    void Q0(boolean z) throws RemoteException;

    IFragmentWrapper Q1() throws RemoteException;

    Bundle Q4() throws RemoteException;

    IFragmentWrapper R() throws RemoteException;

    IObjectWrapper T5() throws RemoteException;

    boolean W3() throws RemoteException;

    boolean Z3() throws RemoteException;

    boolean f4() throws RemoteException;

    int g() throws RemoteException;

    String getTag() throws RemoteException;

    boolean isVisible() throws RemoteException;

    boolean j0() throws RemoteException;

    boolean l3() throws RemoteException;

    boolean n1() throws RemoteException;

    void o6(boolean z) throws RemoteException;

    void p0(boolean z) throws RemoteException;

    void startActivityForResult(Intent intent, int i) throws RemoteException;

    int v5() throws RemoteException;

    void z(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper) throws RemoteException;
}
