package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<a> f1572a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f1573b;

    /* renamed from: c  reason: collision with root package name */
    int f1574c;

    /* renamed from: d  reason: collision with root package name */
    int f1575d;

    /* renamed from: e  reason: collision with root package name */
    int f1576e;

    /* renamed from: f  reason: collision with root package name */
    int f1577f;
    boolean g;
    boolean h = true;
    String i;
    int j;
    CharSequence k;
    int l;
    CharSequence m;
    ArrayList<String> n;
    ArrayList<String> o;
    boolean p = false;
    ArrayList<Runnable> q;

    /* compiled from: FragmentTransaction */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f1578a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f1579b;

        /* renamed from: c  reason: collision with root package name */
        int f1580c;

        /* renamed from: d  reason: collision with root package name */
        int f1581d;

        /* renamed from: e  reason: collision with root package name */
        int f1582e;

        /* renamed from: f  reason: collision with root package name */
        int f1583f;
        g.b g;
        g.b h;

        a() {
        }

        a(int i, Fragment fragment) {
            this.f1578a = i;
            this.f1579b = fragment;
            g.b bVar = g.b.RESUMED;
            this.g = bVar;
            this.h = bVar;
        }

        a(int i, Fragment fragment, g.b bVar) {
            this.f1578a = i;
            this.f1579b = fragment;
            this.g = fragment.Q;
            this.h = bVar;
        }
    }

    q(g gVar, ClassLoader classLoader) {
    }

    public q b(int i2, Fragment fragment, String str) {
        m(i2, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public q c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.G = viewGroup;
        b(viewGroup.getId(), fragment, str);
        return this;
    }

    public q d(Fragment fragment, String str) {
        m(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f1572a.add(aVar);
        aVar.f1580c = this.f1573b;
        aVar.f1581d = this.f1574c;
        aVar.f1582e = this.f1575d;
        aVar.f1583f = this.f1576e;
    }

    public q f(String str) {
        if (this.h) {
            this.g = true;
            this.i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public q g(Fragment fragment) {
        e(new a(7, fragment));
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public q k(Fragment fragment) {
        e(new a(6, fragment));
        return this;
    }

    public q l() {
        if (!this.g) {
            this.h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void m(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.y;
            if (str2 == null || str.equals(str2)) {
                fragment.y = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.y + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.w;
                if (i4 == 0 || i4 == i2) {
                    fragment.w = i2;
                    fragment.x = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.w + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        e(new a(i3, fragment));
    }

    public q n(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public q o(int i2, Fragment fragment) {
        p(i2, fragment, (String) null);
        return this;
    }

    public q p(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            m(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public q q(Fragment fragment, g.b bVar) {
        e(new a(10, fragment, bVar));
        return this;
    }

    public q r(boolean z) {
        this.p = z;
        return this;
    }

    public q s(int i2) {
        this.f1577f = i2;
        return this;
    }
}
