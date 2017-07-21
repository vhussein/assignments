package com.azlan.assignments.question1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azlan on 20/7/2017.
 */
public class IPValidationRegex {

    static BufferedReader br = null;
    static FileReader fr = null;
    static List<String> validIP = new ArrayList<>();
    static List<String> inValidIP = new ArrayList<>();

    static IPAddressDTO ipAddDTO = new IPAddressDTO();
    static IPAddressValidatorImpl ipAddValidator = new IPAddressValidatorImpl();

    private static final Logger logger = LoggerFactory.getLogger(IPValidationRegex.class);

    public static void main (String[] args) {

        //Read the input
        if (args.length < 1) {
            logger.error("You need to input the filename");
        }
        else
        {

            logger.debug("Input verified, proceed with processing");

            String fileName = args[0];

            // Check file exist
            if(fileExist(fileName))
            {
//                TODO: do everything

                fileProcessor(fileName);

//                logger.info("VALID IP Address as follows");
//                if(!ipAddDTO.getValidIP().isEmpty())
//                {
//                    for (String ipAddStr : ipAddDTO.getValidIP())
//                    {
//                        logger.info(ipAddStr);
//                    }
//                }
//                else
//                {
//                    logger.info("There is no valid IP Address");
//                }


                //filter invalid IP
                logger.info("INVALID IP Address as follows");
                if(!ipAddDTO.getInvalidIP().isEmpty())
                {
                    for (String ipAddStr : ipAddDTO.getInvalidIP())
                    {
                        logger.info(ipAddStr);
                    }
                }
                else
                {
                    logger.info("There is no INVALID IP Address");
                }
            }
            else
            {
                logger.error("File " + fileName + " doesn't exist");
            }
        }
    }

    private static boolean fileExist(String fileName)
    {
        logger.debug("Check file exist at " + fileName);

        File filename = new File(fileName);

        return (filename.exists() ? true : false);
    }

    private static void fileProcessor(String fileName) {
        logger.debug("Reading the file input");
        try {
            fr = new FileReader(fileName);

            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(fileName));

            while ((sCurrentLine = br.readLine()) != null) {
                logger.debug("Current data is ==> " + sCurrentLine);


                if(ipAddValidator.validate(sCurrentLine) == false)
                {
                    logger.debug("The IP " + sCurrentLine + " is invalid");
                    inValidIP.add(sCurrentLine);
                }
                else
                {
                    logger.debug("The IP " + sCurrentLine + " is valid");
                    validIP.add(sCurrentLine);
                }


            }
        } catch (IOException e) {
            logger.error("Exception occured: " + e.toString());
        }
        finally
        {
            ipAddDTO.setInvalidIP(inValidIP);
            ipAddDTO.setValidIP(validIP);

            try {

                if(br != null)
                    br.close();
                if(fr != null)
                    fr.close();

                } catch (IOException e) {
                    logger.error("Exception occured: " + e.toString());
            }
        }
    }
}
