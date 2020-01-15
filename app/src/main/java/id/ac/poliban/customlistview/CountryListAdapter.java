package id.ac.poliban.customlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryListAdapter extends BaseAdapter {
    private List<Country> countries;

    public CountryListAdapter(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }


    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_country_list,parent,false);

        //mengenali view ke objek
        ImageView imgCountryListFalg = convertView.findViewById(R.id.img_country_flag_list);
        TextView tvCountryName = convertView.findViewById(R.id.tv_country_nama);
        TextView tvCountryDetail = convertView.findViewById(R.id.tv_country_detail);


    }
}


