package com.bangqu.game.activity;

import com.bangqu.game.R;
import com.bangqu.recharge.activity.RechargeActivity; 
import com.bangqu.recharge.activity.SDKInterface;
import com.longtu.base.http.HttpClient;
import com.longtu.base.notice.HttpRequestListener;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener, SDKInterface {
    private String tag = "MainActivity";
    private Context mContext = MainActivity.this;
    private Button btLogin, btRegister, btPay, btMyCard, btPePay;
    private TextView tvRelsut;
    private Button btMycard;

    /*
     * MyCard需要参数
     */
    private String gameid = "280";
    private int PAY = 1001;
    /*
     * pepay需要参数
     */
    private final static String THIS_FILE = "MainActivity";
    private String SHOP_ID = "PPS_152826";
    private String ORDER_ID = "";
    private String USER_ID = "";
    private String ORDER_ITEM = "";
    private String ORDER_NAME = "帮趣游戏";
    private String RTN_URL;// 交易结果回传地址

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        RechargeActivity.setInterface(this);
    }

    private void findView() {
        btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
        btRegister = (Button) findViewById(R.id.btRegister);
        btRegister.setOnClickListener(this);
        btPay = (Button) findViewById(R.id.btPay);
        btPay.setOnClickListener(this);
        btMyCard = (Button) findViewById(R.id.btPay);
        btMyCard.setOnClickListener(this);
        btPePay = (Button) findViewById(R.id.btpepay);
        btPePay.setOnClickListener(this);  
        btMycard = (Button) findViewById(R.id.btMycard);
        btMycard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btLogin:
                Intent intent1 = new Intent(this, RechargeActivity.class);
                intent1.putExtra("gameid", "209");
                intent1.putExtra("type", "1");
                startActivity(intent1);
//                Intent intent1 = new Intent(this, SDKAgentActivity.class);
//                intent1.putExtra("type", 1 + "");
//                startActivity(intent1);
                break;
            case R.id.btRegister:
                Intent intent2 = new Intent(this, RechargeActivity.class);
                intent2.putExtra("gameid", "209");
                intent2.putExtra("type", "2");
                startActivity(intent2);
                break;
            case R.id.btPay:
//			Intent intent3 = new Intent(this, SDKAgentActivity.class);
//			intent3.putExtra("type", 3 + "");
//			intent3.putExtra("account","lam0322");
//			startActivity(intent3);
                break;
            case R.id.btpepay:
//                Intent intent4 = new Intent(this, SDKAgentActivity.class);
//                intent4.putExtra("type", 4 + "");
//                startActivity(intent4);
            	
                Intent intent3 = new Intent(this, RechargeActivity.class);
                intent3.putExtra("gameid", gameid);
                intent3.putExtra("type", "3");
                intent3.putExtra("userUid", "1201220100");//用户玩家ID
                intent3.putExtra("ServerName", "S1");//游戏区
                intent3.putExtra("goodsId", "1");//
                intent3.putExtra("ProductName", "测试名称"); 
                startActivity(intent3);
                break;
            case R.id.btMycard:
            	get();
            	break;
        }
    }
    
    public void get(){
    	/*HttpClient httpClient=new HttpClient();
    	httpClient.get("http://test.b2b.mycard520.com.tw/MyBillingPay/api/AuthGlobal?FacServiceId=bangqu&FacTradeSeq=FacTradeSeq13509&CustomerId=860311024458960&ProductName=%e6%b5%8b%e8%af%95&Amount=1&Currency=TWD&TradeType=1&SandBoxMode=true&Hash=2c2d6c5574faa7b923f5557f61bd88dcad1f204876edd8154d37d180370bc4e0&PaymentType=&ItemCode=",
    			"MyCart", null, new HttpRequestListener() {
					
					@Override
					public void OnSuccess(String content, String requestname) { 
						Log.e(requestname, content);
					}
					
					@Override
					public void OnStart() { 
						Log.e("OnStart", "OnStart");
					}
					
					@Override
					public void OnFinish() { 
						Log.e("OnFinish", "OnFinish");
					}
					
					@Override
					public void OnError(String arg0) { 
						Log.e("OnError", "OnError:"+arg0);
						
					}
				}, null, false);*/
    }


    @Override
    protected void onDestroy() {
        super.onDestroy(); 
    }

    @Override
    public void registerCallBack(String msg, String rel) {
        Log.i(tag, "registerCallBack:" + rel.toString());
    }

    @Override
    public void loginCallBack(String msg, String rel) {
        Log.i(tag, "loginCallBack:" + rel.toString());
    }

    @Override
    public void getBlanceCallBack(String msg, String rel) {
        Log.i(tag, "getBlanceCallBack:" + rel.toString());
    }

    @Override
    public void payCallBack(String msg, String rel) {
        Log.e(msg, "payCallBack:" + rel.toString());
    }
}
