package androidx.appcompat.widget;

import a.a.h;
import a.a.j;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.s;

public class ActivityChooserView extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    final f f940b;

    /* renamed from: c  reason: collision with root package name */
    private final g f941c;

    /* renamed from: d  reason: collision with root package name */
    private final View f942d;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable f943e;

    /* renamed from: f  reason: collision with root package name */
    final FrameLayout f944f;
    private final ImageView g;
    final FrameLayout h;
    private final ImageView i;
    private final int j;
    a.h.k.b k;
    final DataSetObserver l;
    private final ViewTreeObserver.OnGlobalLayoutListener m;
    private ListPopupWindow n;
    PopupWindow.OnDismissListener o;
    boolean p;
    int q;
    private boolean r;
    private int s;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private static final int[] f945b = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            b0 t = b0.t(context, attributeSet, f945b);
            setBackgroundDrawable(t.g(0));
            t.v();
        }
    }

    class a extends DataSetObserver {
        a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f940b.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f940b.notifyDataSetInvalidated();
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().show();
            a.h.k.b bVar = ActivityChooserView.this.k;
            if (bVar != null) {
                bVar.k(true);
            }
        }
    }

    class c extends View.AccessibilityDelegate {
        c() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            a.h.k.d0.d.B0(accessibilityNodeInfo).W(true);
        }
    }

    class d extends r {
        d(View view) {
            super(view);
        }

        public s b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    class e extends DataSetObserver {
        e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    private class f extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private c f950b;

        /* renamed from: c  reason: collision with root package name */
        private int f951c = 4;

        /* renamed from: d  reason: collision with root package name */
        private boolean f952d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f953e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f954f;

        f() {
        }

        public int a() {
            return this.f950b.c();
        }

        public c b() {
            return this.f950b;
        }

        public ResolveInfo c() {
            return this.f950b.e();
        }

        public int d() {
            return this.f950b.f();
        }

        public boolean e() {
            return this.f952d;
        }

        public int f() {
            int i = this.f951c;
            this.f951c = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f951c = i;
            return i2;
        }

        public void g(c cVar) {
            c b2 = ActivityChooserView.this.f940b.b();
            if (b2 != null && ActivityChooserView.this.isShown()) {
                b2.unregisterObserver(ActivityChooserView.this.l);
            }
            this.f950b = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.l);
            }
            notifyDataSetChanged();
        }

        public int getCount() {
            int c2 = this.f950b.c();
            if (!this.f952d && this.f950b.e() != null) {
                c2--;
            }
            int min = Math.min(c2, this.f951c);
            return this.f954f ? min + 1 : min;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.f952d && this.f950b.e() != null) {
                    i++;
                }
                return this.f950b.b(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.f954f || i != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != a.a.f.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.a.g.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(a.a.f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(a.a.f.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f952d || i != 0 || !this.f953e) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.a.g.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(a.a.f.title)).setText(ActivityChooserView.this.getContext().getString(h.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i) {
            if (this.f951c != i) {
                this.f951c = i;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z, boolean z2) {
            if (this.f952d != z || this.f953e != z2) {
                this.f952d = z;
                this.f953e = z2;
                notifyDataSetChanged();
            }
        }

        public void j(boolean z) {
            if (this.f954f != z) {
                this.f954f = z;
                notifyDataSetChanged();
            }
        }
    }

    private class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.h) {
                activityChooserView.a();
                Intent a2 = ActivityChooserView.this.f940b.b().a(ActivityChooserView.this.f940b.b().d(ActivityChooserView.this.f940b.c()));
                if (a2 != null) {
                    a2.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(a2);
                }
            } else if (view == activityChooserView.f944f) {
                activityChooserView.p = false;
                activityChooserView.d(activityChooserView.q);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            a();
            a.h.k.b bVar = ActivityChooserView.this.k;
            if (bVar != null) {
                bVar.k(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.p) {
                    if (!activityChooserView.f940b.e()) {
                        i++;
                    }
                    Intent a2 = ActivityChooserView.this.f940b.b().a(i);
                    if (a2 != null) {
                        a2.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(a2);
                    }
                } else if (i > 0) {
                    activityChooserView.f940b.b().g(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.d(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.h) {
                if (activityChooserView.f940b.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.p = true;
                    activityChooserView2.d(activityChooserView2.q);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.m);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().b();
    }

    public boolean c() {
        if (b() || !this.r) {
            return false;
        }
        this.p = false;
        d(this.q);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d(int i2) {
        if (this.f940b.b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.m);
            boolean z = this.h.getVisibility() == 0;
            int a2 = this.f940b.a();
            if (i2 == Integer.MAX_VALUE || a2 <= i2 + (z ? 1 : 0)) {
                this.f940b.j(false);
                this.f940b.h(i2);
            } else {
                this.f940b.j(true);
                this.f940b.h(i2 - 1);
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.b()) {
                if (this.p || !z) {
                    this.f940b.i(true, z);
                } else {
                    this.f940b.i(false, false);
                }
                listPopupWindow.u(Math.min(this.f940b.f(), this.j));
                listPopupWindow.show();
                a.h.k.b bVar = this.k;
                if (bVar != null) {
                    bVar.k(true);
                }
                listPopupWindow.d().setContentDescription(getContext().getString(h.abc_activitychooserview_choose_application));
                listPopupWindow.d().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f940b.getCount() > 0) {
            this.f944f.setEnabled(true);
        } else {
            this.f944f.setEnabled(false);
        }
        int a2 = this.f940b.a();
        int d2 = this.f940b.d();
        if (a2 == 1 || (a2 > 1 && d2 > 0)) {
            this.h.setVisibility(0);
            ResolveInfo c2 = this.f940b.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.i.setImageDrawable(c2.loadIcon(packageManager));
            if (this.s != 0) {
                CharSequence loadLabel = c2.loadLabel(packageManager);
                this.h.setContentDescription(getContext().getString(this.s, new Object[]{loadLabel}));
            }
        } else {
            this.h.setVisibility(8);
        }
        if (this.h.getVisibility() == 0) {
            this.f942d.setBackgroundDrawable(this.f943e);
        } else {
            this.f942d.setBackgroundDrawable((Drawable) null);
        }
    }

    public c getDataModel() {
        return this.f940b.b();
    }

    /* access modifiers changed from: package-private */
    public ListPopupWindow getListPopupWindow() {
        if (this.n == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.n = listPopupWindow;
            listPopupWindow.q(this.f940b);
            this.n.r(this);
            this.n.z(true);
            this.n.B(this.f941c);
            this.n.A(this.f941c);
        }
        return this.n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c b2 = this.f940b.b();
        if (b2 != null) {
            b2.registerObserver(this.l);
        }
        this.r = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c b2 = this.f940b.b();
        if (b2 != null) {
            b2.unregisterObserver(this.l);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.m);
        }
        if (b()) {
            a();
        }
        this.r = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.f942d.layout(0, 0, i4 - i2, i5 - i3);
        if (!b()) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        View view = this.f942d;
        if (this.h.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(c cVar) {
        this.f940b.g(cVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i2) {
        this.s = i2;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
        this.g.setContentDescription(getContext().getString(i2));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i2) {
        this.q = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.o = onDismissListener;
    }

    public void setProvider(a.h.k.b bVar) {
        this.k = bVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = new a();
        this.m = new b();
        this.q = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActivityChooserView, i2, 0);
        this.q = obtainStyledAttributes.getInt(j.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(j.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(a.a.g.abc_activity_chooser_view, this, true);
        this.f941c = new g();
        View findViewById = findViewById(a.a.f.activity_chooser_view_content);
        this.f942d = findViewById;
        this.f943e = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(a.a.f.default_activity_button);
        this.h = frameLayout;
        frameLayout.setOnClickListener(this.f941c);
        this.h.setOnLongClickListener(this.f941c);
        this.i = (ImageView) this.h.findViewById(a.a.f.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(a.a.f.expand_activities_button);
        frameLayout2.setOnClickListener(this.f941c);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f944f = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(a.a.f.image);
        this.g = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f940b = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.a.d.abc_config_prefDialogWidth));
    }
}
