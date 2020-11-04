package androidx.media;

import a.h.j.c;
import android.media.session.MediaSessionManager;

/* compiled from: MediaSessionManagerImplApi28 */
final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    final MediaSessionManager.RemoteUserInfo f1639a;

    g(String str, int i, int i2) {
        this.f1639a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f1639a.equals(((g) obj).f1639a);
    }

    public int hashCode() {
        return c.b(this.f1639a);
    }

    g(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f1639a = remoteUserInfo;
    }
}
