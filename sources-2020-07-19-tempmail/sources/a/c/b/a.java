package a.c.b;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.c;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f96a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f97b;

    /* renamed from: a.c.b.a$a  reason: collision with other inner class name */
    /* compiled from: CustomTabsIntent */
    public static final class C0004a {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f98a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<Bundle> f99b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f100c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<Bundle> f101d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f102e;

        public C0004a() {
            this((b) null);
        }

        public a a() {
            ArrayList<Bundle> arrayList = this.f99b;
            if (arrayList != null) {
                this.f98a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f101d;
            if (arrayList2 != null) {
                this.f98a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f98a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f102e);
            return new a(this.f98a, this.f100c);
        }

        public C0004a(b bVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f98a = intent;
            IBinder iBinder = null;
            this.f99b = null;
            this.f100c = null;
            this.f101d = null;
            this.f102e = true;
            if (bVar != null) {
                intent.setPackage(bVar.b().getPackageName());
            }
            Bundle bundle = new Bundle();
            c.b(bundle, "android.support.customtabs.extra.SESSION", bVar != null ? bVar.a() : iBinder);
            this.f98a.putExtras(bundle);
        }
    }

    a(Intent intent, Bundle bundle) {
        this.f96a = intent;
        this.f97b = bundle;
    }
}
