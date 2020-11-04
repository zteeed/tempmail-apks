package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.d;

/* compiled from: BaseTransientBottomBar */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private d.b f10880a;

    public a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.J(0.1f);
        swipeDismissBehavior.I(0.6f);
        swipeDismissBehavior.K(0);
    }

    public boolean a(View view) {
        return view instanceof BaseTransientBottomBar$SnackbarBaseLayout;
    }

    public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                d.b().f(this.f10880a);
            }
        } else if (coordinatorLayout.F(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            d.b().e(this.f10880a);
        }
    }
}
