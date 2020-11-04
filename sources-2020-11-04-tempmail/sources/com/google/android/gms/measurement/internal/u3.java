package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class u3<V> extends FutureTask<V> implements Comparable<u3<V>> {

    /* renamed from: b  reason: collision with root package name */
    private final long f10450b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f10451c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10452d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzfv f10453e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u3(zzfv zzfv, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f10453e = zzfv;
        Preconditions.k(str);
        long andIncrement = zzfv.l.getAndIncrement();
        this.f10450b = andIncrement;
        this.f10452d = str;
        this.f10451c = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzfv.h().G().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        u3 u3Var = (u3) obj;
        boolean z = this.f10451c;
        if (z != u3Var.f10451c) {
            return z ? -1 : 1;
        }
        long j = this.f10450b;
        long j2 = u3Var.f10450b;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f10453e.h().H().b("Two tasks share the same index. index", Long.valueOf(this.f10450b));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f10453e.h().G().b(this.f10452d, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u3(zzfv zzfv, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f10453e = zzfv;
        Preconditions.k(str);
        long andIncrement = zzfv.l.getAndIncrement();
        this.f10450b = andIncrement;
        this.f10452d = str;
        this.f10451c = false;
        if (andIncrement == Long.MAX_VALUE) {
            zzfv.h().G().a("Tasks index overflow");
        }
    }
}
