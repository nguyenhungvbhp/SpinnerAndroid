package mt.com.vn.spinnerandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import mt.com.vn.modell.NhanVien;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtTen;
    private EditText edtSoNgayCongTac;
    private Button btnOK;
    private Spinner spNgatBatDau;

    private ArrayList<String> arrThu;
    private ArrayAdapter<String> adapterThu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        edtTen = (EditText) this.findViewById(R.id.edtName);
        edtSoNgayCongTac = (EditText) this.findViewById(R.id.edtSoNgayCongTac);
        spNgatBatDau = (Spinner) this.findViewById(R.id.spNgayCongTac);
        btnOK = (Button) this.findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this);

        arrThu = new ArrayList<>();
        arrThu.add("Thu 2");
        arrThu.add("Thu 3");
        arrThu.add("Thu 4");
        arrThu.add("Thu 5");
        arrThu.add("Thu 6");
        arrThu.add("Thu 7");
        arrThu.add("Chu nhat");

        adapterThu = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrThu);
        adapterThu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spNgatBatDau.setAdapter(adapterThu);
    }

    @Override
    public void onClick(View view) {
        String ten = edtTen.getText().toString();
        String strNgayBatDau = spNgatBatDau.getSelectedItem().toString();
        String strSoNgay = edtSoNgayCongTac.getText().toString();
        int soNgay = Integer.parseInt(strSoNgay);

        if (ten.isEmpty() || strSoNgay.isEmpty()) {
            Toast.makeText(this, "Vui long nhap day du thong tin", Toast.LENGTH_SHORT).show();
            return;
        }
        NhanVien nhanVien = new NhanVien(ten, strNgayBatDau, soNgay);
        Toast.makeText(this, nhanVien.toString(), Toast.LENGTH_SHORT).show();
    }
}
