package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.b0;

public final class ExpandedMenuView extends ListView implements h.b, p, AdapterView.OnItemClickListener {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f800d = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    private h f801b;

    /* renamed from: c  reason: collision with root package name */
    private int f802c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public boolean a(j jVar) {
        return this.f801b.N(jVar, 0);
    }

    public void b(h hVar) {
        this.f801b = hVar;
    }

    public int getWindowAnimations() {
        return this.f802c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((j) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b0 u = b0.u(context, attributeSet, f800d, i, 0);
        if (u.r(0)) {
            setBackgroundDrawable(u.g(0));
        }
        if (u.r(1)) {
            setDivider(u.g(1));
        }
        u.v();
    }
}
