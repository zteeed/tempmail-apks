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
    private static m f776d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f777a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f778b;

    /* renamed from: c  reason: collision with root package name */
    private final a f779c = new a();

    /* compiled from: TwilightManager */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f780a;

        /* renamed from: b  reason: collision with root package name */
        long f781b;

        /* renamed from: c  reason: collision with root package name */
        long f782c;

        /* renamed from: d  reason: collision with root package name */
        long f783d;

        /* renamed from: e  reason: collision with root package name */
        long f784e;

        /* renamed from: f  reason: collision with root package name */
        long f785f;

        a() {
        }
    }

    m(Context context, LocationManager locationManager) {
        this.f777a = context;
        this.f778b = locationManager;
    }

    static m a(Context context) {
        if (f776d == null) {
            Context applicationContext = context.getApplicationContext();
            f776d = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f776d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c2 = b.b(this.f777a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (b.b(this.f777a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c2 == null) ? location != null ? location : c2 : location.getTime() > c2.getTime() ? location : c2;
    }

    private Location c(String str) {
        try {
            if (this.f778b.isProviderEnabled(str)) {
                return this.f778b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f779c.f785f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.f779c;
        long currentTimeMillis = System.currentTimeMillis();
        l b2 = l.b();
        l lVar = b2;
        lVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b2.f773a;
        lVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.f775c == 1;
        long j3 = b2.f774b;
        long j4 = j2;
        long j5 = b2.f773a;
        long j6 = j3;
        boolean z2 = z;
        b2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b2.f774b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f780a = z2;
        aVar.f781b = j4;
        aVar.f782c = j6;
        aVar.f783d = j5;
        aVar.f784e = j7;
        aVar.f785f = j;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f779c;
        if (e()) {
            return aVar.f780a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return aVar.f780a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
