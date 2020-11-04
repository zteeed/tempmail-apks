package com.google.firebase.e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final DynamicLinkData f11108a;

    @KeepForSdk
    @VisibleForTesting
    public b(DynamicLinkData dynamicLinkData) {
        if (dynamicLinkData == null) {
            this.f11108a = null;
            return;
        }
        if (dynamicLinkData.u() == 0) {
            dynamicLinkData.v(DefaultClock.d().a());
        }
        this.f11108a = dynamicLinkData;
    }

    @VisibleForTesting
    private final Uri d() {
        DynamicLinkData dynamicLinkData = this.f11108a;
        if (dynamicLinkData == null) {
            return null;
        }
        return dynamicLinkData.A();
    }

    public Uri a() {
        String B;
        DynamicLinkData dynamicLinkData = this.f11108a;
        if (dynamicLinkData == null || (B = dynamicLinkData.B()) == null) {
            return null;
        }
        return Uri.parse(B);
    }

    public int b() {
        DynamicLinkData dynamicLinkData = this.f11108a;
        if (dynamicLinkData == null) {
            return 0;
        }
        return dynamicLinkData.G();
    }

    public Intent c(Context context) {
        if (b() == 0) {
            return null;
        }
        try {
            if (context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0).versionCode < b() && d() != null) {
                return new Intent("android.intent.action.VIEW").setData(d()).setPackage("com.android.vending");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
