package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

public final class zaa {

    /* renamed from: a  reason: collision with root package name */
    private static final Api.ClientKey<SignInClientImpl> f10741a = new Api.ClientKey<>();
    @ShowFirstParty

    /* renamed from: b  reason: collision with root package name */
    private static final Api.ClientKey<SignInClientImpl> f10742b = new Api.ClientKey<>();

    /* renamed from: c  reason: collision with root package name */
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> f10743c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final Api.AbstractClientBuilder<SignInClientImpl, Object> f10744d = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final Api<SignInOptions> f10745e = new Api<>("SignIn.API", f10743c, f10741a);

    static {
        new Scope("profile");
        new Scope("email");
        new Api("SignIn.INTERNAL_API", f10744d, f10742b);
    }
}
