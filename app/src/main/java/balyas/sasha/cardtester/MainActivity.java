package balyas.sasha.cardtester;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
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
        rView.setHasFixedSize(true);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setLayoutManager(
                new GridLayoutManager(rView.getContext(), 1, GridLayoutManager.HORIZONTAL, false));

      /*  LinearSnapHelper snapHelper = new LinearSnapHelper() {
            @Override
            public int findTargetSnapPosition(RecyclerView.LayoutManager lm, int velocityX, int velocityY) {
                View centerView = findSnapView(lm);
                if (centerView == null)
                    return RecyclerView.NO_POSITION;

                int position = lm.getPosition(centerView);
                int targetPosition = -1;
                if (lm.canScrollHorizontally()) {
                    if (velocityX < 0) {
                        targetPosition = position - 1;
                    } else {
                        targetPosition = position + 1;
                    }
                }

                if (lm.canScrollVertically()) {
                    if (velocityY < 0) {
                        targetPosition = position - 1;
                    } else {
                        targetPosition = position + 1;
                    }
                }

                final int firstItem = 0;
                final int lastItem = lm.getItemCount() - 1;
                targetPosition = Math.min(lastItem, Math.max(targetPosition, firstItem));
                return targetPosition;
            }
        };
        snapHelper.attachToRecyclerView(rView);*/
        rView.setAdapter(rcAdapter);
    }



    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Українська мова та література", "23.05.2017", "Політехнічний Ліцей НТУУ КПІ", "м. Київ, Проспект Перемоги 37, корпус 7"));
        allItems.add(new ItemObject("Математика", "31.05.2017", "Політехнічний Ліцей НТУУ КПІ", "м. Київ, Проспект Перемоги 37, корпус 7"));
        allItems.add(new ItemObject("Географія", "12.06.2017", "Державний Університет Україна", "м. Київ, вулиця Львівська 23"));
        allItems.add(new ItemObject("Фізика", "14.06.2017", "Державний Університет Україна", "м. Київ, вулиця Львівська 23"));


        return allItems;
    }

}
