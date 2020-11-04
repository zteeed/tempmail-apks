package a.q;

import android.os.IBinder;

/* compiled from: WindowIdApi14 */
class j0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f558a;

    j0(IBinder iBinder) {
        this.f558a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j0) && ((j0) obj).f558a.equals(this.f558a);
    }

    public int hashCode() {
        return this.f558a.hashCode();
    }
}
