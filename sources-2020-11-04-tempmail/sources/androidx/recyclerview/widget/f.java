package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState */
class f {

    /* renamed from: a  reason: collision with root package name */
    boolean f1917a = true;

    /* renamed from: b  reason: collision with root package name */
    int f1918b;

    /* renamed from: c  reason: collision with root package name */
    int f1919c;

    /* renamed from: d  reason: collision with root package name */
    int f1920d;

    /* renamed from: e  reason: collision with root package name */
    int f1921e;

    /* renamed from: f  reason: collision with root package name */
    int f1922f = 0;
    int g = 0;
    boolean h;
    boolean i;

    f() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.y yVar) {
        int i2 = this.f1919c;
        return i2 >= 0 && i2 < yVar.b();
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.u uVar) {
        View o = uVar.o(this.f1919c);
        this.f1919c += this.f1920d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1918b + ", mCurrentPosition=" + this.f1919c + ", mItemDirection=" + this.f1920d + ", mLayoutDirection=" + this.f1921e + ", mStartLine=" + this.f1922f + ", mEndLine=" + this.g + '}';
    }
}
