package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1256a = (IconCompat) versionedParcel.v(remoteActionCompat.f1256a, 1);
        remoteActionCompat.f1257b = versionedParcel.l(remoteActionCompat.f1257b, 2);
        remoteActionCompat.f1258c = versionedParcel.l(remoteActionCompat.f1258c, 3);
        remoteActionCompat.f1259d = (PendingIntent) versionedParcel.r(remoteActionCompat.f1259d, 4);
        remoteActionCompat.f1260e = versionedParcel.h(remoteActionCompat.f1260e, 5);
        remoteActionCompat.f1261f = versionedParcel.h(remoteActionCompat.f1261f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f1256a, 1);
        versionedParcel.D(remoteActionCompat.f1257b, 2);
        versionedParcel.D(remoteActionCompat.f1258c, 3);
        versionedParcel.H(remoteActionCompat.f1259d, 4);
        versionedParcel.z(remoteActionCompat.f1260e, 5);
        versionedParcel.z(remoteActionCompat.f1261f, 6);
    }
}
