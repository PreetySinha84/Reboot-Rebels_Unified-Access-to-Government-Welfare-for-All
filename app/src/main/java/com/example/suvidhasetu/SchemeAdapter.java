package com.example.suvidhasetu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class SchemeAdapter extends ArrayAdapter<Scheme> {

    public SchemeAdapter(Context context, List<Scheme> schemes) {
        super(context, 0, schemes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Scheme scheme = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.scheme_item, parent, false);
        }

        TextView title = convertView.findViewById(R.id.schemeTitle);
        TextView desc = convertView.findViewById(R.id.schemeDesc);

        title.setText(scheme.title);
        desc.setText(scheme.description);

        return convertView;
    }
}
