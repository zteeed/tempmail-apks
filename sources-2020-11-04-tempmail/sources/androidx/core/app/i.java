package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: NotificationCompatJellybean */
class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1324a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Field f1325b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1326c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    static Bundle b(g.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", aVar.e());
        bundle2.putCharSequence("title", aVar.i());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", e(aVar.f()));
        bundle2.putBoolean("showsUserInterface", aVar.h());
        bundle2.putInt("semanticAction", aVar.g());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (f1324a) {
            if (f1326c) {
                return null;
            }
            try {
                if (f1325b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1326c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1325b = declaredField;
                }
                Bundle bundle = (Bundle) f1325b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1325b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f1326c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                Log.e("NotificationCompat", "Unable to access notification extras", e3);
                f1326c = true;
                return null;
            }
        }
    }

    private static Bundle d(j jVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", jVar.h());
        bundle.putCharSequence("label", jVar.g());
        bundle.putCharSequenceArray("choices", jVar.e());
        bundle.putBoolean("allowFreeFormInput", jVar.c());
        bundle.putBundle("extras", jVar.f());
        Set<String> d2 = jVar.d();
        if (d2 != null && !d2.isEmpty()) {
            ArrayList arrayList = new ArrayList(d2.size());
            for (String add : d2) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] e(j[] jVarArr) {
        if (jVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[jVarArr.length];
        for (int i = 0; i < jVarArr.length; i++) {
            bundleArr[i] = d(jVarArr[i]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, g.a aVar) {
        builder.addAction(aVar.e(), aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
