package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzarl implements zzarp {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f5888f = new Object();
    @VisibleForTesting
    private static zzarp g;
    @VisibleForTesting
    private static zzarp h;

    /* renamed from: a  reason: collision with root package name */
    private final Object f5889a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5890b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<Thread, Boolean> f5891c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f5892d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbbd f5893e;

    private zzarl(Context context) {
        this(context, zzbbd.u());
    }

    @VisibleForTesting
    private final Uri.Builder c(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = Wrappers.a(this.f5890b).g();
        } catch (Throwable th) {
            zzbba.c("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.f5890b.getPackageName();
        } catch (Throwable unused) {
            zzbba.i("Cannot obtain package name, proceeding.");
            str4 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.f5893e.f6131b).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", zzaav.d())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "312401170").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", zzwg.f()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzacq.f5607c.a()));
    }

    public static zzarp f(Context context, zzbbd zzbbd) {
        synchronized (f5888f) {
            if (h == null) {
                if (zzacq.f5609e.a().booleanValue()) {
                    if (!((Boolean) zzwg.e().c(zzaav.J3)).booleanValue()) {
                        zzarl zzarl = new zzarl(context, zzbbd);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzarl.f5889a) {
                                zzarl.f5891c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new r3(zzarl, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new p3(zzarl, Thread.getDefaultUncaughtExceptionHandler()));
                        h = zzarl;
                    }
                }
                h = new zzars();
            }
        }
        return h;
    }

    public static zzarp g(Context context) {
        synchronized (f5888f) {
            if (g == null) {
                if (zzacq.f5609e.a().booleanValue()) {
                    if (!((Boolean) zzwg.e().c(zzaav.J3)).booleanValue()) {
                        g = new zzarl(context);
                    }
                }
                g = new zzars();
            }
        }
        return g;
    }

    public final void a(Throwable th, String str) {
        b(th, str, 1.0f);
    }

    public final void b(Throwable th, String str, float f2) {
        if (zzbaq.s(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            zzeea.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f2);
            if (f2 > 0.0f) {
                i2 = (int) (1.0f / f2);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c(name, stringWriter2, str, i2).toString());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.f5892d.execute(new q3(new zzbbe(), (String) obj));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x003c
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x0037
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        L_0x000f:
            if (r6 >= r5) goto L_0x0032
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.zzbaq.w(r8)
            if (r8 == 0) goto L_0x001e
            r2 = 1
        L_0x001e:
            java.lang.Class<com.google.android.gms.internal.ads.zzarl> r8 = com.google.android.gms.internal.ads.zzarl.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x002f
            r3 = 1
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x000f
        L_0x0032:
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x0007
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r10 = 0
        L_0x003d:
            if (r10 == 0) goto L_0x0046
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.b(r11, r0, r10)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarl.e(java.lang.Thread, java.lang.Throwable):void");
    }

    private zzarl(Context context, zzbbd zzbbd) {
        this.f5889a = new Object();
        this.f5891c = new WeakHashMap<>();
        this.f5892d = zzdrn.a().a(zzdrs.f8355a);
        this.f5890b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5893e = zzbbd;
    }
}
