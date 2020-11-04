package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.q;

public class FitWindowsFrameLayout extends FrameLayout implements q {

    /* renamed from: b  reason: collision with root package name */
    private q.a f974b;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        q.a aVar = this.f974b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(q.a aVar) {
        this.f974b = aVar;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
