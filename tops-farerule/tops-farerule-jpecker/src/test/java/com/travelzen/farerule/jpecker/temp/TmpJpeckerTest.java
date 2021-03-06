/**
 * Copyright 2014 Travelzen Inc. All Rights Reserved.
 * Author: yiming.yan@travelzen.com (Yiming Yan)
 */

package com.travelzen.farerule.jpecker.temp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;

import com.travelzen.farerule.jpecker.LogBase;
import com.travelzen.farerule.jpecker.pecker.*;
import com.travelzen.farerule.translator.RuleTranslator;
import com.travelzen.farerule.translator.RuleTranslator14;

@RunWith(JUnit4.class)
public class TmpJpeckerTest {

	private static final Logger log = LoggerFactory.getLogger(TmpJpeckerTest.class);

	@Test
	public void testNormal() {
		LogBase.logBack();
		
		String text0 = "";
		
		String text1 = "\n"
				+ "VALID FOR SEAMAN.\n"
				+ "VALID FOR LABORER/WORKER WITH ID.\n"
				+ "VALID FOR SENIOR CITIZEN 55 OR OLDER.\n"
				+ "VALID FOR STUDENT.\n"
				+ "VALID FOR STUDENT AGD 12-35 WITH ID.\n"
				+ "OR - VALID FOR STUDENT 18 OR OLDER WITH ID.\n"
				+ "OR - VALID FOR YOUTH CONFIRMED 12-25 WITH ID.\n"
				+ "UNACCOMPANIED INFANT WITHOUT A SEAT - NOT ELIGIBLE TO TRAVEL.\n"
				+ "UNACCOMPANIED INFANT UNDER 2 WITHOUTH A SEAT - NOT PERMITTED.\n"
				+ "UNACCOMPANIED CHILD IS NOT ELIGIBLE.\n"
				+ "UNACCOMPANIED CHILD UNDER 5 YEARS - NOT ELIGIBLE\n"
				+ "UNACCOMPANIED CHILD 5-11YEARS OF AGE NOT APPLY\n"
				+ "VALID FOR MINIMUM 3 PASSENGERS - MINIMUM 2 ADULT REQUIRED.\n"
				+ "VALID FOR MINIMUM 4 ADULT PASSENGERS.\n"
				+ "VALID FOR GROUPS OF 5-9 PASSENGERS.";
		
		String text2 = "\n"
//				+ "OUTBOUND -\n"
				+ "FROM JAPAN OUTBOUND -\n"
				+ "PERMITTED 601AM TO 959AM OR 1029AM TO 959PM OR 1101PM TO MIDNIGHT DAILY\n"
//				+ "INBOUND -\n"
				+ "TO JAPAN INBOUND -\n"
				+ "PERMITTED 901AM TO 959PM WED AND\n"
				+ "FRI/SAT AND SUN.\n"
				+ "NOTE -\n"
				+ "BLABLALALA";
		
		String text3 = "\n"
				+ "PERMITTED 12APR 13 THROUGH 24JUN 13 OR 11SEP2013 THROUGH 31OCT2013.";
		
		String text4 = "\n"
				+ "THE FARE COMPONENT MUST INCLUDE TRAVEL BETWEEN CHINA AND\n"
				+ "JAPAN BUT NOT ON\n"
				+ "ONE OR MORE OF THE FOLLOWING\n"
				+ "CZ FLIGHTS 700 THROUGH 799\n"
				+ "MU FLIGHTS 1000 THROUGH 1999\n"
				+ "AND\n"
				+ "IF THE FARE COMPONENT INCLUDES TRAVEL BETWEEN CHINA AND\n"
				+ "AREA 3\n"
				+ "THEN THAT TRAVEL MUST BE ON\n"
				+ "ONE OR MORE OF THE FOLLOWING\n"
				+ "HX FLIGHTS 8000 THROUGH 8999\n"
				+ "AND \n"
				+ "THE FARE COMPONENT MUST INCLUDE TRAVEL BETWEEN CHINA AND\n"
				+ "KOREA, REPUBLIC OF ON\n"
				+ "ONE OR MORE OF THE FOLLOWING\n"
				+ "F FLIGHTS 179 / 180\n"
				+ "F FLIGHTS 2400 / 2499\n"
				+ "AND \n"
				+ "THE FARE COMPONENT MUST BE ON\n"
				+ "ONE OR MORE OF THE FOLLOWING\n"
				+ "I FLIGHT 1 - 999 OPERATED BY MI\n"
				+ "ANY MI FLIGHT OPERATED BY SQ\n"
				+ "ANY SQ FLIGHT OPERATED BY MI\n"
				+ "SQ FLIGHT 1 - 999 OPERATED BY SQ.";
		
		String text5 = "\n"
				+ "RESERVATIONS ARE REQUIRED FOR ALL SECTORS.\n"
				+ "WHEN RESERVATIONS ARE MADE AT LEAST 7 DAYS BEFORE\n"
				+ "DEPARTURE TICKETING MUST BE COMPLETED WITHIN 7 DAYS AFTER\n"
				+ "RESERVATIONS ARE MADE.\n"
				+ "OR - RESERVATIONS FOR ALL SECTORS ARE REQUIRED AT LEAST 1\n"
				+ "DAY BEFORE DEPARTURE.";
		
		String text6 = "\n"
				+ "FOR TRAVEL ON/BEFORE 22NOV 14\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO EARLIER THAN\n"
				+ "THE FIRST SUN AFTER DEPARTURE FROM FARE ORIGIN.\n"
				+ "FOR TRAVEL ON/AFTER 23NOV 14 AND ON/BEFORE 26NOV 14\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO EARLIER THAN\n"
				+ "THE FIRST THU AFTER DEPARTURE FROM FARE ORIGIN.\n"
				+ "NOTE -\n"
				+ "FOR TRAVEL ON/AFTER 27NOV14 AND ON/BEFORE 28NOV14\n"
				+ "NO MINIMUM STAY REQUIRED\n"
				+ "FOR TRAVEL ON/AFTER 29NOV 14 AND ON/BEFORE 16DEC 14\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO EARLIER THAN\n"
				+ "THE FIRST SUN AFTER DEPARTURE FROM FARE ORIGIN.\n"
				+ "FOR TRAVEL ON/AFTER 17DEC 14 AND ON/BEFORE 23DEC 14\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO EARLIER THAN\n"
				+ "THE FIRST SAT AFTER DEPARTURE FROM FARE ORIGIN.\n"
				+ "NOTE -\n"
				+ "FOR TRAVEL ON/AFTER 24DEC14 AND ON/BEFORE 25DEC14\n"
				+ "NO MINIMUM STAY REQUIRED\n"
				+ "FOR TRAVEL ON/AFTER 26DEC 14 AND ON/BEFORE 30DEC 14\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO EARLIER THAN\n"
				+ "THE FIRST SAT AFTER DEPARTURE FROM FARE ORIGIN.\n"
				+ "NOTE -\n"
				+ "FOR TRAVEL ON/AFTER 31DEC14 AND ON/BEFORE 01JAN15\n"
				+ "NO MINIMUM STAY REQUIRED\n"
				+ "FOR TRAVEL ON/AFTER 02JAN 15\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO EARLIER THAN\n"
				+ "THE FIRST SUN AFTER DEPARTURE FROM FARE ORIGIN.\n";
		
		String text60 = "\n"
				+ "ORIGINATING SHA -\n"
				+ "TRAVEL FROM LAST INTERNATIONAL STOPOVER MUST COMMENCE NO\n"
				+ "EARLIER THAN 2 DAYS AFTER DEPARTURE OF THE FIRST\n"
				+ "INTERNATIONAL SECTOR.\n"
				+ "ORIGINATING HKG -\n"
				+ "TRAVEL FROM LAST INTERNATIONAL STOPOVER MUST COMMENCE NO\n"
				+ "EARLIER THAN 1 DAY AFTER DEPARTURE OF THE FIRST\n"
				+ "INTERNATIONAL SECTOR.";
		
		String text61 = "		NOTE - RULE 6030 IN IPRG100 APPLIES\n"
				+ "	    THE PROVISIONS BELOW APPLY ONLY AS FOLLOWS -\n"
				+ "	    RESERVATIONS\n"
				+ "	    FOR ALL SECTORS ARE REQUIRED AT LEAST 21 DAYS BEFORE\n"
				+ "	    DEPARTURE.\n"
				+ "	    TICKETING MUST BE COMPLETED WITHIN 72 HOURS AFTER\n"
				+ "	    RESERVATIONS ARE MADE OR AT LEAST 21 DAYS BEFORE\n"
				+ "	    DEPARTURE\n"
				+ "	    WHICHEVER IS EARLIER.\n"
				+ "	      TRAVEL FROM TURNAROUND MUST COMMENCE NO EARLIER THAN 1\n"
				+ "	      DAY AFTER ARRIVAL AT TURNAROUND.\n"
				+ "	           NOTE -\n"
				+ "	            WHEN COMBINING FARES ON HALF ROUND TRIP BASIS\n"
				+ "	            THE\n"
				+ "	            MORE RESTRICTIVE MINIMUM STAY RULE APPLIES\n"
				+ "	    TRAVEL FROM TURNAROUND MUST COMMENCE NO EARLIER THAN\n"
				+ "	    1201AM ON THE FIRST SUN AFTER ARRIVAL AT TURNAROUND\n"
				+ "	    OR - TRAVEL FROM TURNAROUND MUST COMMENCE NO EARLIER\n"
				+ "	    THAN\n"
				+ "	         4 DAYS AFTER ARRIVAL AT TURNAROUND.\n"
				+ "	           NOTE -\n"
				+ "	            WHEN COMBINING FARES ON HALF ROUND TRIP BASIS\n"
				+ "	            THE\n"
				+ "	            MORE RESTRICTIVE MINIMUM STAY RULE APPLIES.";
		
		String text7 = "FOR TICKETING ON/BEFORE 28FEB 07\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO LATER THAN 6\n"
				+ "MONTHS AFTER DEPARTURE FROM FARE ORIGIN.\n"
				+ "FOR TICKETING ON/AFTER 01MAR 07\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO LATER THAN 12\n"
				+ "MONTHS AFTER DEPARTURE FROM FARE ORIGIN.";
		
		String text70 = "\n"
				+ "ORIGINATING SHA -\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO LATER THAN 7\n"
				+ "DAYS AFTER DEPARTURE FROM FARE ORIGIN.\n"
				+ "ORIGINATING HKG -\n"
				+ "TRAVEL FROM LAST STOPOVER MUST COMMENCE NO LATER THAN 21\n"
				+ "DAYS AFTER DEPARTURE FROM FARE ORIGIN.";
				
		String text71 = "NOTE -\n"
				+ "INTERNATIONAL PASSENGER TICKETS TO COVER DOMESTIC\n"
				+ "SECTOR/S/ IN CONNECTION WITH INTERNATIONAL\n"
				+ "SECTOR/S/ SHALL BE VALID FOR ONE YEAR FROM THE\n"
				+ "DATE OF COMMENCEMENT OF TRAVEL OR FOR YEAR FROM\n"
				+ "THE DATE OF TICKET ISSUANCE WHEN TRAVEL HAS NOT\n"
				+ "BEEN COMMENCED.\n"
				+ "FOR TRANSPORTATION WHOLLY WITHIN JAPAN TICKETS\n"
				+ "SHALL BE VALID FOR 90 DAYS FROM DATE OF\n"
				+ "ISSUANCE.";
		
		String text72 = "TRAVEL FROM LAST INTERNATIONAL STOPOVER MUST COMMENCE NO\n"
				+ "LATER THAN 12 MONTHS AFTER DEPARTURE FROM FARE ORIGIN.\n"
				+ "OR 01JAN 2015 WHICHEVER";
				
		String text11 = "\n"
				+ "FROM SHA - \n"
				+ "TRAVEL IS NOT PERMITTED 01JAN 12 THROUGH 24JAN 12 FOR \n"
				+ "DEPARTURE OF FIRST INTERNATIONAL SECTOR.  \n"
				+ "AND - TO SHA - \n"
				+ "TRAVEL IS NOT PERMITTED 25JAN 12 THROUGH 06FEB 12 FOR  \n"
				+ "DEPARTURE OF FIRST INTERNATIONAL SECTOR.  ";
		
		String text14 = "\n"
				+ "VALID FOR TRAVEL COMMENCING DEPARTURE OF FIRST\n"
				+ "INTERNATIONAL SECTOR ON/AFTER 01JUL 13.\n"
				+ "OR - VALID FOR TRAVEL COMMENCING ON/AFTER 10FEB2013\n"
				+ "AND ON/BEFORE 30JUN2013.\n"
				+ "ALL TRAVEL MUST BE COMPLETED BY MIDNIGHT ON 28OCT 13.";
		
		String text15 = "\n"
				+ "TICKETS MUST BE ISSUED ON/AFTER 01JAN 13 AND ON/BEFORE\n"
				+ "31MAR 14.";
		
		String text16 = "\n"
				+ "CANCELLATIONS  \n"
				+ "BEFORE DEPARTURE \n"
				+ "CHARGE CNY 500 FOR CANCEL/REFUND  \n"
				+ "NOTE -  \n"
				+ "NOTE 1-IN THE EVENT OF NO-SHOW ON A CANCEL/REFUND  \n"
				+ "TICKET CHARGE CNY500 - CANCEL/REFUND FEE    \n"
				+ "CNY500 PLUS NO-SHOW FEE FOC \n"
				+ "AFTER DEPARTURE  \n"
				+ "TICKET IS NON-REFUNDABLE  \n"
				+ "CHANGES    \n"
				+ "ANY TIME \n"
				+ "CHANGES PERMITTED FOR REVALIDATION    \n"
				+ "NOTE -  \n"
				+ "CHANGES NOT PERMITTED IN CASE OF REISSUE   \n"
				+ "-------------------------------------------------- \n"
				+ "NOTE 1-IN THE EVENT OF NO-SHOW \n"
				+ "PERMITTED AT FOC-REBOOKING FEE FOC";
				
		String text19 = "\n"
				+ "ACCOMPANIED CHILD 2-11 - CHARGE 75 PERCENT OF THE FARE.\n"
				+ "TICKET DESIGNATOR - CH AND PERCENT OF DISCOUNT\n"
				+ "MUST BE ACCOMPANIED ON ALL FLIGHTS BY ADULT 12 OR OLDER\n"
				+ "OR - UNACCOMPANIED CHILD 5-11 - NO DISCOUNT\n"
				+ "TICKET DESIGNATOR - CH AND PERCENT OF DISCOUNT\n"
				+ "OR - 1ST INFANT UNDER 2 WITHOUT A SEAT - CHARGE 10 PERCENT\n"
				+ "OF THE FARE\n"
				+ "TICKET DESIGNATOR - IN AND PERCENT OF DISCOUNT\n"
				+ "MUST BE ACCOMPANIED ON ALL FLIGHTS BY ADULT 12 OR\n"
				+ "OLDER\n"
				+ "OR - INFANT UNDER 2 WITH A SEAT - CHARGE 75 PERCENT OF THE\n"
				+ "TICKET DESIGNATOR - CH AND PERCENT OF DISCOUNT\n"
				+ "MUST BE ACCOMPANIED ON ALL FLIGHTS BY ADULT 12 OR\n"
				+ "OLDER\n"
				+ "NOTE -\n"
				+ "UNACCOMPANIED INFANT UNDER 2 YEARS-\n"
				+ "TRAVEL NOT PERMITTED AT THIS FARE";
		
		long startTime = System.nanoTime();
		
		try {
			
		} catch(Exception e) {
			e.printStackTrace();
		}	
		
		long endTime = System.nanoTime();
		log.info((double)(endTime-startTime)/1e9 + " s");
	}

}
