package androidx.appcompat.view.menu;

import a.a.g;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.o;

/* compiled from: MenuDialogHelper */
class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, o.a {

    /* renamed from: b  reason: collision with root package name */
    private h f855b;

    /* renamed from: c  reason: collision with root package name */
    private d f856c;

    /* renamed from: d  reason: collision with root package name */
    f f857d;

    /* renamed from: e  reason: collision with root package name */
    private o.a f858e;

    public i(h hVar) {
        this.f855b = hVar;
    }

    public void a(h hVar, boolean z) {
        if (z || hVar == this.f855b) {
            c();
        }
        o.a aVar = this.f858e;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    public boolean b(h hVar) {
        o.a aVar = this.f858e;
        if (aVar != null) {
            return aVar.b(hVar);
        }
        return false;
    }

    public void c() {
        d dVar = this.f856c;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        h hVar = this.f855b;
        d.a aVar = new d.a(hVar.w());
        f fVar = new f(aVar.b(), g.abc_list_menu_item_layout);
        this.f857d = fVar;
        fVar.l(this);
        this.f855b.b(this.f857d);
        aVar.c(this.f857d.b(), this);
        View A = hVar.A();
        if (A != null) {
            aVar.d(A);
        } else {
            aVar.e(hVar.y());
            aVar.l(hVar.z());
        }
        aVar.i(this);
        d a2 = aVar.a();
        this.f856c = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f856c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f856c.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f855b.N((j) this.f857d.b().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f857d.a(this.f855b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f856c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f856c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f855b.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f855b.performShortcut(i, keyEvent, 0);
    }
}
