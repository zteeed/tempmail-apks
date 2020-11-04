package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    private static void A(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    private static void B(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    public static int a(Parcel parcel) {
        return y(parcel, 20293);
    }

    public static void b(Parcel parcel, int i) {
        A(parcel, i);
    }

    public static void c(Parcel parcel, int i, boolean z) {
        B(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            B(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int y = y(parcel, i);
            parcel.writeBundle(bundle);
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int y = y(parcel, i);
            parcel.writeByteArray(bArr);
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void g(Parcel parcel, int i, double d2) {
        B(parcel, i, 8);
        parcel.writeDouble(d2);
    }

    public static void h(Parcel parcel, int i, Double d2, boolean z) {
        if (d2 != null) {
            B(parcel, i, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void i(Parcel parcel, int i, float f2) {
        B(parcel, i, 4);
        parcel.writeFloat(f2);
    }

    public static void j(Parcel parcel, int i, Float f2, boolean z) {
        if (f2 != null) {
            B(parcel, i, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void k(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int y = y(parcel, i);
            parcel.writeStrongBinder(iBinder);
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void l(Parcel parcel, int i, int i2) {
        B(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int y = y(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void n(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            B(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void o(Parcel parcel, int i, long j) {
        B(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void p(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            B(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void q(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int y = y(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void r(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int y = y(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void s(Parcel parcel, int i, short s) {
        B(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void t(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int y = y(parcel, i);
            parcel.writeString(str);
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void u(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int y = y(parcel, i);
            parcel.writeStringArray(strArr);
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static void v(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int y = y(parcel, i);
            parcel.writeStringList(list);
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void w(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int y = y(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    z(parcel, t, i2);
                }
            }
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void x(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int y = y(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    z(parcel, parcelable, 0);
                }
            }
            A(parcel, y);
        } else if (z) {
            B(parcel, i, 0);
        }
    }

    private static int y(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static <T extends Parcelable> void z(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
