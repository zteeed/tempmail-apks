package com.google.android.gms.common.api;

import a.e.a;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.google.android.gms.signin.zaa;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk
public abstract class GoogleApiClient {

    @KeepForSdk
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private Account f2887a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Scope> f2888b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private int f2889c;

        /* renamed from: d  reason: collision with root package name */
        private View f2890d;

        /* renamed from: e  reason: collision with root package name */
        private String f2891e;

        /* renamed from: f  reason: collision with root package name */
        private String f2892f;
        private final Map<Api<?>, ClientSettings.OptionalApiSettings> g;
        private final Map<Api<?>, Api.ApiOptions> h;

        @KeepForSdk
        public Builder(Context context) {
            new HashSet();
            this.g = new a();
            this.h = new a();
            GoogleApiAvailability.q();
            Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> abstractClientBuilder = zaa.f10743c;
            new ArrayList();
            new ArrayList();
            context.getMainLooper();
            this.f2891e = context.getPackageName();
            this.f2892f = context.getClass().getName();
        }

        @KeepForSdk
        @VisibleForTesting
        public final ClientSettings a() {
            SignInOptions signInOptions = SignInOptions.j;
            if (this.h.containsKey(zaa.f10745e)) {
                signInOptions = (SignInOptions) this.h.get(zaa.f10745e);
            }
            return new ClientSettings(this.f2887a, this.f2888b, this.g, this.f2889c, this.f2890d, this.f2891e, this.f2892f, signInOptions, false);
        }
    }

    public interface ConnectionCallbacks {
        void B(int i);

        void H(Bundle bundle);
    }

    public interface OnConnectionFailedListener {
        void h0(ConnectionResult connectionResult);
    }

    static {
        Collections.newSetFromMap(new WeakHashMap());
    }

    public abstract void d();

    public abstract void e();

    public abstract void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void g(OnConnectionFailedListener onConnectionFailedListener);

    public void h(zacm zacm) {
        throw new UnsupportedOperationException();
    }
}
