package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;

public final class SignInOptions implements Api.ApiOptions.Optional {
    public static final SignInOptions j = new SignInOptions(false, false, (String) null, false, (String) null, false, (Long) null, (Long) null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10724b = false;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10725c = false;

    /* renamed from: d  reason: collision with root package name */
    private final String f10726d = null;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10727e = false;

    /* renamed from: f  reason: collision with root package name */
    private final String f10728f = null;
    private final boolean g = false;
    private final Long h = null;
    private final Long i = null;

    public static final class zaa {
    }

    static {
        new zaa();
    }

    private SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, boolean z4, Long l, Long l2) {
    }

    public final Long a() {
        return this.h;
    }

    public final String b() {
        return this.f10728f;
    }

    public final Long c() {
        return this.i;
    }

    public final String d() {
        return this.f10726d;
    }

    public final boolean e() {
        return this.f10727e;
    }

    public final boolean f() {
        return this.f10725c;
    }

    public final boolean g() {
        return this.f10724b;
    }

    public final boolean h() {
        return this.g;
    }
}
