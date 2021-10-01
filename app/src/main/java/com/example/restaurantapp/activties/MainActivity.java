package com.example.restaurantapp.activties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AbsListView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.adapter.SegmentOneAdpter;
import com.example.restaurantapp.adapter.SegmentTwoAdapter;
import com.example.restaurantapp.databinding.ActivityMainBinding;
import com.example.restaurantapp.dataclass.SegmentOne;
import com.example.restaurantapp.dataclass.Segments;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayList<SegmentOne> dataSegmentOne=new ArrayList<SegmentOne>();
    ArrayList<Segments> dataSegmentTwo=new ArrayList<Segments>();
 Boolean scrolling=false;
 int cItems,tItems,scItems;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toolbar actionBar=binding.tbMainActivity;
        if (actionBar != null) {
            actionBar.setNavigationIcon(R.drawable.back_foreground);
            actionBar.setTitle("Menu Card");

        }
        actionBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        addDataSegmentOne();
        addDataSegmentTwo();
        setUpSegmentOneRecyclerView();
        setUpSegmentTwoRecyclerView();
    }
    void setUpSegmentOneRecyclerView(){
        SegmentOneAdpter segmentOneAdpter=new SegmentOneAdpter(dataSegmentOne,MainActivity.this);
        binding.rvSegmentOne.setHasFixedSize(true);
        binding.rvSegmentOne.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.rvSegmentOne.setAdapter(segmentOneAdpter);
    }
    void setUpSegmentTwoRecyclerView(){
        SegmentTwoAdapter segmentTwoAdpater =new SegmentTwoAdapter(dataSegmentTwo,MainActivity.this);
        binding.rvSegmentTwo.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.rvSegmentTwo.setLayoutManager(linearLayoutManager);
        binding.rvSegmentTwo.setAdapter(segmentTwoAdpater);
        binding.rvSegmentTwo.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if(newState== AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL){
                    scrolling=true;
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                cItems=linearLayoutManager.getChildCount();
                tItems=linearLayoutManager.getItemCount();
                scItems=linearLayoutManager.findFirstVisibleItemPosition();
                if(scrolling&&(cItems+scItems==tItems)){
                    scrolling=false;
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            dataSegmentTwo.add(new Segments(R.drawable.northindian, "North Indian", 100));
                            dataSegmentTwo.add(new Segments(R.drawable.south, "South Indian", 80));
                            dataSegmentTwo.add(new Segments(R.drawable.thai, "Thai", 120));
                            dataSegmentTwo.add(new Segments(R.drawable.rajasthani, "Rajasthani", 110));
                            dataSegmentTwo.add(new Segments(R.drawable.gujarati, "Gujarati", 130));
                            dataSegmentTwo.add(new Segments(R.drawable.punjabi, "Punjabi", 125));
                            dataSegmentTwo.add(new Segments(R.drawable.chinese, "Chinese", 90));
                            dataSegmentTwo.add(new Segments(R.drawable.korean, "Korean", 70));
                            dataSegmentTwo.add(new Segments(R.drawable.italian, "Italian", 140));
                                segmentTwoAdpater.notifyDataSetChanged();

                        }
                    },1000);
                }
            }
        });
    }


    void addDataSegmentOne(){
        ArrayList<Segments> NorthIndina=new ArrayList<>();
        NorthIndina.add(new Segments(R.drawable.northindian, "North Indian", 100));
        NorthIndina.add(new Segments(R.drawable.south, "South Indian", 80));
        dataSegmentOne.add(new SegmentOne(R.drawable.northindian,"North Indina",NorthIndina));
        ArrayList<Segments> SouthIndina=new ArrayList<>();
        SouthIndina.add(new Segments(R.drawable.south, "south Indian", 100));
        SouthIndina.add(new Segments(R.drawable.south, "South Indian", 80));
        dataSegmentOne.add(new SegmentOne(R.drawable.south,"South Indina",SouthIndina));
        ArrayList<Segments> Thai=new ArrayList<>();
        Thai.add(new Segments(R.drawable.thai, "thai", 100));
        Thai.add(new Segments(R.drawable.south, "thai", 80));
        dataSegmentOne.add(new SegmentOne(R.drawable.thai,"thai",Thai));
        ArrayList<Segments> Punjabi=new ArrayList<>();
        Punjabi.add(new Segments(R.drawable.punjabi, "punjabi", 100));
        Punjabi.add(new Segments(R.drawable.south, "South Indian", 80));
        dataSegmentOne.add(new SegmentOne(R.drawable.punjabi,"punjabi",Punjabi));
        ArrayList<Segments> Korean=new ArrayList<>();
        Korean.add(new Segments(R.drawable.korean, "Korean", 100));
        Korean.add(new Segments(R.drawable.south, "South Indian", 80));
        dataSegmentOne.add(new SegmentOne(R.drawable.korean,"Korean",Korean));
        ArrayList<Segments> Chinese=new ArrayList<>();
        Chinese.add(new Segments(R.drawable.chinese, "chinese", 100));
        Chinese.add(new Segments(R.drawable.south, "South Indian", 80));
        dataSegmentOne.add(new SegmentOne(R.drawable.chinese,"Chinese",Chinese));
        ArrayList<Segments> Rajasthani=new ArrayList<>();
        Rajasthani.add(new Segments(R.drawable.rajasthani, "Rajasthani", 100));
        Rajasthani.add(new Segments(R.drawable.south, "South Indian", 80));
        dataSegmentOne.add(new SegmentOne(R.drawable.rajasthani,"Rajasthani",Rajasthani));
        ArrayList<Segments> Gujrati=new ArrayList<>();
        Gujrati.add(new Segments(R.drawable.gujarati, "Gujarati", 100));
        Gujrati.add(new Segments(R.drawable.south, "South Indian", 80));
        dataSegmentOne.add(new SegmentOne(R.drawable.gujarati,"Gujarati",Gujrati));
        ArrayList<Segments> Italina=new ArrayList<>();
        Italina.add(new Segments(R.drawable.italian, "Italian", 100));
        Italina.add(new Segments(R.drawable.south, "South Indian", 80));
        dataSegmentOne.add(new SegmentOne(R.drawable.italian,"Italina",Italina));



    }
    void addDataSegmentTwo(){
        dataSegmentTwo.add(new Segments(R.drawable.northindian, "North Indian", 100));
        dataSegmentTwo.add(new Segments(R.drawable.south, "South Indian", 80));
        dataSegmentTwo.add(new Segments(R.drawable.thai, "Thai", 120));
        dataSegmentTwo.add(new Segments(R.drawable.rajasthani, "Rajasthani", 110));
        dataSegmentTwo.add(new Segments(R.drawable.gujarati, "Gujarati", 130));
        dataSegmentTwo.add(new Segments(R.drawable.punjabi, "Punjabi", 125));
        dataSegmentTwo.add(new Segments(R.drawable.chinese, "Chinese", 90));
        dataSegmentTwo.add(new Segments(R.drawable.korean, "Korean", 70));
        dataSegmentTwo.add(new Segments(R.drawable.italian, "Italian", 140));


    }
}