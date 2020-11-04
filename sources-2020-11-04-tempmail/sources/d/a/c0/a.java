package d.a.c0;

import d.a.a0.j.r;
import d.a.c0.a;
import d.a.y.b;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: BaseTestConsumer */
public abstract class a<T, U extends a<T, U>> implements b {

    /* renamed from: b  reason: collision with root package name */
    protected final CountDownLatch f14490b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    protected final List<T> f14491c = new r();

    /* renamed from: d  reason: collision with root package name */
    protected final List<Throwable> f14492d = new r();

    /* renamed from: e  reason: collision with root package name */
    protected long f14493e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f14494f;
    protected int g;
    protected int h;
}
