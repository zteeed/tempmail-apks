package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

@KeepForSdk
public class SignInClientImpl extends GmsClient<zaf> implements zad {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10543c;

    /* renamed from: d  reason: collision with root package name */
    private final ClientSettings f10544d;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f10545e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f10546f;

    private SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f10543c = true;
        this.f10544d = clientSettings;
        this.f10545e = bundle;
        this.f10546f = clientSettings.e();
    }

    @KeepForSdk
    public static Bundle i(ClientSettings clientSettings) {
        SignInOptions j = clientSettings.j();
        Integer e2 = clientSettings.e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.b());
        if (e2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", e2.intValue());
        }
        if (j != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", j.g());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", j.f());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", j.d());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", j.e());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", j.b());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", j.h());
            if (j.a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", j.a().longValue());
            }
            if (j.c() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", j.c().longValue());
            }
        }
        return bundle;
    }

    public final void a(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zaf) getService()).D2(iAccountAccessor, this.f10546f.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void b() {
        try {
            ((zaf) getService()).b1(this.f10546f.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void connect() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zaf) {
            return (zaf) queryLocalInterface;
        }
        return new zag(iBinder);
    }

    public final void d(zad zad) {
        Preconditions.l(zad, "Expecting a valid ISignInCallbacks");
        try {
            Account c2 = this.f10544d.c();
            GoogleSignInAccount googleSignInAccount = null;
            if (BaseGmsClient.DEFAULT_ACCOUNT.equals(c2.name)) {
                googleSignInAccount = Storage.a(getContext()).b();
            }
            ((zaf) getService()).S2(new zah(new ResolveAccountRequest(c2, this.f10546f.intValue(), googleSignInAccount)), zad);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zad.V0(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f10544d.h())) {
            this.f10545e.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f10544d.h());
        }
        return this.f10545e;
    }

    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public boolean requiresSignIn() {
        return this.f10543c;
    }

    public SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, SignInOptions signInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, clientSettings, i(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }
}
