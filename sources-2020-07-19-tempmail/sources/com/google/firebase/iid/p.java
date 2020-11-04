package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
abstract class p<T> {

    /* renamed from: a  reason: collision with root package name */
    final int f11229a;

    /* renamed from: b  reason: collision with root package name */
    final TaskCompletionSource<T> f11230b = new TaskCompletionSource<>();

    /* renamed from: c  reason: collision with root package name */
    final int f11231c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f11232d;

    p(int i, int i2, Bundle bundle) {
        this.f11229a = i;
        this.f11231c = i2;
        this.f11232d = bundle;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: package-private */
    public final void b(zzam zzam) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzam);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11230b.b(zzam);
    }

    /* access modifiers changed from: package-private */
    public final void c(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11230b.c(t);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean d();

    public String toString() {
        int i = this.f11231c;
        int i2 = this.f11229a;
        boolean d2 = d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }
}
