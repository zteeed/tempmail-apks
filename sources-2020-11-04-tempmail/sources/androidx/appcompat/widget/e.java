package androidx.appcompat.widget;

import a.a.j;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

/* compiled from: AppCompatCompoundButtonHelper */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f1115a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f1116b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1117c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1118d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1119e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1120f;

    e(CompoundButton compoundButton) {
        this.f1115a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a2 = c.a(this.f1115a);
        if (a2 == null) {
            return;
        }
        if (this.f1118d || this.f1119e) {
            Drawable mutate = a.r(a2).mutate();
            if (this.f1118d) {
                a.o(mutate, this.f1116b);
            }
            if (this.f1119e) {
                a.p(mutate, this.f1117c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1115a.getDrawableState());
            }
            this.f1115a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.c.a(r2.f1115a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f1115a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.c.a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.b(int):int");
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f1116b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f1117c;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1115a.getContext().obtainStyledAttributes(attributeSet, j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(j.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(j.CompoundButton_android_button, 0)) != 0) {
                this.f1115a.setButtonDrawable(a.a.k.a.a.d(this.f1115a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(j.CompoundButton_buttonTint)) {
                c.b(this.f1115a, obtainStyledAttributes.getColorStateList(j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(j.CompoundButton_buttonTintMode)) {
                c.c(this.f1115a, o.e(obtainStyledAttributes.getInt(j.CompoundButton_buttonTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f1120f) {
            this.f1120f = false;
            return;
        }
        this.f1120f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f1116b = colorStateList;
        this.f1118d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f1117c = mode;
        this.f1119e = true;
        a();
    }
}
