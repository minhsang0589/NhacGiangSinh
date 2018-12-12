package com.nhacgiangsinhdangkhoamuavonganngai.nhacgiangsinh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class BaihatAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Baihat> baihatList;

    public BaihatAdapter(Context context, int layout, List<Baihat> baihatList) {
        this.context = context;
        this.layout = layout;
        this.baihatList = baihatList;
    }

    @Override
    public int getCount() {
        return baihatList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.dongbaihat, parent, false);
//            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = inflater.inflate(layout, null);
            viewHolder = new ViewHolder();
            viewHolder.tenbh = (TextView) convertView.findViewById(R.id.tvbaihat);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();

            Baihat baihat=baihatList.get(position);
        viewHolder.tenbh.setText(baihat.getTenbh());
        }

        return convertView;
    }
    private class ViewHolder{
        TextView tenbh;

    }
}
