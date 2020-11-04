package a.h.k;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: ViewParentCompat */
public final class x {
    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f2, f3, z);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
                return false;
            }
        } else if (viewParent instanceof o) {
            return ((o) viewParent).onNestedFling(view, f2, f3, z);
        } else {
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f2, f3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
                return false;
            }
        } else if (viewParent instanceof o) {
            return ((o) viewParent).onNestedPreFling(view, f2, f3);
        } else {
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof m) {
            ((m) viewParent).m(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
                }
            } else if (viewParent instanceof o) {
                ((o) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof n) {
            ((n) viewParent2).h(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof m) {
            ((m) viewParent2).i(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    AbstractMethodError abstractMethodError = e2;
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
                }
            } else if (viewParent2 instanceof o) {
                ((o) viewParent2).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof m) {
            ((m) viewParent).k(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
                }
            } else if (viewParent instanceof o) {
                ((o) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof m) {
            return ((m) viewParent).j(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
                return false;
            }
        } else if (viewParent instanceof o) {
            return ((o) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof m) {
            ((m) viewParent).l(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
                }
            } else if (viewParent instanceof o) {
                ((o) viewParent).onStopNestedScroll(view);
            }
        }
    }

    @Deprecated
    public static boolean h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
