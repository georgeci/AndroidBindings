package com.georgeci.bindingssample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.georgeci.bindingssample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;
    ActivityMainBinding binding;
    Vm vm = new Vm();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("Some name", 668714400L, false);
        binding.setUser(user);
        binding.setVm(vm);
        binding.setClicker(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), vm.edit.get().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
