package es.pymeapps.eventosdeportivos;

import es.pymeapps.eventosdeportivos.eventos.Eventos;
import es.pymeapps.eventosdeportivos.informacion.Informacion;
import es.pymeapps.eventosdeportivos.noticias.Noticias;
import es.pymeapps.eventosdeportivos.servicios.Servicios;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Inicio extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);

		initComponents();

	}

	private void initComponents() {

		ImageView imgbtn_inicio_informacion = (ImageView) findViewById(R.id.imgbtn_inicio_informacion);
		imgbtn_inicio_informacion.setOnClickListener(this);

		ImageView imgbtn_inicio_eventos = (ImageView) findViewById(R.id.imgbtn_inicio_eventos);
		imgbtn_inicio_eventos.setOnClickListener(this);

		ImageView imgbtn_inicio_noticias = (ImageView) findViewById(R.id.imgbtn_inicio_noticias);
		imgbtn_inicio_noticias.setOnClickListener(this);

		ImageView imgbtn_inicio_servicios = (ImageView) findViewById(R.id.imgbtn_inicio_servicios);
		imgbtn_inicio_servicios.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.imgbtn_inicio_informacion:

			startActivity(new Intent(this, Informacion.class));

			break;

		case R.id.imgbtn_inicio_eventos:

			startActivity(new Intent(this, Eventos.class));

			break;

		case R.id.imgbtn_inicio_noticias:

			startActivity(new Intent(this, Noticias.class));

			break;

		case R.id.imgbtn_inicio_servicios:

			startActivity(new Intent(this, Servicios.class));

			break;

		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
