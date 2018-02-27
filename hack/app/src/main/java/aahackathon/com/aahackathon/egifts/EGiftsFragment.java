package aahackathon.com.aahackathon.egifts;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;

import aahackathon.com.aahackathon.R;
import aahackathon.com.aahackathon.utils.ImageListAdapter;

/**
 * Created by MURARI.RAVINATH on 27-02-2018.
 */

public class EGiftsFragment extends Fragment{


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.egifts_fragment, container, false);
        TextView tv = (TextView) v.findViewById(R.id.text);
        ListView lV = (ListView) v.findViewById(R.id.list1);
        ArrayList<String> images = new ArrayList();
        tv.setText(this.getTag() + " Content");
        Bundle giftsBundle = this.getArguments();
        if(giftsBundle!=null){
             images = giftsBundle.getStringArrayList("images");
        }
//        ArrayAdapter<String> mHistory = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, images);
        lV.setAdapter(new ImageListAdapter(getActivity(), images));
        return v;
    }


}
