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
    private final ArrayList<Intent> f1327b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f1328c;

    /* compiled from: TaskStackBuilder */
    public interface a {
        Intent z();
    }

    private l(Context context) {
        this.f1328c = context;
    }

    public static l j(Context context) {
        return new l(context);
    }

    public l c(Intent intent) {
        this.f1327b.add(intent);
        return this;
    }

    public l h(Activity activity) {
        Intent z = activity instanceof a ? ((a) activity).z() : null;
        if (z == null) {
            z = e.a(activity);
        }
        if (z != null) {
            ComponentName component = z.getComponent();
            if (component == null) {
                component = z.resolveActivity(this.f1328c.getPackageManager());
            }
            i(component);
            c(z);
        }
        return this;
    }

    public l i(ComponentName componentName) {
        int size = this.f1327b.size();
        try {
            Intent b2 = e.b(this.f1328c, componentName);
            while (b2 != null) {
                this.f1327b.add(size, b2);
                b2 = e.b(this.f1328c, b2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1327b.iterator();
    }

    public PendingIntent l(int i, int i2) {
        return m(i, i2, (Bundle) null);
    }

    public PendingIntent m(int i, int i2, Bundle bundle) {
        if (!this.f1327b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1327b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (Build.VERSION.SDK_INT >= 16) {
                return PendingIntent.getActivities(this.f1328c, i, intentArr, i2, bundle);
            }
            return PendingIntent.getActivities(this.f1328c, i, intentArr, i2);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public void q() {
        s((Bundle) null);
    }

    public void s(Bundle bundle) {
        if (!this.f1327b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1327b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.k(this.f1328c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1328c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
