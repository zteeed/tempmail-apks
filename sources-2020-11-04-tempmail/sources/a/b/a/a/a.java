package a.b.a.a;

/* compiled from: ArchTaskExecutor */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f76c;

    /* renamed from: a  reason: collision with root package name */
    private c f77a;

    /* renamed from: b  reason: collision with root package name */
    private c f78b;

    private a() {
        b bVar = new b();
        this.f78b = bVar;
        this.f77a = bVar;
    }

    public static a c() {
        if (f76c != null) {
            return f76c;
        }
        synchronized (a.class) {
            if (f76c == null) {
                f76c = new a();
            }
        }
        return f76c;
    }

    public boolean a() {
        return this.f77a.a();
    }

    public void b(Runnable runnable) {
        this.f77a.b(runnable);
    }
}
