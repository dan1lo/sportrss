package sport.recife;



import sport.recife.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends Activity {
	  public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.menu);
	        	
	        
	        //botoes da pagina
	        	Button btnHistoria = (Button)findViewById(R.id.btn_historia);
	        	Button btnNoticia = (Button)findViewById(R.id.btn_noticia);
	        	Button btnRedes = (Button)findViewById(R.id.btn_redes);
	        	Button btnPlacar = (Button)findViewById(R.id.btn_placar);
	        	Button btnContato = (Button)findViewById(R.id.btn_contato);
	        	Button btnTitulos = (Button)findViewById(R.id.btn_titulos);
	        	Button btnCampeonato = (Button) findViewById(R.id.btn_campeonatos);
	        	Button btnLinks = (Button) findViewById(R.id.btn_links);
	        	
	        	//testes
	        //final de botes da pagina	
	        	
	        //intents para ir a outra pagina	
	        	
	        	final Intent itTitulos = new Intent(this,Titulos.class);
	        	final Intent itNoticia = new Intent(this,SportRSS.class);
	        	final Intent itContato = new Intent(this,Contato.class);
	        	final Intent itRedes = new Intent(this,RedesSociais.class);
	        	//final Intent itHistoria = new Intent(this,Historia.class);
	        	//final Intent itElenco = new Intent(this,Elenco.class);
	        	final Intent itLinks = new Intent(this,Links.class);
	        	
	        //final dos intents	
	        
	        // inicio dos botoes
	        	btnNoticia.setOnClickListener(new OnClickListener(){

	    			public void onClick(View v) {
	    				
	    				startActivity(itNoticia);
	    			}
	        		
	        	
	        	});
	        	
	        	
	        	
	        	btnContato.setOnClickListener(new OnClickListener(){

	        		public void onClick(View v) {
	        			startActivity(itContato);
			
	        			}
		   
		   
	        	});
	        	
	        btnTitulos.setOnClickListener(new OnClickListener(){

				public void onClick(View v) {
					startActivity(itTitulos);
					
				}
	        	
	        	
	        	
	        	}
	            
	        );
	        
	        
	        btnRedes.setOnClickListener(new OnClickListener(){

				public void onClick(View v) {
					startActivity(itRedes);
					
				}
	        	
	        	
	        	
	        });
	        
	        btnPlacar.setOnClickListener(new OnClickListener(){
	        	
	        	public void onClick(View v){
	        		String url = "http://app.esporte.ig.com.br/temporeal/home.php?campeonato=brasileiroserieb2011" ;
					Uri uri = Uri.parse(url);
					Intent itPlacar = new Intent(Intent.ACTION_VIEW,uri);
					startActivity(itPlacar);
	        	}
	        	
	        });
	        
	    
        	
		       btnCampeonato.setOnClickListener(new OnClickListener(){

				public void onClick(View v) {
					String url = "http://esporte.uol.com.br/futebol/campeonatos/brasileiro/2011/serie-b/classificacao/classificacao.jhtm" ;
					Uri uri = Uri.parse(url);
					Intent itCampeonato = new Intent(Intent.ACTION_VIEW,uri);
					startActivity(itCampeonato);
				}
		    	   
		       	});
		       
		       btnLinks.setOnClickListener(new OnClickListener(){

				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					startActivity(itLinks);
					
				}
		    	   
		    	   
		       });
		    	
		        
		       btnHistoria.setOnClickListener(new OnClickListener(){
		        	
		        	public void onClick(View v){
		        		String url = "http://pt.wikipedia.org/wiki/Sport_Club_do_Recife" ;
						Uri uri = Uri.parse(url);
						Intent itHistoria = new Intent(Intent.ACTION_VIEW,uri);
						startActivity(itHistoria);
		        	}
		        	
		        });
		       
	        
	        
	        	
	        //final dos botoes	
	        	

	       
	      	        	
	        	
	        	
	        	
	  }
}