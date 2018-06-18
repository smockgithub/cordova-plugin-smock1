var exec = require('cordova/exec');


module.exports = {
    coolMethod:function (arg0, success, error) {
        exec(success, error, 'CordovaPluginSmock1', 'coolMethod', [arg0]);
    },

    startJD:function(arg0, success, error){
        exec(success, error, 'CordovaPluginSmock1', 'startJD', [arg0]);
    }

}