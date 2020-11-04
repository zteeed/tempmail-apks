package e.m0;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14100b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f14101c;

    public /* synthetic */ b(String str, boolean z) {
        this.f14100b = str;
        this.f14101c = z;
    }

    public final Thread newThread(Runnable runnable) {
        return e.A(this.f14100b, this.f14101c, runnable);
    }
}
