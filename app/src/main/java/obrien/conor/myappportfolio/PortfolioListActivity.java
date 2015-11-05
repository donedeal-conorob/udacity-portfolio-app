package obrien.conor.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioListActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton1, mButton2, mButton3, mButton4, mButton5, mButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_list);

        mButton1 = (Button) findViewById(R.id.button_1);
        mButton2 = (Button) findViewById(R.id.button_2);
        mButton3 = (Button) findViewById(R.id.button_3);
        mButton4 = (Button) findViewById(R.id.button_4);
        mButton5 = (Button) findViewById(R.id.button_5);
        mButton6 = (Button) findViewById(R.id.button_6);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view == null) {
            return;
        }

        if (view == mButton1) {
            Toast.makeText(this, getString(R.string.portfolio_button1_message), Toast.LENGTH_SHORT).show();
        }
        else if (view == mButton2) {
            Toast.makeText(this, getString(R.string.portfolio_button2_message), Toast.LENGTH_SHORT).show();
        }
        else if (view == mButton3) {
            Toast.makeText(this, getString(R.string.portfolio_button3_message), Toast.LENGTH_SHORT).show();
        }
        else if (view == mButton4) {
            Toast.makeText(this, getString(R.string.portfolio_button4_message), Toast.LENGTH_SHORT).show();
        }
        else if (view == mButton5) {
            Toast.makeText(this, getString(R.string.portfolio_button5_message), Toast.LENGTH_SHORT).show();
        }
        else if (view == mButton6) {
            Toast.makeText(this, getString(R.string.portfolio_button6_message), Toast.LENGTH_SHORT).show();
        }
    }
}
