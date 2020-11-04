package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbhd extends MutableContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private Activity f6243a;

    /* renamed from: b  reason: collision with root package name */
    private Context f6244b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6245c;

    public zzbhd(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Context a() {
        return this.f6245c;
    }

    public final Activity b() {
        return this.f6243a;
    }

    public final Object getSystemService(String str) {
        return this.f6245c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f6244b = context.getApplicationContext();
        this.f6243a = context instanceof Activity ? (Activity) context : null;
        this.f6245c = context;
        super.setBaseContext(this.f6244b);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f6243a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f6244b.startActivity(intent);
    }
}
