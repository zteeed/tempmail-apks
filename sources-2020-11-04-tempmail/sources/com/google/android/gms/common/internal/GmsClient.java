package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

@KeepForSdk
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, GmsClientEventManager.GmsClientEventState {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Scope> f3185a;

    /* renamed from: b  reason: collision with root package name */
    private final Account f3186b;

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected GmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.ClientSettings r13, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r14, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.a(r10)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.q()
            com.google.android.gms.common.internal.Preconditions.k(r14)
            r7 = r14
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r7 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r7
            com.google.android.gms.common.internal.Preconditions.k(r15)
            r8 = r15
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r8 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener):void");
    }

    private static BaseGmsClient.BaseConnectionCallbacks f(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        if (connectionCallbacks == null) {
            return null;
        }
        return new d(connectionCallbacks);
    }

    private static BaseGmsClient.BaseOnConnectionFailedListener g(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        if (onConnectionFailedListener == null) {
            return null;
        }
        return new e(onConnectionFailedListener);
    }

    private final Set<Scope> h(Set<Scope> set) {
        e(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public Set<Scope> e(Set<Scope> set) {
        return set;
    }

    public final Account getAccount() {
        return this.f3186b;
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> getScopes() {
        return this.f3185a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    protected GmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i, f(connectionCallbacks), g(onConnectionFailedListener), clientSettings.g());
        this.f3186b = clientSettings.b();
        Set<Scope> d2 = clientSettings.d();
        h(d2);
        this.f3185a = d2;
    }
}
