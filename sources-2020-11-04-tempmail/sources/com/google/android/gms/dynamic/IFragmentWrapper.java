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

            public final boolean B3() throws RemoteException {
                Parcel H = H(16, B());
                boolean e2 = zzc.e(H);
                H.recycle();
                return e2;
            }

            public final void C(IObjectWrapper iObjectWrapper) throws RemoteException {
                Parcel B = B();
                zzc.c(B, iObjectWrapper);
                V(20, B);
            }

            public final boolean H0() throws RemoteException {
                Parcel H = H(11, B());
                boolean e2 = zzc.e(H);
                H.recycle();
                return e2;
            }

            public final void J0(boolean z) throws RemoteException {
                Parcel B = B();
                zzc.a(B, z);
                V(24, B);
            }

            public final boolean J1() throws RemoteException {
                Parcel H = H(7, B());
                boolean e2 = zzc.e(H);
                H.recycle();
                return e2;
            }

            public final IObjectWrapper L() throws RemoteException {
                Parcel H = H(6, B());
                IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
                H.recycle();
                return H2;
            }

            public final IObjectWrapper Q() throws RemoteException {
                Parcel H = H(2, B());
                IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
                H.recycle();
                return H2;
            }

            public final void Q6(boolean z) throws RemoteException {
                Parcel B = B();
                zzc.a(B, z);
                V(23, B);
            }

            public final int R5() throws RemoteException {
                Parcel H = H(10, B());
                int readInt = H.readInt();
                H.recycle();
                return readInt;
            }

            public final void U0(Intent intent) throws RemoteException {
                Parcel B = B();
                zzc.d(B, intent);
                V(25, B);
            }

            public final IFragmentWrapper X() throws RemoteException {
                Parcel H = H(5, B());
                IFragmentWrapper H2 = Stub.H(H.readStrongBinder());
                H.recycle();
                return H2;
            }

            public final void X0(boolean z) throws RemoteException {
                Parcel B = B();
                zzc.a(B, z);
                V(22, B);
            }

            public final IFragmentWrapper Z1() throws RemoteException {
                Parcel H = H(9, B());
                IFragmentWrapper H2 = Stub.H(H.readStrongBinder());
                H.recycle();
                return H2;
            }

            public final String getTag() throws RemoteException {
                Parcel H = H(8, B());
                String readString = H.readString();
                H.recycle();
                return readString;
            }

            public final int h() throws RemoteException {
                Parcel H = H(4, B());
                int readInt = H.readInt();
                H.recycle();
                return readInt;
            }

            public final boolean isVisible() throws RemoteException {
                Parcel H = H(19, B());
                boolean e2 = zzc.e(H);
                H.recycle();
                return e2;
            }

            public final Bundle k5() throws RemoteException {
                Parcel H = H(3, B());
                Bundle bundle = (Bundle) zzc.b(H, Bundle.CREATOR);
                H.recycle();
                return bundle;
            }

            public final boolean p0() throws RemoteException {
                Parcel H = H(15, B());
                boolean e2 = zzc.e(H);
                H.recycle();
                return e2;
            }

            public final boolean q4() throws RemoteException {
                Parcel H = H(17, B());
                boolean e2 = zzc.e(H);
                H.recycle();
                return e2;
            }

            public final void startActivityForResult(Intent intent, int i) throws RemoteException {
                Parcel B = B();
                zzc.d(B, intent);
                B.writeInt(i);
                V(26, B);
            }

            public final boolean t1() throws RemoteException {
                Parcel H = H(14, B());
                boolean e2 = zzc.e(H);
                H.recycle();
                return e2;
            }

            public final boolean t4() throws RemoteException {
                Parcel H = H(18, B());
                boolean e2 = zzc.e(H);
                H.recycle();
                return e2;
            }

            public final IObjectWrapper t6() throws RemoteException {
                Parcel H = H(12, B());
                IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
                H.recycle();
                return H2;
            }

            public final void v0(boolean z) throws RemoteException {
                Parcel B = B();
                zzc.a(B, z);
                V(21, B);
            }

            public final boolean z4() throws RemoteException {
                Parcel H = H(13, B());
                boolean e2 = zzc.e(H);
                H.recycle();
                return e2;
            }

            public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
                Parcel B = B();
                zzc.c(B, iObjectWrapper);
                V(27, B);
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper H(IBinder iBinder) {
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
        public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    IObjectWrapper Q = Q();
                    parcel2.writeNoException();
                    zzc.c(parcel2, Q);
                    return true;
                case 3:
                    Bundle k5 = k5();
                    parcel2.writeNoException();
                    zzc.f(parcel2, k5);
                    return true;
                case 4:
                    int h = h();
                    parcel2.writeNoException();
                    parcel2.writeInt(h);
                    return true;
                case 5:
                    IFragmentWrapper X = X();
                    parcel2.writeNoException();
                    zzc.c(parcel2, X);
                    return true;
                case 6:
                    IObjectWrapper L = L();
                    parcel2.writeNoException();
                    zzc.c(parcel2, L);
                    return true;
                case 7:
                    boolean J1 = J1();
                    parcel2.writeNoException();
                    zzc.a(parcel2, J1);
                    return true;
                case 8:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 9:
                    IFragmentWrapper Z1 = Z1();
                    parcel2.writeNoException();
                    zzc.c(parcel2, Z1);
                    return true;
                case 10:
                    int R5 = R5();
                    parcel2.writeNoException();
                    parcel2.writeInt(R5);
                    return true;
                case 11:
                    boolean H0 = H0();
                    parcel2.writeNoException();
                    zzc.a(parcel2, H0);
                    return true;
                case 12:
                    IObjectWrapper t6 = t6();
                    parcel2.writeNoException();
                    zzc.c(parcel2, t6);
                    return true;
                case 13:
                    boolean z4 = z4();
                    parcel2.writeNoException();
                    zzc.a(parcel2, z4);
                    return true;
                case 14:
                    boolean t1 = t1();
                    parcel2.writeNoException();
                    zzc.a(parcel2, t1);
                    return true;
                case 15:
                    boolean p0 = p0();
                    parcel2.writeNoException();
                    zzc.a(parcel2, p0);
                    return true;
                case 16:
                    boolean B3 = B3();
                    parcel2.writeNoException();
                    zzc.a(parcel2, B3);
                    return true;
                case 17:
                    boolean q4 = q4();
                    parcel2.writeNoException();
                    zzc.a(parcel2, q4);
                    return true;
                case 18:
                    boolean t4 = t4();
                    parcel2.writeNoException();
                    zzc.a(parcel2, t4);
                    return true;
                case 19:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    zzc.a(parcel2, isVisible);
                    return true;
                case 20:
                    C(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    v0(zzc.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    X0(zzc.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    Q6(zzc.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    J0(zzc.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    U0((Intent) zzc.b(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    startActivityForResult((Intent) zzc.b(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    zzb(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean B3() throws RemoteException;

    void C(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean H0() throws RemoteException;

    void J0(boolean z) throws RemoteException;

    boolean J1() throws RemoteException;

    IObjectWrapper L() throws RemoteException;

    IObjectWrapper Q() throws RemoteException;

    void Q6(boolean z) throws RemoteException;

    int R5() throws RemoteException;

    void U0(Intent intent) throws RemoteException;

    IFragmentWrapper X() throws RemoteException;

    void X0(boolean z) throws RemoteException;

    IFragmentWrapper Z1() throws RemoteException;

    String getTag() throws RemoteException;

    int h() throws RemoteException;

    boolean isVisible() throws RemoteException;

    Bundle k5() throws RemoteException;

    boolean p0() throws RemoteException;

    boolean q4() throws RemoteException;

    void startActivityForResult(Intent intent, int i) throws RemoteException;

    boolean t1() throws RemoteException;

    boolean t4() throws RemoteException;

    IObjectWrapper t6() throws RemoteException;

    void v0(boolean z) throws RemoteException;

    boolean z4() throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper) throws RemoteException;
}
