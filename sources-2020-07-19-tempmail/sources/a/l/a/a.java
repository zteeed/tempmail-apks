package a.l.a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* compiled from: WakefulBroadcastReceiver */
public abstract class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f462a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static int f463b = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f462a) {
            PowerManager.WakeLock wakeLock = f462a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f462a.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f462a) {
            int i = f463b;
            int i2 = f463b + 1;
            f463b = i2;
            if (i2 <= 0) {
                f463b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f462a.put(i, newWakeLock);
            return startService;
        }
    }
}
