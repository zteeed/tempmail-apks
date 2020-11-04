package androidx.appcompat.widget;

import a.a.k.a.a;
import a.h.k.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements s {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f942d = {16843126};

    /* renamed from: b  reason: collision with root package name */
    private final d f943b;

    /* renamed from: c  reason: collision with root package name */
    private final k f944c;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f943b;
        if (dVar != null) {
            dVar.b();
        }
        k kVar = this.f944c;
        if (kVar != null) {
            kVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f943b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f943b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        g.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f943b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.f943b;
        if (dVar != null) {
            dVar.g(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.d(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f943b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f943b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k kVar = this.f944c;
        if (kVar != null) {
            kVar.n(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(y.b(context), attributeSet, i);
        b0 u = b0.u(getContext(), attributeSet, f942d, i, 0);
        if (u.r(0)) {
            setDropDownBackgroundDrawable(u.g(0));
        }
        u.v();
        d dVar = new d(this);
        this.f943b = dVar;
        dVar.e(attributeSet, i);
        k kVar = new k(this);
        this.f944c = kVar;
        kVar.k(attributeSet, i);
        this.f944c.b();
    }
}
