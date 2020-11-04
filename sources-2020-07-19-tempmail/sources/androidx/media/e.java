package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* compiled from: MediaSessionManager */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    f f1638a;

    public e(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1638a = new g(str, i, i2);
        } else {
            this.f1638a = new h(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f1638a.equals(((e) obj).f1638a);
    }

    public int hashCode() {
        return this.f1638a.hashCode();
    }

    public e(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f1638a = new g(remoteUserInfo);
    }
}
