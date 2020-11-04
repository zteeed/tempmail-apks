package com.tempmail.m;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentChangeEmailBinding */
public abstract class w extends ViewDataBinding {
    public final TextView A;
    public final Button q;
    public final ConstraintLayout r;
    public final EditText s;
    public final ExpandableListView t;
    public final Group u;
    public final Guideline v;
    public final Guideline w;
    public final RecyclerView x;
    public final TextView y;
    public final TextView z;

    protected w(Object obj, View view, int i, Button button, ConstraintLayout constraintLayout, EditText editText, ExpandableListView expandableListView, Group group, Guideline guideline, Guideline guideline2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.q = button;
        this.r = constraintLayout;
        this.s = editText;
        this.t = expandableListView;
        this.u = group;
        this.v = guideline;
        this.w = guideline2;
        this.x = recyclerView;
        this.y = textView;
        this.z = textView2;
        this.A = textView3;
    }
}
