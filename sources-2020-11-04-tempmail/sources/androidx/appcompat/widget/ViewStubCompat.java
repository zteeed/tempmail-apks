package androidx.appcompat.widget;

import a.a.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: b  reason: collision with root package name */
    private int f1080b;

    /* renamed from: c  reason: collision with root package name */
    private int f1081c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<View> f1082d;

    /* renamed from: e  reason: collision with root package name */
    private LayoutInflater f1083e;

    /* renamed from: f  reason: collision with root package name */
    private a f1084f;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1080b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1083e;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1080b, viewGroup, false);
            int i = this.f1081c;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1082d = new WeakReference<>(inflate);
            a aVar = this.f1084f;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1081c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1083e;
    }

    public int getLayoutResource() {
        return this.f1080b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1081c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1083e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1080b = i;
    }

    public void setOnInflateListener(a aVar) {
        this.f1084f = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1082d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1080b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ViewStubCompat, i, 0);
        this.f1081c = obtainStyledAttributes.getResourceId(j.ViewStubCompat_android_inflatedId, -1);
        this.f1080b = obtainStyledAttributes.getResourceId(j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
