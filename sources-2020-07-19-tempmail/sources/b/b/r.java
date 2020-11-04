package b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

final class r {

    /* renamed from: a  reason: collision with root package name */
    private IntentFilter f2068a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final r f2069a = new r();
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final float f2070a;

        /* renamed from: b  reason: collision with root package name */
        private final String f2071b;

        b(float f2, String str) {
            this.f2070a = f2;
            this.f2071b = str;
        }

        /* access modifiers changed from: package-private */
        public final String a() {
            return this.f2071b;
        }

        /* access modifiers changed from: package-private */
        public final float b() {
            return this.f2070a;
        }
    }

    r() {
    }

    /* access modifiers changed from: package-private */
    public final b a(Context context) {
        String str = null;
        float f2 = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, this.f2068a);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f2 = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new b(f2, str);
    }
}
