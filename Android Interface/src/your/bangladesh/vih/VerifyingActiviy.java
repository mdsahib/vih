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
import android.widget.EditText;

/**
 * @author Shaon
 *
 */
public class VerifyingActiviy extends Activity {

	EditText etRegID,etRegIssue,etRegExp;
	String loginStatus;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// TODO Put your code here
		setContentView(R.layout.checking_vi);
	
		
	etRegID = (EditText) findViewById(R.id.editText_checking_reg_id);		
	etRegIssue = (EditText) findViewById(R.id.editText_checking_reg_issue_date);
	etRegExp = (EditText) findViewById(R.id.editText_checking__reg_expire_date);
	
	etRegExp.setError("Invalid Register");
	etRegExp.setError("Invalid Register");
	etRegIssue.setError("Invalid Register");
		
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
				
//				Intent loginSuccessIntent = new Intent(getApplicationContext(),.class);
//				startActivity(loginSuccessIntent);
				
			}// end of if else condition

		} catch (JSONException e) {

			Log.e("<<<- LoginActivity parseResponse() ->>>", "Exception is :" + e);

		}// end of exception handling

	}// end of parseResponse()
}
