package a.p;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18 */
class k0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f556a;

    k0(View view) {
        this.f556a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f556a.equals(this.f556a);
    }

    public int hashCode() {
        return this.f556a.hashCode();
    }
}
