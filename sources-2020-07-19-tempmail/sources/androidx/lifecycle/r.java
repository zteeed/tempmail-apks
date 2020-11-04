package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: ViewModelStore */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, p> f1629a = new HashMap<>();

    public final void a() {
        for (p a2 : this.f1629a.values()) {
            a2.a();
        }
        this.f1629a.clear();
    }

    /* access modifiers changed from: package-private */
    public final p b(String str) {
        return this.f1629a.get(str);
    }

    /* access modifiers changed from: package-private */
    public final void c(String str, p pVar) {
        p put = this.f1629a.put(str, pVar);
        if (put != null) {
            put.a();
        }
    }
}
