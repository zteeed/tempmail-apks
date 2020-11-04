package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.core.content.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzai extends s4 {

    /* renamed from: c  reason: collision with root package name */
    private long f10366c;

    /* renamed from: d  reason: collision with root package name */
    private String f10367d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f10368e;

    /* renamed from: f  reason: collision with root package name */
    private AccountManager f10369f;
    private Boolean g;
    private long h;

    zzai(zzfy zzfy) {
        super(zzfy);
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        Calendar instance = Calendar.getInstance();
        this.f10366c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f10367d = sb.toString();
        return false;
    }

    public final boolean u(Context context) {
        if (this.f10368e == null) {
            m();
            this.f10368e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f10368e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f10368e.booleanValue();
    }

    public final long v() {
        p();
        return this.f10366c;
    }

    public final String w() {
        p();
        return this.f10367d;
    }

    /* access modifiers changed from: package-private */
    public final long x() {
        c();
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final void y() {
        c();
        this.g = null;
        this.h = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean z() {
        c();
        long a2 = n().a();
        if (a2 - this.h > 86400000) {
            this.g = null;
        }
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.a(f(), "android.permission.GET_ACCOUNTS") != 0) {
            h().K().a("Permission error checking for dasher/unicorn accounts");
            this.h = a2;
            this.g = Boolean.FALSE;
            return false;
        }
        if (this.f10369f == null) {
            this.f10369f = AccountManager.get(f());
        }
        try {
            Account[] result = this.f10369f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f10369f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.g = Boolean.TRUE;
                    this.h = a2;
                    return true;
                }
                this.h = a2;
                this.g = Boolean.FALSE;
                return false;
            }
            this.g = Boolean.TRUE;
            this.h = a2;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            h().H().b("Exception checking account types", e2);
        }
    }
}
