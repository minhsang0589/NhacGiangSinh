package com.nhacgiangsinhdangkhoamuavonganngai.nhacgiangsinh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BaihatAdapter extends RecyclerView.Adapter<BaihatAdapter.ViewHolder> {
//    Context context;
    ArrayList<Baihat> arrayList = new ArrayList<>();
    OnItemClicked onClick;



    public BaihatAdapter( OnItemClicked onClick, ArrayList<Baihat> arrayList) {
//        this.context = context;
        this.arrayList = arrayList;
        this.onClick=onClick;




    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v =LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dongbaihat,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.textView.setText(arrayList.get(i).getTenbh());
//        viewHolder.textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClick.onItemClick(i);
//
//            }
//        });



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        int baihat;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.tvbaihat);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClick.onItemClick(getPosition());

                }
            });

        }
    }
    public interface OnItemClicked {
        void onItemClick(int i);
    }

}
//    private Context context;
//    private int layout;
//    private List<Baihat> baihatList;
//
//    public BaihatAdapter(Context context, int layout, List<Baihat> baihatList) {
//        this.context = context;
//        this.layout = layout;
//        this.baihatList = baihatList;
//    }
//
//    @Override
//    public int getCount() {
//        return baihatList.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder viewHolder;
//        if (convertView==null) {
//            convertView = LayoutInflater.from(context).inflate(R.layout.dongbaihat, parent, false);
////            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
////            convertView = inflater.inflate(layout, null);
//            viewHolder = new ViewHolder();
//            viewHolder.tenbh = (TextView) convertView.findViewById(R.id.tvbaihat);
//            convertView.setTag(viewHolder);
//        }else {
//            viewHolder= (ViewHolder) convertView.getTag();
//
//            Baihat baihat=baihatList.get(position);
//        viewHolder.tenbh.setText(baihat.getTenbh());
//        }
//
//        return convertView;
//    }
//    private class ViewHolder{
//        TextView tenbh;
//
//    }
//}
