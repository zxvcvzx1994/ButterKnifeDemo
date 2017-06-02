package com.example.kh.myapplication.View;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.kh.myapplication.Module.MyAdapter;
import com.example.kh.myapplication.R;

import butterknife.BindArray;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
    @BindView(R.id.list_view)
    ListView listView;
    @BindArray(R.array.day)
    String[] strings;
    ListView listView1;
    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        ButterKnife.bind(this,view);
        listView1 = (ListView) view.findViewById(R.id.list_view);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        MyAdapter myAdapter = new MyAdapter(getActivity(),R.layout.layout,strings);

       // listView1.setAdapter(myAdapter);

    }
}
