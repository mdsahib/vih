/**
 * 
 */
package your.bangladesh.vih;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

/**
 * @author Shaon
 *
 */
public class LoginActivity extends Activity {
	
	String loginStatus;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// TODO Put your code here
		setContentView(R.layout.login);
		
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {

				Intent loginIntent = new Intent(LoginActivity.this,
						VIHActivity.class);
				
				startActivity(loginIntent);
				finish();

			}// end of run()

		}, 10000); // end of postDelayed after 6000 means 6 seconds.


	}
	
	/**
	 * 
	 * @param jsonString
	 */
	private void parseResponse(String jsonString) {

		JSONObject jsonObject;

		try {

			jsonObject = new JSONObject(jsonString);

			loginStatus = jsonObject.getString("success");

			if (loginStatus.equalsIgnoreCase("0")) {


			}else{
				
				Intent loginSuccessIntent = new Intent(getApplicationContext(),VerifyingActiviy.class);
				startActivity(loginSuccessIntent);
				
			}// end of if else condition

		} catch (JSONException e) {

			Log.e("<<<- LoginActivity parseResponse() ->>>", "Exception is :" + e);

		}// end of exception handling

	}// end of parseResponse()

}
