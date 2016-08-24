bangqu-game-sdk-demo

帮趣游戏充值SDK（台湾）

帮趣游戏 http://game.bangqu.com

本SDK集成了台湾2大支付平台Pepay与MyCard

开发环境：

工具：eclipse 
Android sdk 2.3以上
下载demo（bangqu-game-sdk），lib（bangqu-recharge-lib，pepay-lib）；
将bangqu-game-sdk，bangqu-recharge-lib，pepay-lib eclipse导入


配置 AndroidManifest.xml：

    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.WRITE_SETTINGS" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.WAKE_LOCK" />
    <uses-permission android:name="android.permission.DISABLE_KEYGUARD" />
    <uses-permission android:name="android.permission.VIBRATE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.READ_PROFILE" />

    <!-- MyCard -->
    <uses-permission android:name="android.permission.CAMERA" />

    <uses-feature android:name="android.hardware.camera" />
    <uses-feature android:name="android.hardware.camera.autofocus" />

    <uses-permission android:name="android.permission.VIBRATE" />
    <uses-permission android:name="android.permission.FLASHLIGHT" />
    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.MOUNT_UNMOUNT_FILESYSTEMS" />
    <uses-permission android:name="android.permission.READ_LOGS" />
    
        
    <uses-feature
        android:name="android.hardware.wifi"
        android:required="false" />
    <uses-feature
        android:name="android.hardware.touchscreen"
        android:required="false" />
    <uses-feature
        android:name="android.hardware.screen.portrait"
        android:required="false" />

  
        <!--充值配置  -->
         <activity
            android:name="com.tw3pole.pepay_api.PepayActivity"
            android:label="@string/title_activity_main" > 
        </activity>
        <activity
            android:name="com.tw3pole.pepay_api.ui.xPepayApiActivity"
         />
         <activity android:name="com.bangqu.recharge.activity.RechargeActivity"
            android:theme="@style/Dialog"></activity>
         
   <!-- MyCard -->
        <activity
            android:name="soft_world.mycard.paymentapp.ui.SplashActivity"
            android:screenOrientation="sensorPortrait" />
        <activity
            android:name="soft_world.mycard.paymentapp.ui.MainActivity"
            android:screenOrientation="sensorPortrait"
            android:windowSoftInputMode="adjustPan" />
        <activity
            android:name="soft_world.mycard.paymentapp.ui.TrainActivity"
            android:screenOrientation="sensorPortrait" />
        <activity
            android:name="com.google.zxing.CaptureActivity"
            android:screenOrientation="portrait" />
        <activity
            android:name="tw.com.mycard.paymentsdk.PSDKActivity"
            android:screenOrientation="portrait" />
        <activity
            android:name="soft_world.mycard.paymentapp.ui.billing.BillingWebViewActivity"
            android:screenOrientation="sensorPortrait"
            android:theme="@android:style/Theme.Dialog" />
        <!-- 異康 -->
        <activity
            android:name="soft_world.mycard.paymentapp.Ecom.ATMMenuActivity"
            android:screenOrientation="portrait" />
        <activity
            android:name="com.xmobilepay.xpaymentlibs.XCardTypeForm"
            android:screenOrientation="portrait" />
        <activity
            android:name="com.xmobilepay.xpaymentlibs.XPayCardPassWordForm"
            android:screenOrientation="portrait" />
        <activity
            android:name="com.xmobilepay.xpaymentlibs.XSmallPayCardPassWordForm"
            android:screenOrientation="portrait" />
        <activity
            android:name="com.xmobilepay.xpaymentlibs.PaymentResultForm"
            android:screenOrientation="portrait" />
        <activity
            android:name="com.xmobilepay.xpaymentlibs.PaymentErrResultForm"
            android:screenOrientation="portrait" />
        <!-- 遠傳電信 -->
        <activity
            android:name="com.fet.iap.activity.FetLoginActivity"
            android:configChanges="keyboardHidden|orientation|screenSize"
            android:theme="@android:style/Theme.Translucent.NoTitleBar"
            android:windowSoftInputMode="adjustPan" />

        <!-- 中華電信 -->
        <activity android:name="com.cht.iap.api.ChtRegMainActivity" />
        <activity android:name="com.cht.iap.api.ChtPhoneNumPayConfirmActivity" />
        <activity android:name="com.cht.iap.api.ChtRegEInvoiceInfo" />
        <activity android:name="com.cht.iap.api.ChtRegVerifyOTP" />
        <activity android:name="com.cht.iap.api.ChtRegHNDataTabActivity" />
        <activity android:name="com.cht.iap.api.ChtRegHNAccountActivity" />
        <activity android:name="com.cht.iap.api.ChtRegMobileAuth" />
        <activity android:name="com.cht.iap.api.ChtRegMobileHNData" />
        <activity android:name="com.cht.iap.api.ChtTransactionAuth" />
        <activity android:name="com.cht.iap.api.ChtRegVerifyMessage" />
        <!-- 中國信託 -->
        <activity
            android:name="com.softmobile.ui.PayPageActivity"
            android:configChanges="orientation"
            android:screenOrientation="portrait" />
        <!-- 首信易 -->
        <activity
            android:name="com.payeasenet.token.lib.ui.TokenPayTypeCheckUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.CardTypeCheckUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.TokenCreateUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.TokenCreateResultUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.TokenPayUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEPayRelUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.TokenIntroductionUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.TokenUnBindedUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.MoreAboutUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEUpopInfoUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEUpopPayUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEIvrPayUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEQuickPayUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEUpmpPayUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEVisaPayUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEVisaInfoUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEVisaBillInfoUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEDebitBillInfoUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEQuickInfoUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
        <activity
            android:name="com.payeasenet.token.lib.ui.PEUpmpInfoUI"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Light.NoTitleBar" />
            
            
    引入lib：
    bangqu-recharge-lib
    
    
    使用：
    使用SDKinterface接口支付回调
    public class MainActivity extends Activity implements SDKInterface { 

       @Override
       public void payCallBack(String msg, String rel) {
          Log.e(msg, "payCallBack:" + rel.toString());
       }
    }
    
Demo：bangqu-game-sdk-demo

展示apk：http://7xocov.com2.z0.glb.qiniucdn.com/bangqu-game-sdk.apk
