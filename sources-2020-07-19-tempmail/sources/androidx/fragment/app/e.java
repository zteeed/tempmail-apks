package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: FragmentController */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final f<?> f1491a;

    private e(f<?> fVar) {
        this.f1491a = fVar;
    }

    public static e b(f<?> fVar) {
        return new e(fVar);
    }

    public void a(Fragment fragment) {
        f<?> fVar = this.f1491a;
        fVar.f1495d.r(fVar, fVar, fragment);
    }

    public void c() {
        this.f1491a.f1495d.z();
    }

    public void d(Configuration configuration) {
        this.f1491a.f1495d.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f1491a.f1495d.B(menuItem);
    }

    public void f() {
        this.f1491a.f1495d.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f1491a.f1495d.D(menu, menuInflater);
    }

    public void h() {
        this.f1491a.f1495d.E();
    }

    public void i() {
        this.f1491a.f1495d.G();
    }

    public void j(boolean z) {
        this.f1491a.f1495d.H(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.f1491a.f1495d.W(menuItem);
    }

    public void l(Menu menu) {
        this.f1491a.f1495d.X(menu);
    }

    public void m() {
        this.f1491a.f1495d.Y();
    }

    public void n(boolean z) {
        this.f1491a.f1495d.Z(z);
    }

    public boolean o(Menu menu) {
        return this.f1491a.f1495d.a0(menu);
    }

    public void p() {
        this.f1491a.f1495d.b0();
    }

    public void q() {
        this.f1491a.f1495d.c0();
    }

    public void r() {
        this.f1491a.f1495d.e0();
    }

    public boolean s() {
        return this.f1491a.f1495d.k0();
    }

    public Fragment t(String str) {
        return this.f1491a.f1495d.o0(str);
    }

    public g u() {
        return this.f1491a.f();
    }

    public void v() {
        this.f1491a.f1495d.L0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1491a.f1495d.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable, i iVar) {
        this.f1491a.f1495d.U0(parcelable, iVar);
    }

    public i y() {
        return this.f1491a.f1495d.V0();
    }

    public Parcelable z() {
        return this.f1491a.f1495d.X0();
    }
}
