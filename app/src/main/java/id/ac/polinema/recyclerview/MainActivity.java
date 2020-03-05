package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleSimpleButton(View view) {
		Intent intent = new Intent(this, SimpleActivity.class);
		startActivityForResult(intent, 1);
	}

	public void handleLogoButton(View view) {
		Intent intent = new Intent(this, LogoActivity.class);
		startActivityForResult(intent, 1);
	}

	public void handleGridButton(View view) {
		Intent intent = new Intent(this, GridActivity.class);
		startActivityForResult(intent, 1);
	}

	public void handleViewTypeButton(View view) {
		Intent intent = new Intent(this, ViewTypeActivity.class);
		startActivityForResult(intent, 1);
	}

    public void handleExerciseButton(View view) {
		Intent intent = new Intent(this, ExerciseActivity.class);
		startActivityForResult(intent, 1);
    }
}
