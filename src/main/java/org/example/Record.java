
package org.example;

import java.io.File;

import java.io.FileOutputStream;

import java.io.InputStream;

import java.io.OutputStream;

import java.time.LocalDate;

import java.time.OffsetDateTime;

import java.time.ZoneOffset;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.HeaderMap;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.layouts.Layout;

import com.zoho.crm.api.record.*;

import com.zoho.crm.api.tags.Tag;

import com.zoho.crm.api.record.RecordOperations.DeleteRecordParam;

import com.zoho.crm.api.record.RecordOperations.DeleteRecordsParam;

import com.zoho.crm.api.record.RecordOperations.GetDeletedRecordsHeader;

import com.zoho.crm.api.record.RecordOperations.GetDeletedRecordsParam;

import com.zoho.crm.api.record.RecordOperations.GetMassUpdateStatusParam;

import com.zoho.crm.api.record.RecordOperations.GetRecordHeader;

import com.zoho.crm.api.record.RecordOperations.GetRecordParam;

import com.zoho.crm.api.record.RecordOperations.GetRecordsHeader;

import com.zoho.crm.api.record.RecordOperations.GetRecordsParam;

import com.zoho.crm.api.record.RecordOperations.SearchRecordsParam;

import com.zoho.crm.api.users.User;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Choice;

import com.zoho.crm.api.util.Model;

import com.zoho.crm.api.util.StreamWrapper;

import com.zoho.crm.api.attachments.Attachment;

