package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState */
class f {

    /* renamed from: a  reason: collision with root package name */
    boolean f1834a = true;

    /* renamed from: b  reason: collision with root package name */
    int f1835b;

    /* renamed from: c  reason: collision with root package name */
    int f1836c;

    /* renamed from: d  reason: collision with root package name */
    int f1837d;

    /* renamed from: e  reason: collision with root package name */
    int f1838e;

    /* renamed from: f  reason: collision with root package name */
    int f1839f = 0;
    int g = 0;
    boolean h;
    boolean i;

    f() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.y yVar) {
        int i2 = this.f1836c;
        return i2 >= 0 && i2 < yVar.b();
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.u uVar) {
        View o = uVar.o(this.f1836c);
        this.f1836c += this.f1837d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1835b + ", mCurrentPosition=" + this.f1836c + ", mItemDirection=" + this.f1837d + ", mLayoutDirection=" + this.f1838e + ", mStartLine=" + this.f1839f + ", mEndLine=" + this.g + '}';
    }
}
