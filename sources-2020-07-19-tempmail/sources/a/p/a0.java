package a.p;

import a.h.k.t;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14 */
class a0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    protected a f485a;

    /* compiled from: ViewOverlayApi14 */
    static class a extends ViewGroup {

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f486b;

        /* renamed from: c  reason: collision with root package name */
        View f487c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Drawable> f488d = null;

        /* renamed from: e  reason: collision with root package name */
        a0 f489e;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, a0 a0Var) {
            super(context);
            this.f486b = viewGroup;
            this.f487c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f489e = a0Var;
        }

        private void c(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f486b.getLocationOnScreen(iArr2);
            this.f487c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            if (this.f488d == null) {
                this.f488d = new ArrayList<>();
            }
            if (!this.f488d.contains(drawable)) {
                this.f488d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f486b || viewGroup.getParent() == null || !t.H(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f486b.getLocationOnScreen(iArr2);
                    t.N(view, iArr[0] - iArr2[0]);
                    t.O(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f488d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d() {
            /*
                r1 = this;
                int r0 = r1.getChildCount()
                if (r0 != 0) goto L_0x0012
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f488d
                if (r0 == 0) goto L_0x0010
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a.p.a0.a.d():boolean");
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f486b.getLocationOnScreen(iArr);
            this.f487c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f487c.getWidth(), this.f487c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f488d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f488d.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void e(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f488d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
            }
        }

        public void f(View view) {
            super.removeView(view);
            if (d()) {
                this.f486b.removeView(this);
            }
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f486b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f486b instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                c(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f488d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f488d
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: a.p.a0.a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    a0(Context context, ViewGroup viewGroup, View view) {
        this.f485a = new a(context, viewGroup, view, this);
    }

    static a0 e(View view) {
        ViewGroup f2 = f(view);
        if (f2 == null) {
            return null;
        }
        int childCount = f2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f2.getChildAt(i);
            if (childAt instanceof a) {
                return ((a) childAt).f489e;
            }
        }
        return new u(f2.getContext(), f2, view);
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    public void a(Drawable drawable) {
        this.f485a.a(drawable);
    }

    public void b(Drawable drawable) {
        this.f485a.e(drawable);
    }
}