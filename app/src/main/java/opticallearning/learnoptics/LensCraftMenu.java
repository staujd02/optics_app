package opticallearning.learnoptics;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Joel on 7/1/2016.
 */
public class LensCraftMenu extends ListActivity{

    //ToDo generate pages[] dynamically based on user data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lenscraft_extended);
        setTitle("Explore");

        //This array needs to be generated dynamically based on user data
        String[] pages = {"Background","Concave vs. Convex","N Index","Height","Distance","Lens Width","Number of Lens"};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,pages));
    }

    public void onBackPressed() {
        startActivity(new Intent(LensCraftMenu.this, MainActivity.class));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position){
            case 0:
                startActivity(new Intent(LensCraftMenu.this, BGLensCraft.class));
                break;
            case 1:
                startActivity(new Intent(LensCraftMenu.this, ConcaveConvex.class));
                break;
            case 2:
                startActivity(new Intent(LensCraftMenu.this, NIndex.class));
                break;
            case 3:
                startActivity(new Intent(LensCraftMenu.this, Shew.class));
                break;
            case 4:
                startActivity(new Intent(LensCraftMenu.this, Distances.class));
                break;
            case 5:
                startActivity(new Intent(LensCraftMenu.this, LensWidth.class));
                break;
            case 6:
                startActivity(new Intent(LensCraftMenu.this, NumberOfLens.class));
                break;
        }
    }
}