public class Record
{
    /**
     * Get Records
     * This method is used to get all the records of a module and print the response.
     * @param moduleAPIName - The API Name of the module to obtain records.
     * @throws Exception
     */
    public static void createRecords(String moduleAPIName) throws Exception
    {
        //API Name of the module to create records
        //String moduleAPIName = "Leads";

        //Get instance of RecordOperations Class
        RecordOperations recordOperations = new RecordOperations();

        //Get instance of BodyWrapper Class that will contain the request body
        BodyWrapper bodyWrapper = new BodyWrapper();

        //List of Record instances
        List<com.zoho.crm.api.record.Record> records = new ArrayList<com.zoho.crm.api.record.Record>();

        //Get instance of Record Class
        com.zoho.crm.api.record.Record record1 = new com.zoho.crm.api.record.Record();

        /*
         * Call addFieldValue method that takes two arguments
         * 1 -> Call Field "." and choose the module from the displayed list and press "." and choose the field name from the displayed list.
         * 2 -> Value
         */
//      record1.addFieldValue(Field.Leads.CITY, "City");
//
        record1.addFieldValue(Field.Leads.LAST_NAME, "Last Name");
//
//      record1.addFieldValue(Field.Leads.FIRST_NAME, "First Name");
//
//      record1.addFieldValue(Field.Leads.COMPANY, "KKRNP");

        /*
         * Call addKeyValue method that takes two arguments
         * 1 -> A string that is the Field's API Name
         * 2 -> Value
         */
//      record1.addKeyValue("Custom_field", "Value");
//
//      record1.addKeyValue("Custom_field_2", "value");
//
//      record1.addKeyValue("Date_1", LocalDate.of(2021, 1, 13));
//
//      record1.addKeyValue("Subject", "AutomatedSDK");

        List<FileDetails> fileDetails = new ArrayList<FileDetails>();

        FileDetails fileDetail1 = new FileDetails();

        fileDetail1.setFileId("ae9c7cefa418aec1d6a5cc2d9ab35c32537b7c2400dadca8ff55f620c65357da");

        fileDetails.add(fileDetail1);

        FileDetails fileDetail2 = new FileDetails();

        fileDetail2.setFileId("ae9c7cefa418aec1d6a5cc2d9ab35c32e0063e7321b5b4ca878a934519e6cdb2");

        fileDetails.add(fileDetail2);

        FileDetails fileDetail3 = new FileDetails();

        fileDetail3.setFileId("ae9c7cefa418aec1d6a5cc2d9ab35c323daf4780bfe0058133556f155795981f");

        fileDetails.add(fileDetail3);

        record1.addKeyValue("File_Upload", fileDetails);

        /** Following methods are being used only by Inventory modules */

//      com.zoho.crm.api.record.Record dealName = new com.zoho.crm.api.record.Record();
//
//      dealName.addFieldValue(Field.Deals.ID, 3477061000004995070L);
//
//      record1.addFieldValue(Field.Sales_Orders.DEAL_NAME, dealName);
//
//      com.zoho.crm.api.record.Record contactName = new com.zoho.crm.api.record.Record();
//
//      contactName.addFieldValue(Field.Contacts.ID, 3477061000004977055L);
//
//      record1.addFieldValue(Field.Purchase_Orders.CONTACT_NAME, contactName);
//
//      com.zoho.crm.api.record.Record accountName = new com.zoho.crm.api.record.Record();
//
//      accountName.addKeyValue("name", "automatedAccount");
//
//      record1.addFieldValue(Field.Quotes.ACCOUNT_NAME, accountName);
//
//      i
//
//      List<InventoryLineItems> inventoryLineItemList = new ArrayList<InventoryLineItems>();
//
//      InventoryLineItems inventoryLineItem = new InventoryLineItems();
//
//      LineItemProduct lineItemProduct = new LineItemProduct();
//
//      lineItemProduct.setId(3477061000005356009L);
//
//      inventoryLineItem.setProduct(lineItemProduct);
//
//      inventoryLineItem.setQuantity(1.5);
//
//      inventoryLineItem.setProductDescription("productDescription");
//
//      inventoryLineItem.setListPrice(10.0);
//
//      inventoryLineItem.setDiscount("5.0");

//      inventoryLineItem.setDiscount("5.25%");
//
//      List<LineTax> productLineTaxes = new ArrayList<LineTax>();
//
//      LineTax productLineTax = new LineTax();
//
//      productLineTax.setName("Tax1");
//
//      productLineTax.setPercentage(20.0);
//
//      productLineTaxes.add(productLineTax);
//
//      inventoryLineItem.setLineTax(productLineTaxes);
//
//      inventoryLineItemList.add(inventoryLineItem);
//
//      record1.addKeyValue("Product_Details", inventoryLineItemList);
//
//      List<LineTax> lineTaxes = new ArrayList<LineTax>();
//
//      LineTax lineTax = new LineTax();
//
//      lineTax.setName("Tax1");
//
//      lineTax.setPercentage(20.0);
//
//      lineTaxes.add(lineTax);
//
//      record1.addKeyValue("$line_tax", lineTaxes);

        /** End Inventory **/

        /** Following methods are being used only by Activity modules */

        //Tasks
//      record1.addFieldValue(Field.Tasks.DESCRIPTION, "Test Task");
//
//      record1.addKeyValue("Currency",new Choice("INR"));
//
//      RemindAt remindAt = new RemindAt();
//
//      remindAt.setAlarm("FREQ=NONE;ACTION=EMAILANDPOPUP;TRIGGER=DATE-TIME:2020-07-03T12:30:00+05:30");
//
//      record1.addFieldValue(Field.Tasks.REMIND_AT, remindAt);
//
//      com.zoho.crm.api.record.Record whoId = new com.zoho.crm.api.record.Record();
//
//      whoId.setId(3477061000004977055L);
//
//      record1.addFieldValue(Field.Tasks.WHO_ID, whoId);
//
//      record1.addFieldValue(Field.Tasks.STATUS,new Choice("Waiting for input"));
//
//      record1.addFieldValue(Field.Tasks.DUE_DATE, LocalDate.of(2021, 1, 13));
//
//      record1.addFieldValue(Field.Tasks.PRIORITY,new Choice("High"));
//
//      record1.addKeyValue("$se_module", "Accounts");
//
//      com.zoho.crm.api.record.Record whatId = new com.zoho.crm.api.record.Record();
//
//      whatId.setId(3477061000000207118L);
//
//      record1.addFieldValue(Field.Tasks.WHAT_ID, whatId);

        /** Recurring Activity can be provided in any activity module*/

//      RecurringActivity recurringActivity = new RecurringActivity();
//
//      recurringActivity.setRrule("FREQ=DAILY;INTERVAL=10;UNTIL=2020-08-14;DTSTART=2020-07-03");
//
//      record1.addFieldValue(Field.Events.RECURRINGACTIVITY, recurringActivity);
//
        //Events
//      record1.addFieldValue(Field.Events.DESCRIPTION, "Test Events");
//
//      OffsetDateTime startDateTime = OffsetDateTime.of(2020, 01, 02, 10, 00, 00, 00, ZoneOffset.of("+05:30"));
//
//      record1.addFieldValue(Field.Events.START_DATETIME, startDateTime);
//
//      List<Participants> participants = new ArrayList<Participants>();
//
//      Participants participant1 = new Participants();
//
//      participant1.setParticipant("abc@gmail.com");
//
//      participant1.setType("email");
//
//      participant1.setId(3477061000005902017L);
//
//      participants.add(participant1);
//
//      Participants participant2 = new Participants();
//
//      participant2.addKeyValue("participant", "3477061000005908033");
//
//      participant2.addKeyValue("type", "lead");
//
//      participants.add(participant2);
//
//      record1.addFieldValue(Field.Events.PARTICIPANTS, participants);
//
//      record1.addKeyValue("$send_notification", true);
//
//      record1.addFieldValue(Field.Events.EVENT_TITLE, "New Automated Event");
//
//      OffsetDateTime enddatetime = OffsetDateTime.of(2020, 05, 02, 10, 00, 00, 00, ZoneOffset.of("+05:30"));
//
//      record1.addFieldValue(Field.Events.END_DATETIME, enddatetime);
//
//      OffsetDateTime remindAt = OffsetDateTime.of(2020, 05, 02, 05, 00, 00, 00, ZoneOffset.of("+05:30"));
//
//      record1.addFieldValue(Field.Events.REMIND_AT, remindAt);
//
//      record1.addFieldValue(Field.Events.CHECK_IN_STATUS, "PLANNED");
//
//      record1.addKeyValue("$se_module", "Leads");
//
//      com.zoho.crm.api.record.Record whatId = new com.zoho.crm.api.record.Record();
//
//      whatId.setId(3477061000004381002);
//
//      record1.addFieldValue(Field.Events.WHAT_ID, whatId);

        /** End Activity **/

        /** Following methods are being used only by Price_Books modules */
//
//      List<PricingDetails> pricingDetails = new ArrayList<PricingDetails>();
//
//      PricingDetails pricingDetail1 = new PricingDetails();
//
//      pricingDetail1.setFromRange(1.0);
//
//      pricingDetail1.setToRange(5.0);
//
//      pricingDetail1.setDiscount(2.0);
//
//      pricingDetails.add(pricingDetail1);
//
//      PricingDetails pricingDetail2 = new PricingDetails();
//
//      pricingDetail2.addKeyValue("from_range", 6.0);
//
//      pricingDetail2.addKeyValue("to_range", 11.0);
//
//      pricingDetail2.addKeyValue("discount", 3.0);
//
//      pricingDetails.add(pricingDetail2);
//
//      record1.addFieldValue(Field.Price_Books.PRICING_DETAILS, pricingDetails);
//
//      record1.addKeyValue("Email", "raja.k12@zoho.com");
//
//      record1.addFieldValue(Field.Price_Books.DESCRIPTION, "TEST");
//
//      record1.addFieldValue(Field.Price_Books.PRICE_BOOK_NAME, "book_name");
//
//      record1.addFieldValue(Field.Price_Books.PRICING_MODEL, new Choice("Flat"));

        List<Tag> tagList = new ArrayList<Tag>();

        Tag tag = new Tag();

        tag.setName("Testtask");

        tagList.add(tag);

        record1.setTag(tagList);

        //Add Record instance to the list
        records.add(record1);

        //Set the list to Records in BodyWrapper instance
        bodyWrapper.setData(records);

        List<String> trigger = new ArrayList<String>();

        trigger.add("approval");

        trigger.add("workflow");

        trigger.add("blueprint");

        bodyWrapper.setTrigger(trigger);

        //bodyWrapper.setLarId("3477061000000087515");

        HeaderMap headerInstance = new HeaderMap();

        //Call createRecords method that takes moduleAPIName and BodyWrapper instance as parameter.
        APIResponse<ActionHandler> response = recordOperations.createRecords(moduleAPIName, bodyWrapper, headerInstance);

        if(response != null)
        {
            //Get the status code from response
            System.out.println("Status Code: " + response.getStatusCode());

            //Check if expected response is received
            if(response.isExpected())
            {
                //Get object from response
                ActionHandler actionHandler = response.getObject();

                if(actionHandler instanceof ActionWrapper)
                {
                    //Get the received ActionWrapper instance
                    ActionWrapper actionWrapper = (ActionWrapper) actionHandler;

                    //Get the list of obtained ActionResponse instances
                    List<ActionResponse> actionResponses = actionWrapper.getData();

                    for(ActionResponse actionResponse : actionResponses)
                    {
                        //Check if the request is successful
                        if(actionResponse instanceof SuccessResponse)
                        {
                            //Get the received SuccessResponse instance
                            SuccessResponse successResponse = (SuccessResponse)actionResponse;

                            //Get the Status
                            System.out.println("Status: " + successResponse.getStatus().getValue());

                            //Get the Code
                            System.out.println("Code: " + successResponse.getCode().getValue());

                            System.out.println("Details: " );

                            //Get the details map
                            for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
                            {
                                //Get each value in the map
                                System.out.println(entry.getKey() + ": " + entry.getValue());
                            }

                            //Get the Message
                            System.out.println("Message: " + successResponse.getMessage().getValue());
                        }
                        //Check if the request returned an exception
                        else if(actionResponse instanceof APIException)
                        {
                            //Get the received APIException instance
                            APIException exception = (APIException) actionResponse;

                            //Get the Status
                            System.out.println("Status: " + exception.getStatus().getValue());

                            //Get the Code
                            System.out.println("Code: " + exception.getCode().getValue());

                            System.out.println("Details: " );

                            //Get the details map
                            for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
                            {
                                //Get each value in the map
                                System.out.println(entry.getKey() + ": " + entry.getValue());
                            }

                            //Get the Message
                            System.out.println("Message: " + exception.getMessage().getValue());
                        }
                    }
                }
                //Check if the request returned an exception
                else if(actionHandler instanceof APIException)
                {
                    //Get the received APIException instance
                    APIException exception = (APIException) actionHandler;

                    //Get the Status
                    System.out.println("Status: " + exception.getStatus().getValue());

                    //Get the Code
                    System.out.println("Code: " + exception.getCode().getValue());

                    System.out.println("Details: " );

                    //Get the details map
                    for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
                    {
                        //Get each value in the map
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }

                    //Get the Message
                    System.out.println("Message: " + exception.getMessage().getValue());
                }
            }
            else
            {//If response is not as expected

                //Get model object from response
                Model responseObject = response.getModel();

                //Get the response object's class
                Class<? extends Model> clas = responseObject.getClass();

                //Get all declared fields of the response class
                java.lang.reflect.Field[] fields = clas.getDeclaredFields();

                for(java.lang.reflect.Field field : fields)
                {
                    //Get each value
                    System.out.println(field.getName() + ":" + field.get(responseObject));
                }
            }
        }
    }

