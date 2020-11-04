package androidx.appcompat.view.menu;

import a.a.a;
import a.a.f;
import a.a.g;
import a.a.j;
import a.h.k.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.b0;

public class ListMenuItemView extends LinearLayout implements p.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    private j f830b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f831c;

    /* renamed from: d  reason: collision with root package name */
    private RadioButton f832d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f833e;

    /* renamed from: f  reason: collision with root package name */
    private CheckBox f834f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private LinearLayout j;
    private Drawable k;
    private int l;
    private Context m;
    private boolean n;
    private Drawable o;
    private boolean p;
    private LayoutInflater q;
    private boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i2) {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, this, false);
        this.f834f = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, this, false);
        this.f831c = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, this, false);
        this.f832d = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            rect.top += this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public boolean d() {
        return false;
    }

    public void e(j jVar, int i2) {
        this.f830b = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.i(this));
        setCheckable(jVar.isCheckable());
        setShortcut(jVar.A(), jVar.g());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    public j getItemData() {
        return this.f830b;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        u.b0(this, this.k);
        TextView textView = (TextView) findViewById(f.title);
        this.f833e = textView;
        int i2 = this.l;
        if (i2 != -1) {
            textView.setTextAppearance(this.m, i2);
        }
        this.g = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(f.group_divider);
        this.j = (LinearLayout) findViewById(f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f831c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f831c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f832d != null || this.f834f != null) {
            if (this.f830b.m()) {
                if (this.f832d == null) {
                    g();
                }
                compoundButton2 = this.f832d;
                compoundButton = this.f834f;
            } else {
                if (this.f834f == null) {
                    c();
                }
                compoundButton2 = this.f834f;
                compoundButton = this.f832d;
            }
            if (z) {
                compoundButton2.setChecked(this.f830b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f834f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f832d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f830b.m()) {
            if (this.f832d == null) {
                g();
            }
            compoundButton = this.f832d;
        } else {
            if (this.f834f == null) {
                c();
            }
            compoundButton = this.f834f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f830b.z() || this.r;
        if (!z && !this.n) {
            return;
        }
        if (this.f831c != null || drawable != null || this.n) {
            if (this.f831c == null) {
                f();
            }
            if (drawable != null || this.n) {
                ImageView imageView = this.f831c;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f831c.getVisibility() != 0) {
                    this.f831c.setVisibility(0);
                    return;
                }
                return;
            }
            this.f831c.setVisibility(8);
        }
    }

    public void setShortcut(boolean z, char c2) {
        int i2 = (!z || !this.f830b.A()) ? 8 : 0;
        if (i2 == 0) {
            this.g.setText(this.f830b.h());
        }
        if (this.g.getVisibility() != i2) {
            this.g.setVisibility(i2);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f833e.setText(charSequence);
            if (this.f833e.getVisibility() != 0) {
                this.f833e.setVisibility(0);
            }
        } else if (this.f833e.getVisibility() != 8) {
            this.f833e.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        b0 u = b0.u(getContext(), attributeSet, j.MenuView, i2, 0);
        this.k = u.g(j.MenuView_android_itemBackground);
        this.l = u.n(j.MenuView_android_itemTextAppearance, -1);
        this.n = u.a(j.MenuView_preserveIconSpacing, false);
        this.m = context;
        this.o = u.g(j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        u.v();
        obtainStyledAttributes.recycle();
    }
}
