package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import b.c.a.b.i.m;
import b.c.a.b.i.w.j.c;

/* compiled from: AlarmManagerScheduler */
public class a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2564a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2565b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f2566c;

    /* renamed from: d  reason: collision with root package name */
    private final g f2567d;

    /* renamed from: e  reason: collision with root package name */
    private final b.c.a.b.i.x.a f2568e;

    public a(Context context, c cVar, b.c.a.b.i.x.a aVar, g gVar) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    public void a(m mVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", mVar.b());
        builder.appendQueryParameter("priority", String.valueOf(b.c.a.b.i.y.a.a(mVar.d())));
        if (mVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(mVar.c(), 0));
        }
        Intent intent = new Intent(this.f2564a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (b(intent)) {
            b.c.a.b.i.u.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long C = this.f2565b.C(mVar);
        long f2 = this.f2567d.f(mVar.d(), C, i);
        b.c.a.b.i.u.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", mVar, Long.valueOf(f2), Long.valueOf(C), Integer.valueOf(i));
        this.f2566c.set(3, this.f2568e.a() + f2, PendingIntent.getBroadcast(this.f2564a, 0, intent, 0));
    }

    /* access modifiers changed from: package-private */
    public boolean b(Intent intent) {
        return PendingIntent.getBroadcast(this.f2564a, 0, intent, 536870912) != null;
    }

    a(Context context, c cVar, AlarmManager alarmManager, b.c.a.b.i.x.a aVar, g gVar) {
        this.f2564a = context;
        this.f2565b = cVar;
        this.f2566c = alarmManager;
        this.f2568e = aVar;
        this.f2567d = gVar;
    }
}
