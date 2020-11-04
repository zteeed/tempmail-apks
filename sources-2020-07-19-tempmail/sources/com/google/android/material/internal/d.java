package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: DescendantOffsetUtils */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Matrix> f10839a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<RectF> f10840b = new ThreadLocal<>();

    public static void a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        c(viewGroup, view, rect);
    }

    private static void b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            b(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    public static void c(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f10839a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f10839a.set(matrix);
        } else {
            matrix.reset();
        }
        b(viewGroup, view, matrix);
        RectF rectF = f10840b.get();
        if (rectF == null) {
            rectF = new RectF();
            f10840b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
