package androidx.appcompat.widget;

import a.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.j;

public class AppCompatRadioButton extends RadioButton implements j {

    /* renamed from: b  reason: collision with root package name */
    private final e f947b;

    /* renamed from: c  reason: collision with root package name */
    private final k f948c;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        e eVar = this.f947b;
        return eVar != null ? eVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        e eVar = this.f947b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        e eVar = this.f947b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        e eVar = this.f947b;
        if (eVar != null) {
            eVar.f();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        e eVar = this.f947b;
        if (eVar != null) {
            eVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        e eVar = this.f947b;
        if (eVar != null) {
            eVar.h(mode);
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(y.b(context), attributeSet, i);
        e eVar = new e(this);
        this.f947b = eVar;
        eVar.e(attributeSet, i);
        k kVar = new k(this);
        this.f948c = kVar;
        kVar.k(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(a.a.k.a.a.d(getContext(), i));
    }
}
