package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* compiled from: AudioAttributesImplApi21 */
class b implements a {

    /* renamed from: a  reason: collision with root package name */
    AudioAttributes f1632a;

    /* renamed from: b  reason: collision with root package name */
    int f1633b = -1;

    b() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f1632a.equals(((b) obj).f1632a);
    }

    public int hashCode() {
        return this.f1632a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1632a;
    }
}
