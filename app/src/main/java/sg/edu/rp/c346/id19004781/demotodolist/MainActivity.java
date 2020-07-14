package sg.edu.rp.c346.id19004781.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvItems;
    ArrayList <ToDoItem> alItems;
//    ArrayAdapter <String> aaItems;
    CustomAdapter caItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.listViewItems);

        alItems = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);
        Calendar date2 = Calendar.getInstance();
        date1.set(2020, 8, 2);
        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);
        alItems.add(item1);
        alItems.add(item2);

//        aaItems = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alItems);
        caItems = new CustomAdapter(this, R.layout.row, alItems);
        lvItems.setAdapter(caItems);





    }
}
