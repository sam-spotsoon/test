package com.bigappcompany.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/**
		 * TODO:
		 * There are 3 fragment holders in the activity_main layout
		 * fl_fragment_bottom_left and fl_fragment_bottom_right fragments must contain a RecyclerView
		 * with items displaying its position 0, 1, 2, 3 ...etc
		 *
		 * 1) When the Recycler view in the fl_fragment_bottom_right scrolled by user
		 * the Recycler View in the fl_fragment_bottom_left must also scroll at the same offset in the reverse
		 * direction automatically and vice-versa
		 *
		 * 2) When user is clicked on any of the recycler item you need to display the position on the top fragment
		 * in a textView "Clicked position is : x", where x is the clicked item position in the recycler view
		 *
		 * Constraints: You must have 3 fragments attached to the aforementioned fragment holders.
		 *              Maintain best coding practices and styles.
		 *              Add comments wherever it's necessary.
		 */
		
	}
}
