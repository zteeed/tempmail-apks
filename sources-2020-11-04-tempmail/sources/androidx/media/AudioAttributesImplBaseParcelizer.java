package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer {
    public static c read(VersionedParcel versionedParcel) {
        c cVar = new c();
        cVar.f1717a = versionedParcel.p(cVar.f1717a, 1);
        cVar.f1718b = versionedParcel.p(cVar.f1718b, 2);
        cVar.f1719c = versionedParcel.p(cVar.f1719c, 3);
        cVar.f1720d = versionedParcel.p(cVar.f1720d, 4);
        return cVar;
    }

    public static void write(c cVar, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(cVar.f1717a, 1);
        versionedParcel.F(cVar.f1718b, 2);
        versionedParcel.F(cVar.f1719c, 3);
        versionedParcel.F(cVar.f1720d, 4);
    }
}
