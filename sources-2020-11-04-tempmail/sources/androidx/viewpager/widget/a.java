package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PagerAdapter */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final DataSetObservable f2052a = new DataSetObservable();

    @Deprecated
    public void a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        a(viewGroup, i, obj);
        throw null;
    }

    @Deprecated
    public void c(View view) {
    }

    public void d(ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(Object obj) {
        return -1;
    }

    public CharSequence g(int i) {
        return null;
    }

    public float h(int i) {
        return 1.0f;
    }

    @Deprecated
    public Object i(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object j(ViewGroup viewGroup, int i) {
        i(viewGroup, i);
        throw null;
    }

    public abstract boolean k(View view, Object obj);

    public void l(DataSetObserver dataSetObserver) {
        this.f2052a.registerObserver(dataSetObserver);
    }

    public void m(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable n() {
        return null;
    }

    @Deprecated
    public void o(View view, int i, Object obj) {
    }

    public void p(ViewGroup viewGroup, int i, Object obj) {
        o(viewGroup, i, obj);
    }

    /* access modifiers changed from: package-private */
    public void q(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    @Deprecated
    public void r(View view) {
    }

    public void s(ViewGroup viewGroup) {
        r(viewGroup);
    }

    public void t(DataSetObserver dataSetObserver) {
        this.f2052a.unregisterObserver(dataSetObserver);
    }
}