    public static void getRecords(String moduleAPIName) throws Exception
    {
        //example
        //String moduleAPIName = "Leads";

        //Get instance of RecordOperations Class
        RecordOperations recordOperations = new RecordOperations();

        ParameterMap paramInstance = new ParameterMap();

        paramInstance.add(GetRecordsParam.APPROVED, "both");
//      
//      paramInstance.add(GetRecordsParam.CONVERTED, "both");

//      paramInstance.add(GetRecordsParam.CVID, "3477061000000087501");

//      List<long> ids = new ArrayList<long>(Arrays.asList(3477061000005623115, 3477061000004352001));
//      
//      for(long id : ids)
//      {
//          paramInstance.add(GetRecordsParam.IDS, id);
//      }
//      
//      paramInstance.add(GetRecordsParam.UID, "3477061000005181008");
//      
//      List<String> fieldNames = new ArrayList<String>(Arrays.asList("Company", "Email"));
//      
//      for(String fieldName : fieldNames)
//      {
//          paramInstance.add(GetRecordsParam.FIELDS, fieldName);
//      }
//      
//      paramInstance.add(GetRecordsParam.SORT_BY, "Email");
//      
//      paramInstance.add(GetRecordsParam.SORT_ORDER, "desc");
//      
//      paramInstance.add(GetRecordsParam.PAGE, 1);
//      
//      paramInstance.add(GetRecordsParam.PER_PAGE, 1);

//      OffsetDateTime startdatetime = OffsetDateTime.of(2019, 11, 20, 10, 00, 01, 00, ZoneOffset.of("+05:30"));
//      
//      paramInstance.add(GetRecordsParam.STARTDATETIME, startdatetime);
//      
//      OffsetDateTime enddatetime = OffsetDateTime.of(2019, 12, 20, 10, 00, 01, 00, ZoneOffset.of("+05:30"));
//      
//      paramInstance.add(GetRecordsParam.ENDDATETIME, enddatetime);
//      
//      paramInstance.add(GetRecordsParam.TERRITORY_ID, "3477061000003051357");
//      
//      paramInstance.add(GetRecordsParam.INCLUDE_CHILD, true);

        HeaderMap headerInstance = new HeaderMap();

        OffsetDateTime ifmodifiedsince = OffsetDateTime.of(2019, 05, 20, 10, 00, 01, 00, ZoneOffset.of("+05:30"));

        headerInstance.add(GetRecordsHeader.IF_MODIFIED_SINCE, ifmodifiedsince);

        //Call getRecords method that takes moduleAPIName, paramInstance and headerInstance as parameter.
        APIResponse<ResponseHandler> response = recordOperations.getRecords(moduleAPIName, paramInstance, headerInstance);

        if(response != null)
        {
            //Get the status code from response
            System.out.println("Status Code: " + response.getStatusCode());

            if(Arrays.asList(204,304).contains(response.getStatusCode()))
            {
                System.out.println(response.getStatusCode() == 204? "No Content" : "Not Modified");
                return;
            }

            //Check if expected response is received
            if(response.isExpected())
            {
                //Get the object from response
                ResponseHandler responseHandler = response.getObject();

                if(responseHandler instanceof ResponseWrapper)
                {
                    //Get the received ResponseWrapper instance
                    ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;

                    //Get the obtained Record instances
                    List<com.zoho.crm.api.record.Record> records = responseWrapper.getData();

                    for(com.zoho.crm.api.record.Record record : records)
                    {
                        //Get the ID of each Record
                        System.out.println("Record ID: " + record.getId());

                        //Get the createdBy User instance of each Record
                        com.zoho.crm.api.users.User createdBy = record.getCreatedBy();

                        //Check if createdBy is not null
                        if(createdBy != null)
                        {
                            //Get the ID of the createdBy User
                            System.out.println("Record Created By User-ID: " + createdBy.getId());

                            //Get the name of the createdBy User
                            System.out.println("Record Created By User-Name: " + createdBy.getName());

                            //Get the Email of the createdBy User
                            System.out.println("Record Created By User-Email: " + createdBy.getEmail());
                        }

                        //Get the CreatedTime of each Record
                        System.out.println("Record CreatedTime: " + record.getCreatedTime());

                        //Get the modifiedBy User instance of each Record
                        com.zoho.crm.api.users.User modifiedBy = record.getModifiedBy();

                        //Check if modifiedBy is not null
                        if(modifiedBy != null)
                        {
                            //Get the ID of the modifiedBy User
                            System.out.println("Record Modified By User-ID: " + modifiedBy.getId());

                            //Get the name of the modifiedBy User
                            System.out.println("Record Modified By User-Name: " + modifiedBy.getName());

                            //Get the Email of the modifiedBy User
                            System.out.println("Record Modified By User-Email: " + modifiedBy.getEmail());
                        }

                        //Get the ModifiedTime of each Record
                        System.out.println("Record ModifiedTime: " + record.getModifiedTime());

                        //Get the list of Tag instance each Record
                        List<Tag> tags = record.getTag();

                        //Check if tags is not null
                        if(tags != null)
                        {
                            for(Tag tag : tags)
                            {
                                //Get the Name of each Tag
                                System.out.println("Record Tag Name: " + tag.getName());

                                //Get the Id of each Tag
                                System.out.println("Record Tag ID: " + tag.getId());
                            }
                        }

                        //To get particular field value 
                        System.out.println("Record Field Value: " + record.getKeyValue("Last_Name"));// FieldApiName

                        System.out.println("Record KeyValues: " );

                        //Get the KeyValue map
                        for(Map.Entry<String, Object> entry : record.getKeyValues().entrySet())
                        {
                            String keyName = entry.getKey();

                            Object value = entry.getValue();

                            if(value instanceof List)
                            {
                                List<?> dataList = (List<?>) value;

                                if(dataList.size() > 0)
                                {
                                    if(dataList.get(0) instanceof FileDetails)
                                    {
                                        @SuppressWarnings("unchecked")
                                        List<FileDetails> fileDetails = (List<FileDetails>) value;

                                        for(FileDetails fileDetail : fileDetails)
                                        {
                                            //Get the Extn of each FileDetails
                                            System.out.println("Record FileDetails Extn: " + fileDetail.getExtn());

                                            //Get the IsPreviewAvailable of each FileDetails
                                            System.out.println("Record FileDetails IsPreviewAvailable: " + fileDetail.getIsPreviewAvailable());

                                            //Get the DownloadUrl of each FileDetails
                                            System.out.println("Record FileDetails DownloadUrl: " + fileDetail.getDownloadUrl());

                                            //Get the DeleteUrl of each FileDetails
                                            System.out.println("Record FileDetails DeleteUrl: " + fileDetail.getDeleteUrl());

                                            //Get the EntityId of each FileDetails
                                            System.out.println("Record FileDetails EntityId: " + fileDetail.getEntityId());

                                            //Get the Mode of each FileDetails
                                            System.out.println("Record FileDetails Mode: " + fileDetail.getMode());

                                            //Get the OriginalSizeByte of each FileDetails
                                            System.out.println("Record FileDetails OriginalSizeByte: " + fileDetail.getOriginalSizeByte());

                                            //Get the PreviewUrl of each FileDetails
                                            System.out.println("Record FileDetails PreviewUrl: " + fileDetail.getPreviewUrl());

                                            //Get the FileName of each FileDetails
                                            System.out.println("Record FileDetails FileName: " + fileDetail.getFileName());

                                            //Get the FileId of each FileDetails
                                            System.out.println("Record FileDetails FileId: " + fileDetail.getFileId());

                                            //Get the AttachmentId of each FileDetails
                                            System.out.println("Record FileDetails AttachmentId: " + fileDetail.getAttachmentId());

                                            //Get the FileSize of each FileDetails
                                            System.out.println("Record FileDetails FileSize: " + fileDetail.getFileSize());

                                            //Get the CreatorId of each FileDetails
                                            System.out.println("Record FileDetails CreatorId: " + fileDetail.getCreatorId());

                                            //Get the LinkDocs of each FileDetails
                                            System.out.println("Record FileDetails LinkDocs: " + fileDetail.getLinkDocs());
                                        }
                                    }
                                    else if(dataList.get(0) instanceof InventoryLineItems)
                                    {
                                        @SuppressWarnings("unchecked")
                                        List<InventoryLineItems> productDetails = (List<InventoryLineItems>) value;

                                        for(InventoryLineItems productDetail : productDetails)
                                        {
                                            LineItemProduct lineItemProduct = productDetail.getProduct();

                                            if(lineItemProduct != null)
                                            {
                                                System.out.println("Record ProductDetails LineItemProduct ProductCode: " + lineItemProduct.getProductCode());

                                                System.out.println("Record ProductDetails LineItemProduct Currency: " + lineItemProduct.getCurrency());

                                                System.out.println("Record ProductDetails LineItemProduct Name: " + lineItemProduct.getName());

                                                System.out.println("Record ProductDetails LineItemProduct Id: " + lineItemProduct.getId());
                                            }

                                            System.out.println("Record ProductDetails Quantity: " + productDetail.getQuantity().toString());

                                            System.out.println("Record ProductDetails Discount: " + productDetail.getDiscount());

                                            System.out.println("Record ProductDetails TotalAfterDiscount: " + productDetail.getTotalAfterDiscount().toString());

                                            System.out.println("Record ProductDetails NetTotal: " + productDetail.getNetTotal().toString());

                                            if(productDetail.getBook() != null)
                                            {
                                                System.out.println("Record ProductDetails Book: " + productDetail.getBook().toString());
                                            }

                                            System.out.println("Record ProductDetails Tax: " + productDetail.getTax().toString());

                                            System.out.println("Record ProductDetails ListPrice: " + productDetail.getListPrice().toString());

                                            System.out.println("Record ProductDetails UnitPrice: " + productDetail.getUnitPrice());
//                                          

                                            System.out.println("Record ProductDetails QuantityInStock: " + productDetail.getQuantityInStock().toString());

                                            System.out.println("Record ProductDetails Total: " + productDetail.getTotal().toString());

                                            System.out.println("Record ProductDetails ID: " + productDetail.getId());

                                            System.out.println("Record ProductDetails ProductDescription: " + productDetail.getProductDescription());

                                            List<LineTax> lineTaxes = productDetail.getLineTax();

                                            for(LineTax lineTax : lineTaxes)
                                            {
                                                System.out.println("Record ProductDetails LineTax Percentage: " + lineTax.getPercentage().toString());

                                                System.out.println("Record ProductDetails LineTax Name: " + lineTax.getName());

                                                System.out.println("Record ProductDetails LineTax Id: " + lineTax.getId());

                                                System.out.println("Record ProductDetails LineTax Value: " + lineTax.getValue().toString());
                                            }
                                        }
                                    }
                                    else if(dataList.get(0) instanceof Tag)
                                    {
                                        @SuppressWarnings("unchecked")
                                        List<Tag> tagList = (List<Tag>) value;

                                        for(Tag tag : tagList)
                                        {
                                            //Get the Name of each Tag
                                            System.out.println("Record Tag Name: " + tag.getName());

                                            //Get the Id of each Tag
                                            System.out.println("Record Tag ID: " + tag.getId());
                                        }
                                    }
                                    else if(dataList.get(0) instanceof PricingDetails)
                                    {
                                        @SuppressWarnings("unchecked")
                                        List<PricingDetails> pricingDetails = (List<PricingDetails>) value;

                                        for(PricingDetails pricingDetail : pricingDetails)
                                        {
                                            System.out.println("Record PricingDetails ToRange: " + pricingDetail.getToRange().toString());

                                            System.out.println("Record PricingDetails Discount: " + pricingDetail.getDiscount().toString());

                                            System.out.println("Record PricingDetails ID: " + pricingDetail.getId());

                                            System.out.println("Record PricingDetails FromRange: " + pricingDetail.getFromRange().toString());
                                        }
                                    }
                                    else if(dataList.get(0) instanceof Participants)
                                    {
                                        @SuppressWarnings("unchecked")
                                        List<Participants> participants = (List<Participants>) value;

                                        for(Participants participant : participants)
                                        {
                                            System.out.println("Record Participants Name: " + participant.getName());

                                            System.out.println("Record Participants Invited: " + participant.getInvited().toString());

                                            System.out.println("Record Participants ID: " + participant.getId());

                                            System.out.println("Record Participants Type: " + participant.getType());

                                            System.out.println("Record Participants Participant: " + participant.getParticipant());

                                            System.out.println("Record Participants Status: " + participant.getStatus());
                                        }
                                    }
                                    else if(dataList.get(0) instanceof com.zoho.crm.api.record.Record)
                                    {
                                        @SuppressWarnings("unchecked")
                                        List<com.zoho.crm.api.record.Record> recordList = (List<com.zoho.crm.api.record.Record>) dataList;

                                        for(com.zoho.crm.api.record.Record record1 : recordList)
                                        {
                                            //Get the details map
                                            for(Map.Entry<String, Object> entry1 : record1.getKeyValues().entrySet())
                                            {
                                                //Get each value in the map
                                                System.out.println(entry1.getKey() + ": " + entry1.getValue());
                                            }
                                        }
                                    }
                                    else if(dataList.get(0) instanceof LineTax)
                                    {
                                        @SuppressWarnings("unchecked")
                                        List<LineTax> lineTaxes = (List<LineTax>) dataList;

                                        for(LineTax lineTax : lineTaxes)
                                        {
                                            System.out.println("Record ProductDetails LineTax Percentage: " + lineTax.getPercentage().toString());

                                            System.out.println("Record ProductDetails LineTax Name: " + lineTax.getName());

                                            System.out.println("Record ProductDetails LineTax Id: " + lineTax.getId());

                                            System.out.println("Record ProductDetails LineTax Value: " + lineTax.getValue().toString());
                                        }
                                    }
                                    else if(dataList.get(0) instanceof Choice<?>)
                                    {
                                        @SuppressWarnings("unchecked")
                                        List<Choice<?>> choiceList = (List<Choice<?>>) dataList;

                                        System.out.println(keyName);

                                        System.out.println("values");

                                        for(Choice<?> choice : choiceList)
                                        {
                                            System.out.println(choice.getValue());
                                        }
                                    }
                                    else if(dataList.get(0) instanceof Comment)
                                    {
                                        @SuppressWarnings("unchecked")
                                        List<Comment> comments = (List<Comment>) dataList;

                                        for(Comment comment : comments)
                                        {
                                            System.out.println("Record Comment CommentedBy: " + comment.getCommentedBy());

                                            System.out.println("Record Comment CommentedTime: " + comment.getCommentedTime().toString());

                                            System.out.println("Record Comment CommentContent: " + comment.getCommentContent());

                                            System.out.println("Record Comment Id: " + comment.getId());
                                        }
                                    }
                                    else if(dataList.get(0) instanceof Attachment)
                                    {
                                        //Get the list of obtained Attachment instances
                                        @SuppressWarnings("unchecked")
                                        List<com.zoho.crm.api.attachments.Attachment> attachments = (List<Attachment>) dataList;;

                                        for(com.zoho.crm.api.attachments.Attachment attachment : attachments)
                                        {
                                            //Get the owner User instance of each attachment
                                            com.zoho.crm.api.users.User owner = attachment.getOwner();

                                            //Check if owner is not null
                                            if(owner != null)
                                            {
                                                //Get the Name of the Owner
                                                System.out.println("Record Attachment Owner User-Name: " + owner.getName());

                                                //Get the ID of the Owner
                                                System.out.println("Record Attachment Owner User-ID: " + owner.getId());

                                                //Get the Email of the Owner
                                                System.out.println("Record Attachment Owner User-Email: " + owner.getEmail());
                                            }

                                            //Get the modified time of each attachment
                                            System.out.println("Record Attachment Modified Time: " + attachment.getModifiedTime().toString());

                                            //Get the name of the File
                                            System.out.println("Record Attachment File Name: " + attachment.getFileName());

                                            //Get the created time of each attachment
                                            System.out.println("Record Attachment Created Time: " + attachment.getCreatedTime().toString());

                                            //Get the Attachment file size
                                            System.out.println("Record Attachment File Size: " + attachment.getSize().toString());

                                            //Get the parentId Record instance of each attachment
                                            com.zoho.crm.api.record.Record parentId = attachment.getParentId();

                                            //Check if parentId is not null
                                            if(parentId != null)
                                            {
                                                //Get the parent record Name of each attachment
                                                System.out.println("Record Attachment parent record Name: " + parentId.getKeyValue("name"));

                                                //Get the parent record ID of each attachment
                                                System.out.println("Record Attachment parent record ID: " + parentId.getId());
                                            }

                                            //Get the attachment is Editable
                                            System.out.println("Record Attachment is Editable: " + attachment.getEditable().toString());

                                            //Get the file ID of each attachment
                                            System.out.println("Record Attachment File ID: " + attachment.getFileId());

                                            //Get the type of each attachment
                                            System.out.println("Record Attachment File Type: " + attachment.getType());

                                            //Get the seModule of each attachment
                                            System.out.println("Record Attachment seModule: " + attachment.getSeModule());

                                            //Get the modifiedBy User instance of each attachment
                                            modifiedBy = attachment.getModifiedBy();

                                            //Check if modifiedBy is not null
                                            if(modifiedBy != null)
                                            {
                                                //Get the Name of the modifiedBy User
                                                System.out.println("Record Attachment Modified By User-Name: " + modifiedBy.getName());

                                                //Get the ID of the modifiedBy User
                                                System.out.println("Record Attachment Modified By User-ID: " + modifiedBy.getId());

                                                //Get the Email of the modifiedBy User
                                                System.out.println("Record Attachment Modified By User-Email: " + modifiedBy.getEmail());
                                            }

                                            //Get the state of each attachment
                                            System.out.println("Record Attachment State: " + attachment.getState());

                                            //Get the ID of each attachment
                                            System.out.println("Record Attachment ID: " + attachment.getId());

                                            //Get the createdBy User instance of each attachment
                                            createdBy = attachment.getCreatedBy();

                                            //Check if createdBy is not null
                                            if(createdBy != null)
                                            {
                                                //Get the name of the createdBy User
                                                System.out.println("Record Attachment Created By User-Name: " + createdBy.getName());

                                                //Get the ID of the createdBy User
                                                System.out.println("Record Attachment Created By User-ID: " + createdBy.getId());

                                                //Get the Email of the createdBy User
                                                System.out.println("Record Attachment Created By User-Email: " + createdBy.getEmail());
                                            }

                                            //Get the linkUrl of each attachment
                                            System.out.println("Record Attachment LinkUrl: " + attachment.getLinkUrl());
                                        }
                                    }
                                    else
                                    {
                                        System.out.println(keyName + ": " + value);
                                    }
                                }
                            }
                            else if(value instanceof Layout)
                            {
                                com.zoho.crm.api.layouts.Layout layout = (Layout) value;

                                if(layout != null)
                                {
                                    System.out.println("Record " + keyName + " ID: " + layout.getId());

                                    System.out.println("Record " + keyName + " Name: " + layout.getName());
                                }
                            }
                            else if(value instanceof User)
                            {
                                com.zoho.crm.api.users.User user = (User) value;

                                if(user != null)
                                {
                                    System.out.println("Record " + keyName + " User-ID: " + user.getId());

                                    System.out.println("Record " + keyName + " User-Name: " + user.getName());

                                    System.out.println("Record " + keyName + " User-Email: " + user.getEmail());
                                }
                            }
                            else if( value instanceof com.zoho.crm.api.record.Record)
                            {
                                com.zoho.crm.api.record.Record recordValue = (com.zoho.crm.api.record.Record) value;

                                System.out.println("Record " + keyName + " ID: " + recordValue.getId());

                                System.out.println("Record " + keyName + " Name: " + recordValue.getKeyValue("name"));
                            }
                            else if(value instanceof Choice<?>)
                            {
                                System.out.println(keyName + ": " + ((Choice<?>)value).getValue());
                            }
                            else if(value instanceof RemindAt)
                            {
                                System.out.println(keyName + ": " + ((RemindAt)value).getAlarm());
                            }
                            else if(value instanceof RecurringActivity)
                            {
                                System.out.println(keyName);

                                System.out.println("RRULE" + ": " + ((RecurringActivity)value).getRrule());
                            }
                            else if(value instanceof Consent)
                            {
                                Consent consent = (Consent) value;

                                //Get the Owner User instance of each attachment
                                User owner = consent.getOwner();

                                //Check if owner is not null
                                if(owner != null)
                                {
                                    //Get the name of the owner User
                                    System.out.println("Record Consent Owner Name: " + owner.getName());

                                    //Get the ID of the owner User
                                    System.out.println("Record Consent Owner ID: " + owner.getId());

                                    //Get the Email of the owner User
                                    System.out.println("Record Consent Owner Email: " + owner.getEmail());
                                }

                                System.out.println("Record Consent ContactThroughEmail: " + consent.getContactThroughEmail());

                                System.out.println("Record Consent ContactThroughSocial: " + consent.getContactThroughSocial());

                                System.out.println("Record Consent ContactThroughSurvey: " + consent.getContactThroughSurvey());

                                System.out.println("Record Consent ContactThroughPhone: " + consent.getContactThroughPhone());

                                System.out.println("Record Consent MailSentTime: " + consent.getMailSentTime().toString());

                                System.out.println("Record Consent ConsentDate: " + consent.getConsentDate().toString());

                                System.out.println("Record Consent ConsentRemarks: " + consent.getConsentRemarks());

                                System.out.println("Record Consent ConsentThrough: " + consent.getConsentThrough());

                                System.out.println("Record Consent DataProcessingBasis: " + consent.getDataProcessingBasis());
                            }
                            else
                            {
                                //Get each value in the map
                                System.out.println(keyName + ": " + value);
                            }
                        }
                    }

                    //Get the Object obtained Info instance
                    Info info = responseWrapper.getInfo();

                    //Check if info is not null
                    if(info != null)
                    {
                        if(info.getPerPage() != null)
                        {
                            //Get the PerPage of the Info
                            System.out.println("Record Info PerPage: " + info.getPerPage().toString());
                        }

                        if(info.getCount() != null)
                        {
                            //Get the Count of the Info
                            System.out.println("Record Info Count: " + info.getCount().toString());
                        }

                        if(info.getPage() != null)
                        {
                            //Get the Page of the Info
                            System.out.println("Record Info Page: " + info.getPage().toString());
                        }

                        if(info.getMoreRecords() != null)
                        {
                            //Get the MoreRecords of the Info
                            System.out.println("Record Info MoreRecords: " + info.getMoreRecords().toString());
                        }
                    }
                }
                //Check if the request returned an exception
                else if(responseHandler instanceof APIException)
                {
                    //Get the received APIException instance
                    APIException exception = (APIException) responseHandler;

                    //Get the Status
                    System.out.println("Status: " + exception.getStatus().getValue());

                    //Get the Code
                    System.out.println("Code: " + exception.getCode().getValue());

                    System.out.println("Details: " );

                    //Get the details map
                    for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
                    {
                        //Get each value in the map
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }

                    //Get the Message
                    System.out.println("Message: " + exception.getMessage().getValue());
                }
            }
            else
            {//If response is not as expected

                //Get model object from response
                Model responseObject = response.getModel();

                //Get the response object's class
                Class<? extends Model> clas = responseObject.getClass();

                //Get all declared fields of the response class
                java.lang.reflect.Field[] fields = clas.getDeclaredFields();

                for(java.lang.reflect.Field field : fields)
                {
                    //Get each value
                    System.out.println(field.getName() + ":" + field.get(responseObject));
                }
            }
        }
    }
    public static void convertLead(long leadId) throws Exception
    {
        //API Name of the module
        //long leadId = 3477061000006603276L;

        //Get instance of RecordOperations Class
        RecordOperations recordOperations = new RecordOperations();

        //Get instance of ConvertBodyWrapper Class that will contain the request body
        ConvertBodyWrapper request = new ConvertBodyWrapper();

        //List of LeadConverter instances
        List<LeadConverter> data = new ArrayList<LeadConverter>();

        //Get instance of LeadConverter Class
        LeadConverter record1 = new LeadConverter();

        record1.setOverwrite(true);

        record1.setNotifyLeadOwner(true);

        record1.setNotifyNewEntityOwner(true);

        record1.setAccounts("3477061000005848125");

        record1.setContacts("3477061000000358009");

        record1.setAssignTo("3477061000000173021");

        com.zoho.crm.api.record.Record deals = new com.zoho.crm.api.record.Record();

        /*
         * Call addFieldValue method that takes two arguments
         * 1 -> Call Field "." and choose the module from the displayed list and press "." and choose the field name from the displayed list.
         * 2 -> Value
         */
        deals.addFieldValue(Field.Deals.DEAL_NAME, "deal_name");

        deals.addFieldValue(Field.Deals.DESCRIPTION, "deals description");

        deals.addFieldValue(Field.Deals.CLOSING_DATE, LocalDate.of(2021, 1, 13));

        deals.addFieldValue(Field.Deals.STAGE, new Choice<String>("Closed Won"));

        deals.addFieldValue(Field.Deals.AMOUNT, 50.7);

        /*
         * Call addKeyValue method that takes two arguments
         * 1 -> A string that is the Field's API Name
         * 2 -> Value
         */
        deals.addKeyValue("Custom_field", "Value");

        deals.addKeyValue("Custom_field_2", "value");

        List<Tag> tagList = new ArrayList<Tag>();

        Tag tag = new Tag();

        tag.setName("TestDeals");

        tagList.add(tag);

        deals.setTag(tagList);

        record1.setDeals(deals);

        //Add Record instance to the list
        data.add(record1);

        //Set the list to Records in BodyWrapper instance
        request.setData(data);

        //Call convertLead method that takes leadId and ConvertBodyWrapper instance as parameter.
        APIResponse<ConvertActionHandler> response = recordOperations.convertLead(leadId, request);

        if(response != null)
        {
            //Get the status code from response
            System.out.println("Status Code: " + response.getStatusCode());

            //Check if expected response is received
            if(response.isExpected())
            {
                //Get object from response
                ConvertActionHandler convertActionHandler = response.getObject();

                if(convertActionHandler instanceof ConvertActionWrapper)
                {
                    //Get the received ConvertActionWrapper instance
                    ConvertActionWrapper convertActionWrapper = (ConvertActionWrapper) convertActionHandler;

                    //Get the list of obtained ConvertActionResponse instances
                    List<ConvertActionResponse> convertActionResponses = convertActionWrapper.getData();

                    for(ConvertActionResponse convertActionResponse : convertActionResponses)
                    {
                        //Check if the request is successful
                        if(convertActionResponse instanceof SuccessfulConvert)
                        {
                            //Get the received SuccessfulConvert instance
                            SuccessfulConvert successfulConvert = (SuccessfulConvert) convertActionResponse;

                            //Get the Accounts ID of  Record
                            System.out.println("LeadConvert Accounts ID: " + successfulConvert.getAccounts());

                            //Get the Contacts ID of  Record
                            System.out.println("LeadConvert Contacts ID: " + successfulConvert.getContacts());

                            //Get the Deals ID of  Record
                            System.out.println("LeadConvert Deals ID: " + successfulConvert.getDeals());
                        }
                        //Check if the request returned an exception
                        else if(convertActionResponse instanceof APIException)
                        {
                            //Get the received APIException instance
                            APIException exception = (APIException) convertActionResponse;

                            //Get the Status
                            System.out.println("Status: " + exception.getStatus().getValue());

                            //Get the Code
                            System.out.println("Code: " + exception.getCode().getValue());

                            System.out.println("Details: " );

                            //Get the details map
                            for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
                            {
                                //Get each value in the map
                                System.out.println(entry.getKey() + ": " + entry.getValue());
                            }

                            //Get the Message
                            System.out.println("Message: " + exception.getMessage().getValue());
                        }
                    }
                }
                //Check if the request returned an exception
                else if(convertActionHandler instanceof APIException)
                {
                    //Get the received APIException instance
                    APIException exception = (APIException) convertActionHandler;

                    //Get the Status
                    System.out.println("Status: " + exception.getStatus().getValue());

                    //Get the Code
                    System.out.println("Code: " + exception.getCode().getValue());

                    System.out.println("Details: " );

                    //Get the details map
                    for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
                    {
                        //Get each value in the map
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }

                    //Get the Message
                    System.out.println("Message: " + exception.getMessage().getValue());
                }
            }
            else
            {//If response is not as expected

                //Get model object from response
                Model responseObject = response.getModel();

                //Get the response object's class
                Class<? extends Model> clas = responseObject.getClass();

                //Get all declared fields of the response class
                java.lang.reflect.Field[] fields = clas.getDeclaredFields();

                for(java.lang.reflect.Field field : fields)
                {
                    //Get each value
                    System.out.println(field.getName() + ":" + field.get(responseObject));
                }
            }
        }
    }
}
 