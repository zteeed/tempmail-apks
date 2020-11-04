package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbam {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f6101a = new h6(this);
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final Map<BroadcastReceiver, IntentFilter> f6102b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f6103c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6104d;

    /* renamed from: e  reason: collision with root package name */
    private Context f6105e;

    /* access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f6102b.entrySet()) {
            if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) next.getKey());
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((BroadcastReceiver) obj).onReceive(context, intent);
        }
    }

    public final synchronized void a(Context context) {
        if (!this.f6103c) {
            Context applicationContext = context.getApplicationContext();
            this.f6105e = applicationContext;
            if (applicationContext == null) {
                this.f6105e = context;
            }
            zzaav.a(this.f6105e);
            this.f6104d = ((Boolean) zzwg.e().c(zzaav.A1)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f6105e.registerReceiver(this.f6101a, intentFilter);
            this.f6103c = true;
        }
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f6104d) {
            this.f6102b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f6104d) {
            this.f6102b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
