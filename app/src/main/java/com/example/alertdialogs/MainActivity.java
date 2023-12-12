package com.example.alertdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private Button mShowDialogBtn;
    private CharSequence[]mAlertItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowDialogBtn = findViewById(R.id.show_dialog_btn);
        mAlertItems = new CharSequence[]{
                "Videos",
                "Fotos",
                "Musica",
                "Todo"
        };
        mShowDialogBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialAlertDialogBuilder builder = new
                        MaterialAlertDialogBuilder(MainActivity.this);
                builder.setTitle("Opciones");
                builder.setSingleChoiceItems(mAlertItems, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });

                builder.setBackground(getResources().getDrawable(R.drawable.alert_dialog_dg, null));
                builder.show();
            }
        });
    }
}