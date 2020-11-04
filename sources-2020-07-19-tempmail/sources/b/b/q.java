package b.b;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import b.b.b;

final class q {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final q f2067a = new q();
    }

    q() {
    }

    private static boolean a(Context context, String[] strArr) {
        for (String a2 : strArr) {
            if (b.a.C0058a.a(context, a2)) {
                return true;
            }
        }
        return false;
    }

    static Location b(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            Location lastKnownLocation = a(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? locationManager.getLastKnownLocation("network") : null;
            Location lastKnownLocation2 = a(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? locationManager.getLastKnownLocation("gps") : null;
            if (lastKnownLocation2 == null && lastKnownLocation == null) {
                lastKnownLocation = null;
            } else if (lastKnownLocation2 != null || lastKnownLocation == null) {
                if ((lastKnownLocation == null && lastKnownLocation2 != null) || 60000 >= lastKnownLocation.getTime() - lastKnownLocation2.getTime()) {
                    lastKnownLocation = lastKnownLocation2;
                }
            }
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
