package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1329a = versionedParcel.p(iconCompat.f1329a, 1);
        iconCompat.f1331c = versionedParcel.j(iconCompat.f1331c, 2);
        iconCompat.f1332d = versionedParcel.r(iconCompat.f1332d, 3);
        iconCompat.f1333e = versionedParcel.p(iconCompat.f1333e, 4);
        iconCompat.f1334f = versionedParcel.p(iconCompat.f1334f, 5);
        iconCompat.g = (ColorStateList) versionedParcel.r(iconCompat.g, 6);
        iconCompat.i = versionedParcel.t(iconCompat.i, 7);
        iconCompat.e();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.f(versionedParcel.f());
        int i = iconCompat.f1329a;
        if (-1 != i) {
            versionedParcel.F(i, 1);
        }
        byte[] bArr = iconCompat.f1331c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1332d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i2 = iconCompat.f1333e;
        if (i2 != 0) {
            versionedParcel.F(i2, 4);
        }
        int i3 = iconCompat.f1334f;
        if (i3 != 0) {
            versionedParcel.F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
    }
}
