package com.matteofilippi.pigreko.strafalcioni;

import android.app.Activity;
import android.os.Bundle;
import com.phonegap.*;

public class StrafalcionipigrekoActivity extends DroidGap {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/index.html");
    }
    
}