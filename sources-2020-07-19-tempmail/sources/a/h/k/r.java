package a.h.k;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private Object f407a;

    private r(Object obj) {
        this.f407a = obj;
    }

    public static r b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new r(PointerIcon.getSystemIcon(context, i));
        }
        return new r((Object) null);
    }

    public Object a() {
        return this.f407a;
    }
}
