package com.tempmail.services;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tempmail.R;
import com.tempmail.db.b;
import com.tempmail.db.c;
import com.tempmail.db.d;
import com.tempmail.utils.e;
import com.tempmail.utils.m;
import com.tempmail.utils.q;
import com.tempmail.utils.s;
import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String k = MyFirebaseMessagingService.class.getSimpleName();
    public b h;
    public c i;
    public SQLiteDatabase j;

    private void o() {
        SQLiteDatabase writableDatabase = new d(this, com.tempmail.utils.y.b.f12595b).getWritableDatabase();
        this.j = writableDatabase;
        b bVar = new b(writableDatabase);
        this.h = bVar;
        this.i = bVar.c();
    }

    public void h() {
        super.h();
        m.b(k, "onDeletedMessages");
    }

    public void i(RemoteMessage remoteMessage) {
        String str;
        String str2 = k;
        m.b(str2, "From: " + remoteMessage.v());
        String str3 = k;
        m.b(str3, "To: " + remoteMessage.B());
        if (remoteMessage.u().size() > 0) {
            String str4 = k;
            m.b(str4, "Message data payload: " + remoteMessage.u());
            str = remoteMessage.u().get("url");
        } else {
            str = null;
        }
        if (remoteMessage.A() != null) {
            String a2 = remoteMessage.A().a();
            String c2 = remoteMessage.A().c();
            String str5 = k;
            m.b(str5, "Message Sound: " + remoteMessage.A().b());
            String str6 = k;
            m.b(str6, "Message Notification: " + remoteMessage.A().toString());
            String str7 = k;
            m.b(str7, "Message Notification Body: " + a2);
            String str8 = k;
            m.b(str8, "Message Notification title: " + c2);
            if (TextUtils.isEmpty(c2)) {
                c2 = getString(R.string.app_name);
            }
            if (!TextUtils.isEmpty(str)) {
                q.h(this, c2, a2, str);
            } else {
                q.g(this, a2);
            }
            n();
            org.greenrobot.eventbus.c.c().k(new com.tempmail.t.e.b());
        }
        if (remoteMessage.u() != null) {
            for (Map.Entry next : remoteMessage.u().entrySet()) {
                String str9 = k;
                m.b(str9, "Key " + ((String) next.getKey()) + " Value " + ((String) next.getValue()));
            }
        }
    }

    public void k(String str) {
        super.k(str);
        s.m0(this, str);
        m.b(k, "onNewToken");
    }

    public void m() {
        c cVar = this.i;
        if (cVar != null) {
            cVar.d();
        }
        SQLiteDatabase sQLiteDatabase = this.j;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        this.h = null;
    }

    public void n() {
        o();
        me.leolin.shortcutbadger.b.a(this, e.q(this, this.i));
    }

    public void onDestroy() {
        super.onDestroy();
        m();
    }
}
