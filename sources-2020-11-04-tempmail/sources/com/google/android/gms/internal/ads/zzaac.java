package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaac {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5700a;

    public zzaac(Context context) {
        Preconditions.l(context, "Context can not be null");
        this.f5700a = context;
    }

    private final boolean a(Intent intent) {
        Preconditions.l(intent, "Intent can not be null");
        if (!this.f5700a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(intent);
    }

    public final boolean c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(intent);
    }

    public final boolean d() {
        return ((Boolean) zzbai.a(this.f5700a, new b())).booleanValue() && Wrappers.a(this.f5700a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean e() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
