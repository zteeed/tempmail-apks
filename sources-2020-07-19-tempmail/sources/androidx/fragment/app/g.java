package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: FragmentManager */
public abstract class g {

    /* compiled from: FragmentManager */
    public static abstract class a {
        public abstract void a(g gVar, Fragment fragment, Bundle bundle);

        public abstract void b(g gVar, Fragment fragment, Context context);

        public abstract void c(g gVar, Fragment fragment, Bundle bundle);

        public abstract void d(g gVar, Fragment fragment);

        public abstract void e(g gVar, Fragment fragment);

        public abstract void f(g gVar, Fragment fragment);

        public abstract void g(g gVar, Fragment fragment, Context context);

        public abstract void h(g gVar, Fragment fragment, Bundle bundle);

        public abstract void i(g gVar, Fragment fragment);

        public abstract void j(g gVar, Fragment fragment, Bundle bundle);

        public abstract void k(g gVar, Fragment fragment);

        public abstract void l(g gVar, Fragment fragment);

        public abstract void m(g gVar, Fragment fragment, View view, Bundle bundle);

        public abstract void n(g gVar, Fragment fragment);
    }

    /* compiled from: FragmentManager */
    public interface b {
        void a();
    }

    public abstract void a(b bVar);

    public abstract j b();

    public abstract void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean d();

    public abstract Fragment e(int i);

    public abstract Fragment f(String str);

    public abstract int g();

    public abstract List<Fragment> h();

    public abstract boolean i();

    public abstract void j();

    public abstract void k(int i, int i2);

    public abstract boolean l();
}
