package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ViewModelStore */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, w> f1712a = new HashMap<>();

    public final void a() {
        for (w a2 : this.f1712a.values()) {
            a2.a();
        }
        this.f1712a.clear();
    }

    /* access modifiers changed from: package-private */
    public final w b(String str) {
        return this.f1712a.get(str);
    }

    /* access modifiers changed from: package-private */
    public Set<String> c() {
        return new HashSet(this.f1712a.keySet());
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, w wVar) {
        w put = this.f1712a.put(str, wVar);
        if (put != null) {
            put.d();
        }
    }
}
