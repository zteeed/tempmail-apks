package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f15269b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callback f15270c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Response f15271d;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r1, Callback callback, Response response) {
        this.f15269b = r1;
        this.f15270c = callback;
        this.f15271d = response;
    }

    public final void run() {
        this.f15269b.b(this.f15270c, this.f15271d);
    }
}
