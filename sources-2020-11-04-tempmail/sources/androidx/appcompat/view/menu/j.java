package androidx.appcompat.view.menu;

import a.a.h;
import a.h.f.a.b;
import a.h.k.b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.p;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;

/* compiled from: MenuItemImpl */
public final class j implements b {
    private View A;
    private a.h.k.b B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f886a;

    /* renamed from: b  reason: collision with root package name */
    private final int f887b;

    /* renamed from: c  reason: collision with root package name */
    private final int f888c;

    /* renamed from: d  reason: collision with root package name */
    private final int f889d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f890e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f891f;
    private Intent g;
    private char h;
    private int i = CodedOutputStream.DEFAULT_BUFFER_SIZE;
    private char j;
    private int k = CodedOutputStream.DEFAULT_BUFFER_SIZE;
    private Drawable l;
    private int m = 0;
    h n;
    private u o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private int z = 0;

    /* compiled from: MenuItemImpl */
    class a implements b.C0013b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            j jVar = j.this;
            jVar.n.L(jVar);
        }
    }

    j(h hVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.n = hVar;
        this.f886a = i3;
        this.f887b = i2;
        this.f888c = i4;
        this.f889d = i5;
        this.f890e = charSequence;
        this.z = i6;
    }

    private static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.o(drawable, this.t);
            }
            if (this.w) {
                androidx.core.graphics.drawable.a.p(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.n.J() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    public a.h.f.a.b a(a.h.k.b bVar) {
        a.h.k.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.n.M(true);
        a.h.k.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public a.h.k.b b() {
        return this.B;
    }

    public void c() {
        this.n.K(this);
    }

    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f889d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        return this.n.I() ? this.j : this.h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        a.h.k.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View d2 = bVar.d(this);
        this.A = d2;
        return d2;
    }

    public int getAlphabeticModifiers() {
        return this.k;
    }

    public char getAlphabeticShortcut() {
        return this.j;
    }

    public CharSequence getContentDescription() {
        return this.r;
    }

    public int getGroupId() {
        return this.f887b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable d2 = a.a.k.a.a.d(this.n.w(), this.m);
        this.m = 0;
        this.l = d2;
        return e(d2);
    }

    public ColorStateList getIconTintList() {
        return this.t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    public Intent getIntent() {
        return this.g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f886a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public int getNumericModifiers() {
        return this.i;
    }

    public char getNumericShortcut() {
        return this.h;
    }

    public int getOrder() {
        return this.f888c;
    }

    public SubMenu getSubMenu() {
        return this.o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f890e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f891f;
        if (charSequence == null) {
            charSequence = this.f890e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        char g2 = g();
        if (g2 == 0) {
            return "";
        }
        Resources resources = this.n.w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h.abc_prepend_shortcut_label));
        }
        int i2 = this.n.I() ? this.k : this.i;
        d(sb, i2, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
        d(sb, i2, CodedOutputStream.DEFAULT_BUFFER_SIZE, resources.getString(h.abc_menu_ctrl_shortcut_label));
        d(sb, i2, 2, resources.getString(h.abc_menu_alt_shortcut_label));
        d(sb, i2, 1, resources.getString(h.abc_menu_shift_shortcut_label));
        d(sb, i2, 4, resources.getString(h.abc_menu_sym_shortcut_label));
        d(sb, i2, 8, resources.getString(h.abc_menu_function_shortcut_label));
        if (g2 == 8) {
            sb.append(resources.getString(h.abc_menu_delete_shortcut_label));
        } else if (g2 == 10) {
            sb.append(resources.getString(h.abc_menu_enter_shortcut_label));
        } else if (g2 != ' ') {
            sb.append(g2);
        } else {
            sb.append(resources.getString(h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.o != null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(p.a aVar) {
        if (aVar == null || !aVar.d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    public boolean isVisible() {
        a.h.k.b bVar = this.B;
        if (bVar == null || !bVar.g()) {
            if ((this.y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.y & 8) != 0 || !this.B.b()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j() {
        a.h.k.b bVar;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        if (this.A != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        h hVar = this.n;
        if (hVar.h(hVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.g != null) {
            try {
                this.n.w().startActivity(this.g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        a.h.k.b bVar = this.B;
        if (bVar == null || !bVar.e()) {
            return false;
        }
        return true;
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    public a.h.f.a.b p(int i2) {
        Context w2 = this.n.w();
        q(LayoutInflater.from(w2).inflate(i2, new LinearLayout(w2), false));
        return this;
    }

    public a.h.f.a.b q(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.f886a) > 0) {
            view.setId(i2);
        }
        this.n.K(this);
        return this;
    }

    public void r(boolean z2) {
        this.D = z2;
        this.n.M(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z2) {
        int i2 = this.y;
        int i3 = (z2 ? 2 : 0) | (i2 & -3);
        this.y = i3;
        if (i2 != i3) {
            this.n.M(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        p(i2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.n.M(false);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.y;
        boolean z3 = z2 | (i2 & true);
        this.y = z3 ? 1 : 0;
        if (i2 != z3) {
            this.n.M(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        if ((this.y & 4) != 0) {
            this.n.X(this);
        } else {
            s(z2);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.M(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.M(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.M(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.M(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.n.M(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.j = Character.toLowerCase(c3);
        this.n.M(false);
        return this;
    }

    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.z = i2;
            this.n.K(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        w(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f890e = charSequence;
        this.n.M(false);
        u uVar = this.o;
        if (uVar != null) {
            uVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f891f = charSequence;
        this.n.M(false);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        if (y(z2)) {
            this.n.L(this);
        }
        return this;
    }

    public void t(boolean z2) {
        this.y = (z2 ? 4 : 0) | (this.y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f890e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z2) {
        if (z2) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public a.h.f.a.b w(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(u uVar) {
        this.o = uVar;
        uVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z2) {
        int i2 = this.y;
        int i3 = (z2 ? 0 : 8) | (i2 & -9);
        this.y = i3;
        if (i2 != i3) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.n.C();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        q(view);
        return this;
    }

    public a.h.f.a.b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.M(false);
        return this;
    }

    public a.h.f.a.b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.M(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.j == c2 && this.k == i2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.M(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.h == c2 && this.i == i2) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.n.M(false);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        this.n.M(false);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.l = null;
        this.m = i2;
        this.x = true;
        this.n.M(false);
        return this;
    }

    public MenuItem setTitle(int i2) {
        setTitle((CharSequence) this.n.w().getString(i2));
        return this;
    }
}
