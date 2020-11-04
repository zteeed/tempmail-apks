package com.google.android.gms.common.internal;

import a.e.b;
import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@KeepForSdk
@VisibleForTesting
public final class ClientSettings {

    /* renamed from: a  reason: collision with root package name */
    private final Account f2978a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f2979b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f2980c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Api<?>, OptionalApiSettings> f2981d;

    /* renamed from: e  reason: collision with root package name */
    private final View f2982e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2983f;
    private final String g;
    private final SignInOptions h;
    private final boolean i;
    private Integer j;

    @KeepForSdk
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private Account f2984a;

        /* renamed from: b  reason: collision with root package name */
        private b<Scope> f2985b;

        /* renamed from: c  reason: collision with root package name */
        private Map<Api<?>, OptionalApiSettings> f2986c;

        /* renamed from: d  reason: collision with root package name */
        private int f2987d = 0;

        /* renamed from: e  reason: collision with root package name */
        private View f2988e;

        /* renamed from: f  reason: collision with root package name */
        private String f2989f;
        private String g;
        private SignInOptions h = SignInOptions.j;
        private boolean i;

        public final Builder a(Collection<Scope> collection) {
            if (this.f2985b == null) {
                this.f2985b = new b<>();
            }
            this.f2985b.addAll(collection);
            return this;
        }

        @KeepForSdk
        public final ClientSettings b() {
            return new ClientSettings(this.f2984a, this.f2985b, this.f2986c, this.f2987d, this.f2988e, this.f2989f, this.g, this.h, this.i);
        }

        public final Builder c(Account account) {
            this.f2984a = account;
            return this;
        }

        public final Builder d(String str) {
            this.g = str;
            return this;
        }

        @KeepForSdk
        public final Builder e(String str) {
            this.f2989f = str;
            return this;
        }
    }

    public static final class OptionalApiSettings {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Scope> f2990a;
    }

    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, OptionalApiSettings> map, int i2, View view, String str, String str2, SignInOptions signInOptions, boolean z) {
        this.f2978a = account;
        this.f2979b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f2981d = map == null ? Collections.EMPTY_MAP : map;
        this.f2982e = view;
        this.f2983f = str;
        this.g = str2;
        this.h = signInOptions;
        this.i = z;
        HashSet hashSet = new HashSet(this.f2979b);
        for (OptionalApiSettings optionalApiSettings : this.f2981d.values()) {
            hashSet.addAll(optionalApiSettings.f2990a);
        }
        this.f2980c = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    public static ClientSettings a(Context context) {
        return new GoogleApiClient.Builder(context).a();
    }

    @KeepForSdk
    @Nullable
    public final Account b() {
        return this.f2978a;
    }

    @KeepForSdk
    public final Account c() {
        Account account = this.f2978a;
        if (account != null) {
            return account;
        }
        return new Account(BaseGmsClient.DEFAULT_ACCOUNT, "com.google");
    }

    @KeepForSdk
    public final Set<Scope> d() {
        return this.f2980c;
    }

    @Nullable
    public final Integer e() {
        return this.j;
    }

    public final Map<Api<?>, OptionalApiSettings> f() {
        return this.f2981d;
    }

    @Nullable
    public final String g() {
        return this.g;
    }

    @KeepForSdk
    @Nullable
    public final String h() {
        return this.f2983f;
    }

    @KeepForSdk
    public final Set<Scope> i() {
        return this.f2979b;
    }

    @Nullable
    public final SignInOptions j() {
        return this.h;
    }

    public final boolean k() {
        return this.i;
    }

    public final void l(Integer num) {
        this.j = num;
    }
}
