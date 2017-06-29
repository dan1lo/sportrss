package sport.recife;


import sport.recife.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class Links extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.links);
		
		TextView lbl_sportnet = (TextView)findViewById(R.id.lbl_sportnet);
		TextView lbl_sportclub = (TextView) findViewById(R.id.lbl_sportclub);
		TextView lbl_blogTorcedor = (TextView) findViewById(R.id.lbl_blogtorcedor);
		TextView lbl_meusport = (TextView) findViewById(R.id.lbl_meusport);
		TextView lbl_sportoficial = (TextView) findViewById(R.id.lbl_sportoficial);
		
		
		Linkify.addLinks(lbl_sportnet, Linkify.WEB_URLS);
		Linkify.addLinks(lbl_sportclub, Linkify.WEB_URLS);
		Linkify.addLinks(lbl_blogTorcedor, Linkify.WEB_URLS);
		Linkify.addLinks(lbl_meusport, Linkify.WEB_URLS);
		Linkify.addLinks(lbl_sportoficial,Linkify.WEB_URLS);
		
	}
	
}
