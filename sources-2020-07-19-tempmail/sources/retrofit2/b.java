package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f14703b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callback f14704c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Throwable f14705d;

    public /* synthetic */ b(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r1, Callback callback, Throwable th) {
        this.f14703b = r1;
        this.f14704c = callback;
        this.f14705d = th;
    }

    public final void run() {
        this.f14703b.a(this.f14704c, this.f14705d);
    }
}
