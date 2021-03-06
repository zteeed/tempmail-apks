package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public class GoogleApi<O extends Api.ApiOptions> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2687a;

    /* renamed from: b  reason: collision with root package name */
    private final Api<O> f2688b;

    /* renamed from: c  reason: collision with root package name */
    private final O f2689c;

    /* renamed from: d  reason: collision with root package name */
    private final zai<O> f2690d;

    /* renamed from: e  reason: collision with root package name */
    private final Looper f2691e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2692f;
    private final StatusExceptionMapper g;
    protected final GoogleApiManager h;

    @KeepForSdk
    public static class Settings {
        @KeepForSdk

        /* renamed from: c  reason: collision with root package name */
        public static final Settings f2693c = new Builder().a();

        /* renamed from: a  reason: collision with root package name */
        public final StatusExceptionMapper f2694a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f2695b;

        @KeepForSdk
        public static class Builder {

            /* renamed from: a  reason: collision with root package name */
            private StatusExceptionMapper f2696a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f2697b;

            @KeepForSdk
            public Settings a() {
                if (this.f2696a == null) {
                    this.f2696a = new ApiExceptionMapper();
                }
                if (this.f2697b == null) {
                    this.f2697b = Looper.getMainLooper();
                }
                return new Settings(this.f2696a, this.f2697b);
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.f2694a = statusExceptionMapper;
            this.f2695b = looper;
        }
    }

    @KeepForSdk
    protected GoogleApi(Context context, Api<O> api, Looper looper) {
        Preconditions.l(context, "Null context is not permitted.");
        Preconditions.l(api, "Api must not be null.");
        Preconditions.l(looper, "Looper must not be null.");
        this.f2687a = context.getApplicationContext();
        this.f2688b = api;
        this.f2689c = null;
        this.f2691e = looper;
        this.f2690d = zai.a(api);
        new zabp(this);
        GoogleApiManager j = GoogleApiManager.j(this.f2687a);
        this.h = j;
        this.f2692f = j.n();
        this.g = new ApiExceptionMapper();
    }

    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(int i, T t) {
        t.q();
        this.h.f(this, i, t);
        return t;
    }

    private final <TResult, A extends Api.AnyClient> Task<TResult> i(int i, TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.h.g(this, i, taskApiCall, taskCompletionSource, this.g);
        return taskCompletionSource.a();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public ClientSettings.Builder a() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount m;
        GoogleSignInAccount m2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o = this.f2689c;
        if (!(o instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (m2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o).m()) == null) {
            O o2 = this.f2689c;
            account = o2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o2).U() : null;
        } else {
            account = m2.U();
        }
        builder.c(account);
        O o3 = this.f2689c;
        if (!(o3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (m = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o3).m()) == null) {
            set = Collections.emptySet();
        } else {
            set = m.N();
        }
        builder.a(set);
        builder.d(this.f2687a.getClass().getName());
        builder.e(this.f2687a.getPackageName());
        return builder;
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T b(T t) {
        g(1, t);
        return t;
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> c(TaskApiCall<A, TResult> taskApiCall) {
        return i(1, taskApiCall);
    }

    public final Api<O> d() {
        return this.f2688b;
    }

    public final int e() {
        return this.f2692f;
    }

    public Api.Client f(Looper looper, GoogleApiManager.zaa<O> zaa) {
        return this.f2688b.d().b(this.f2687a, looper, a().b(), this.f2689c, zaa, zaa);
    }

    public zace h(Context context, Handler handler) {
        return new zace(context, handler, a().b());
    }

    public final zai<O> j() {
        return this.f2690d;
    }

    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, O o, Settings settings) {
        Preconditions.l(context, "Null context is not permitted.");
        Preconditions.l(api, "Api must not be null.");
        Preconditions.l(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f2687a = context.getApplicationContext();
        this.f2688b = api;
        this.f2689c = o;
        this.f2691e = settings.f2695b;
        this.f2690d = zai.b(api, o);
        new zabp(this);
        GoogleApiManager j = GoogleApiManager.j(this.f2687a);
        this.h = j;
        this.f2692f = j.n();
        this.g = settings.f2694a;
        this.h.e(this);
    }
}
