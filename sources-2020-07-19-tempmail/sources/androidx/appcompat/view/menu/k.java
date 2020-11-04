package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS */
public class k extends c<a.h.f.a.b> implements MenuItem {

    /* renamed from: e  reason: collision with root package name */
    private Method f866e;

    /* compiled from: MenuItemWrapperICS */
    class a extends a.h.k.b {

        /* renamed from: c  reason: collision with root package name */
        final ActionProvider f867c;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f867c = actionProvider;
        }

        public boolean a() {
            return this.f867c.hasSubMenu();
        }

        public View c() {
            return this.f867c.onCreateActionView();
        }

        public boolean e() {
            return this.f867c.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.f867c.onPrepareSubMenu(k.this.d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    static class b extends FrameLayout implements a.a.n.c {

        /* renamed from: b  reason: collision with root package name */
        final CollapsibleActionView f869b;

        b(View view) {
            super(view.getContext());
            this.f869b = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f869b;
        }

        public void c() {
            this.f869b.onActionViewExpanded();
        }

        public void f() {
            this.f869b.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class c extends d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f822a).onMenuItemActionCollapse(k.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f822a).onMenuItemActionExpand(k.this.c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class d extends d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f822a).onMenuItemClick(k.this.c(menuItem));
        }
    }

    k(Context context, a.h.f.a.b bVar) {
        super(context, bVar);
    }

    public boolean collapseActionView() {
        return ((a.h.f.a.b) this.f822a).collapseActionView();
    }

    public boolean expandActionView() {
        return ((a.h.f.a.b) this.f822a).expandActionView();
    }

    public ActionProvider getActionProvider() {
        a.h.k.b b2 = ((a.h.f.a.b) this.f822a).b();
        if (b2 instanceof a) {
            return ((a) b2).f867c;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((a.h.f.a.b) this.f822a).getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((a.h.f.a.b) this.f822a).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((a.h.f.a.b) this.f822a).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((a.h.f.a.b) this.f822a).getContentDescription();
    }

    public int getGroupId() {
        return ((a.h.f.a.b) this.f822a).getGroupId();
    }

    public Drawable getIcon() {
        return ((a.h.f.a.b) this.f822a).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((a.h.f.a.b) this.f822a).getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((a.h.f.a.b) this.f822a).getIconTintMode();
    }

    public Intent getIntent() {
        return ((a.h.f.a.b) this.f822a).getIntent();
    }

    public int getItemId() {
        return ((a.h.f.a.b) this.f822a).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((a.h.f.a.b) this.f822a).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((a.h.f.a.b) this.f822a).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((a.h.f.a.b) this.f822a).getNumericShortcut();
    }

    public int getOrder() {
        return ((a.h.f.a.b) this.f822a).getOrder();
    }

    public SubMenu getSubMenu() {
        return d(((a.h.f.a.b) this.f822a).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((a.h.f.a.b) this.f822a).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((a.h.f.a.b) this.f822a).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((a.h.f.a.b) this.f822a).getTooltipText();
    }

    /* access modifiers changed from: package-private */
    public a h(ActionProvider actionProvider) {
        return new a(this.f819b, actionProvider);
    }

    public boolean hasSubMenu() {
        return ((a.h.f.a.b) this.f822a).hasSubMenu();
    }

    public void i(boolean z) {
        try {
            if (this.f866e == null) {
                this.f866e = ((a.h.f.a.b) this.f822a).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f866e.invoke(this.f822a, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean isActionViewExpanded() {
        return ((a.h.f.a.b) this.f822a).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((a.h.f.a.b) this.f822a).isCheckable();
    }

    public boolean isChecked() {
        return ((a.h.f.a.b) this.f822a).isChecked();
    }

    public boolean isEnabled() {
        return ((a.h.f.a.b) this.f822a).isEnabled();
    }

    public boolean isVisible() {
        return ((a.h.f.a.b) this.f822a).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((a.h.f.a.b) this.f822a).a(actionProvider != null ? h(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((a.h.f.a.b) this.f822a).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        ((a.h.f.a.b) this.f822a).setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((a.h.f.a.b) this.f822a).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((a.h.f.a.b) this.f822a).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((a.h.f.a.b) this.f822a).setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((a.h.f.a.b) this.f822a).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((a.h.f.a.b) this.f822a).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((a.h.f.a.b) this.f822a).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((a.h.f.a.b) this.f822a).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((a.h.f.a.b) this.f822a).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        ((a.h.f.a.b) this.f822a).setNumericShortcut(c2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((a.h.f.a.b) this.f822a).setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((a.h.f.a.b) this.f822a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        ((a.h.f.a.b) this.f822a).setShortcut(c2, c3);
        return this;
    }

    public void setShowAsAction(int i) {
        ((a.h.f.a.b) this.f822a).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((a.h.f.a.b) this.f822a).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((a.h.f.a.b) this.f822a).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((a.h.f.a.b) this.f822a).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((a.h.f.a.b) this.f822a).setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((a.h.f.a.b) this.f822a).setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c2, int i) {
        ((a.h.f.a.b) this.f822a).setAlphabeticShortcut(c2, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((a.h.f.a.b) this.f822a).setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i) {
        ((a.h.f.a.b) this.f822a).setNumericShortcut(c2, i);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        ((a.h.f.a.b) this.f822a).setShortcut(c2, c3, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((a.h.f.a.b) this.f822a).setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((a.h.f.a.b) this.f822a).setActionView(i);
        View actionView = ((a.h.f.a.b) this.f822a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((a.h.f.a.b) this.f822a).setActionView((View) new b(actionView));
        }
        return this;
    }
}
