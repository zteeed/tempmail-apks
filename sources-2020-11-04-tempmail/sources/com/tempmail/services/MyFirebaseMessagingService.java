package com.tempmail.services;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tempmail.R;
import com.tempmail.db.DaoMaster;
import com.tempmail.db.DaoSession;
import com.tempmail.db.DbOpenHelper;
import com.tempmail.utils.e;
import com.tempmail.utils.m;
import com.tempmail.utils.q;
import com.tempmail.utils.s;
import com.tempmail.utils.y.b;
import java.util.Map;
import org.greenrobot.eventbus.c;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String k = MyFirebaseMessagingService.class.getSimpleName();
    public DaoMaster h;
    public DaoSession i;
    public SQLiteDatabase j;

    private void o() {
        SQLiteDatabase writableDatabase = new DbOpenHelper(this, b.f13137b).getWritableDatabase();
        this.j = writableDatabase;
        DaoMaster daoMaster = new DaoMaster(writableDatabase);
        this.h = daoMaster;
        this.i = daoMaster.newSession();
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
            c.c().k(new com.tempmail.u.e.b());
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
        s.o0(this, str);
        m.b(k, "onNewToken");
    }

    public void m() {
        DaoSession daoSession = this.i;
        if (daoSession != null) {
            daoSession.clear();
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
