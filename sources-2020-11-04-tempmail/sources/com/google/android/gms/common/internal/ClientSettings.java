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
    private final Account f3166a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f3167b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f3168c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Api<?>, OptionalApiSettings> f3169d;

    /* renamed from: e  reason: collision with root package name */
    private final View f3170e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3171f;
    private final String g;
    private final SignInOptions h;
    private final boolean i;
    private Integer j;

    @KeepForSdk
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private Account f3172a;

        /* renamed from: b  reason: collision with root package name */
        private b<Scope> f3173b;

        /* renamed from: c  reason: collision with root package name */
        private Map<Api<?>, OptionalApiSettings> f3174c;

        /* renamed from: d  reason: collision with root package name */
        private int f3175d = 0;

        /* renamed from: e  reason: collision with root package name */
        private View f3176e;

        /* renamed from: f  reason: collision with root package name */
        private String f3177f;
        private String g;
        private SignInOptions h = SignInOptions.j;
        private boolean i;

        public final Builder a(Collection<Scope> collection) {
            if (this.f3173b == null) {
                this.f3173b = new b<>();
            }
            this.f3173b.addAll(collection);
            return this;
        }

        @KeepForSdk
        public final ClientSettings b() {
            return new ClientSettings(this.f3172a, this.f3173b, this.f3174c, this.f3175d, this.f3176e, this.f3177f, this.g, this.h, this.i);
        }

        public final Builder c(Account account) {
            this.f3172a = account;
            return this;
        }

        public final Builder d(String str) {
            this.g = str;
            return this;
        }

        @KeepForSdk
        public final Builder e(String str) {
            this.f3177f = str;
            return this;
        }
    }

    public static final class OptionalApiSettings {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Scope> f3178a;
    }

    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, OptionalApiSettings> map, int i2, View view, String str, String str2, SignInOptions signInOptions, boolean z) {
        this.f3166a = account;
        this.f3167b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f3169d = map == null ? Collections.EMPTY_MAP : map;
        this.f3170e = view;
        this.f3171f = str;
        this.g = str2;
        this.h = signInOptions;
        this.i = z;
        HashSet hashSet = new HashSet(this.f3167b);
        for (OptionalApiSettings optionalApiSettings : this.f3169d.values()) {
            hashSet.addAll(optionalApiSettings.f3178a);
        }
        this.f3168c = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    public static ClientSettings a(Context context) {
        return new GoogleApiClient.Builder(context).a();
    }

    @KeepForSdk
    @Nullable
    public final Account b() {
        return this.f3166a;
    }

    @KeepForSdk
    public final Account c() {
        Account account = this.f3166a;
        if (account != null) {
            return account;
        }
        return new Account(BaseGmsClient.DEFAULT_ACCOUNT, "com.google");
    }

    @KeepForSdk
    public final Set<Scope> d() {
        return this.f3168c;
    }

    @Nullable
    public final Integer e() {
        return this.j;
    }

    public final Map<Api<?>, OptionalApiSettings> f() {
        return this.f3169d;
    }

    @Nullable
    public final String g() {
        return this.g;
    }

    @KeepForSdk
    @Nullable
    public final String h() {
        return this.f3171f;
    }

    @KeepForSdk
    public final Set<Scope> i() {
        return this.f3167b;
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
