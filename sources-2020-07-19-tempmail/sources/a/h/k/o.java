package a.h.k;

import android.view.View;

/* compiled from: NestedScrollingParent */
public interface o {
    boolean onNestedFling(View view, float f2, float f3, boolean z);

    boolean onNestedPreFling(View view, float f2, float f3);

    void onNestedPreScroll(View view, int i, int i2, int[] iArr);

    void onNestedScroll(View view, int i, int i2, int i3, int i4);

    void onNestedScrollAccepted(View view, View view2, int i);

    boolean onStartNestedScroll(View view, View view2, int i);

    void onStopNestedScroll(View view);
}
