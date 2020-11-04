package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    Runnable f994b;

    /* renamed from: c  reason: collision with root package name */
    private c f995c;

    /* renamed from: d  reason: collision with root package name */
    LinearLayoutCompat f996d;

    /* renamed from: e  reason: collision with root package name */
    private Spinner f997e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f998f;
    int g;
    int h;
    private int i;
    private int j;
    protected ViewPropertyAnimator k;

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f999b;

        a(View view) {
            this.f999b = view;
        }

        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f999b.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f999b.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f994b = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.f996d.getChildCount();
        }

        public Object getItem(int i) {
            return ((d) ScrollingTabContainerView.this.f996d.getChildAt(i)).b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.d((a.c) getItem(i), true);
            }
            ((d) view).a((a.c) getItem(i));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = ScrollingTabContainerView.this.f996d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f996d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1003b;

        /* renamed from: c  reason: collision with root package name */
        private a.c f1004c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f1005d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f1006e;

        /* renamed from: f  reason: collision with root package name */
        private View f1007f;

        public d(Context context, a.c cVar, boolean z) {
            super(context, (AttributeSet) null, a.a.a.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f1003b = iArr;
            this.f1004c = cVar;
            b0 u = b0.u(context, (AttributeSet) null, iArr, a.a.a.actionBarTabStyle, 0);
            if (u.r(0)) {
                setBackgroundDrawable(u.g(0));
            }
            u.v();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f1004c = cVar;
            c();
        }

        public a.c b() {
            return this.f1004c;
        }

        public void c() {
            a.c cVar = this.f1004c;
            View b2 = cVar.b();
            CharSequence charSequence = null;
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.f1007f = b2;
                TextView textView = this.f1005d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1006e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1006e.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1007f;
            if (view != null) {
                removeView(view);
                this.f1007f = null;
            }
            Drawable c2 = cVar.c();
            CharSequence d2 = cVar.d();
            if (c2 != null) {
                if (this.f1006e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1006e = appCompatImageView;
                }
                this.f1006e.setImageDrawable(c2);
                this.f1006e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1006e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1006e.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f1005d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, a.a.a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1005d = appCompatTextView;
                }
                this.f1005d.setText(d2);
                this.f1005d.setVisibility(0);
            } else {
                TextView textView2 = this.f1005d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1005d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1006e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z) {
                charSequence = cVar.a();
            }
            d0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.g > 0 && getMeasuredWidth() > (i3 = ScrollingTabContainerView.this.g)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    protected class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1008a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f1009b;

        protected e() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f1008a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1008a) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                scrollingTabContainerView.k = null;
                scrollingTabContainerView.setVisibility(this.f1009b);
            }
        }

        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f1008a = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        new e();
        setHorizontalScrollBarEnabled(false);
        a.a.n.a b2 = a.a.n.a.b(context);
        setContentHeight(b2.f());
        this.h = b2.e();
        LinearLayoutCompat c2 = c();
        this.f996d = c2;
        addView(c2, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, a.a.a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat c() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, a.a.a.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        return linearLayoutCompat;
    }

    private boolean e() {
        Spinner spinner = this.f997e;
        return spinner != null && spinner.getParent() == this;
    }

    private void f() {
        if (!e()) {
            if (this.f997e == null) {
                this.f997e = b();
            }
            removeView(this.f996d);
            addView(this.f997e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f997e.getAdapter() == null) {
                this.f997e.setAdapter(new b());
            }
            Runnable runnable = this.f994b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f994b = null;
            }
            this.f997e.setSelection(this.j);
        }
    }

    private boolean g() {
        if (!e()) {
            return false;
        }
        removeView(this.f997e);
        addView(this.f996d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f997e.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.f996d.getChildAt(i2);
        Runnable runnable = this.f994b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f994b = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    public d d(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            dVar.setFocusable(true);
            if (this.f995c == null) {
                this.f995c = new c();
            }
            dVar.setOnClickListener(this.f995c);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f994b;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.a.n.a b2 = a.a.n.a.b(getContext());
        setContentHeight(b2.f());
        this.h = b2.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f994b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f996d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.g = -1;
        } else {
            if (childCount > 2) {
                this.g = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.g = View.MeasureSpec.getSize(i2) / 2;
            }
            this.g = Math.min(this.g, this.h);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        if (z2 || !this.f998f) {
            z = false;
        }
        if (z) {
            this.f996d.measure(0, makeMeasureSpec);
            if (this.f996d.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                f();
            } else {
                g();
            }
        } else {
            g();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.j);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f998f = z;
    }

    public void setContentHeight(int i2) {
        this.i = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.j = i2;
        int childCount = this.f996d.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f996d.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f997e;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}
