package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentStore */
class p {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f1570a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, o> f1571b = new HashMap<>();

    p() {
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.f1570a.contains(fragment)) {
            synchronized (this.f1570a) {
                this.f1570a.add(fragment);
            }
            fragment.l = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f1571b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f1571b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void d(int i) {
        Iterator<Fragment> it = this.f1570a.iterator();
        while (it.hasNext()) {
            o oVar = this.f1571b.get(it.next().f1472f);
            if (oVar != null) {
                oVar.q(i);
            }
        }
        for (o next : this.f1571b.values()) {
            if (next != null) {
                next.q(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f1571b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (o next : this.f1571b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment i = next.i();
                    printWriter.println(i);
                    i.t(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f1570a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1570a.get(i2).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment f(String str) {
        o oVar = this.f1571b.get(str);
        if (oVar != null) {
            return oVar.i();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment g(int i) {
        for (int size = this.f1570a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1570a.get(size);
            if (fragment != null && fragment.w == i) {
                return fragment;
            }
        }
        for (o next : this.f1571b.values()) {
            if (next != null) {
                Fragment i2 = next.i();
                if (i2.w == i) {
                    return i2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f1570a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1570a.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (o next : this.f1571b.values()) {
            if (next != null) {
                Fragment i = next.i();
                if (str.equals(i.y)) {
                    return i;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment y;
        for (o next : this.f1571b.values()) {
            if (next != null && (y = next.i().y(str)) != null) {
                return y;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment j(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        View view = fragment.H;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f1570a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f1570a.get(indexOf);
                if (fragment2.G == viewGroup && fragment2.H != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> k() {
        ArrayList arrayList = new ArrayList();
        for (o next : this.f1571b.values()) {
            if (next != null) {
                arrayList.add(next.i());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public o l(String str) {
        return this.f1571b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> m() {
        ArrayList arrayList;
        if (this.f1570a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1570a) {
            arrayList = new ArrayList(this.f1570a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void n(o oVar) {
        this.f1571b.put(oVar.i().f1472f, oVar);
    }

    /* access modifiers changed from: package-private */
    public void o(o oVar) {
        Fragment i = oVar.i();
        for (o next : this.f1571b.values()) {
            if (next != null) {
                Fragment i2 = next.i();
                if (i.f1472f.equals(i2.i)) {
                    i2.h = i;
                    i2.i = null;
                }
            }
        }
        this.f1571b.put(i.f1472f, (Object) null);
        String str = i.i;
        if (str != null) {
            i.h = f(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(Fragment fragment) {
        synchronized (this.f1570a) {
            this.f1570a.remove(fragment);
        }
        fragment.l = false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f1571b.clear();
    }

    /* access modifiers changed from: package-private */
    public void r(List<String> list) {
        this.f1570a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f2 = f(next);
                if (f2 != null) {
                    if (k.r0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f2);
                    }
                    a(f2);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<FragmentState> s() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f1571b.size());
        for (o next : this.f1571b.values()) {
            if (next != null) {
                Fragment i = next.i();
                FragmentState o = next.o();
                arrayList.add(o);
                if (k.r0(2)) {
                    Log.v("FragmentManager", "Saved state of " + i + ": " + o.n);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> t() {
        synchronized (this.f1570a) {
            if (this.f1570a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f1570a.size());
            Iterator<Fragment> it = this.f1570a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f1472f);
                if (k.r0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f1472f + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
