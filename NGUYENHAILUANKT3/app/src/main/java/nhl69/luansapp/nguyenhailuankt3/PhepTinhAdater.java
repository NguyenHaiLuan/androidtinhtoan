package nhl69.luansapp.nguyenhailuankt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhepTinhAdater extends BaseAdapter {
    private Context context;
    private List<PhepTinh> arrayList;
    private int layout;

    public PhepTinhAdater(Context context, List<PhepTinh> arrayList, int layout) {
        this.context = context;
        this.arrayList = arrayList;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        PhepTinh phepTinh = arrayList.get(i);

        TextView ten = convertView.findViewById(R.id.tenpheptinh);
        TextView bieutuong = convertView.findViewById(R.id.bieutuong);

        ten.setText(phepTinh.getTenpheptinh());
        bieutuong.setText(phepTinh.getBieutuong());

        return convertView;
    }
}
