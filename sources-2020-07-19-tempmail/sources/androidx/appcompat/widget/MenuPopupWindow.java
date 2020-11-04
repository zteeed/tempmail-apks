package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import java.lang.reflect.Method;

public class MenuPopupWindow extends ListPopupWindow implements s {
    private static Method K;
    private s J;

    public static class MenuDropDownListView extends p {
        final int p;
        final int q;
        private s r;
        private MenuItem s;

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.p = 22;
                this.q = 21;
                return;
            }
            this.p = 21;
            this.q = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            g gVar;
            int pointToPosition;
            int i2;
            if (this.r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    gVar = (g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    gVar = (g) adapter;
                }
                j jVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < gVar.getCount()) {
                    jVar = gVar.getItem(i2);
                }
                MenuItem menuItem = this.s;
                if (menuItem != jVar) {
                    h b2 = gVar.b();
                    if (menuItem != null) {
                        this.r.c(b2, menuItem);
                    }
                    this.s = jVar;
                    if (jVar != null) {
                        this.r.a(b2, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.q) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((g) getAdapter()).b().e(false);
                return true;
            }
        }

        public void setHoverListener(s sVar) {
            this.r = sVar;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            K = cls.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void I(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setEnterTransition((Transition) obj);
        }
    }

    public void J(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setExitTransition((Transition) obj);
        }
    }

    public void K(s sVar) {
        this.J = sVar;
    }

    public void L(boolean z) {
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.F, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    public void a(h hVar, MenuItem menuItem) {
        s sVar = this.J;
        if (sVar != null) {
            sVar.a(hVar, menuItem);
        }
    }

    public void c(h hVar, MenuItem menuItem) {
        s sVar = this.J;
        if (sVar != null) {
            sVar.c(hVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    public p g(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
