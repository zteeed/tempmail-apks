package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private SafeParcelReader() {
    }

    public static float A(Parcel parcel, int i) {
        M(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float B(Parcel parcel, int i) {
        int J = J(parcel, i);
        if (J == 0) {
            return null;
        }
        N(parcel, i, J, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int C(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder D(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + J);
        return readStrongBinder;
    }

    public static int E(Parcel parcel, int i) {
        M(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer F(Parcel parcel, int i) {
        int J = J(parcel, i);
        if (J == 0) {
            return null;
        }
        N(parcel, i, J, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long G(Parcel parcel, int i) {
        M(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long H(Parcel parcel, int i) {
        int J = J(parcel, i);
        if (J == 0) {
            return null;
        }
        N(parcel, i, J, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short I(Parcel parcel, int i) {
        M(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static int J(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static void K(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i));
    }

    public static int L(Parcel parcel) {
        int C = C(parcel);
        int J = J(parcel, C);
        int dataPosition = parcel.dataPosition();
        if (v(C) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(C));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = J + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    private static void M(Parcel parcel, int i, int i2) {
        int J = J(parcel, i);
        if (J != i2) {
            String hexString = Integer.toHexString(J);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(J);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    private static void N(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    public static BigDecimal a(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + J);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigDecimal[] b(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + J);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + J);
        return new BigInteger(createByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + J);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + J);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + J);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + J);
        return createByteArray;
    }

    public static double[] h(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + J);
        return createDoubleArray;
    }

    public static float[] i(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + J);
        return createFloatArray;
    }

    public static int[] j(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + J);
        return createIntArray;
    }

    public static ArrayList<Integer> k(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + J);
        return arrayList;
    }

    public static long[] l(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + J);
        return createLongArray;
    }

    public static Parcel m(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, J);
        parcel.setDataPosition(dataPosition + J);
        return obtain;
    }

    public static Parcel[] n(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + J);
        return parcelArr;
    }

    public static <T extends Parcelable> T o(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + J);
        return t;
    }

    public static String p(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + J);
        return readString;
    }

    public static String[] q(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + J);
        return createStringArray;
    }

    public static ArrayList<String> r(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + J);
        return createStringArrayList;
    }

    public static <T> T[] s(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + J);
        return createTypedArray;
    }

    public static <T> ArrayList<T> t(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + J);
        return createTypedArrayList;
    }

    public static void u(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
    }

    public static int v(int i) {
        return i & 65535;
    }

    public static boolean w(Parcel parcel, int i) {
        M(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean x(Parcel parcel, int i) {
        int J = J(parcel, i);
        if (J == 0) {
            return null;
        }
        N(parcel, i, J, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double y(Parcel parcel, int i) {
        M(parcel, i, 8);
        return parcel.readDouble();
    }

    public static Double z(Parcel parcel, int i) {
        int J = J(parcel, i);
        if (J == 0) {
            return null;
        }
        N(parcel, i, J, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
