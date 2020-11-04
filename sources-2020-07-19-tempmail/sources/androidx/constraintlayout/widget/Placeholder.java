package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Placeholder extends View {

    /* renamed from: b  reason: collision with root package name */
    private int f1223b = -1;

    /* renamed from: c  reason: collision with root package name */
    private View f1224c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f1225d = 4;

    public Placeholder(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f1225d);
        this.f1223b = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c.ConstraintLayout_placeholder_content) {
                    this.f1223b = obtainStyledAttributes.getResourceId(index, this.f1223b);
                } else if (index == c.ConstraintLayout_placeholder_emptyVisibility) {
                    this.f1225d = obtainStyledAttributes.getInt(index, this.f1225d);
                }
            }
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1224c != null) {
            ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f1224c.getLayoutParams();
            aVar2.k0.x0(0);
            aVar.k0.y0(aVar2.k0.D());
            aVar.k0.b0(aVar2.k0.r());
            aVar2.k0.x0(8);
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f1223b == -1 && !isInEditMode()) {
            setVisibility(this.f1225d);
        }
        View findViewById = constraintLayout.findViewById(this.f1223b);
        this.f1224c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.a) findViewById.getLayoutParams()).Z = true;
            this.f1224c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1224c;
    }

    public int getEmptyVisibility() {
        return this.f1225d;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f1223b != i) {
            View view = this.f1224c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f1224c.getLayoutParams()).Z = false;
                this.f1224c = null;
            }
            this.f1223b = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1225d = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}
