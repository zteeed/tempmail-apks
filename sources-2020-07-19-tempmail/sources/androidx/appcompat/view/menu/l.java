package androidx.appcompat.view.menu;

import a.h.k.b;
import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;

/* compiled from: MenuItemWrapperJB */
class l extends k {

    /* compiled from: MenuItemWrapperJB */
    class a extends k.a implements ActionProvider.VisibilityListener {

        /* renamed from: e  reason: collision with root package name */
        b.C0013b f872e;

        public a(l lVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f867c.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.f867c.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.f867c.overridesItemVisibility();
        }

        public void j(b.C0013b bVar) {
            this.f872e = bVar;
            this.f867c.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            b.C0013b bVar = this.f872e;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    l(Context context, a.h.f.a.b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    public k.a h(ActionProvider actionProvider) {
        return new a(this, this.f819b, actionProvider);
    }
}
