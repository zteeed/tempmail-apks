package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder */
public final class l implements Iterable<Intent> {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Intent> f1300b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f1301c;

    /* compiled from: TaskStackBuilder */
    public interface a {
        Intent A();
    }

    private l(Context context) {
        this.f1301c = context;
    }

    public static l j(Context context) {
        return new l(context);
    }

    public l c(Intent intent) {
        this.f1300b.add(intent);
        return this;
    }

    public l h(Activity activity) {
        Intent A = activity instanceof a ? ((a) activity).A() : null;
        if (A == null) {
            A = e.a(activity);
        }
        if (A != null) {
            ComponentName component = A.getComponent();
            if (component == null) {
                component = A.resolveActivity(this.f1301c.getPackageManager());
            }
            i(component);
            c(A);
        }
        return this;
    }

    public l i(ComponentName componentName) {
        int size = this.f1300b.size();
        try {
            Intent b2 = e.b(this.f1301c, componentName);
            while (b2 != null) {
                this.f1300b.add(size, b2);
                b2 = e.b(this.f1301c, b2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1300b.iterator();
    }

    public PendingIntent l(int i, int i2) {
        return m(i, i2, (Bundle) null);
    }

    public PendingIntent m(int i, int i2, Bundle bundle) {
        if (!this.f1300b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1300b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (Build.VERSION.SDK_INT >= 16) {
                return PendingIntent.getActivities(this.f1301c, i, intentArr, i2, bundle);
            }
            return PendingIntent.getActivities(this.f1301c, i, intentArr, i2);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public void q() {
        s((Bundle) null);
    }

    public void s(Bundle bundle) {
        if (!this.f1300b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1300b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.k(this.f1301c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1301c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
