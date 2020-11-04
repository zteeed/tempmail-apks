package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class m5 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaye f4346a;

    private m5(zzaye zzaye) {
        this.f4346a = zzaye;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            boolean unused = this.f4346a.f6052c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            boolean unused2 = this.f4346a.f6052c = false;
        }
    }

    /* synthetic */ m5(zzaye zzaye, j5 j5Var) {
        this(zzaye);
    }
}
