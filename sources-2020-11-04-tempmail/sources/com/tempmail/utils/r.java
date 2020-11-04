package com.tempmail.utils;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.db.DaoSession;
import com.tempmail.db.DomainTable;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.u.e.a;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.c;

/* compiled from: SaveLogicUtils */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13133a = "r";

    public static EmailAddressTable a(Context context, EmailAddressTable emailAddressTable, long j, long j2) {
        emailAddressTable.setStartTime(Long.valueOf(j));
        emailAddressTable.setEndTime(Long.valueOf(j2));
        if (s.T(context)) {
            q.b(context, j2, emailAddressTable.getFullEmailAddress());
        }
        return emailAddressTable;
    }

    public static void b(Context context, DaoSession daoSession, String str, List<ExtendedMail> list) {
        int d2 = d(daoSession, str, list);
        if (d2 > 0) {
            c.c().k(new a());
            q.f(context);
            d.e(context, FirebaseAnalytics.getInstance(context), d2);
        }
    }

    public static void c(DaoSession daoSession, List<DomainExpired> list) {
        List<DomainExpired> e0 = e.e0(list);
        ArrayList arrayList = new ArrayList();
        for (DomainExpired next : e0) {
            arrayList.add(new DomainTable(next.getDomain(), next.getExp()));
        }
        g.b(daoSession, arrayList);
    }

    public static int d(DaoSession daoSession, String str, List<ExtendedMail> list) {
        int i = 0;
        if (list == null) {
            return 0;
        }
        for (ExtendedMail f2 : list) {
            if (g.f(daoSession, str, f2)) {
                i++;
            }
        }
        return i;
    }

    public static boolean e(DaoSession daoSession, EmailAddressTable emailAddressTable, EmailAddressTable emailAddressTable2) {
        EmailAddressTable s = g.s(daoSession);
        String str = emailAddressTable2.getEmailPrefix() + emailAddressTable2.getDomain();
        m.b(f13133a, "fullEmailAddress new " + str);
        m.b(f13133a, "fullEmailAddress old " + emailAddressTable.getFullEmailAddress());
        m.b(f13133a, "fullEmailAddress not equals " + str.equals(emailAddressTable.getFullEmailAddress()));
        if (str.equals(emailAddressTable.getFullEmailAddress())) {
            return false;
        }
        emailAddressTable.setDomain(emailAddressTable2.getDomain());
        emailAddressTable.setEmailPrefix(emailAddressTable2.getEmailPrefix());
        emailAddressTable.setFullEmailAddress(str);
        if (s == null) {
            emailAddressTable.setIsDefault(Boolean.TRUE);
        }
        g.E(daoSession, emailAddressTable);
        g.J(daoSession, emailAddressTable);
        return true;
    }

    public static boolean f(DaoSession daoSession, List<String> list, EmailAddressTable emailAddressTable) {
        return e(daoSession, emailAddressTable, e.m(list, (String) null));
    }

    public static boolean g(DaoSession daoSession, EmailAddressTable emailAddressTable) {
        return e(daoSession, g.s(daoSession), emailAddressTable);
    }
}
