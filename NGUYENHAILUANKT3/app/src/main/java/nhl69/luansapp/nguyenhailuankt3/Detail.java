package nhl69.luansapp.nguyenhailuankt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private Button tinh;

    int thuchien;
    private ImageView hinhpheptinh;
    private EditText stt1, stt2;
    private TextView kq;
    ListView listView;
    SharedPreferences sharedPreferences;
    TextView save;

    @Override
    protected void onStart() {
        super.onStart();
        sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);
        save.setText(sharedPreferences.getString("ketquacu", ""));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        save = findViewById(R.id.ketqualuu);
        tinh = findViewById(R.id.tinhbtn);
        hinhpheptinh = findViewById(R.id.hinhpheptinh);
        stt1 = findViewById(R.id.st1);
        stt2 = findViewById(R.id.st2);
        kq = findViewById(R.id.ketqua);
        listView = (ListView) findViewById(R.id.listpheptinh);
        thuchien = getIntent().getIntExtra("thuchien", 0);
        if (thuchien != 4) {
            tinh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double a, b;
                    a = Double.parseDouble(stt1.getText().toString());
                    b = Double.parseDouble(stt2.getText().toString());
                    switch (thuchien) {
                        case 0:
                            double cong = a + b;
                            kq.setText(cong + "");
                            break;
                        case 1:
                            double tru = a - b;
                            kq.setText(tru + "");
                            break;
                        case 2:
                            double nhan = a * b;
                            kq.setText(nhan + "");
                            break;
                        case 3:
                            double chia = a * 1.0 / b;
                            kq.setText(chia + "");
                            break;
                        case 4:
                            double log = Math.log(a);
                            kq.setText(log + "");
                            break;
                        case 5:
                            int div  = (int) (a/b);
                            kq.setText(div + "");
                            break;
                        case 6:
                            double mod = a%b;
                            kq.setText(mod + "");
                            break;
                    }

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("ketquacu", save.getText().toString().trim());
                    editor.commit();
                }
            });
        }
    }
}