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
import com.android.billingclient.api.j;
import com.android.billingclient.api.n;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.PeriodicTask;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.db.DaoSession;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.db.EmailTable;
import com.tempmail.db.MailHtmlTable;
import com.tempmail.db.MailTextOnlyTable;
import com.tempmail.db.MailTextTable;
import com.tempmail.h;
import com.tempmail.services.GetEmailsPeriodicService;
import com.tempmail.services.NetworkChangeService;
import com.tempmail.services.SyncMailsService;
import com.tempmail.u.d;
import com.tempmail.utils.y.b;
import com.tempmail.utils.z.m;
import com.tempmail.utils.z.o;
import java.nio.charset.StandardCharsets;
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
    private static final String f13114a = "e";

    public static long A(Map<String, List<ExtendedMail>> map) {
        double d2 = 0.0d;
        for (Map.Entry<String, List<ExtendedMail>> value : map.entrySet()) {
            for (ExtendedMail mailTimestamp : (List) value.getValue()) {
                d2 = Math.max(d2, mailTimestamp.getMailTimestamp());
            }
        }
        return (long) (d2 * 1000.0d);
    }

    public static d B(n nVar, n nVar2, double d2) {
        double d3 = ((double) nVar2.d()) / 1000000.0d;
        double d4 = d3 / d2;
        int C = x.C((1.0d - (d3 / ((((double) nVar.d()) / 1000000.0d) * d2))) * 100.0d);
        return new d(nVar2.e() + " " + x.D(d4), C);
    }

    public static void C(List<EmailAddressTable> list) {
        Collections.sort(list, a.f13105b);
    }

    public static void D(List<EmailAddressTable> list) {
        Collections.sort(list);
        Collections.reverse(list);
    }

    public static j E(List<j> list) {
        j jVar = null;
        for (j next : list) {
            String str = f13114a;
            m.b(str, "purchase state " + next.c());
            String str2 = f13114a;
            m.b(str2, "purchase " + next.toString());
            if (next.c() == 1 && !com.tempmail.billing.e.e(next)) {
                m.b(f13114a, "purchase state equals");
                if (jVar == null || jVar.d() < next.d()) {
                    jVar = next;
                }
            }
        }
        return jVar;
    }

    public static String F(Uri uri) {
        return uri.getQueryParameter("ots");
    }

    public static int G(double d2, n nVar, double d3) {
        return x.C((1.0d - ((((double) nVar.d()) / 1000000.0d) / (d2 * d3))) * 100.0d);
    }

    public static String H(n nVar, double d2) {
        double d3 = (((double) nVar.d()) / 1000000.0d) / d2;
        return nVar.e() + " " + x.D(d3);
    }

    public static long I(Context context) {
        f fVar;
        Calendar instance = Calendar.getInstance();
        try {
            fVar = f.f();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            fVar = null;
        }
        if (P(context)) {
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

    public static List<String> J(List<DomainExpired> list) {
        ArrayList arrayList = new ArrayList();
        for (DomainExpired domain : list) {
            arrayList.add(domain.getDomain());
        }
        return arrayList;
    }

    public static List<String> K(String str) {
        if (str == null) {
            return new ArrayList();
        }
        int length = str.length();
        String str2 = f13114a;
        m.b(str2, "text length " + length);
        int i = 1;
        double d2 = (double) length;
        if (d2 > 1900000.0d) {
            m.b(f13114a, "length higher ");
            double d3 = d2 / 1900000.0d;
            String str3 = f13114a;
            m.b(str3, "divide " + d3);
            i = (int) Math.ceil(d3);
        }
        String str4 = f13114a;
        m.b(str4, "text parts " + i);
        int i2 = length / i;
        String str5 = f13114a;
        m.b(str5, "text partLength " + i2);
        return x.G(str, i2);
    }

    public static String L(List<MailTextTable> list) {
        StringBuilder sb = new StringBuilder();
        for (MailTextTable text : list) {
            sb.append(text.getText());
        }
        return sb.toString();
    }

    public static String M(List<MailTextOnlyTable> list) {
        StringBuilder sb = new StringBuilder();
        for (MailTextOnlyTable text : list) {
            sb.append(text.getText());
        }
        return sb.toString();
    }

    public static int N(n nVar) {
        int i;
        int parseInt = Integer.parseInt("3");
        String a2 = nVar.a();
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

    public static void O(Context context, long j) {
        if (!x.c(context, SyncMailsService.class)) {
            m.b("App", "SyncMailsService component disabled");
            return;
        }
        GcmNetworkManager b2 = GcmNetworkManager.b(context);
        if (GoogleApiAvailability.q().i(context) == 0) {
            String str = f13114a;
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

    public static boolean P(Context context) {
        return TextUtils.isEmpty(s.L(context));
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

    static /* synthetic */ int T(EmailAddressTable emailAddressTable, EmailAddressTable emailAddressTable2) {
        Long startTime = emailAddressTable.getStartTime();
        Long startTime2 = emailAddressTable2.getStartTime();
        if (startTime == null || startTime2 == null) {
            return 0;
        }
        return startTime2.compareTo(startTime);
    }

    public static void U(Activity activity, EmailTable emailTable) {
        x.A(activity, activity.getString(R.string.temp_email_address_link, new Object[]{x.m(activity), f.h(emailTable.getEmailAddress().getBytes(), true)}));
    }

    public static void V(h hVar) {
        q.d(hVar, b.f13141f.intValue(), hVar.getString(R.string.app_name), hVar.getString(R.string.premium_trial_expired_now_on_free));
        s.s0(hVar, (String) null);
        s.f0(hVar, (String) null);
        Y(hVar);
    }

    public static EmailAddressTable W(h hVar, m mVar, o oVar, boolean z, String str, String str2) {
        EmailAddressTable emailAddressTable = new EmailAddressTable(str, str.replace(str2, ""), str2, Boolean.TRUE);
        r.a(hVar, emailAddressTable, Calendar.getInstance().getTimeInMillis(), p());
        if (z) {
            g.d(hVar.G0(), emailAddressTable);
        } else {
            r.g(hVar.G0(), emailAddressTable);
        }
        mVar.v(emailAddressTable);
        oVar.U();
        Toast.makeText(hVar, R.string.message_mailbox_added, 1).show();
        return emailAddressTable;
    }

    public static void X(h hVar) {
        q.d(hVar, b.f13141f.intValue(), hVar.getString(R.string.app_name), hVar.getString(R.string.premium_trial_expired_now_on_free));
        s.s0(hVar, (String) null);
        Y(hVar);
    }

    public static void Y(h hVar) {
        s.d0(hVar, 0);
        c.c().k(new com.tempmail.u.e.c());
        g.D(hVar.G0());
    }

    public static void Z(h hVar, ApiError apiError, String str, String str2) {
        String str3 = f13114a;
        m.b(str3, "processServerError " + str2 + " api error " + apiError.getCode() + "api error message " + apiError.getMessage());
        int intValue = apiError.getCode().intValue();
        if (hVar != null) {
            d.i(hVar, hVar.I0(), str, str2, apiError.getMessage(), apiError.getCode().intValue());
        }
        if (intValue != -32603) {
            if (intValue == -1) {
                hVar.N0(apiError.getMessage());
            } else if (intValue != 4090) {
                if (intValue != 4000) {
                    if (intValue == 4001) {
                        V(hVar);
                        return;
                    } else if (intValue != 4030) {
                        if (intValue != 4031) {
                            if (hVar != null && !P(hVar)) {
                                hVar.N0(apiError.getMessage());
                                return;
                            }
                            return;
                        } else if (hVar != null) {
                            hVar.N0(hVar.getString(R.string.error_access_denied));
                            return;
                        } else {
                            return;
                        }
                    }
                }
                X(hVar);
            } else if (hVar != null) {
                hVar.N0(hVar.getString(R.string.error_email_address_busy));
            }
        } else if (hVar != null) {
            hVar.N0(hVar.getString(R.string.error_internal_error));
        }
    }

    public static void a(Context context) {
        GcmNetworkManager.b(context).a("periodic_email_sync", SyncMailsService.class);
    }

    public static void a0(Context context, Map<String, List<ExtendedMail>> map) {
        long A = A(map);
        String str = f13114a;
        m.b(str, "newLastCheck " + A);
        if (A != 0) {
            s.d0(context, A);
        }
    }

    private static void b(Context context, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            x.b(context, GetEmailsPeriodicService.class, z);
            x.b(context, NetworkChangeService.class, true);
        }
        if (z) {
            c0(context);
            x.b(context, SyncMailsService.class, true);
            O(context, 60);
            return;
        }
        a(context);
        x.b(context, SyncMailsService.class, false);
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
        if (P(context)) {
            b(context, z);
            d(context, false);
            return;
        }
        b(context, false);
        d(context, z);
    }

    public static void c0(Context context) {
        if (Build.VERSION.SDK_INT >= 21 && !x.c(context, GetEmailsPeriodicService.class)) {
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

    public static boolean e(DaoSession daoSession, List<EmailAddressTable> list, List<String> list2) {
        return h(list2, g(daoSession, list));
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

    public static boolean f(Context context, DaoSession daoSession, List<String> list) {
        List<String> f0 = f0(list);
        if (f0.isEmpty()) {
            Toast.makeText(context, R.string.message_no_domains, 1).show();
        }
        m.b(f13114a, "checkEmails");
        List<EmailAddressTable> y = g.y(daoSession);
        String str = f13114a;
        m.b(str, "emailAddressTableList size" + y.size());
        if (y.isEmpty()) {
            k(context, daoSession, f0);
            return true;
        } else if (!P(context)) {
            return true;
        } else {
            if (!Q()) {
                return e(daoSession, y, f0);
            }
            if (g.s(daoSession).isExpired()) {
                return true;
            }
            m.b(f13114a, "checkEmails checkDefaultEmailValid");
            return e(daoSession, y, f0);
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

    public static EmailAddressTable g(DaoSession daoSession, List<EmailAddressTable> list) {
        EmailAddressTable s = g.s(daoSession);
        if (s != null) {
            return s;
        }
        EmailAddressTable emailAddressTable = list.get(0);
        emailAddressTable.setIsDefault(Boolean.TRUE);
        g.J(daoSession, emailAddressTable);
        return emailAddressTable;
    }

    public static boolean h(List<String> list, EmailAddressTable emailAddressTable) {
        String str = f13114a;
        m.b(str, "checkIfDomainValid " + emailAddressTable.getDomain());
        return list.contains(emailAddressTable.getDomain());
    }

    public static boolean i(Integer num) {
        return num.equals(4001) || num.equals(4030) || num.equals(4000);
    }

    public static void j(Context context, String str) {
        try {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(context.getString(R.string.message_copy_clipboard_title), str));
        } catch (SecurityException e2) {
            e2.printStackTrace();
            Toast.makeText(context, "Not allowed to perform \"Copy\" to clipboard", 1).show();
        }
        Toast.makeText(context, R.string.message_address_copied, 1).show();
    }

    public static void k(Context context, DaoSession daoSession, List<String> list) {
        m.b(f13114a, "createFirstEmail");
        EmailAddressTable m = m(list, (String) null);
        m.setIsDefault(Boolean.TRUE);
        r.a(context, m, Calendar.getInstance().getTimeInMillis(), p());
        g.c(daoSession, m);
    }

    public static boolean l(Context context, DaoSession daoSession, Map<String, List<ExtendedMail>> map, boolean z) {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            arrayList.add(str);
            if (x.w((CharSequence) next.getKey())) {
                com.tempmail.u.c F = x.F(str);
                if (F != null) {
                    EmailAddressTable emailAddressTable = new EmailAddressTable(str, F.b(), F.a(), Boolean.valueOf(z3));
                    boolean e2 = g.e(daoSession, emailAddressTable);
                    String str2 = f13114a;
                    m.b(str2, "email " + emailAddressTable.getFullEmailAddress() + " isAdded " + e2);
                    if (e2) {
                        m.b(f13114a, "isHaveNewMailboxes = true");
                        z4 = true;
                    }
                    int d2 = r.d(daoSession, (String) next.getKey(), (List) next.getValue());
                    if (d2 > 0) {
                        d.e(context, instance, d2);
                        z2 = true;
                    }
                    z3 = false;
                } else {
                    Toast.makeText(context, R.string.message_something_going_wrong, 1).show();
                }
            }
        }
        if (!P(context)) {
            g.j(daoSession, arrayList);
        }
        if (g.s(daoSession) == null) {
            g.g(daoSession, g.y(daoSession).get(0));
        }
        if (z2 && z) {
            q.f(context);
        }
        String str3 = f13114a;
        m.b(str3, "isHaveNewMailboxes last " + z4);
        return z4;
    }

    public static EmailAddressTable m(List<String> list, String str) {
        if (str == null) {
            str = android.org.apache.commons.lang3.b.e(5, 8).toLowerCase();
        }
        int length = 10 - str.length();
        m.b(f13114a, "numeric count " + length);
        String f2 = android.org.apache.commons.lang3.b.f(length);
        m.b(f13114a, "generatedNumeric " + f2);
        String str2 = str + f2;
        int i = 0;
        try {
            i = x.e(list.size(), 0);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        String str3 = list.get(i);
        return new EmailAddressTable(str2 + str3, str2, str3, Boolean.FALSE);
    }

    public static int n(Context context, DaoSession daoSession, EmailAddressTable emailAddressTable) {
        return g.z(daoSession, emailAddressTable, I(context)).size();
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

    public static int q(Context context, DaoSession daoSession) {
        return (int) g.B(daoSession, g.s(daoSession), I(context));
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
                return new String(f.c(queryParameter), StandardCharsets.UTF_8);
            }
            return null;
        } catch (Base64DecoderException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static long t(long j, long j2) {
        return j + j2;
    }

    public static int u(Context context, DaoSession daoSession, EmailAddressTable emailAddressTable) {
        return (int) g.B(daoSession, emailAddressTable, I(context));
    }

    public static List<EmailAddressTable> v(Context context, List<EmailAddressTable> list) {
        f.f();
        int a2 = i.a(context);
        return list.size() > a2 ? list.subList(0, a2) : list;
    }

    public static String w(List<MailHtmlTable> list) {
        StringBuilder sb = new StringBuilder();
        for (MailHtmlTable text : list) {
            sb.append(text.getText());
        }
        return sb.toString();
    }

    public static boolean x(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static List<EmailAddressTable> y(Context context, List<EmailAddressTable> list) {
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
