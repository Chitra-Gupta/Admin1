package chitra.helloworld.homepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:
                Toast.makeText(this,"Bye",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void homebtn(View view) {
        Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
    }
    public void updatebtn(View view) {
        Toast.makeText(this," Construction Update",Toast.LENGTH_SHORT).show();
    }
    public void addbtn(View view) {
        Toast.makeText(this,"Add Property ",Toast.LENGTH_SHORT).show();
    }
    public void viewbtn(View view) {
        Toast.makeText(this,"View Property ",Toast.LENGTH_SHORT).show();
    }
    public void customerbtn(View view) {
        Toast.makeText(this,"Customer Details",Toast.LENGTH_SHORT).show();
    }
    public void contactbtn(View view) {
        Toast.makeText(this,"Contact Enquiry",Toast.LENGTH_SHORT).show();
    }

}