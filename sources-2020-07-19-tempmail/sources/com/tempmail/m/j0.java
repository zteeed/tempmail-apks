package com.tempmail.m;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.h.a;
import com.tempmail.R;

/* compiled from: FragmentPremiumBindingImpl */
public class j0 extends i0 {
    private static final ViewDataBinding.d m1 = null;
    private static final SparseIntArray n1;
    private final NestedScrollView k1;
    private long l1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n1 = sparseIntArray;
        sparseIntArray.put(R.id.constraintMain, 4);
        n1.put(R.id.ivClose, 5);
        n1.put(R.id.ivLogo, 6);
        n1.put(R.id.tvTitle, 7);
        n1.put(R.id.tvChoose, 8);
        n1.put(R.id.btnOneWeek, 9);
        n1.put(R.id.tvFirstFakeTextWeek, 10);
        n1.put(R.id.tvSecondFakeTextWeek, 11);
        n1.put(R.id.tvPeriodOneWeek, 12);
        n1.put(R.id.tvTotalOneWeek, 13);
        n1.put(R.id.tvPriceOneWeek, 14);
        n1.put(R.id.line4, 15);
        n1.put(R.id.btnOneMonth, 16);
        n1.put(R.id.tvFirstFakeText, 17);
        n1.put(R.id.tvSecondFakeText, 18);
        n1.put(R.id.tvPeriodMonth, 19);
        n1.put(R.id.tvTotalOneMonth, 20);
        n1.put(R.id.tvPriceMonth, 21);
        n1.put(R.id.line6, 22);
        n1.put(R.id.tvDiscountOneMonth, 23);
        n1.put(R.id.btnThreeMonth, 24);
        n1.put(R.id.tvPeriodThreeMonth, 25);
        n1.put(R.id.tvPriceThreePerMonth, 26);
        n1.put(R.id.tvTotalThreeMonth, 27);
        n1.put(R.id.tvPriceThreeMonth, 28);
        n1.put(R.id.line5, 29);
        n1.put(R.id.tvDiscountThreeMonth, 30);
        n1.put(R.id.btnSixMonth, 31);
        n1.put(R.id.tvPeriodSixMonth, 32);
        n1.put(R.id.tvPriceSixPerMonth, 33);
        n1.put(R.id.tvTotalSixMonth, 34);
        n1.put(R.id.tvPriceSixMonth, 35);
        n1.put(R.id.line2, 36);
        n1.put(R.id.tvDiscountSixMonth, 37);
        n1.put(R.id.btnYear, 38);
        n1.put(R.id.tvPeriodYear, 39);
        n1.put(R.id.tvPriceYearPerMonth, 40);
        n1.put(R.id.tvTotalYear, 41);
        n1.put(R.id.tvPriceYear, 42);
        n1.put(R.id.line3, 43);
        n1.put(R.id.tvDiscountYear, 44);
        n1.put(R.id.btnOneWeekSecond, 45);
        n1.put(R.id.rbWeek, 46);
        n1.put(R.id.tvPeriodWeekSecond, 47);
        n1.put(R.id.tvPriceWeekSecond, 48);
        n1.put(R.id.btnOneMonthSecond, 49);
        n1.put(R.id.ivDiscountOneMonthSecond, 50);
        n1.put(R.id.tvDiscountOneMonthSecond, 51);
        n1.put(R.id.rb_month, 52);
        n1.put(R.id.tvPeriodMonthSecond, 53);
        n1.put(R.id.tvPriceMonthSecond, 54);
        n1.put(R.id.btnThreeMonthSecond, 55);
        n1.put(R.id.ivDiscountThreeMonthSecond, 56);
        n1.put(R.id.rbThreeMonth, 57);
        n1.put(R.id.tvPriceThreeMonthSecond, 58);
        n1.put(R.id.tvDiscountThreeMonthSecond, 59);
        n1.put(R.id.tvPeriodThreeMonthSecond, 60);
        n1.put(R.id.btnSixMonthSecond, 61);
        n1.put(R.id.ivDiscountSixMonthSecond, 62);
        n1.put(R.id.rb_six_month, 63);
        n1.put(R.id.tvPriceSixMonthSecond, 64);
        n1.put(R.id.tvDiscountSixMonthSecond, 65);
        n1.put(R.id.tvPeriodSixMonthSecond, 66);
        n1.put(R.id.btnYearSecond, 67);
        n1.put(R.id.ivDiscountYearSecond, 68);
        n1.put(R.id.rb_year, 69);
        n1.put(R.id.tvPriceYearSecond, 70);
        n1.put(R.id.tvPeriodYearSecond, 71);
        n1.put(R.id.tvDiscountYearSecond, 72);
        n1.put(R.id.btnFirst, 73);
        n1.put(R.id.lineLeft, 74);
        n1.put(R.id.tvOr, 75);
        n1.put(R.id.lineRight, 76);
        n1.put(R.id.orGroup, 77);
        n1.put(R.id.tvTrialTip, 78);
        n1.put(R.id.tvTrialCharge, 79);
        n1.put(R.id.btnSecond, 80);
        n1.put(R.id.tvBilled, 81);
        n1.put(R.id.tvWhyPremium, 82);
        n1.put(R.id.ivCheckOne, 83);
        n1.put(R.id.tvReasonOne, 84);
        n1.put(R.id.ivCheckTwo, 85);
        n1.put(R.id.ivCheckThree, 86);
        n1.put(R.id.ivCheckFour, 87);
        n1.put(R.id.ivCheckFive, 88);
        n1.put(R.id.tvReasonFive, 89);
        n1.put(R.id.ivCheckSix, 90);
        n1.put(R.id.tvReasonSix, 91);
        n1.put(R.id.ivCheckSeven, 92);
        n1.put(R.id.tvReasonSeven, 93);
        n1.put(R.id.tvTos, 94);
        n1.put(R.id.tvRestorePurchase, 95);
        n1.put(R.id.centerGuideline, 96);
        n1.put(R.id.rightGuidelineWhyPremium, 97);
        n1.put(R.id.leftGuideLineWhyPremium, 98);
    }

    public j0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 99, m1, n1));
    }

    /* access modifiers changed from: protected */
    public void g() {
        long j;
        int i;
        Resources resources;
        int i2;
        Resources resources2;
        int i3;
        Resources resources3;
        long j2;
        long j3;
        synchronized (this) {
            j = this.l1;
            this.l1 = 0;
        }
        int i4 = ((j & 1) > 0 ? 1 : ((j & 1) == 0 ? 0 : -1));
        if (!(i4 == 0 || i4 == 0)) {
            if (com.tempmail.utils.e.P()) {
                j3 = j | 4 | 16;
                j2 = 64;
            } else {
                j3 = j | 2 | 8;
                j2 = 32;
            }
            j = j3 | j2;
        }
        if ((j & 1) != 0) {
            TextView textView = this.R0;
            if (com.tempmail.utils.e.P()) {
                resources = this.R0.getResources();
                i = R.string.premium_10mm_why_line_4;
            } else {
                resources = this.R0.getResources();
                i = R.string.premium_why_line_4;
            }
            a.b(textView, resources.getString(i));
            TextView textView2 = this.V0;
            if (com.tempmail.utils.e.P()) {
                resources2 = this.V0.getResources();
                i2 = R.string.premium_10mm_why_line_3;
            } else {
                resources2 = this.V0.getResources();
                i2 = R.string.premium_why_line_3;
            }
            a.b(textView2, resources2.getString(i2));
            TextView textView3 = this.W0;
            if (com.tempmail.utils.e.P()) {
                resources3 = this.W0.getResources();
                i3 = R.string.premium_10mm_why_line_2;
            } else {
                resources3 = this.W0.getResources();
                i3 = R.string.premium_why_line_2;
            }
            a.b(textView3, resources3.getString(i3));
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.l1 != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.l1 = 1;
        }
        v();
    }

    private j0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[73], objArr[16], objArr[49], objArr[9], objArr[45], objArr[80], objArr[31], objArr[61], objArr[24], objArr[55], objArr[38], objArr[67], objArr[96], objArr[4], objArr[88], objArr[87], objArr[83], objArr[92], objArr[90], objArr[86], objArr[85], objArr[5], objArr[50], objArr[62], objArr[56], objArr[68], objArr[6], objArr[98], objArr[36], objArr[43], objArr[15], objArr[29], objArr[22], objArr[74], objArr[76], objArr[77], objArr[52], objArr[63], objArr[57], objArr[46], objArr[69], objArr[97], objArr[81], objArr[8], objArr[23], objArr[51], objArr[37], objArr[65], objArr[30], objArr[59], objArr[44], objArr[72], objArr[17], objArr[10], objArr[75], objArr[19], objArr[53], objArr[12], objArr[32], objArr[66], objArr[25], objArr[60], objArr[47], objArr[39], objArr[71], objArr[21], objArr[54], objArr[14], objArr[35], objArr[64], objArr[33], objArr[28], objArr[58], objArr[26], objArr[48], objArr[42], objArr[40], objArr[70], objArr[89], objArr[3], objArr[84], objArr[93], objArr[91], objArr[2], objArr[1], objArr[95], objArr[18], objArr[11], objArr[7], objArr[94], objArr[20], objArr[13], objArr[34], objArr[27], objArr[41], objArr[79], objArr[78], objArr[82]);
        this.l1 = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.k1 = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        this.R0.setTag((Object) null);
        this.V0.setTag((Object) null);
        this.W0.setTag((Object) null);
        x(view);
        p();
    }
}
