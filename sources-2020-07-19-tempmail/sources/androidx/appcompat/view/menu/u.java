package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;

/* compiled from: SubMenuBuilder */
public class u extends h implements SubMenu {
    private h B;
    private j C;

    public u(Context context, h hVar, j jVar) {
        super(context);
        this.B = hVar;
        this.C = jVar;
    }

    public h F() {
        return this.B.F();
    }

    public boolean H() {
        return this.B.H();
    }

    public boolean I() {
        return this.B.I();
    }

    public boolean J() {
        return this.B.J();
    }

    public void V(h.a aVar) {
        this.B.V(aVar);
    }

    public boolean f(j jVar) {
        return this.B.f(jVar);
    }

    public MenuItem getItem() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public boolean h(h hVar, MenuItem menuItem) {
        return super.h(hVar, menuItem) || this.B.h(hVar, menuItem);
    }

    public Menu i0() {
        return this.B;
    }

    public boolean m(j jVar) {
        return this.B.m(jVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.Z(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.c0(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.d0(view);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    public String v() {
        j jVar = this.C;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + ":" + itemId;
    }

    public SubMenu setHeaderIcon(int i) {
        super.Y(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.b0(i);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.C.setIcon(i);
        return this;
    }
}
