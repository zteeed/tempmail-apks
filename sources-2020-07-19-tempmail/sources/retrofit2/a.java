package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f14700b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callback f14701c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Response f14702d;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r1, Callback callback, Response response) {
        this.f14700b = r1;
        this.f14701c = callback;
        this.f14702d = response;
    }

    public final void run() {
        this.f14700b.b(this.f14701c, this.f14702d);
    }
}
