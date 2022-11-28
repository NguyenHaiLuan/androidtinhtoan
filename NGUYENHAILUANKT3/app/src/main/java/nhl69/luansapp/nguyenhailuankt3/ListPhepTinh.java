package nhl69.luansapp.nguyenhailuankt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPhepTinh extends AppCompatActivity {
    ListView listView;
    ArrayList<PhepTinh> arrayList;
    PhepTinhAdater phepTinhAdater;

    private ImageView hinhpheptinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_phep_tinh);

        listView = (ListView) findViewById(R.id.listpheptinh);
        hinhpheptinh = findViewById(R.id.hinhpheptinh);

        arrayList = new ArrayList<>();

        arrayList.add(new PhepTinh("Cộng", "+"));
        arrayList.add(new PhepTinh("Trừ", "-"));
        arrayList.add(new PhepTinh("Nhân", "*"));
        arrayList.add(new PhepTinh("Chia", "+"));
        arrayList.add(new PhepTinh("Logarit", "+"));
        arrayList.add(new PhepTinh("Div", "+"));
        arrayList.add(new PhepTinh("Mod", "+"));

        phepTinhAdater = new PhepTinhAdater(ListPhepTinh.this, arrayList,R.layout.list_pheptinh_item);
        listView.setAdapter(phepTinhAdater);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListPhepTinh.this, Detail.class);
                intent.putExtra("thuchien",i);
                startActivity(intent);
            }
        });
    }
}