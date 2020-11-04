package b.b;

import android.os.Bundle;
import b.b.p;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.InstanceIDListenerService;

public class m extends InstanceIDListenerService {
    public void c() {
        super.c();
        String g = j.b().g("gcmProjectNumber");
        long currentTimeMillis = System.currentTimeMillis();
        String str = null;
        try {
            str = InstanceID.b(getApplicationContext()).e(g, "GCM", (Bundle) null);
        } catch (Throwable th) {
            e.b("Error registering for uninstall tracking", th);
        }
        if (str != null) {
            e.c("GCM Refreshed Token = ".concat(String.valueOf(str)));
            p.a.C0059a c2 = p.a.C0059a.c(j.b().g("afUninstallToken"));
            p.a.C0059a aVar = new p.a.C0059a(currentTimeMillis, str);
            if (c2.e(aVar)) {
                j0.e(getApplicationContext(), aVar);
            }
        }
    }
}
