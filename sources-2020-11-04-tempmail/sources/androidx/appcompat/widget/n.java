package androidx.appcompat.widget;

import a.h.k.y;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;

/* compiled from: DecorToolbar */
public interface n {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f();

    void g(ScrollingTabContainerView scrollingTabContainerView);

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i);

    Menu j();

    void k(int i);

    int l();

    y m(int i, long j);

    void n(o.a aVar, h.a aVar2);

    void o(int i);

    ViewGroup p();

    void q(boolean z);

    int r();

    void s(int i);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setMenu(Menu menu, o.a aVar);

    void setMenuPrepared();

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();

    void u();

    void v(Drawable drawable);

    void w(boolean z);
}
