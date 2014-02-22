package chapter.two.hello_wprld;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    WorldGen earth = new WorldGen("Earth", 5973, 9.78);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setStartUpWorldValues();
        setStartUpScreenText();

        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
    }

    protected void setStartUpWorldValues() {
        earth.setPlanetColonies(1);
        earth.setPlanetMilitary(1);
        earth.setColonyImmigration(1000);
        earth.setBaseProtection(100);
        earth.turnForceFieldOn();
    }

    private void setStartUpScreenText() {
        TextView planetName = (TextView)findViewById(R.id.dataview1);
        planetName.setText(earth.planetName);

        TextView planetMass = (TextView)findViewById(R.id.dataview2);
        planetMass.setText(String.valueOf(earth.planetMass));

        TextView planetGravity = (TextView)findViewById(R.id.dataview3);
        planetGravity.setText(String.valueOf(earth.planetGravity));

        TextView planetColonies = (TextView)findViewById(R.id.dataview4);
        planetColonies.setText(String.valueOf(earth.planetColonies));

        TextView planetPopulation = (TextView)findViewById(R.id.dataview5);
        planetPopulation.setText(String.valueOf(earth.planetPopulation));

        TextView planetMilitary = (TextView)findViewById(R.id.dataview6);
        planetMilitary.setText(String.valueOf(earth.planetMilitary));

        TextView planetBases = (TextView)findViewById(R.id.dataview7);
        planetBases.setText(String.valueOf(earth.planetBases));

        TextView planetForcefield = (TextView)findViewById(R.id.dataview8);
        planetForcefield.setText(String.valueOf(earth.planetProtection));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        /*
        if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
