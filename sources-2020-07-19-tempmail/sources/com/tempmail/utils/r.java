package com.tempmail.utils;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.db.DomainTable;
import com.tempmail.db.c;
import com.tempmail.db.e;
import com.tempmail.t.e.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SaveLogicUtils */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12589a = "r";

    public static e a(Context context, e eVar, long j, long j2) {
        eVar.H(Long.valueOf(j));
        eVar.B(Long.valueOf(j2));
        if (s.S(context)) {
            q.b(context, j2, eVar.p());
        }
        return eVar;
    }

    public static void b(Context context, c cVar, String str, List<ExtendedMail> list) {
        int d2 = d(cVar, str, list);
        if (d2 > 0) {
            org.greenrobot.eventbus.c.c().k(new a());
            q.f(context);
            d.c(context, FirebaseAnalytics.getInstance(context), d2);
        }
    }

    public static void c(c cVar, List<DomainExpired> list) {
        List<DomainExpired> e0 = e.e0(list);
        ArrayList arrayList = new ArrayList();
        for (DomainExpired next : e0) {
            arrayList.add(new DomainTable(next.getDomain(), next.getExp()));
        }
        g.b(cVar, arrayList);
    }

    public static int d(c cVar, String str, List<ExtendedMail> list) {
        int i = 0;
        if (list == null) {
            return 0;
        }
        for (ExtendedMail f2 : list) {
            if (g.f(cVar, str, f2)) {
                i++;
            }
        }
        return i;
    }

    public static boolean e(c cVar, e eVar, e eVar2) {
        e t = g.t(cVar);
        String str = eVar2.n() + eVar2.k();
        m.b(f12589a, "fullEmailAddress new " + str);
        m.b(f12589a, "fullEmailAddress old " + eVar.p());
        m.b(f12589a, "fullEmailAddress not equals " + str.equals(eVar.p()));
        if (str.equals(eVar.p())) {
            return false;
        }
        eVar.x(eVar2.k());
        eVar.A(eVar2.n());
        eVar.D(str);
        if (t == null) {
            eVar.G(Boolean.TRUE);
        }
        g.G(cVar, eVar);
        g.L(cVar, eVar);
        return true;
    }

    public static boolean f(c cVar, List<String> list, e eVar) {
        return e(cVar, eVar, e.m(list, (String) null));
    }

    public static boolean g(c cVar, e eVar) {
        return e(cVar, g.t(cVar), eVar);
    }
}
