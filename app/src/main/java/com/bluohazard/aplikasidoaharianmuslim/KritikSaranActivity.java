package com.bluohazard.aplikasidoaharianmuslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class KritikSaranActivity extends AppCompatActivity {

    EditText editTextNama, editTextEmail, editTextKritikSaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kritik_saran);

        editTextNama = findViewById(R.id.editTextNama);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextKritikSaran = findViewById(R.id.editTextKritikSaran);
    }

    public void clickKirim(View view) {
        // Validasi nama bila kosong
        if (TextUtils.isEmpty(editTextNama.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Namamu siapa ya?", Toast.LENGTH_LONG).show();
        }
        // Validasi email bila kosong
        else if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email jangan lupa...", Toast.LENGTH_LONG).show();
        }
        // Validasi inputan tipe email
        else if (!isValidEmail(editTextEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Yang valid emailnya yaa!", Toast.LENGTH_LONG).show();
        }
        // Validasi kritik saran bila kosong
        else if (TextUtils.isEmpty(editTextKritikSaran.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Hayo kritik dan sarannya lupa ya?", Toast.LENGTH_LONG).show();
        } else {
            Intent i = new Intent(KritikSaranActivity.this, SuccessActivity.class);
            startActivity(i);
        }
    }

    public static boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
