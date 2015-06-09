package com.georgeci.bindingssample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableLong;

public class User extends BaseObservable {
    @Bindable
    public final ObservableField<String> name = new ObservableField<>();
    @Bindable
    public final ObservableLong birthday = new ObservableLong();
    @Bindable
    public final ObservableBoolean adult = new ObservableBoolean();

    public User(String name, long birthday, boolean isAdult) {
        this.name.set(name);
        this.birthday.set(birthday);
        this.adult.set(isAdult);
    }
}
