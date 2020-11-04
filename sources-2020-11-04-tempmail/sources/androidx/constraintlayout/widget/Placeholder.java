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
    private int f1250b = -1;

    /* renamed from: c  reason: collision with root package name */
    private View f1251c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f1252d = 4;

    public Placeholder(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f1252d);
        this.f1250b = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c.ConstraintLayout_placeholder_content) {
                    this.f1250b = obtainStyledAttributes.getResourceId(index, this.f1250b);
                } else if (index == c.ConstraintLayout_placeholder_emptyVisibility) {
                    this.f1252d = obtainStyledAttributes.getInt(index, this.f1252d);
                }
            }
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1251c != null) {
            ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f1251c.getLayoutParams();
            aVar2.k0.x0(0);
            aVar.k0.y0(aVar2.k0.D());
            aVar.k0.b0(aVar2.k0.r());
            aVar2.k0.x0(8);
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f1250b == -1 && !isInEditMode()) {
            setVisibility(this.f1252d);
        }
        View findViewById = constraintLayout.findViewById(this.f1250b);
        this.f1251c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.a) findViewById.getLayoutParams()).Z = true;
            this.f1251c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1251c;
    }

    public int getEmptyVisibility() {
        return this.f1252d;
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
        if (this.f1250b != i) {
            View view = this.f1251c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f1251c.getLayoutParams()).Z = false;
                this.f1251c = null;
            }
            this.f1250b = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1252d = i;
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
