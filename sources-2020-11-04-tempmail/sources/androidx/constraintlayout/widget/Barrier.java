package androidx.constraintlayout.widget;

import a.f.a.j.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

public class Barrier extends ConstraintHelper {
    private int h;
    private int i;
    private b j;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void b(AttributeSet attributeSet) {
        super.b(attributeSet);
        this.j = new b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == c.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.j.L0(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f1235e = this.j;
        f();
    }

    public boolean g() {
        return this.j.K0();
    }

    public int getType() {
        return this.h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.j.L0(z);
    }

    public void setType(int i2) {
        this.h = i2;
        this.i = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i3 = this.h;
                if (i3 == 5) {
                    this.i = 1;
                } else if (i3 == 6) {
                    this.i = 0;
                }
            } else {
                int i4 = this.h;
                if (i4 == 5) {
                    this.i = 0;
                } else if (i4 == 6) {
                    this.i = 1;
                }
            }
        } else if (i2 == 5) {
            this.i = 0;
        } else if (i2 == 6) {
            this.i = 1;
        }
        this.j.M0(this.i);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        super.setVisibility(8);
    }
}
