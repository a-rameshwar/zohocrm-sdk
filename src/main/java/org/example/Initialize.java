package org.example;

import com.zoho.api.authenticator.OAuthToken;

import com.zoho.api.authenticator.Token;

import com.zoho.api.authenticator.store.DBStore;

import com.zoho.api.authenticator.store.FileStore;

import com.zoho.api.authenticator.store.TokenStore;

import com.zoho.api.logger.Logger;

import com.zoho.api.logger.Logger.Levels;

import com.zoho.crm.api.Initializer;

import com.zoho.crm.api.RequestProxy;

import com.zoho.crm.api.SDKConfig;

import com.zoho.crm.api.UserSignature;

import com.zoho.crm.api.dc.DataCenter.Environment;

import com.zoho.crm.api.dc.INDataCenter;
import com.zoho.crm.api.dc.USDataCenter;

public class Initialize
{



    public static void main(String[] args) throws Exception
    {
        initialize();
        Record.getRecords("Leads");
        //Record.createRecords("Leads");
        //Record.convertLead(401781000000988002L);
    }

    public static void initialize() throws Exception
    {
        /*
         * Create an instance of Logger Class that takes two parameters
         * level -> Level of the log messages to be logged. Can be configured by typing Levels "." and choose any level from the list displayed.
         * filePath -> Absolute file path, where messages need to be logged.
         */
        Logger logger = new Logger.Builder()
                .level(Levels.INFO)
                .filePath("/Users/rameshwara/Documents/java_sdk_log.log")
                .build();

        //Create an UserSignature instance that takes user Email as parameter
        UserSignature user = new UserSignature("preeyam.sahu@rupifi.com");

        /*
         * Configure the environment
         * which is of the pattern Domain.Environment
         * Available Domains: USDataCenter, EUDataCenter, INDataCenter, CNDataCenter, AUDataCenter
         * Available Environments: PRODUCTION, DEVELOPER, SANDBOX
         */
        Environment environment = INDataCenter.SANDBOX;

        /*
         * Create a Token instance that requires the following
         * clientId -> OAuth client id.
         * clientSecret -> OAuth client secret.
         * refreshToken -> REFRESH token.
         * grantToken -> GRANT token.
         * id -> User unique id.
         * redirectURL -> OAuth redirect URL.
         */
        // if grant token is available
        Token token = new OAuthToken.Builder()
                .clientID("")
                .clientSecret("")
                .grantToken("1000.65a82692f239ad964ed5e6a88e1ec437.2adfa0be15ace1c9d2b4b386d514ddf0")
                .redirectURL("https://www.zohoapis.in")
                .refreshToken("1000.e634cd99fac8e49d65b0fa6e64a79318.94c28c6305ec779ecf340f6d36f3ec0c")
                .build();

        /*
         * Create an instance of DBStore that requires the following
         * host -> DataBase host name. Default value "localhost"
         * databaseName -> DataBase name. Default  value "zohooauth"
         * userName -> DataBase user name. Default value "root"
         * password -> DataBase password. Default value ""
         * portNumber -> DataBase port number. Default value "3306"
         * tabletName -> DataBase table name. Default value "oauthtoken"
         */
        //TokenStore tokenstore = new DBStore.Builder().build();

//        TokenStore tokenstore = new DBStore.Builder()
//                .host("rupifi-postgres-qa.ci8yruwcnrq2.ap-south-1.rds.amazonaws.com")
//                .databaseName("postgres")
//                .tableName("crm_auth_tokens")
//                .userName("rupifi_uat")
//                .password("Rupifi2020")
//                .portNumber("5432")
//                .build();
        //Parameter containing the absolute file path to store tokens
        TokenStore tokenstore = new FileStore("/Users/rameshwara/Documents/tokenStore");


                //TokenStore tokenstore = new FileStore("absolute_file_path");

        /*
         * autoRefreshFields
         * if true - all the modules' fields will be auto-refreshed in the background, every hour.
         * if false - the fields will not be auto-refreshed in the background. The user can manually delete the file(s) or refresh the fields using methods from ModuleFieldsHandler(com.zoho.crm.api.util.ModuleFieldsHandler)
         *
         * pickListValidation
         * A boolean field that validates user input for a pick list field and allows or disallows the addition of a new value to the list.
         * if true - the SDK validates the input. If the value does not exist in the pick list, the SDK throws an error.
         * if false - the SDK does not validate the input and makes the API request with the user’s input to the pick list
         */
        SDKConfig sdkConfig = new SDKConfig.Builder()
                .autoRefreshFields(false)
                .pickListValidation(true)
                .build();

        String resourcePath = "/Users/rameshwara/Downloads/zohocrm-sdk";

        /*
         * Create an instance of RequestProxy
         * host -> proxyHost
         * port -> proxyPort
         * user -> proxyUser
         * password -> password
         * userDomain -> userDomain
         */
        RequestProxy requestProxy = new RequestProxy.Builder()
                .host("host")
                .port(8090)
                .user("userName")
                .password("password")
                .userDomain("userDomain")
                .build();

        /*
         * Set the following in InitializeBuilder
         * user -> UserSignature instance
         * environment -> Environment instance
         * token -> Token instance
         * store -> TokenStore instance
         * SDKConfig -> SDKConfig instance
         * resourcePath -> resourcePath - A String
         * logger -> Log instance (optional)
         * requestProxy -> RequestProxy instance (optional)
         */
        new Initializer.Builder()
                .user(user)
                .environment(environment)
                .token(token)
                .store(tokenstore)
                .SDKConfig(sdkConfig)
                .resourcePath(resourcePath)
                .logger(logger)
                .initialize();
    }
}
