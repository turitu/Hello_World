package chapter.two.hello_wprld;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by mlandin on 2/21/14.
 */
public class NewPlanet extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
}
