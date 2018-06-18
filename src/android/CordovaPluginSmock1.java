package com.wabaoge.testPlugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.Toast;

/**
 * This class echoes a string called from JavaScript.
 */
public class CordovaPluginSmock1 extends CordovaPlugin {

    @Override
    protected void pluginInitialize() {

        super.pluginInitialize();

        //String id = getAppId();

        // save app id
        //saveAppId(cordova.getActivity(), id);

        // init api
        //initWXAPI();

        

        //Log.d(TAG, "plugin initialized.");
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            Toast.makeText(cordova.getActivity(), "传入参数错误", Toast.LENGTH_LONG).show();
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void startJD(String message, CallbackContext callbackContext){
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
            //Toast.makeText(cordova.getActivity(), cordova.getActivity(), Toast.LENGTH_LONG).show();
        } else {
            //Toast.makeText(cordova.getActivity(), "传入参数错误", Toast.LENGTH_LONG).show();
            callbackContext.error("传入参数错误");
        }
    }
}
