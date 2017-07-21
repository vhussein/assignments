package com.azlan.assignments.question1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Azlan on 20/7/2017.
 */
public class IPAddressValidatorImpl {

    private Pattern pattern;
    private Matcher matcher;

    private static final Logger logger = LoggerFactory.getLogger(IPAddressValidatorImpl.class);

    private static final String IPADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public IPAddressValidatorImpl(){
        pattern = Pattern.compile(IPADDRESS_PATTERN);
    }

    /**
     * Validate ip address with regular expression
     * @param ip ip address for validation
     * @return true valid ip address, false invalid ip address
     */
    public boolean validate(final String ip) {
        logger.debug("Matching the pattern from the ip address");
        matcher = pattern.matcher(ip);

        String resultStr = (matcher.matches() == true) ? "MATCHES" : "DOESN'T MATCH";
        logger.debug("The pattern from the " + ip + " " + resultStr);

        return matcher.matches();
    }
}
