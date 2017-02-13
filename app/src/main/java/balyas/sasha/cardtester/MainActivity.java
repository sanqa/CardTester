package balyas.sasha.cardtester;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  setTitle(null);

     /*   Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setLogo(R.mipmap.ic_launcher);*/

        List<ItemObject> rowListItem = getAllItemList();
       /* if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            lLayout = new GridLayoutManager(MainActivity.this, BIND_AUTO_CREATE);
        } else {
            lLayout = new GridLayoutManager(MainActivity.this, BIND_AUTO_CREATE);
        } */

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }



    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Українська мова та література", "23.05.2017", "Політехнічний Ліцей НТУУ КПІ", "м. Київ, Проспект Перемоги 37, корпус 7"));
        allItems.add(new ItemObject("Математика", "08.06.2017", "Політехнічний Ліцей НТУУ КПІ", "м. Київ, Проспект Перемоги 37, корпус 7"));
        allItems.add(new ItemObject("Географія", "12.06.2017", "Державний Університет Україна", "м. Київ, вулиця Львівська 23"));
        allItems.add(new ItemObject("Фізика", "14.06.2017", "Державний Університет Україна", "м. Київ, вулиця Львівська 23"));


        return allItems;
    }

}
