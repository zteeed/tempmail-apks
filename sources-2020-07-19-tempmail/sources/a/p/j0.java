package a.p;

import android.os.IBinder;

/* compiled from: WindowIdApi14 */
class j0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f554a;

    j0(IBinder iBinder) {
        this.f554a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j0) && ((j0) obj).f554a.equals(this.f554a);
    }

    public int hashCode() {
        return this.f554a.hashCode();
    }
}
