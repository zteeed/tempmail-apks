package androidx.fragment.app;

import a.h.j.h;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.z;

/* compiled from: FragmentController */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final h<?> f1527a;

    private f(h<?> hVar) {
        this.f1527a = hVar;
    }

    public static f b(h<?> hVar) {
        h.c(hVar, "callbacks == null");
        return new f(hVar);
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f1527a;
        hVar.f1532e.h(hVar, hVar, fragment);
    }

    public void c() {
        this.f1527a.f1532e.s();
    }

    public void d(Configuration configuration) {
        this.f1527a.f1532e.t(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f1527a.f1532e.u(menuItem);
    }

    public void f() {
        this.f1527a.f1532e.v();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f1527a.f1532e.w(menu, menuInflater);
    }

    public void h() {
        this.f1527a.f1532e.x();
    }

    public void i() {
        this.f1527a.f1532e.z();
    }

    public void j(boolean z) {
        this.f1527a.f1532e.A(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.f1527a.f1532e.B(menuItem);
    }

    public void l(Menu menu) {
        this.f1527a.f1532e.C(menu);
    }

    public void m() {
        this.f1527a.f1532e.E();
    }

    public void n(boolean z) {
        this.f1527a.f1532e.F(z);
    }

    public boolean o(Menu menu) {
        return this.f1527a.f1532e.G(menu);
    }

    public void p() {
        this.f1527a.f1532e.I();
    }

    public void q() {
        this.f1527a.f1532e.J();
    }

    public void r() {
        this.f1527a.f1532e.L();
    }

    public boolean s() {
        return this.f1527a.f1532e.R(true);
    }

    public Fragment t(String str) {
        return this.f1527a.f1532e.a0(str);
    }

    public k u() {
        return this.f1527a.f1532e;
    }

    public void v() {
        this.f1527a.f1532e.D0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1527a.f1532e.i0().onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h<?> hVar = this.f1527a;
        if (hVar instanceof z) {
            hVar.f1532e.Q0(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable y() {
        return this.f1527a.f1532e.S0();
    }
}
