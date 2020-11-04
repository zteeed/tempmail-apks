package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* compiled from: NotificationCompat */
public class g {

    /* compiled from: NotificationCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f1272a;

        /* renamed from: b  reason: collision with root package name */
        private final j[] f1273b;

        /* renamed from: c  reason: collision with root package name */
        private final j[] f1274c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1275d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1276e;

        /* renamed from: f  reason: collision with root package name */
        private final int f1277f;
        public int g;
        public CharSequence h;
        public PendingIntent i;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2, charSequence, pendingIntent, new Bundle(), (j[]) null, (j[]) null, true, 0, true);
        }

        public PendingIntent a() {
            return this.i;
        }

        public boolean b() {
            return this.f1275d;
        }

        public j[] c() {
            return this.f1274c;
        }

        public Bundle d() {
            return this.f1272a;
        }

        public int e() {
            return this.g;
        }

        public j[] f() {
            return this.f1273b;
        }

        public int g() {
            return this.f1277f;
        }

        public boolean h() {
            return this.f1276e;
        }

        public CharSequence i() {
            return this.h;
        }

        a(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, j[] jVarArr, j[] jVarArr2, boolean z, int i3, boolean z2) {
            this.f1276e = true;
            this.g = i2;
            this.h = d.d(charSequence);
            this.i = pendingIntent;
            this.f1272a = bundle == null ? new Bundle() : bundle;
            this.f1273b = jVarArr;
            this.f1274c = jVarArr2;
            this.f1275d = z;
            this.f1277f = i3;
            this.f1276e = z2;
        }
    }

    /* compiled from: NotificationCompat */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f1278e;

        /* renamed from: f  reason: collision with root package name */
        private Bitmap f1279f;
        private boolean g;

        public void b(f fVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(fVar.a()).setBigContentTitle(this.f1288b).bigPicture(this.f1278e);
                if (this.g) {
                    bigPicture.bigLargeIcon(this.f1279f);
                }
                if (this.f1290d) {
                    bigPicture.setSummaryText(this.f1289c);
                }
            }
        }

        public b g(Bitmap bitmap) {
            this.f1279f = bitmap;
            this.g = true;
            return this;
        }

        public b h(Bitmap bitmap) {
            this.f1278e = bitmap;
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static class c extends e {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f1280e;

        public void b(f fVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(fVar.a()).setBigContentTitle(this.f1288b).bigText(this.f1280e);
                if (this.f1290d) {
                    bigText.setSummaryText(this.f1289c);
                }
            }
        }

        public c g(CharSequence charSequence) {
            this.f1280e = d.d(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        protected d f1287a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f1288b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f1289c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1290d = false;

        public void a(Bundle bundle) {
        }

        public abstract void b(f fVar);

        public RemoteViews c(f fVar) {
            return null;
        }

        public RemoteViews d(f fVar) {
            return null;
        }

        public RemoteViews e(f fVar) {
            return null;
        }

        public void f(d dVar) {
            if (this.f1287a != dVar) {
                this.f1287a = dVar;
                if (dVar != null) {
                    dVar.w(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return i.c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat */
    public static class d {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        Notification N;
        @Deprecated
        public ArrayList<String> O;

        /* renamed from: a  reason: collision with root package name */
        public Context f1281a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1282b;

        /* renamed from: c  reason: collision with root package name */
        ArrayList<a> f1283c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f1284d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f1285e;

        /* renamed from: f  reason: collision with root package name */
        PendingIntent f1286f;
        PendingIntent g;
        RemoteViews h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        e o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        public d(Context context, String str) {
            this.f1282b = new ArrayList<>();
            this.f1283c = new ArrayList<>();
            this.m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            Notification notification = new Notification();
            this.N = notification;
            this.f1281a = context;
            this.I = str;
            notification.when = System.currentTimeMillis();
            this.N.audioStreamType = -1;
            this.l = 0;
            this.O = new ArrayList<>();
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1281a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.h.b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.h.b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        private void n(int i2, boolean z2) {
            if (z2) {
                Notification notification = this.N;
                notification.flags = i2 | notification.flags;
                return;
            }
            Notification notification2 = this.N;
            notification2.flags = (~i2) & notification2.flags;
        }

        public d A(long j2) {
            this.N.when = j2;
            return this;
        }

        public d a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1282b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new h(this).c();
        }

        public Bundle c() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public d f(boolean z2) {
            n(16, z2);
            return this;
        }

        public d g(String str) {
            this.I = str;
            return this;
        }

        public d h(int i2) {
            this.C = i2;
            return this;
        }

        public d i(PendingIntent pendingIntent) {
            this.f1286f = pendingIntent;
            return this;
        }

        public d j(CharSequence charSequence) {
            this.f1285e = d(charSequence);
            return this;
        }

        public d k(CharSequence charSequence) {
            this.f1284d = d(charSequence);
            return this;
        }

        public d l(int i2) {
            Notification notification = this.N;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public d m(PendingIntent pendingIntent) {
            this.N.deleteIntent = pendingIntent;
            return this;
        }

        public d o(Bitmap bitmap) {
            this.i = e(bitmap);
            return this;
        }

        public d p(int i2, int i3, int i4) {
            Notification notification = this.N;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            int i5 = (i3 == 0 || i4 == 0) ? 0 : 1;
            Notification notification2 = this.N;
            notification2.flags = i5 | (notification2.flags & -2);
            return this;
        }

        public d q(boolean z2) {
            this.x = z2;
            return this;
        }

        public d r(int i2) {
            this.k = i2;
            return this;
        }

        public d s(int i2) {
            this.l = i2;
            return this;
        }

        public d t(boolean z2) {
            this.m = z2;
            return this;
        }

        public d u(int i2) {
            this.N.icon = i2;
            return this;
        }

        public d v(Uri uri) {
            Notification notification = this.N;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public d w(e eVar) {
            if (this.o != eVar) {
                this.o = eVar;
                if (eVar != null) {
                    eVar.f(this);
                }
            }
            return this;
        }

        public d x(CharSequence charSequence) {
            this.N.tickerText = d(charSequence);
            return this;
        }

        public d y(long[] jArr) {
            this.N.vibrate = jArr;
            return this;
        }

        public d z(int i2) {
            this.D = i2;
            return this;
        }

        @Deprecated
        public d(Context context) {
            this(context, (String) null);
        }
    }
}
