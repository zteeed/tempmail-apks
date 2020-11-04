package com.tempmail.utils;

import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.billingclient.api.g;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.PeriodicTask;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.db.h;
import com.tempmail.db.i;
import com.tempmail.services.GetEmailsPeriodicService;
import com.tempmail.services.NetworkChangeService;
import com.tempmail.services.SyncMailsService;
import com.tempmail.t.d;
import com.tempmail.utils.y.b;
import com.tempmail.utils.z.m;
import com.tempmail.utils.z.o;
import java.io.UnsupportedEncodingException;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.c;
import org.threeten.bp.a;

/* compiled from: AppUtils */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12570a = "e";

    public static long A(Map<String, List<ExtendedMail>> map) {
        double d2 = 0.0d;
        for (Map.Entry<String, List<ExtendedMail>> value : map.entrySet()) {
            for (ExtendedMail mailTimestamp : (List) value.getValue()) {
                d2 = Math.max(d2, mailTimestamp.getMailTimestamp());
            }
        }
        return (long) (d2 * 1000.0d);
    }

    public static d B(g gVar, g gVar2, double d2) {
        double d3 = ((double) gVar2.d()) / 1000000.0d;
        double d4 = d3 / d2;
        int A = w.A((1.0d - (d3 / ((((double) gVar.d()) / 1000000.0d) * d2))) * 100.0d);
        return new d(gVar2.e() + " " + w.B(d4), A);
    }

    public static void C(List<com.tempmail.db.e> list) {
        Collections.sort(list, a.f12562b);
    }

    public static void D(List<com.tempmail.db.e> list) {
        Collections.sort(list);
        Collections.reverse(list);
    }

    public static String E(Uri uri) {
        return uri.getQueryParameter("ots");
    }

    public static int F(double d2, g gVar, double d3) {
        return w.A((1.0d - ((((double) gVar.d()) / 1000000.0d) / (d2 * d3))) * 100.0d);
    }

    public static String G(g gVar, double d2) {
        double d3 = (((double) gVar.d()) / 1000000.0d) / d2;
        return gVar.e() + " " + w.B(d3);
    }

    public static long H(Context context) {
        f fVar;
        Calendar instance = Calendar.getInstance();
        try {
            fVar = f.f();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            fVar = null;
        }
        if (O(context)) {
            int i = 2;
            if (fVar != null) {
                i = (int) fVar.h(context.getString(R.string.remote_config_store_duration_free_hours));
            }
            instance.add(11, -i);
        } else {
            int i2 = 30;
            if (fVar != null) {
                i2 = (int) fVar.h(context.getString(R.string.remote_config_store_duration_premium_days));
            }
            instance.add(5, -i2);
        }
        return (long) ((int) (instance.getTimeInMillis() / 1000));
    }

    public static List<String> I(List<DomainExpired> list) {
        ArrayList arrayList = new ArrayList();
        for (DomainExpired domain : list) {
            arrayList.add(domain.getDomain());
        }
        return arrayList;
    }

    public static List<String> J(String str) {
        if (str == null) {
            return new ArrayList();
        }
        int length = str.length();
        String str2 = f12570a;
        m.b(str2, "text length " + length);
        int i = 1;
        double d2 = (double) length;
        if (d2 > 1900000.0d) {
            m.b(f12570a, "length higher ");
            double d3 = d2 / 1900000.0d;
            String str3 = f12570a;
            m.b(str3, "divide " + d3);
            i = (int) Math.ceil(d3);
        }
        String str4 = f12570a;
        m.b(str4, "text parts " + i);
        int i2 = length / i;
        String str5 = f12570a;
        m.b(str5, "text partLength " + i2);
        return w.E(str, i2);
    }

    public static String K(List<i> list) {
        StringBuilder sb = new StringBuilder();
        for (i b2 : list) {
            sb.append(b2.b());
        }
        return sb.toString();
    }

    public static String L(List<h> list) {
        StringBuilder sb = new StringBuilder();
        for (h b2 : list) {
            sb.append(b2.b());
        }
        return sb.toString();
    }

    public static int M(g gVar) {
        int i;
        int parseInt = Integer.parseInt("3");
        String a2 = gVar.a();
        if (a2 == null) {
            return parseInt;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                i = Period.parse(a2).getDays();
            } else {
                i = a.c(a2).b();
            }
            return i;
        } catch (Exception e2) {
            e2.printStackTrace();
            return parseInt;
        }
    }

    public static void N(Context context, long j) {
        if (!w.c(context, SyncMailsService.class)) {
            m.b("App", "SyncMailsService component disabled");
            return;
        }
        GcmNetworkManager b2 = GcmNetworkManager.b(context);
        if (GoogleApiAvailability.q().i(context) == 0) {
            String str = f12570a;
            m.b(str, "google services available " + j);
            PeriodicTask.Builder builder = new PeriodicTask.Builder();
            builder.g(SyncMailsService.class);
            builder.d(j);
            builder.c(j / 2);
            builder.h("periodic_email_sync");
            builder.f(0);
            builder.i(true);
            builder.e(true);
            b2.c(builder.b());
        }
    }

    public static boolean O(Context context) {
        return TextUtils.isEmpty(s.L(context));
    }

    public static boolean P() {
        return false;
    }

    public static boolean Q() {
        return false;
    }

    public static boolean R() {
        return false;
    }

    public static boolean S() {
        return true;
    }

    static /* synthetic */ int T(com.tempmail.db.e eVar, com.tempmail.db.e eVar2) {
        Long u = eVar.u();
        Long u2 = eVar2.u();
        if (u == null || u2 == null) {
            return 0;
        }
        return u2.compareTo(u);
    }

    public static void U(Activity activity, com.tempmail.db.f fVar) {
        w.y(activity, activity.getString(R.string.temp_email_address_link, new Object[]{w.l(activity), f.h(fVar.e().getBytes(), true)}));
    }

    public static void V(com.tempmail.f fVar) {
        q.d(fVar, b.f12599f.intValue(), fVar.getString(R.string.app_name), fVar.getString(R.string.premium_trial_expired_now_on_free));
        s.q0(fVar, (String) null);
        s.d0(fVar, (String) null);
        Y(fVar);
    }

    public static com.tempmail.db.e W(com.tempmail.f fVar, m mVar, o oVar, boolean z, String str, String str2) {
        com.tempmail.db.e eVar = new com.tempmail.db.e(str, str.replace(str2, ""), str2, Boolean.TRUE);
        r.a(fVar, eVar, Calendar.getInstance().getTimeInMillis(), p());
        if (z) {
            g.d(fVar.H0(), eVar);
        } else {
            r.g(fVar.H0(), eVar);
        }
        mVar.w(eVar);
        oVar.W();
        Toast.makeText(fVar, R.string.message_mailbox_added, 1).show();
        return eVar;
    }

    public static void X(com.tempmail.f fVar) {
        q.d(fVar, b.f12599f.intValue(), fVar.getString(R.string.app_name), fVar.getString(R.string.premium_trial_expired_now_on_free));
        s.q0(fVar, (String) null);
        Y(fVar);
    }

    public static void Y(com.tempmail.f fVar) {
        s.b0(fVar, 0);
        c.c().k(new com.tempmail.t.e.c());
        g.F(fVar.H0());
    }

    public static void Z(com.tempmail.f fVar, ApiError apiError) {
        int intValue = apiError.getCode().intValue();
        if (fVar != null) {
            d.d(fVar, fVar.K0(), apiError.getMessage(), apiError.getCode().intValue());
        }
        if (intValue != -32603) {
            if (intValue == -1) {
                fVar.P0(apiError.getMessage());
            } else if (intValue != 4090) {
                if (intValue != 4000) {
                    if (intValue == 4001) {
                        V(fVar);
                        return;
                    } else if (intValue != 4030) {
                        if (intValue != 4031) {
                            if (fVar != null) {
                                fVar.P0(apiError.getMessage());
                                return;
                            }
                            return;
                        } else if (fVar != null) {
                            fVar.P0(fVar.getString(R.string.error_access_denied));
                            return;
                        } else {
                            return;
                        }
                    }
                }
                X(fVar);
            } else if (fVar != null) {
                fVar.P0(fVar.getString(R.string.error_email_address_busy));
            }
        } else if (fVar != null) {
            fVar.P0(fVar.getString(R.string.error_internal_error));
        }
    }

    public static void a(Context context) {
        GcmNetworkManager.b(context).a("periodic_email_sync", SyncMailsService.class);
    }

    public static void a0(Context context, Map<String, List<ExtendedMail>> map) {
        long A = A(map);
        String str = f12570a;
        m.b(str, "newLastCheck " + A);
        if (A != 0) {
            s.b0(context, A);
        }
    }

    private static void b(Context context, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            w.b(context, GetEmailsPeriodicService.class, z);
            w.b(context, NetworkChangeService.class, true);
        }
        if (z) {
            c0(context);
            w.b(context, SyncMailsService.class, true);
            N(context, 60);
            return;
        }
        a(context);
        w.b(context, SyncMailsService.class, false);
    }

    public static void b0(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.b("App", "scheduleNetworkChangeJob");
            try {
                ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(1, new ComponentName(context, NetworkChangeService.class)).setRequiredNetworkType(1).setRequiresCharging(false).build());
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void c(Context context, boolean z) {
        if (O(context)) {
            b(context, z);
            d(context, false);
            return;
        }
        b(context, false);
        d(context, z);
    }

    public static void c0(Context context) {
        if (Build.VERSION.SDK_INT >= 21 && !w.c(context, GetEmailsPeriodicService.class)) {
            m.b("App", "component disabled");
        } else if (Build.VERSION.SDK_INT >= 21) {
            m.b("App", "NetworkChangePeriodicService schedulePeriodicJob");
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(0, new ComponentName(context, GetEmailsPeriodicService.class)).setRequiredNetworkType(1).setPeriodic(600).setRequiresCharging(false).build());
        }
    }

    private static void d(Context context, boolean z) {
    }

    public static String d0(String str) {
        if (str.startsWith("@")) {
            return str;
        }
        return "@" + str;
    }

    public static boolean e(com.tempmail.db.c cVar, List<com.tempmail.db.e> list, List<String> list2) {
        return h(list2, g(cVar, list));
    }

    public static List<DomainExpired> e0(List<DomainExpired> list) {
        ArrayList arrayList = new ArrayList();
        for (DomainExpired next : list) {
            String domain = next.getDomain();
            if (domain.startsWith("@")) {
                arrayList.add(next);
            } else {
                next.setDomain("@" + domain);
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static boolean f(Context context, com.tempmail.db.c cVar, List<String> list) {
        List<String> f0 = f0(list);
        if (f0.isEmpty()) {
            Toast.makeText(context, R.string.message_no_domains, 1).show();
        }
        m.b(f12570a, "checkEmails");
        List<com.tempmail.db.e> z = g.z(cVar);
        if (z.isEmpty()) {
            k(context, cVar, f0);
            return true;
        } else if (!O(context)) {
            return true;
        } else {
            if (!P()) {
                return e(cVar, z, f0);
            }
            if (g.t(cVar).v()) {
                return true;
            }
            m.b(f12570a, "checkEmails checkDefaultEmailValid");
            return e(cVar, z, f0);
        }
    }

    public static List<String> f0(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (next.startsWith("@")) {
                arrayList.add(next);
            } else {
                arrayList.add("@" + next);
            }
        }
        return arrayList;
    }

    public static com.tempmail.db.e g(com.tempmail.db.c cVar, List<com.tempmail.db.e> list) {
        com.tempmail.db.e t = g.t(cVar);
        if (t != null) {
            return t;
        }
        com.tempmail.db.e eVar = list.get(0);
        eVar.G(Boolean.TRUE);
        g.L(cVar, eVar);
        return eVar;
    }

    public static boolean h(List<String> list, com.tempmail.db.e eVar) {
        String str = f12570a;
        m.b(str, "checkIfDomainValid " + eVar.k());
        return list.contains(eVar.k());
    }

    public static boolean i(Integer num) {
        return num.equals(4001) || num.equals(4030) || num.equals(4000);
    }

    public static void j(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(context.getString(R.string.message_copy_clipboard_title), str));
        Toast.makeText(context, R.string.message_address_copied, 1).show();
    }

    public static void k(Context context, com.tempmail.db.c cVar, List<String> list) {
        m.b(f12570a, "createFirstEmail");
        com.tempmail.db.e m = m(list, (String) null);
        m.G(Boolean.TRUE);
        r.a(context, m, Calendar.getInstance().getTimeInMillis(), p());
        g.c(cVar, m);
    }

    public static boolean l(Context context, com.tempmail.db.c cVar, Map<String, List<ExtendedMail>> map, boolean z) {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            arrayList.add(str);
            if (w.u((CharSequence) next.getKey())) {
                com.tempmail.t.c D = w.D(str);
                if (D != null) {
                    com.tempmail.db.e eVar = new com.tempmail.db.e(str, D.b(), D.a(), Boolean.valueOf(z3));
                    boolean e2 = g.e(cVar, eVar);
                    String str2 = f12570a;
                    m.b(str2, "email " + eVar.p() + " isAdded " + e2);
                    if (e2) {
                        m.b(f12570a, "isHaveNewMailboxes = true");
                        z4 = true;
                    }
                    int d2 = r.d(cVar, (String) next.getKey(), (List) next.getValue());
                    if (d2 > 0) {
                        d.c(context, instance, d2);
                        z2 = true;
                    }
                    z3 = false;
                } else {
                    Toast.makeText(context, R.string.message_something_going_wrong, 1).show();
                }
            }
        }
        if (!O(context)) {
            g.k(cVar, arrayList);
        }
        if (g.t(cVar) == null) {
            g.h(cVar, g.z(cVar).get(0));
        }
        if (z2 && z) {
            q.f(context);
        }
        String str3 = f12570a;
        m.b(str3, "isHaveNewMailboxes last " + z4);
        return z4;
    }

    public static com.tempmail.db.e m(List<String> list, String str) {
        if (str == null) {
            str = android.org.apache.commons.lang3.b.e(5, 8).toLowerCase();
        }
        int length = 10 - str.length();
        m.b(f12570a, "numeric count " + length);
        String f2 = android.org.apache.commons.lang3.b.f(length);
        m.b(f12570a, "generatedNumeric " + f2);
        String str2 = str + f2;
        String str3 = list.get(w.e(list.size(), 0));
        return new com.tempmail.db.e(str2 + str3, str2, str3, Boolean.FALSE);
    }

    public static int n(Context context, com.tempmail.db.c cVar, com.tempmail.db.e eVar) {
        return g.A(cVar, eVar, H(context)).size();
    }

    public static Class o(Context context, String str) {
        try {
            return Class.forName(context.getPackageName() + str);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static long p() {
        return t(Calendar.getInstance().getTimeInMillis(), 600000);
    }

    public static int q(Context context, com.tempmail.db.c cVar) {
        return (int) g.D(cVar, g.t(cVar), H(context));
    }

    public static List<DomainExpired> r(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String domainExpired : list) {
            arrayList.add(new DomainExpired(domainExpired, (Long) null));
        }
        return arrayList;
    }

    public static String s(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("email");
            if (queryParameter != null) {
                return new String(f.c(queryParameter), "UTF-8");
            }
            return null;
        } catch (Base64DecoderException | UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static long t(long j, long j2) {
        return j + j2;
    }

    public static int u(Context context, com.tempmail.db.c cVar, com.tempmail.db.e eVar) {
        return (int) g.D(cVar, eVar, H(context));
    }

    public static List<com.tempmail.db.e> v(Context context, List<com.tempmail.db.e> list) {
        f.f();
        int a2 = i.a(context);
        return list.size() > a2 ? list.subList(0, a2) : list;
    }

    public static String w(List<com.tempmail.db.g> list) {
        StringBuilder sb = new StringBuilder();
        for (com.tempmail.db.g b2 : list) {
            sb.append(b2.b());
        }
        return sb.toString();
    }

    public static boolean x(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static List<com.tempmail.db.e> y(Context context, List<com.tempmail.db.e> list) {
        int a2 = i.a(context);
        if (list.size() > a2) {
            return list.subList(a2, list.size());
        }
        return new ArrayList();
    }

    public static String z(Uri uri) {
        return uri.getQueryParameter("link");
    }
}
