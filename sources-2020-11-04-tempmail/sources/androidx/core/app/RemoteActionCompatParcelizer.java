package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1283a = (IconCompat) versionedParcel.v(remoteActionCompat.f1283a, 1);
        remoteActionCompat.f1284b = versionedParcel.l(remoteActionCompat.f1284b, 2);
        remoteActionCompat.f1285c = versionedParcel.l(remoteActionCompat.f1285c, 3);
        remoteActionCompat.f1286d = (PendingIntent) versionedParcel.r(remoteActionCompat.f1286d, 4);
        remoteActionCompat.f1287e = versionedParcel.h(remoteActionCompat.f1287e, 5);
        remoteActionCompat.f1288f = versionedParcel.h(remoteActionCompat.f1288f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f1283a, 1);
        versionedParcel.D(remoteActionCompat.f1284b, 2);
        versionedParcel.D(remoteActionCompat.f1285c, 3);
        versionedParcel.H(remoteActionCompat.f1286d, 4);
        versionedParcel.z(remoteActionCompat.f1287e, 5);
        versionedParcel.z(remoteActionCompat.f1288f, 6);
    }
}
