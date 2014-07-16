package es.pymeapps.eventosdeportivos;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "63ZmEGoPdQAEIIbWjxogb7FdpZSX4VVvVz3IlB9L", "kbz7tWgOPtqtVFn1HqwF6MFeYXF9T0ZhCNtjjMeN");


		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		defaultACL.setPublicWriteAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
	}

}
