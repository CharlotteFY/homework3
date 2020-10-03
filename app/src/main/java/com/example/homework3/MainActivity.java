package com.example.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        MyAdapter adapter = new MyAdapter();

        //เข้าถึง  rc ที่อยู่ใน layout ;
        RecyclerView recyclerView = findViewById(R.id.world_list_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
        WordItem item,item2,item3,item4,item5,item6,item7,item8,item9;

        public MyAdapter(){
            item = new WordItem(R.drawable.cat,"CAT" , "แมว");
            item2 = new WordItem(R.drawable.dog,"DOG", "หมา");
            item3 = new WordItem(R.drawable.dolphin,"dolphin", "โลมา");
            item4 = new WordItem(R.drawable.koala,"koala", "โคโอล่า");
            item5 = new WordItem(R.drawable.lion,"lion", "สิงโต");
            item6 = new WordItem(R.drawable.owl,"owl", "นกฮูก");
            item7 = new WordItem(R.drawable.penguin,"penguin", "เพนกิว");
            item8 = new WordItem(R.drawable.pig,"pig", "หมู");
            item9 = new WordItem(R.drawable.rabbit,"rabbit", "กระต่าย");

        }


        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_world, parent, false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            if(position==0){
                holder.imageView.setImageResource(item.imageResId);
                holder.textView.setText(item.word);
                holder.textViewTH.setText(item.wordTH);

            }
            else if (position== 1) {
                holder.imageView.setImageResource(item2.imageResId);
                holder.textView.setText(item2.word);
                holder.textViewTH.setText(item2.wordTH);
            }
            else if (position==2) {
                holder.imageView.setImageResource(item3.imageResId);
                holder.textView.setText(item3.word);
                holder.textViewTH.setText(item3.wordTH);
            }
            else if (position==3) {
                holder.imageView.setImageResource(item4.imageResId);
                holder.textView.setText(item4.word);
                holder.textViewTH.setText(item4.wordTH);
            }
            else if (position==4) {
                holder.imageView.setImageResource(item5.imageResId);
                holder.textView.setText(item5.word);
                holder.textViewTH.setText(item5.wordTH);
            }else if (position==5) {
                holder.imageView.setImageResource(item6.imageResId);
                holder.textView.setText(item6.word);
                holder.textViewTH.setText(item6.wordTH);
            }else if (position==6) {
                holder.imageView.setImageResource(item7.imageResId);
                holder.textView.setText(item7.word);
                holder.textViewTH.setText(item7.wordTH);
            }else if (position==7) {
                holder.imageView.setImageResource(item8.imageResId);
                holder.textView.setText(item8.word);
                holder.textViewTH.setText(item8.wordTH);
            }else{
                holder.imageView.setImageResource(item9.imageResId);
                holder.textView.setText(item9.word);
                holder.textViewTH.setText(item9.wordTH);
            }
        }

        @Override
        public int getItemCount() {
            return 9;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView textView;
            TextView textViewTH;
            public  MyViewHolder(@NonNull View itemView){
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view);
                textView = itemView.findViewById(R.id.word_text_view);
                textViewTH = itemView.findViewById(R.id.word_text_view2);
            }

        }
    }
}
