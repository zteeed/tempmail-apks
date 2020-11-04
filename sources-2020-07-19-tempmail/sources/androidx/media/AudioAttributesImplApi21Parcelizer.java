package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer {
    public static b read(VersionedParcel versionedParcel) {
        b bVar = new b();
        bVar.f1632a = (AudioAttributes) versionedParcel.r(bVar.f1632a, 1);
        bVar.f1633b = versionedParcel.p(bVar.f1633b, 2);
        return bVar;
    }

    public static void write(b bVar, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.H(bVar.f1632a, 1);
        versionedParcel.F(bVar.f1633b, 2);
    }
}
