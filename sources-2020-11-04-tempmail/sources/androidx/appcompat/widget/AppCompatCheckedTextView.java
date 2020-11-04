package androidx.appcompat.widget;

import a.a.k.a.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;

public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f963c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    private final k f964b;

    public AppCompatCheckedTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f964b;
        if (kVar != null) {
            kVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        g.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.d(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.q(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        k kVar = this.f964b;
        if (kVar != null) {
            kVar.n(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(y.b(context), attributeSet, i);
        k kVar = new k(this);
        this.f964b = kVar;
        kVar.k(attributeSet, i);
        this.f964b.b();
        b0 u = b0.u(getContext(), attributeSet, f963c, i, 0);
        setCheckMarkDrawable(u.g(0));
        u.v();
    }
}
