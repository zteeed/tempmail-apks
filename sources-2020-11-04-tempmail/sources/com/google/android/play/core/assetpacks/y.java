package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.o;
import com.google.android.play.core.internal.q0;
import com.google.android.play.core.internal.t0;
import java.util.Arrays;

final class y extends q0 {

    /* renamed from: b  reason: collision with root package name */
    private final a f11457b = new a("AssetPackExtractionService");

    /* renamed from: c  reason: collision with root package name */
    private final Context f11458c;

    /* renamed from: d  reason: collision with root package name */
    private final AssetPackExtractionService f11459d;

    /* renamed from: e  reason: collision with root package name */
    private final b0 f11460e;

    y(Context context, AssetPackExtractionService assetPackExtractionService, b0 b0Var) {
        this.f11458c = context;
        this.f11459d = assetPackExtractionService;
        this.f11460e = b0Var;
    }

    public final void A1(Bundle bundle, t0 t0Var) throws RemoteException {
        String[] packagesForUid;
        this.f11457b.c("updateServiceState AIDL call", new Object[0]);
        if (o.a(this.f11458c) && (packagesForUid = this.f11458c.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
            t0Var.P(this.f11459d.a(bundle), new Bundle());
            return;
        }
        t0Var.l(new Bundle());
        this.f11459d.b();
    }

    public final void G2(t0 t0Var) throws RemoteException {
        this.f11460e.z();
        t0Var.y(new Bundle());
    }
}
