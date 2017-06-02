package com.example.kh.myapplication.Module;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.kh.myapplication.R;

/**
 * Created by kh on 6/2/2017.
 */

public class MyAdapter extends BaseAdapter {
    private  Context context;
  private String[] strings= new String[]{"12"};
    private LayoutInflater inflater;
    private int resource;
    public MyAdapter(Context context,int resource, String[] strings){
        this.context = context;
        this.strings = strings;
        this.resource = resource;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        return strings[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView , ViewGroup parent) {
        View view = convertView;
        ViewHolder holder = null;
        if(view == null){
            view  = inflater.inflate(resource, parent,false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else holder = (ViewHolder) convertView.getTag();
        holder.txt.setText(strings[position]);
        return view;

    }

    public static class ViewHolder{
       // @BindView(R.id.txt_layout)
        TextView txt;
        public ViewHolder(View view){
            txt = (TextView) view.findViewById(R.id.txt_layout);
          //  ButterKnife.bind(this,view);
        }
    }
}
