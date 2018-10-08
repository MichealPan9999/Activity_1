package com.example.panzq.simpleandroid_1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_a extends Activity {

    EditText et_content;
    TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        et_content = findViewById(R.id.et_content);
        tv_result = findViewById(R.id.tv_result);
        Log.d("panzqww","A ######### onCreate");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("panzqww","A ######### onConfigurationChanged "+newConfig.orientation);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("panzqww","A ######## onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("panzqww","A ######### onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("panzqww","A ########## onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("panzqww","A ############ onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("panzqww","A ######## onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("panzqww","A ######## onDestroy");
    }

    public void jumpTob(View view){
        //Intent intent = new Intent(this,Activity_b.class);
        //startActivity(intent);
        //startActivityForResult(intent,RESULT_FIRST_USER);
        //toView();
        //toEdit();
        //toDial();
        /*Intent intent = new Intent();
        intent.setClass(Activity_a.this,Activity_b.class);
        Activity_a.this.startActivity(intent);*/
        /*Intent intent = new Intent();
        //new ComponentName("包名(应用本身所在的包，通过AndroidManifest.xml中package属性查看)","包名.类名(Activity所在的包)");
        ComponentName comp = new ComponentName("com.example.panzq.simpleandroid_1","com.example.panzq.simpleandroid_1.Activity_b");
        //或者intent.setClassName("包名","包名.类名");
        intent.setComponent(comp);
        startActivity(intent);*/
        /*Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN); // 应用程序的入口
        intent.addCategory(Intent.CATEGORY_HOME); // 桌面的应用程序
        startActivity(intent);*/
        /*Intent intent = new Intent();
        intent.putExtra("name", "诸葛亮");
        intent.putExtra("age", 50);
        intent.putExtra("IQ", 200.0f);
        intent.setClass(Activity_a.this, Activity_b.class);
        Activity_a.this.startActivity(intent);*/
        /*Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("name", "乔峰");
        bundle.putInt("age", 40);
        bundle.putFloat("weight", 70.4f);
        intent.putExtras(bundle);
        intent.setClass(Activity_a.this, Activity_b.class);
        Activity_a.this.startActivity(intent);*/
        Intent intent = new Intent();
        Person person = new Person("孙悟空",500,55.6f);
        intent.putExtra("person", person);
        intent.setClass(Activity_a.this, Activity_b.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("panzqww","requestCode = " + requestCode + ", resultCode = " + resultCode );

        if (data != null) {
            String result = data.getExtras().getString("result");
            tv_result.setText("requestCode = " + requestCode + ", resultCode = " + resultCode + " , result = " + result);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("panzqww","A --- onSaveInstanceState");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("panzqww","A --- onRestoreInstanceState");
    }

    /**
     * 跳转到指定的网址页面
     */
    public void toView() {
        Intent intent = new Intent();
        //设置Data数据
        intent.setData(Uri.parse("http://www.baidu.com"));
        //设置Action数据
        intent.setAction(Intent.ACTION_VIEW);
        //页面跳转
        startActivity(intent);
    }

    /**
     * 跳转到编辑联系人的信息
     * 这里联系人的姓名是：1
     */
    public void toEdit() {
        Intent intent = new Intent();
        //设置Data数据
        intent.setData(Uri.parse("content://com.android.contacts/contacts/1"));
        //设置Action数据
        intent.setAction(Intent.ACTION_EDIT);
        //页面跳转
        try {
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "找不到该联系人！", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 跳转到拨打电话的页面
     * Data可以设置电话号码
     */
    public void toDial() {
        Intent intent = new Intent();
        //设置Data数据
        intent.setData(Uri.parse("tel:13814236512"));
        //设置Action数据
        intent.setAction(Intent.ACTION_DIAL);
        //页面跳转
        startActivity(intent);
    }
}
