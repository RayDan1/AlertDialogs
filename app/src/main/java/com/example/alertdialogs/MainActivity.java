package com.example.alertdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button mShowDialogBtn;
    private CharSequence[]mAlertItems;
    private boolean[] mSelectedItems;

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
        mSelectedItems = new boolean[]{
                false,
                true,
                true
        };
        mShowDialogBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialAlertDialogBuilder builder = new
                        MaterialAlertDialogBuilder(MainActivity.this);
                builder.setTitle("Opciones");
                builder.setMultiChoiceItems(mAlertItems, mSelectedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    }
                });

                builder.setBackground(getResources().getDrawable(R.drawable.alert_dialog_dg, null));

                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
                builder.show();
            }
        });
    }
}