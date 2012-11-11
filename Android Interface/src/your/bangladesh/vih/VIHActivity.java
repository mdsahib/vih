package your.bangladesh.vih;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class VIHActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checking_vi);
        
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {

				Intent loginIntent = new Intent(VIHActivity.this,
						LoginActivity.class);
				
				startActivity(loginIntent);
				finish();

			}// end of run()

		}, 10000); // end of postDelayed after 6000 means 6 seconds.

    }
}