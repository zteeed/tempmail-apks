package androidx.appcompat.widget;

import a.a.a;
import a.h.k.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.widget.i;

public class AppCompatEditText extends EditText implements s {

    /* renamed from: b  reason: collision with root package name */
    private final d f938b;

    /* renamed from: c  reason: collision with root package name */
    private final k f939c;

    public AppCompatEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f938b;
        if (dVar != null) {
            dVar.b();
        }
        k kVar = this.f939c;
        if (kVar != null) {
            kVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f938b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f938b;
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
        d dVar = this.f938b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.f938b;
        if (dVar != null) {
            dVar.g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.q(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f938b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f938b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k kVar = this.f939c;
        if (kVar != null) {
            kVar.n(context, i);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.editTextStyle);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(y.b(context), attributeSet, i);
        d dVar = new d(this);
        this.f938b = dVar;
        dVar.e(attributeSet, i);
        k kVar = new k(this);
        this.f939c = kVar;
        kVar.k(attributeSet, i);
        this.f939c.b();
    }
}
