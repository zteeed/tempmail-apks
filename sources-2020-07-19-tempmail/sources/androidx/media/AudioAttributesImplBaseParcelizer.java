package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer {
    public static c read(VersionedParcel versionedParcel) {
        c cVar = new c();
        cVar.f1634a = versionedParcel.p(cVar.f1634a, 1);
        cVar.f1635b = versionedParcel.p(cVar.f1635b, 2);
        cVar.f1636c = versionedParcel.p(cVar.f1636c, 3);
        cVar.f1637d = versionedParcel.p(cVar.f1637d, 4);
        return cVar;
    }

    public static void write(c cVar, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(cVar.f1634a, 1);
        versionedParcel.F(cVar.f1635b, 2);
        versionedParcel.F(cVar.f1636c, 3);
        versionedParcel.F(cVar.f1637d, 4);
    }
}
