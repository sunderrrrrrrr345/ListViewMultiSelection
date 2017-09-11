package sunder.com.a360degreeinfodynamics.listviewmultiselection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import sunder.com.a360degreeinfodynamics.listviewmultiselection.adapter.MultiSelectionAdapter;
import sunder.com.a360degreeinfodynamics.listviewmultiselection.pogo.Product;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView mListView;


    Button btnShowCheckedItems;





    ArrayList<Product> mProducts;


    MultiSelectionAdapter<Product> mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(android.R.id.list);
        btnShowCheckedItems = (Button) findViewById(R.id.btnShowCheckedItems);
        mProducts = new ArrayList<Product>();


        mProducts.add(new Product("Pendrive"));


        mProducts.add(new Product("Laptop"));


        mProducts.add(new Product("Mouse"));


        mProducts.add(new Product("Keyboard"));


        mProducts.add(new Product("HDD"));


        mProducts.add(new Product("Ram"));


        mProducts.add(new Product("Cable"));


        mProducts.add(new Product("Monitor"));


        mProducts.add(new Product("Cabinate"));


        mProducts.add(new Product("CMOS"));


        mProducts.add(new Product("Charger"));


        mProducts.add(new Product("Processor"));


        mProducts.add(new Product("Laptop Bag"));


        mProducts.add(new Product("Laptop Stand"));


        mProducts.add(new Product("Head Phone"));


        mProducts.add(new Product("Mike"));


        mProducts.add(new Product("Bluetooth"));


        mProducts.add(new Product("Dongle"));





        mAdapter = new MultiSelectionAdapter(this, mProducts);


        mListView.setAdapter(mAdapter);
        btnShowCheckedItems.setOnClickListener(this);
    }




    @Override


    public void onClick(View v) {


        // TODO Auto-generated method stub





        if(mAdapter != null) {


            ArrayList<Product> mArrayProducts = mAdapter.getCheckedItems();


       //     Log.d(MainActivity.class.getSimpleName(), "Selected Items: " + mArrayProducts.toString());


   //         Toast.makeText(getApplicationContext(), "Selected Items: " + mArrayProducts.toString(), Toast.LENGTH_LONG).show();


        }


    }



}
