package a.c.b;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.c;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f97a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f98b;

    /* renamed from: a.c.b.a$a  reason: collision with other inner class name */
    /* compiled from: CustomTabsIntent */
    public static final class C0004a {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f99a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<Bundle> f100b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f101c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<Bundle> f102d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f103e;

        public C0004a() {
            this((b) null);
        }

        public a a() {
            ArrayList<Bundle> arrayList = this.f100b;
            if (arrayList != null) {
                this.f99a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f102d;
            if (arrayList2 != null) {
                this.f99a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f99a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f103e);
            return new a(this.f99a, this.f101c);
        }

        public C0004a(b bVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f99a = intent;
            IBinder iBinder = null;
            this.f100b = null;
            this.f101c = null;
            this.f102d = null;
            this.f103e = true;
            if (bVar != null) {
                intent.setPackage(bVar.b().getPackageName());
            }
            Bundle bundle = new Bundle();
            c.b(bundle, "android.support.customtabs.extra.SESSION", bVar != null ? bVar.a() : iBinder);
            this.f99a.putExtras(bundle);
        }
    }

    a(Intent intent, Bundle bundle) {
        this.f97a = intent;
        this.f98b = bundle;
    }
}
