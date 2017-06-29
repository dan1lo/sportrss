package sport.recife;

import sport.recife.R;

import android.app.Activity;
import android.os.Bundle;


import android.text.util.Linkify;
import android.widget.TextView;
public class RedesSociais extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.redes);
		TextView lbl_orkut = (TextView) findViewById(R.id.lbl_orkut);
		TextView lbl_face = (TextView) findViewById(R.id.lbl_face);
		TextView lbl_twitter = (TextView) findViewById(R.id.lbl_twitter);
		TextView lbl_youtube = (TextView) findViewById(R.id.lbl_youtube);
		
		
		Linkify.addLinks(lbl_orkut, Linkify.WEB_URLS);
		Linkify.addLinks(lbl_face, Linkify.WEB_URLS);
		Linkify.addLinks(lbl_twitter, Linkify.WEB_URLS);
		Linkify.addLinks(lbl_youtube, Linkify.WEB_URLS);
		
		
	}

}
