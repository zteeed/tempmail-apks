package androidx.lifecycle;

/* compiled from: ViewModelProvider */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final a f1627a;

    /* renamed from: b  reason: collision with root package name */
    private final r f1628b;

    /* compiled from: ViewModelProvider */
    public interface a {
        <T extends p> T a(Class<T> cls);
    }

    public q(r rVar, a aVar) {
        this.f1627a = aVar;
        this.f1628b = rVar;
    }

    public <T extends p> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends p> T b(String str, Class<T> cls) {
        T b2 = this.f1628b.b(str);
        if (cls.isInstance(b2)) {
            return b2;
        }
        T a2 = this.f1627a.a(cls);
        this.f1628b.c(str, a2);
        return a2;
    }
}
