package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: DataBindingUtil */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static c f1437a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static e f1438b = null;

    static <T extends ViewDataBinding> T a(e eVar, View view, int i) {
        return f1437a.b(eVar, view, i);
    }

    static <T extends ViewDataBinding> T b(e eVar, View[] viewArr, int i) {
        return f1437a.c(eVar, viewArr, i);
    }

    private static <T extends ViewDataBinding> T c(e eVar, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return a(eVar, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return b(eVar, viewArr, i2);
    }

    public static <T extends ViewDataBinding> T d(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        return e(layoutInflater, i, viewGroup, z, f1438b);
    }

    public static <T extends ViewDataBinding> T e(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, e eVar) {
        int i2 = 0;
        boolean z2 = viewGroup != null && z;
        if (z2) {
            i2 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (z2) {
            return c(eVar, viewGroup, i2, i);
        }
        return a(eVar, inflate, i);
    }

    public static <T extends ViewDataBinding> T f(Activity activity, int i) {
        return g(activity, i, f1438b);
    }

    public static <T extends ViewDataBinding> T g(Activity activity, int i, e eVar) {
        activity.setContentView(i);
        return c(eVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i);
    }
}
