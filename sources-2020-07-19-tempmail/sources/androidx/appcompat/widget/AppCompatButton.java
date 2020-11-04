package androidx.appcompat.widget;

import a.a.a;
import a.h.k.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.b;
import androidx.core.widget.i;

public class AppCompatButton extends Button implements s, b {

    /* renamed from: b  reason: collision with root package name */
    private final d f932b;

    /* renamed from: c  reason: collision with root package name */
    private final k f933c;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f932b;
        if (dVar != null) {
            dVar.b();
        }
        k kVar = this.f933c;
        if (kVar != null) {
            kVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f1373a) {
            return super.getAutoSizeMaxTextSize();
        }
        k kVar = this.f933c;
        if (kVar != null) {
            return kVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f1373a) {
            return super.getAutoSizeMinTextSize();
        }
        k kVar = this.f933c;
        if (kVar != null) {
            return kVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f1373a) {
            return super.getAutoSizeStepGranularity();
        }
        k kVar = this.f933c;
        if (kVar != null) {
            return kVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f1373a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        k kVar = this.f933c;
        return kVar != null ? kVar.h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (!b.f1373a) {
            k kVar = this.f933c;
            if (kVar != null) {
                return kVar.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f932b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f932b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k kVar = this.f933c;
        if (kVar != null) {
            kVar.m(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        k kVar = this.f933c;
        if (kVar != null && !b.f1373a && kVar.j()) {
            this.f933c.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (b.f1373a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        k kVar = this.f933c;
        if (kVar != null) {
            kVar.p(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (b.f1373a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        k kVar = this.f933c;
        if (kVar != null) {
            kVar.q(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f1373a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        k kVar = this.f933c;
        if (kVar != null) {
            kVar.r(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f932b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.f932b;
        if (dVar != null) {
            dVar.g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.q(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        k kVar = this.f933c;
        if (kVar != null) {
            kVar.o(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f932b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f932b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k kVar = this.f933c;
        if (kVar != null) {
            kVar.n(context, i);
        }
    }

    public void setTextSize(int i, float f2) {
        if (b.f1373a) {
            super.setTextSize(i, f2);
            return;
        }
        k kVar = this.f933c;
        if (kVar != null) {
            kVar.s(i, f2);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(y.b(context), attributeSet, i);
        d dVar = new d(this);
        this.f932b = dVar;
        dVar.e(attributeSet, i);
        k kVar = new k(this);
        this.f933c = kVar;
        kVar.k(attributeSet, i);
        this.f933c.b();
    }
}
