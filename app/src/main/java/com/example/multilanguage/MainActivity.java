package com.example.multilanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvtDangKy;
    EditText edtHoTen, edtTaiKhoan, edtMatKhau;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
    }

    private void AnhXa() {
        tvtDangKy = (TextView) findViewById(R.id.tvt_DangKy);
        edtHoTen = (EditText) findViewById(R.id.edt_name);
        edtTaiKhoan = (EditText) findViewById(R.id.edt_account);
        edtMatKhau = (EditText) findViewById(R.id.edt_password);
        btnXacNhan = (Button) findViewById(R.id.btn_confirm);
    }
}