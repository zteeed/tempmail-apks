package a.q;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: ViewUtilsBase */
class h0 {
    h0() {
    }

    public void a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(j.save_non_transition_alpha, (Object) null);
        }
    }

    public float b(View view) {
        Float f2 = (Float) view.getTag(j.save_non_transition_alpha);
        if (f2 != null) {
            return view.getAlpha() / f2.floatValue();
        }
        return view.getAlpha();
    }

    public void c(View view) {
        if (view.getTag(j.save_non_transition_alpha) == null) {
            view.setTag(j.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void d(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    public void e(View view, float f2) {
        Float f3 = (Float) view.getTag(j.save_non_transition_alpha);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    public void f(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void g(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            g(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
