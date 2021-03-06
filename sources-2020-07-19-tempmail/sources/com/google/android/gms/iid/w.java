package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class w<T> {

    /* renamed from: a  reason: collision with root package name */
    final int f3295a;

    /* renamed from: b  reason: collision with root package name */
    final TaskCompletionSource<T> f3296b = new TaskCompletionSource<>();

    /* renamed from: c  reason: collision with root package name */
    final int f3297c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f3298d;

    w(int i, int i2, Bundle bundle) {
        this.f3295a = i;
        this.f3297c = i2;
        this.f3298d = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a(zzaa zzaa) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzaa);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f3296b.b(zzaa);
    }

    /* access modifiers changed from: package-private */
    public abstract void b(Bundle bundle);

    /* access modifiers changed from: package-private */
    public abstract boolean c();

    public String toString() {
        int i = this.f3297c;
        int i2 = this.f3295a;
        c();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=false}");
        return sb.toString();
    }
}
