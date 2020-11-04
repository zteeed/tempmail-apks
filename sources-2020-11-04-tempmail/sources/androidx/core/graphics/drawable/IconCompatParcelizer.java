package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1356a = versionedParcel.p(iconCompat.f1356a, 1);
        iconCompat.f1358c = versionedParcel.j(iconCompat.f1358c, 2);
        iconCompat.f1359d = versionedParcel.r(iconCompat.f1359d, 3);
        iconCompat.f1360e = versionedParcel.p(iconCompat.f1360e, 4);
        iconCompat.f1361f = versionedParcel.p(iconCompat.f1361f, 5);
        iconCompat.g = (ColorStateList) versionedParcel.r(iconCompat.g, 6);
        iconCompat.i = versionedParcel.t(iconCompat.i, 7);
        iconCompat.e();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.f(versionedParcel.f());
        int i = iconCompat.f1356a;
        if (-1 != i) {
            versionedParcel.F(i, 1);
        }
        byte[] bArr = iconCompat.f1358c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1359d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i2 = iconCompat.f1360e;
        if (i2 != 0) {
            versionedParcel.F(i2, 4);
        }
        int i3 = iconCompat.f1361f;
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
