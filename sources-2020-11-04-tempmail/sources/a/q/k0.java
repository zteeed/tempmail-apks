package a.q;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18 */
class k0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f560a;

    k0(View view) {
        this.f560a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f560a.equals(this.f560a);
    }

    public int hashCode() {
        return this.f560a.hashCode();
    }
}
