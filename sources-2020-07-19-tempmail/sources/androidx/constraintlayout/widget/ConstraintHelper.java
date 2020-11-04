package androidx.constraintlayout.widget;

import a.f.a.j.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;

public abstract class ConstraintHelper extends View {

    /* renamed from: b  reason: collision with root package name */
    protected int[] f1205b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    protected int f1206c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f1207d;

    /* renamed from: e  reason: collision with root package name */
    protected j f1208e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f1209f = false;
    private String g;

    public ConstraintHelper(Context context) {
        super(context);
        this.f1207d = context;
        b((AttributeSet) null);
    }

    private void a(String str) {
        int i;
        Object c2;
        if (str != null && this.f1207d != null) {
            String trim = str.trim();
            try {
                i = b.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f1207d.getResources().getIdentifier(trim, "id", this.f1207d.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i = ((Integer) c2).intValue();
            }
            if (i != 0) {
                setTag(i, (Object) null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.g = string;
                    setIds(string);
                }
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
    }

    public void d(ConstraintLayout constraintLayout) {
    }

    public void e(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.g);
        }
        j jVar = this.f1208e;
        if (jVar != null) {
            jVar.J0();
            for (int i = 0; i < this.f1206c; i++) {
                View e2 = constraintLayout.e(this.f1205b[i]);
                if (e2 != null) {
                    this.f1208e.I0(constraintLayout.f(e2));
                }
            }
        }
    }

    public void f() {
        if (this.f1208e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).k0 = this.f1208e;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1205b, this.f1206c);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1209f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1206c = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f1206c + 1;
        int[] iArr = this.f1205b;
        if (i2 > iArr.length) {
            this.f1205b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1205b;
        int i3 = this.f1206c;
        iArr2[i3] = i;
        this.f1206c = i3 + 1;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1207d = context;
        b(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1207d = context;
        b(attributeSet);
    }
}
