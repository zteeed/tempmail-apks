package androidx.appcompat.widget;

import a.h.k.s;
import a.h.k.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class AppCompatSpinner extends Spinner implements s {
    private static final int[] j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    private final d f951b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f952c;

    /* renamed from: d  reason: collision with root package name */
    private r f953d;

    /* renamed from: e  reason: collision with root package name */
    private SpinnerAdapter f954e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f955f;
    c g;
    int h;
    final Rect i;

    class a extends r {
        final /* synthetic */ c k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, c cVar) {
            super(view);
            this.k = cVar;
        }

        public androidx.appcompat.view.menu.s b() {
            return this.k;
        }

        public boolean c() {
            if (AppCompatSpinner.this.g.b()) {
                return true;
            }
            AppCompatSpinner.this.g.show();
            return true;
        }
    }

    private static class b implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        private SpinnerAdapter f956b;

        /* renamed from: c  reason: collision with root package name */
        private ListAdapter f957c;

        public b(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f956b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f957c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof x) {
                x xVar = (x) spinnerAdapter;
                if (xVar.getDropDownViewTheme() == null) {
                    xVar.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f957c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f956b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f956b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f956b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f956b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f956b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f957c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f956b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f956b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    private class c extends ListPopupWindow {
        private CharSequence J;
        ListAdapter K;
        private final Rect L = new Rect();

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f958b;

            a(AppCompatSpinner appCompatSpinner) {
                this.f958b = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    c cVar = c.this;
                    AppCompatSpinner.this.performItemClick(view, i, cVar.K.getItemId(i));
                }
                c.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                c cVar = c.this;
                if (!cVar.L(AppCompatSpinner.this)) {
                    c.this.dismiss();
                    return;
                }
                c.this.J();
                c.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c$c  reason: collision with other inner class name */
        class C0034c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f961b;

            C0034c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f961b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f961b);
                }
            }
        }

        public c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            r(AppCompatSpinner.this);
            z(true);
            E(0);
            B(new a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: package-private */
        public void J() {
            Drawable i = i();
            int i2 = 0;
            if (i != null) {
                i.getPadding(AppCompatSpinner.this.i);
                i2 = h0.b(AppCompatSpinner.this) ? AppCompatSpinner.this.i.right : -AppCompatSpinner.this.i.left;
            } else {
                Rect rect = AppCompatSpinner.this.i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.h;
            if (i3 == -2) {
                int a2 = appCompatSpinner.a((SpinnerAdapter) this.K, i());
                int i4 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.i;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a2 > i5) {
                    a2 = i5;
                }
                u(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                u((width - paddingLeft) - paddingRight);
            } else {
                u(i3);
            }
            x(h0.b(AppCompatSpinner.this) ? i2 + ((width - paddingRight) - m()) : i2 + paddingLeft);
        }

        public CharSequence K() {
            return this.J;
        }

        /* access modifiers changed from: package-private */
        public boolean L(View view) {
            return t.H(view) && view.getGlobalVisibleRect(this.L);
        }

        public void M(CharSequence charSequence) {
            this.J = charSequence;
        }

        public void q(ListAdapter listAdapter) {
            super.q(listAdapter);
            this.K = listAdapter;
        }

        public void show() {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            J();
            y(2);
            super.show();
            d().setChoiceMode(1);
            F(AppCompatSpinner.this.getSelectedItemPosition());
            if (!b2 && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                A(new C0034c(bVar));
            }
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return i3 + rect.left + rect.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f951b;
        if (dVar != null) {
            dVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.j();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.l();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.g != null) {
            return this.h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.g != null) {
            return this.f952c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        c cVar = this.g;
        return cVar != null ? cVar.K() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f951b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f951b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.g;
        if (cVar != null && cVar.b()) {
            this.g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.g != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar = this.f953d;
        if (rVar == null || !rVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        c cVar = this.g;
        if (cVar == null) {
            return super.performClick();
        }
        if (cVar.b()) {
            return true;
        }
        this.g.show();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f951b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.f951b;
        if (dVar != null) {
            dVar.g(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.x(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.G(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.g != null) {
            this.h = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.t(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(a.a.k.a.a.d(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.M(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f951b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f951b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.spinnerStyle);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f955f) {
            this.f954e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.f952c;
            if (context == null) {
                context = getContext();
            }
            this.g.q(new b(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r12 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r12 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.i = r0
            int[] r0 = a.a.j.Spinner
            r1 = 0
            androidx.appcompat.widget.b0 r0 = androidx.appcompat.widget.b0.u(r8, r9, r0, r10, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r7)
            r7.f951b = r2
            r2 = 0
            if (r12 == 0) goto L_0x0023
            a.a.n.d r3 = new a.a.n.d
            r3.<init>((android.content.Context) r8, (android.content.res.Resources.Theme) r12)
            r7.f952c = r3
            goto L_0x003e
        L_0x0023:
            int r12 = a.a.j.Spinner_popupTheme
            int r12 = r0.n(r12, r1)
            if (r12 == 0) goto L_0x0033
            a.a.n.d r3 = new a.a.n.d
            r3.<init>((android.content.Context) r8, (int) r12)
            r7.f952c = r3
            goto L_0x003e
        L_0x0033:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x003b
            r12 = r8
            goto L_0x003c
        L_0x003b:
            r12 = r2
        L_0x003c:
            r7.f952c = r12
        L_0x003e:
            android.content.Context r12 = r7.f952c
            r3 = 1
            if (r12 == 0) goto L_0x00ac
            r12 = -1
            if (r11 != r12) goto L_0x0074
            int[] r12 = j     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            boolean r4 = r12.hasValue(r1)     // Catch:{ Exception -> 0x005c }
            if (r4 == 0) goto L_0x0056
            int r11 = r12.getInt(r1, r1)     // Catch:{ Exception -> 0x005c }
        L_0x0056:
            if (r12 == 0) goto L_0x0074
        L_0x0058:
            r12.recycle()
            goto L_0x0074
        L_0x005c:
            r4 = move-exception
            goto L_0x0062
        L_0x005e:
            r8 = move-exception
            goto L_0x006e
        L_0x0060:
            r4 = move-exception
            r12 = r2
        L_0x0062:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch:{ all -> 0x006c }
            if (r12 == 0) goto L_0x0074
            goto L_0x0058
        L_0x006c:
            r8 = move-exception
            r2 = r12
        L_0x006e:
            if (r2 == 0) goto L_0x0073
            r2.recycle()
        L_0x0073:
            throw r8
        L_0x0074:
            if (r11 != r3) goto L_0x00ac
            androidx.appcompat.widget.AppCompatSpinner$c r11 = new androidx.appcompat.widget.AppCompatSpinner$c
            android.content.Context r12 = r7.f952c
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f952c
            int[] r4 = a.a.j.Spinner
            androidx.appcompat.widget.b0 r12 = androidx.appcompat.widget.b0.u(r12, r9, r4, r10, r1)
            int r1 = a.a.j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.m(r1, r4)
            r7.h = r1
            int r1 = a.a.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.g(r1)
            r11.t(r1)
            int r1 = a.a.j.Spinner_android_prompt
            java.lang.String r1 = r0.o(r1)
            r11.M(r1)
            r12.v()
            r7.g = r11
            androidx.appcompat.widget.AppCompatSpinner$a r12 = new androidx.appcompat.widget.AppCompatSpinner$a
            r12.<init>(r7, r11)
            r7.f953d = r12
        L_0x00ac:
            int r11 = a.a.j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.q(r11)
            if (r11 == 0) goto L_0x00c4
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = a.a.g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter((android.widget.SpinnerAdapter) r12)
        L_0x00c4:
            r0.v()
            r7.f955f = r3
            android.widget.SpinnerAdapter r8 = r7.f954e
            if (r8 == 0) goto L_0x00d2
            r7.setAdapter((android.widget.SpinnerAdapter) r8)
            r7.f954e = r2
        L_0x00d2:
            androidx.appcompat.widget.d r8 = r7.f951b
            r8.e(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
