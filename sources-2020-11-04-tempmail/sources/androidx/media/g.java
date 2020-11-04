package androidx.media;

import a.h.j.c;
import android.media.session.MediaSessionManager;

/* compiled from: MediaSessionManagerImplApi28 */
final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    final MediaSessionManager.RemoteUserInfo f1722a;

    g(String str, int i, int i2) {
        this.f1722a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f1722a.equals(((g) obj).f1722a);
    }

    public int hashCode() {
        return c.b(this.f1722a);
    }

    g(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f1722a = remoteUserInfo;
    }
}
