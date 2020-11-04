package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: b  reason: collision with root package name */
    int f1943b = 0;

    /* renamed from: c  reason: collision with root package name */
    final HashMap<Integer, String> f1944c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    final RemoteCallbackList<a> f1945d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final b.a f1946e = new b();

    class a extends RemoteCallbackList<a> {
        a() {
        }

        /* renamed from: a */
        public void onCallbackDied(a aVar, Object obj) {
            MultiInstanceInvalidationService.this.f1944c.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends b.a {
        b() {
        }

        public void D6(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f1945d) {
                String str = MultiInstanceInvalidationService.this.f1944c.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f1945d.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f1945d.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f1944c.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f1945d.getBroadcastItem(i2).x1(strArr);
                        }
                    } catch (RemoteException e2) {
                        Log.w("ROOM", "Error invoking a remote callback", e2);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f1945d.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f1945d.finishBroadcast();
            }
        }

        public void S6(a aVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f1945d) {
                MultiInstanceInvalidationService.this.f1945d.unregister(aVar);
                MultiInstanceInvalidationService.this.f1944c.remove(Integer.valueOf(i));
            }
        }

        public int f2(a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f1945d) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f1943b + 1;
                multiInstanceInvalidationService.f1943b = i;
                if (MultiInstanceInvalidationService.this.f1945d.register(aVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f1944c.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f1943b--;
                return 0;
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f1946e;
    }
}
