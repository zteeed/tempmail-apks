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
    final f f913b;

    /* renamed from: c  reason: collision with root package name */
    private final g f914c;

    /* renamed from: d  reason: collision with root package name */
    private final View f915d;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable f916e;

    /* renamed from: f  reason: collision with root package name */
    final FrameLayout f917f;
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
        private static final int[] f918b = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            b0 t = b0.t(context, attributeSet, f918b);
            setBackgroundDrawable(t.g(0));
            t.v();
        }
    }

    class a extends DataSetObserver {
        a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f913b.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f913b.notifyDataSetInvalidated();
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
            a.h.k.c0.d.A0(accessibilityNodeInfo).W(true);
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
        private c f923b;

        /* renamed from: c  reason: collision with root package name */
        private int f924c = 4;

        /* renamed from: d  reason: collision with root package name */
        private boolean f925d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f926e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f927f;

        f() {
        }

        public int a() {
            return this.f923b.c();
        }

        public c b() {
            return this.f923b;
        }

        public ResolveInfo c() {
            return this.f923b.e();
        }

        public int d() {
            return this.f923b.f();
        }

        public boolean e() {
            return this.f925d;
        }

        public int f() {
            int i = this.f924c;
            this.f924c = Integer.MAX_VALUE;
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
            this.f924c = i;
            return i2;
        }

        public void g(c cVar) {
            c b2 = ActivityChooserView.this.f913b.b();
            if (b2 != null && ActivityChooserView.this.isShown()) {
                b2.unregisterObserver(ActivityChooserView.this.l);
            }
            this.f923b = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.l);
            }
            notifyDataSetChanged();
        }

        public int getCount() {
            int c2 = this.f923b.c();
            if (!this.f925d && this.f923b.e() != null) {
                c2--;
            }
            int min = Math.min(c2, this.f924c);
            return this.f927f ? min + 1 : min;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.f925d && this.f923b.e() != null) {
                    i++;
                }
                return this.f923b.b(i);
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
            return (!this.f927f || i != getCount() - 1) ? 0 : 1;
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
                if (!this.f925d || i != 0 || !this.f926e) {
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
            if (this.f924c != i) {
                this.f924c = i;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z, boolean z2) {
            if (this.f925d != z || this.f926e != z2) {
                this.f925d = z;
                this.f926e = z2;
                notifyDataSetChanged();
            }
        }

        public void j(boolean z) {
            if (this.f927f != z) {
                this.f927f = z;
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
                Intent a2 = ActivityChooserView.this.f913b.b().a(ActivityChooserView.this.f913b.b().d(ActivityChooserView.this.f913b.c()));
                if (a2 != null) {
                    a2.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(a2);
                }
            } else if (view == activityChooserView.f917f) {
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
                    if (!activityChooserView.f913b.e()) {
                        i++;
                    }
                    Intent a2 = ActivityChooserView.this.f913b.b().a(i);
                    if (a2 != null) {
                        a2.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(a2);
                    }
                } else if (i > 0) {
                    activityChooserView.f913b.b().g(i);
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
                if (activityChooserView.f913b.getCount() > 0) {
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
        if (this.f913b.b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.m);
            boolean z = this.h.getVisibility() == 0;
            int a2 = this.f913b.a();
            if (i2 == Integer.MAX_VALUE || a2 <= i2 + (z ? 1 : 0)) {
                this.f913b.j(false);
                this.f913b.h(i2);
            } else {
                this.f913b.j(true);
                this.f913b.h(i2 - 1);
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.b()) {
                if (this.p || !z) {
                    this.f913b.i(true, z);
                } else {
                    this.f913b.i(false, false);
                }
                listPopupWindow.u(Math.min(this.f913b.f(), this.j));
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
        if (this.f913b.getCount() > 0) {
            this.f917f.setEnabled(true);
        } else {
            this.f917f.setEnabled(false);
        }
        int a2 = this.f913b.a();
        int d2 = this.f913b.d();
        if (a2 == 1 || (a2 > 1 && d2 > 0)) {
            this.h.setVisibility(0);
            ResolveInfo c2 = this.f913b.c();
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
            this.f915d.setBackgroundDrawable(this.f916e);
        } else {
            this.f915d.setBackgroundDrawable((Drawable) null);
        }
    }

    public c getDataModel() {
        return this.f913b.b();
    }

    /* access modifiers changed from: package-private */
    public ListPopupWindow getListPopupWindow() {
        if (this.n == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.n = listPopupWindow;
            listPopupWindow.q(this.f913b);
            this.n.r(this);
            this.n.z(true);
            this.n.B(this.f914c);
            this.n.A(this.f914c);
        }
        return this.n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c b2 = this.f913b.b();
        if (b2 != null) {
            b2.registerObserver(this.l);
        }
        this.r = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c b2 = this.f913b.b();
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
        this.f915d.layout(0, 0, i4 - i2, i5 - i3);
        if (!b()) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        View view = this.f915d;
        if (this.h.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(c cVar) {
        this.f913b.g(cVar);
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
        this.f914c = new g();
        View findViewById = findViewById(a.a.f.activity_chooser_view_content);
        this.f915d = findViewById;
        this.f916e = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(a.a.f.default_activity_button);
        this.h = frameLayout;
        frameLayout.setOnClickListener(this.f914c);
        this.h.setOnLongClickListener(this.f914c);
        this.i = (ImageView) this.h.findViewById(a.a.f.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(a.a.f.expand_activities_button);
        frameLayout2.setOnClickListener(this.f914c);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f917f = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(a.a.f.image);
        this.g = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f913b = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.a.d.abc_config_prefDialogWidth));
    }
}
