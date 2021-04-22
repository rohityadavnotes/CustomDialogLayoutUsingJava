package com.dialog.using.java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;

public class ShowAlertDialogActivity extends AppCompatActivity {

    private static final String TAG = ShowAlertDialogActivity.class.getSimpleName();

    private MaterialButton showDialogMaterialButton;
    private DynamicDialog dynamicDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_alert_dialog);
        initializeView();
        initializeObject();
        setOnClickListener();
    }

    protected void initializeView() {
        showDialogMaterialButton = findViewById(R.id.showDialogMaterialButton);
    }

    protected void initializeObject() {


    }

    protected void setOnClickListener() {
        showDialogMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dynamicDialogOne();
            }
        });
    }

    private void dynamicDialogOne() {
        dynamicDialog = new DynamicDialog.Builder(this)
                .setView(R.layout.permission_never_ask_again_alert_dialog)
                .setTheme(R.style.Dynamic_Dialog_Default_Style)
                .setWindowAnimationStyle(R.style.UpDownAnimation)
                .setPadding(20, 0, 20, 0)
                .setWidth(ViewGroup.LayoutParams.MATCH_PARENT)
                .setHeight(ViewGroup.LayoutParams.WRAP_CONTENT)
                .setGravity(Gravity.CENTER)
                .setCanceledOnTouchOutside(true)
                .applyAttribute(true)
                .build();

        dynamicDialog.show();
    }
}