package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.CheckReturnValue;

@ShowFirstParty
@CheckReturnValue
@KeepForSdk
public class GoogleSignatureVerifier {

    /* renamed from: b  reason: collision with root package name */
    private static GoogleSignatureVerifier f2858b;

    /* renamed from: a  reason: collision with root package name */
    private final Context f2859a;

    private GoogleSignatureVerifier(Context context) {
        this.f2859a = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier a(Context context) {
        Preconditions.k(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (f2858b == null) {
                a.c(context);
                f2858b = new GoogleSignatureVerifier(context);
            }
        }
        return f2858b;
    }

    private static c d(PackageInfo packageInfo, c... cVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        d dVar = new d(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < cVarArr.length; i++) {
            if (cVarArr[i].equals(dVar)) {
                return cVarArr[i];
            }
        }
        return null;
    }

    private final i e(String str, int i) {
        try {
            PackageInfo h = Wrappers.a(this.f2859a).h(str, 64, i);
            boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.f2859a);
            if (h == null) {
                return i.d("null pkg");
            }
            if (h.signatures.length != 1) {
                return i.d("single cert required");
            }
            d dVar = new d(h.signatures[0].toByteArray());
            String str2 = h.packageName;
            i a2 = a.a(str2, dVar, honorsDebugCertificates, false);
            return (!a2.f3134a || h.applicationInfo == null || (h.applicationInfo.flags & 2) == 0 || !a.a(str2, dVar, false, true).f3134a) ? a2 : i.d("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return i.d(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    public static boolean f(PackageInfo packageInfo, boolean z) {
        c cVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                cVar = d(packageInfo, f.f3132a);
            } else {
                cVar = d(packageInfo, f.f3132a[0]);
            }
            if (cVar != null) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        if (f(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.f2859a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean c(int i) {
        i iVar;
        String[] f2 = Wrappers.a(this.f2859a).f(i);
        if (f2 != null && f2.length != 0) {
            iVar = null;
            for (String e2 : f2) {
                iVar = e(e2, i);
                if (iVar.f3134a) {
                    break;
                }
            }
        } else {
            iVar = i.d("no pkgs");
        }
        iVar.g();
        return iVar.f3134a;
    }
}
