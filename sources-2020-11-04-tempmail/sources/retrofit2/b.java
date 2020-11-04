package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f15272b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callback f15273c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Throwable f15274d;

    public /* synthetic */ b(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r1, Callback callback, Throwable th) {
        this.f15272b = r1;
        this.f15273c = callback;
        this.f15274d = th;
    }

    public final void run() {
        this.f15272b.a(this.f15273c, this.f15274d);
    }
}
