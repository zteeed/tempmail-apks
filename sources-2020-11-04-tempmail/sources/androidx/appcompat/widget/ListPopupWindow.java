package androidx.appcompat.widget;

import a.a.j;
import a.h.k.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.s;
import androidx.core.widget.h;
import java.lang.reflect.Method;

public class ListPopupWindow implements s {
    private static Method G;
    private static Method H;
    private static Method I;
    private final b A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: b  reason: collision with root package name */
    private Context f1010b;

    /* renamed from: c  reason: collision with root package name */
    private ListAdapter f1011c;

    /* renamed from: d  reason: collision with root package name */
    p f1012d;

    /* renamed from: e  reason: collision with root package name */
    private int f1013e;

    /* renamed from: f  reason: collision with root package name */
    private int f1014f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    int p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    final f x;
    private final e y;
    private final d z;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            p pVar;
            if (i != -1 && (pVar = ListPopupWindow.this.f1012d) != null) {
                pVar.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            ListPopupWindow.this.f();
        }
    }

    private class c extends DataSetObserver {
        c() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.b()) {
                ListPopupWindow.this.show();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    private class d implements AbsListView.OnScrollListener {
        d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.n() && ListPopupWindow.this.F.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.B.removeCallbacks(listPopupWindow.x);
                ListPopupWindow.this.x.run();
            }
        }
    }

    private class e implements View.OnTouchListener {
        e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.F) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.F.getWidth() && y >= 0 && y < ListPopupWindow.this.F.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.B.postDelayed(listPopupWindow.x, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.B.removeCallbacks(listPopupWindow2.x);
                return false;
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void run() {
            p pVar = ListPopupWindow.this.f1012d;
            if (pVar != null && u.H(pVar) && ListPopupWindow.this.f1012d.getCount() > ListPopupWindow.this.f1012d.getChildCount()) {
                int childCount = ListPopupWindow.this.f1012d.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.p) {
                    listPopupWindow.F.setInputMethodMode(2);
                    ListPopupWindow.this.show();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            G = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        Class<PopupWindow> cls2 = PopupWindow.class;
        try {
            H = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public ListPopupWindow(Context context) {
        this(context, (AttributeSet) null, a.a.a.listPopupWindowStyle);
    }

    private void D(boolean z2) {
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, new Object[]{Boolean.valueOf(z2)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: androidx.appcompat.widget.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: androidx.appcompat.widget.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int e() {
        /*
            r12 = this;
            androidx.appcompat.widget.p r0 = r12.f1012d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b8
            android.content.Context r0 = r12.f1010b
            boolean r5 = r12.E
            r5 = r5 ^ r3
            androidx.appcompat.widget.p r5 = r12.g(r0, r5)
            r12.f1012d = r5
            android.graphics.drawable.Drawable r6 = r12.u
            if (r6 == 0) goto L_0x001b
            r5.setSelector(r6)
        L_0x001b:
            androidx.appcompat.widget.p r5 = r12.f1012d
            android.widget.ListAdapter r6 = r12.f1011c
            r5.setAdapter(r6)
            androidx.appcompat.widget.p r5 = r12.f1012d
            android.widget.AdapterView$OnItemClickListener r6 = r12.v
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.p r5 = r12.f1012d
            r5.setFocusable(r3)
            androidx.appcompat.widget.p r5 = r12.f1012d
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.p r5 = r12.f1012d
            androidx.appcompat.widget.ListPopupWindow$a r6 = new androidx.appcompat.widget.ListPopupWindow$a
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.p r5 = r12.f1012d
            androidx.appcompat.widget.ListPopupWindow$d r6 = r12.z
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.w
            if (r5 == 0) goto L_0x004d
            androidx.appcompat.widget.p r6 = r12.f1012d
            r6.setOnItemSelectedListener(r5)
        L_0x004d:
            androidx.appcompat.widget.p r5 = r12.f1012d
            android.view.View r6 = r12.q
            if (r6 == 0) goto L_0x00b1
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.r
            if (r8 == 0) goto L_0x0088
            if (r8 == r3) goto L_0x0081
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.r
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x008e
        L_0x0081:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008e
        L_0x0088:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008e:
            int r0 = r12.f1014f
            if (r0 < 0) goto L_0x0095
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0097
        L_0x0095:
            r0 = 0
            r5 = 0
        L_0x0097:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            android.widget.PopupWindow r6 = r12.F
            r6.setContentView(r5)
            goto L_0x00d6
        L_0x00b8:
            android.widget.PopupWindow r0 = r12.F
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.q
            if (r0 == 0) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            android.widget.PopupWindow r5 = r12.F
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f2
            android.graphics.Rect r6 = r12.C
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.C
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.j
            if (r7 != 0) goto L_0x00f8
            int r6 = -r6
            r12.h = r6
            goto L_0x00f8
        L_0x00f2:
            android.graphics.Rect r5 = r12.C
            r5.setEmpty()
            r5 = 0
        L_0x00f8:
            android.widget.PopupWindow r6 = r12.F
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            android.view.View r4 = r12.h()
            int r6 = r12.h
            int r3 = r12.k(r4, r6, r3)
            boolean r4 = r12.n
            if (r4 != 0) goto L_0x0174
            int r4 = r12.f1013e
            if (r4 != r2) goto L_0x0116
            goto L_0x0174
        L_0x0116:
            int r4 = r12.f1014f
            r6 = -2
            if (r4 == r6) goto L_0x013d
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0124
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0155
        L_0x0124:
            android.content.Context r2 = r12.f1010b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0155
        L_0x013d:
            android.content.Context r2 = r12.f1010b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0155:
            r7 = r1
            androidx.appcompat.widget.p r6 = r12.f1012d
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0172
            androidx.appcompat.widget.p r2 = r12.f1012d
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.p r3 = r12.f1012d
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0172:
            int r1 = r1 + r0
            return r1
        L_0x0174:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.e():int");
    }

    private int k(View view, int i2, boolean z2) {
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, new Object[]{view, Integer.valueOf(i2), Boolean.valueOf(z2)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i2);
    }

    private void p() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    public void A(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void B(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void C(boolean z2) {
        this.l = true;
        this.k = z2;
    }

    public void E(int i2) {
        this.r = i2;
    }

    public void F(int i2) {
        p pVar = this.f1012d;
        if (b() && pVar != null) {
            pVar.setListSelectionHidden(false);
            pVar.setSelection(i2);
            if (pVar.getChoiceMode() != 0) {
                pVar.setItemChecked(i2, true);
            }
        }
    }

    public void G(int i2) {
        this.h = i2;
        this.j = true;
    }

    public void H(int i2) {
        this.f1014f = i2;
    }

    public boolean b() {
        return this.F.isShowing();
    }

    public ListView d() {
        return this.f1012d;
    }

    public void dismiss() {
        this.F.dismiss();
        p();
        this.F.setContentView((View) null);
        this.f1012d = null;
        this.B.removeCallbacks(this.x);
    }

    public void f() {
        p pVar = this.f1012d;
        if (pVar != null) {
            pVar.setListSelectionHidden(true);
            pVar.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public p g(Context context, boolean z2) {
        return new p(context, z2);
    }

    public View h() {
        return this.t;
    }

    public Drawable i() {
        return this.F.getBackground();
    }

    public int j() {
        return this.g;
    }

    public int l() {
        if (!this.j) {
            return 0;
        }
        return this.h;
    }

    public int m() {
        return this.f1014f;
    }

    public boolean n() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean o() {
        return this.E;
    }

    public void q(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new c();
        } else {
            ListAdapter listAdapter2 = this.f1011c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1011c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        p pVar = this.f1012d;
        if (pVar != null) {
            pVar.setAdapter(this.f1011c);
        }
    }

    public void r(View view) {
        this.t = view;
    }

    public void s(int i2) {
        this.F.setAnimationStyle(i2);
    }

    public void show() {
        int e2 = e();
        boolean n2 = n();
        h.b(this.F, this.i);
        boolean z2 = true;
        if (!this.F.isShowing()) {
            int i2 = this.f1014f;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = h().getWidth();
            }
            int i3 = this.f1013e;
            if (i3 == -1) {
                e2 = -1;
            } else if (i3 != -2) {
                e2 = i3;
            }
            this.F.setWidth(i2);
            this.F.setHeight(e2);
            D(true);
            this.F.setOutsideTouchable(!this.o && !this.n);
            this.F.setTouchInterceptor(this.y);
            if (this.l) {
                h.a(this.F, this.k);
            }
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, new Object[]{this.D});
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
            h.c(this.F, h(), this.g, this.h, this.m);
            this.f1012d.setSelection(-1);
            if (!this.E || this.f1012d.isInTouchMode()) {
                f();
            }
            if (!this.E) {
                this.B.post(this.A);
            }
        } else if (u.H(h())) {
            int i4 = this.f1014f;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = h().getWidth();
            }
            int i5 = this.f1013e;
            if (i5 == -1) {
                if (!n2) {
                    e2 = -1;
                }
                if (n2) {
                    this.F.setWidth(this.f1014f == -1 ? -1 : 0);
                    this.F.setHeight(0);
                } else {
                    this.F.setWidth(this.f1014f == -1 ? -1 : 0);
                    this.F.setHeight(-1);
                }
            } else if (i5 != -2) {
                e2 = i5;
            }
            PopupWindow popupWindow = this.F;
            if (this.o || this.n) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.F.update(h(), this.g, this.h, i4 < 0 ? -1 : i4, e2 < 0 ? -1 : e2);
        }
    }

    public void t(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void u(int i2) {
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            this.f1014f = rect.left + rect.right + i2;
            return;
        }
        H(i2);
    }

    public void v(int i2) {
        this.m = i2;
    }

    public void w(Rect rect) {
        this.D = rect;
    }

    public void x(int i2) {
        this.g = i2;
    }

    public void y(int i2) {
        this.F.setInputMethodMode(i2);
    }

    public void z(boolean z2) {
        this.E = z2;
        this.F.setFocusable(z2);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1013e = -2;
        this.f1014f = -2;
        this.i = 1002;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new f();
        this.y = new e();
        this.z = new d();
        this.A = new b();
        this.C = new Rect();
        this.f1010b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ListPopupWindow, i2, i3);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i2, i3);
        this.F = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
