package com.example.testforunderlinetext;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView mTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mTextView=(TextView)findViewById(R.id.txtview);
		
		/*String udata="This is Google";
		SpannableString content = new SpannableString(udata);
		content.setSpan(new UnderlineSpan(), 8, udata.length(), 0);
		mTextView.setText(content);*/
		
		String wText = "This is ";
		String underlineText = "Google";

		SpannableStringBuilder ssb = new SpannableStringBuilder();
		ssb.append(wText);
		ssb.append(underlineText);
		ssb.setSpan(new UnderlineSpan(), ssb.length()-underlineText.length(), ssb.length(),0);
		ssb.setSpan(new TextAppearanceSpan("normal", android.R.style.TextAppearance_DeviceDefault, 18, 
		    ColorStateList.valueOf(Color.BLACK), ColorStateList.valueOf(Color.RED)),
		    ssb.length()-underlineText.length(), ssb.length(), 0);

		/*TextView tv1 = (TextView) findViewById(R.id.spannable_text1);*/
		mTextView.setText(ssb);

		/*TextView tv2 = (TextView) findViewById(R.id.spannable_text2);
		tv2.setText(Html.fromHtml(wText + "<u><font color=\"#FF0000\">" + underlineText + "</font></u>"));*/
		
	}

}
