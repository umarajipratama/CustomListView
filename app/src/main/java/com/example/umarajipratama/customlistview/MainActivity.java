package com.example.umarajipratama.customlistview;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity{

    ListView list;
    String[] itemname ={
            "Chrome",
            "Facebook",
            "File Manager",
            "Mozila Firefox",
            "Google Plus",
            "Gallery",
            "Gmail",
            "Instagram",
            "Line",
            "Twitter",
            "Music Player",
            "Youtube",
            "Camera",
    };

    Integer[] imgid={
            R.drawable.ch,
            R.drawable.fb,
            R.drawable.fm,
            R.drawable.fx,
            R.drawable.g,
            R.drawable.gallery,
            R.drawable.gmail,
            R.drawable.ig,
            R.drawable.line,
            R.drawable.tw,
            R.drawable.music,
            R.drawable.yt,
            R.drawable.camera,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}