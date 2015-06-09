package com.georgeci.bindingssample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.text.Editable;

public class Vm extends BaseObservable {
    @Bindable
    public final ObservableField<Editable> edit = new ObservableField<>();

    public Vm() {
        this.edit.set(Editable.Factory.getInstance().newEditable(""));
    }
}