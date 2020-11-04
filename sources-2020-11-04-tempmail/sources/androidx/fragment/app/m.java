package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel */
final class m extends w {
    private static final x.b i = new a();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Fragment> f1558c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, m> f1559d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, y> f1560e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1561f;
    private boolean g = false;
    private boolean h = false;

    /* compiled from: FragmentManagerViewModel */
    static class a implements x.b {
        a() {
        }

        public <T extends w> T a(Class<T> cls) {
            return new m(true);
        }
    }

    m(boolean z) {
        this.f1561f = z;
    }

    static m j(y yVar) {
        return (m) new x(yVar, i).a(m.class);
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (k.r0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f1558c.equals(mVar.f1558c) || !this.f1559d.equals(mVar.f1559d) || !this.f1560e.equals(mVar.f1560e)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean f(Fragment fragment) {
        if (this.f1558c.containsKey(fragment.f1472f)) {
            return false;
        }
        this.f1558c.put(fragment.f1472f, fragment);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (k.r0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m mVar = this.f1559d.get(fragment.f1472f);
        if (mVar != null) {
            mVar.d();
            this.f1559d.remove(fragment.f1472f);
        }
        y yVar = this.f1560e.get(fragment.f1472f);
        if (yVar != null) {
            yVar.a();
            this.f1560e.remove(fragment.f1472f);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        return this.f1558c.get(str);
    }

    public int hashCode() {
        return (((this.f1558c.hashCode() * 31) + this.f1559d.hashCode()) * 31) + this.f1560e.hashCode();
    }

    /* access modifiers changed from: package-private */
    public m i(Fragment fragment) {
        m mVar = this.f1559d.get(fragment.f1472f);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this.f1561f);
        this.f1559d.put(fragment.f1472f, mVar2);
        return mVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> k() {
        return this.f1558c.values();
    }

    /* access modifiers changed from: package-private */
    public y l(Fragment fragment) {
        y yVar = this.f1560e.get(fragment.f1472f);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y();
        this.f1560e.put(fragment.f1472f, yVar2);
        return yVar2;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public boolean n(Fragment fragment) {
        return this.f1558c.remove(fragment.f1472f) != null;
    }

    /* access modifiers changed from: package-private */
    public boolean o(Fragment fragment) {
        if (!this.f1558c.containsKey(fragment.f1472f)) {
            return true;
        }
        if (this.f1561f) {
            return this.g;
        }
        return !this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1558c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1559d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1560e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
