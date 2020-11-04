package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* compiled from: MediaSessionManager */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    f f1721a;

    public e(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1721a = new g(str, i, i2);
        } else {
            this.f1721a = new h(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f1721a.equals(((e) obj).f1721a);
    }

    public int hashCode() {
        return this.f1721a.hashCode();
    }

    public e(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f1721a = new g(remoteUserInfo);
    }
}
