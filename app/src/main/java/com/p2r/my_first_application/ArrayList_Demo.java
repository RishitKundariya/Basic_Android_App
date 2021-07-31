package com.p2r.my_first_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArrayList_Demo extends AppCompatActivity {

    ArrayList<Model_demo_Arraylist> listf=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list_demo);
        setDetails();
        setListaAdapter();

    }
    public void setDetails(){

        listf.add(new Model_demo_Arraylist(R.drawable.lion,"Prit Kathrotiya","The lion (Panthera leo) is a large felid of the genus Panthera native mainly to Gir. It has a muscular, deep-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail. "));
        listf.add(new Model_demo_Arraylist(R.drawable.tiger,"Prince Koringa","The tiger (Panthera tigris) is the largest living cat species and a member of the genus Panthera. It is most recognisable for its dark vertical stripes on orange-brown fur with a lighter underside. "));
        listf.add(new Model_demo_Arraylist(R.drawable.hasti,"Shubham Maradia","Entertainment Journalist राजस्थान में पैदा होने वाले हस्तीमल हस्ती एक प्रसिद्ध शायर हैं जिनकी ग़ज़लों को जगजीत सिंह से लेकर पंकज उधास तक सभी ने गाया।  "));
        listf.add(new Model_demo_Arraylist(R.drawable.langoor,"Rushi Pandya","Gray langurs, also called Hanuman langurs or Hanuman monkeys, are Old World monkeys native to the Indian subcontinent constituting the genus Semnopithecus "));
        listf.add(new Model_demo_Arraylist(R.drawable.vjs,"Jay Sakhiya","Vijaya Gurunatha Sethupathi Kalimuthu (born 16 January 1978), known professionally as Vijay Sethupathi, is an Indian actor, producer, lyricist, and dialogue writer. Sethupathi works predominantly in Tamil besides few Malayalam, Telugu and Hindi productions."));

    }
    public  void setListaAdapter(){
      Listview_custom_adapter arryadpter= new Listview_custom_adapter(listf,this);
        ListView lvlistview=findViewById(R.id.lvview);
        lvlistview.setAdapter(arryadpter);
    }
}