package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class w5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f5183b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5184c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f5185d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f5186e;

    w5(zzaze zzaze, Context context, String str, boolean z, boolean z2) {
        this.f5183b = context;
        this.f5184c = str;
        this.f5185d = z;
        this.f5186e = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f5183b);
        builder.setMessage(this.f5184c);
        if (this.f5185d) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f5186e) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new x5(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
