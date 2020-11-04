package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* compiled from: AudioAttributesImplApi21 */
class b implements a {

    /* renamed from: a  reason: collision with root package name */
    AudioAttributes f1715a;

    /* renamed from: b  reason: collision with root package name */
    int f1716b = -1;

    b() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f1715a.equals(((b) obj).f1715a);
    }

    public int hashCode() {
        return this.f1715a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1715a;
    }
}
