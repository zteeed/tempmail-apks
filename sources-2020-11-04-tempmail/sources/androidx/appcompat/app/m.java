package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.b;
import java.util.Calendar;

/* compiled from: TwilightManager */
class m {

    /* renamed from: d  reason: collision with root package name */
    private static m f803d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f804a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f805b;

    /* renamed from: c  reason: collision with root package name */
    private final a f806c = new a();

    /* compiled from: TwilightManager */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f807a;

        /* renamed from: b  reason: collision with root package name */
        long f808b;

        /* renamed from: c  reason: collision with root package name */
        long f809c;

        /* renamed from: d  reason: collision with root package name */
        long f810d;

        /* renamed from: e  reason: collision with root package name */
        long f811e;

        /* renamed from: f  reason: collision with root package name */
        long f812f;

        a() {
        }
    }

    m(Context context, LocationManager locationManager) {
        this.f804a = context;
        this.f805b = locationManager;
    }

    static m a(Context context) {
        if (f803d == null) {
            Context applicationContext = context.getApplicationContext();
            f803d = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f803d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c2 = b.b(this.f804a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (b.b(this.f804a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c2 == null) ? location != null ? location : c2 : location.getTime() > c2.getTime() ? location : c2;
    }

    private Location c(String str) {
        try {
            if (this.f805b.isProviderEnabled(str)) {
                return this.f805b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f806c.f812f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.f806c;
        long currentTimeMillis = System.currentTimeMillis();
        l b2 = l.b();
        l lVar = b2;
        lVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b2.f800a;
        lVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.f802c == 1;
        long j3 = b2.f801b;
        long j4 = j2;
        long j5 = b2.f800a;
        long j6 = j3;
        boolean z2 = z;
        b2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b2.f801b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f807a = z2;
        aVar.f808b = j4;
        aVar.f809c = j6;
        aVar.f810d = j5;
        aVar.f811e = j7;
        aVar.f812f = j;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f806c;
        if (e()) {
            return aVar.f807a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return aVar.f807a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
