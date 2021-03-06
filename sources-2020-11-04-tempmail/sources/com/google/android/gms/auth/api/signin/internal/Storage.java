package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

public class Storage {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f2835c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d  reason: collision with root package name */
    private static Storage f2836d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f2837a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f2838b;

    @VisibleForTesting
    private Storage(Context context) {
        this.f2838b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    public static Storage a(Context context) {
        Preconditions.k(context);
        f2835c.lock();
        try {
            if (f2836d == null) {
                f2836d = new Storage(context.getApplicationContext());
            }
            return f2836d;
        } finally {
            f2835c.unlock();
        }
    }

    private static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    @VisibleForTesting
    private final GoogleSignInAccount d(String str) {
        String e2;
        if (!TextUtils.isEmpty(str) && (e2 = e(c("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.P(e2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    private final String e(String str) {
        this.f2837a.lock();
        try {
            return this.f2838b.getString(str, (String) null);
        } finally {
            this.f2837a.unlock();
        }
    }

    @KeepForSdk
    @Nullable
    public GoogleSignInAccount b() {
        return d(e("defaultGoogleSignInAccount"));
    }
}
