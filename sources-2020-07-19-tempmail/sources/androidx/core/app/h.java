package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.g;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder */
class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Notification.Builder f1291a;

    /* renamed from: b  reason: collision with root package name */
    private final g.d f1292b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteViews f1293c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f1294d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Bundle> f1295e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f1296f = new Bundle();
    private int g;
    private RemoteViews h;

    h(g.d dVar) {
        ArrayList<String> arrayList;
        this.f1292b = dVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1291a = new Notification.Builder(dVar.f1281a, dVar.I);
        } else {
            this.f1291a = new Notification.Builder(dVar.f1281a);
        }
        Notification notification = dVar.N;
        this.f1291a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f1284d).setContentText(dVar.f1285e).setContentInfo(dVar.j).setContentIntent(dVar.f1286f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.g, (notification.flags & 128) != 0).setLargeIcon(dVar.i).setNumber(dVar.k).setProgress(dVar.r, dVar.s, dVar.t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f1291a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1291a.setSubText(dVar.p).setUsesChronometer(dVar.n).setPriority(dVar.l);
            Iterator<g.a> it = dVar.f1282b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = dVar.B;
            if (bundle != null) {
                this.f1296f.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.x) {
                    this.f1296f.putBoolean("android.support.localOnly", true);
                }
                String str = dVar.u;
                if (str != null) {
                    this.f1296f.putString("android.support.groupKey", str);
                    if (dVar.v) {
                        this.f1296f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f1296f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = dVar.w;
                if (str2 != null) {
                    this.f1296f.putString("android.support.sortKey", str2);
                }
            }
            this.f1293c = dVar.F;
            this.f1294d = dVar.G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1291a.setShowWhen(dVar.m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = dVar.O) != null && !arrayList.isEmpty()) {
                Bundle bundle2 = this.f1296f;
                ArrayList<String> arrayList2 = dVar.O;
                bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f1291a.setLocalOnly(dVar.x).setGroup(dVar.u).setGroupSummary(dVar.v).setSortKey(dVar.w);
            this.g = dVar.M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1291a.setCategory(dVar.A).setColor(dVar.C).setVisibility(dVar.D).setPublicVersion(dVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = dVar.O.iterator();
            while (it2.hasNext()) {
                this.f1291a.addPerson(it2.next());
            }
            this.h = dVar.H;
            if (dVar.f1283c.size() > 0) {
                Bundle bundle3 = dVar.c().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle();
                for (int i = 0; i < dVar.f1283c.size(); i++) {
                    bundle4.putBundle(Integer.toString(i), i.b(dVar.f1283c.get(i)));
                }
                bundle3.putBundle("invisible_actions", bundle4);
                dVar.c().putBundle("android.car.EXTENSIONS", bundle3);
                this.f1296f.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1291a.setExtras(dVar.B).setRemoteInputHistory(dVar.q);
            RemoteViews remoteViews = dVar.F;
            if (remoteViews != null) {
                this.f1291a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.G;
            if (remoteViews2 != null) {
                this.f1291a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.H;
            if (remoteViews3 != null) {
                this.f1291a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1291a.setBadgeIconType(dVar.J).setShortcutId(dVar.K).setTimeoutAfter(dVar.L).setGroupAlertBehavior(dVar.M);
            if (dVar.z) {
                this.f1291a.setColorized(dVar.y);
            }
            if (!TextUtils.isEmpty(dVar.I)) {
                this.f1291a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
    }

    private void b(g.a aVar) {
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.e(), aVar.i(), aVar.a());
            if (aVar.f() != null) {
                for (RemoteInput addRemoteInput : j.b(aVar.f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.d() != null) {
                bundle = new Bundle(aVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.g());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
            builder.addExtras(bundle);
            this.f1291a.addAction(builder.build());
        } else if (i >= 16) {
            this.f1295e.add(i.f(this.f1291a, aVar));
        }
    }

    private void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    public Notification.Builder a() {
        return this.f1291a;
    }

    public Notification c() {
        Bundle a2;
        RemoteViews e2;
        RemoteViews c2;
        g.e eVar = this.f1292b.o;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews d2 = eVar != null ? eVar.d(this) : null;
        Notification d3 = d();
        if (d2 != null) {
            d3.contentView = d2;
        } else {
            RemoteViews remoteViews = this.f1292b.F;
            if (remoteViews != null) {
                d3.contentView = remoteViews;
            }
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (c2 = eVar.c(this)) == null)) {
            d3.bigContentView = c2;
        }
        if (!(Build.VERSION.SDK_INT < 21 || eVar == null || (e2 = this.f1292b.o.e(this)) == null)) {
            d3.headsUpContentView = e2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (a2 = g.a(d3)) == null)) {
            eVar.a(a2);
        }
        return d3;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f1291a.build();
        }
        if (i >= 24) {
            Notification build = this.f1291a.build();
            if (this.g != 0) {
                if (!(build.getGroup() == null || (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.g != 2)) {
                    e(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.g == 1) {
                    e(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f1291a.setExtras(this.f1296f);
            Notification build2 = this.f1291a.build();
            RemoteViews remoteViews = this.f1293c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1294d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.g != 2)) {
                    e(build2);
                }
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.g == 1) {
                    e(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f1291a.setExtras(this.f1296f);
            Notification build3 = this.f1291a.build();
            RemoteViews remoteViews4 = this.f1293c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1294d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.g != 2)) {
                    e(build3);
                }
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.g == 1) {
                    e(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a2 = i.a(this.f1295e);
            if (a2 != null) {
                this.f1296f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.f1291a.setExtras(this.f1296f);
            Notification build4 = this.f1291a.build();
            RemoteViews remoteViews6 = this.f1293c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1294d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f1291a.getNotification();
        } else {
            Notification build5 = this.f1291a.build();
            Bundle a3 = g.a(build5);
            Bundle bundle = new Bundle(this.f1296f);
            for (String str : this.f1296f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = i.a(this.f1295e);
            if (a4 != null) {
                g.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.f1293c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f1294d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
